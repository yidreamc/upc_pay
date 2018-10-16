package ml.yidreamc.upcpay.common.controller;

import ml.yidreamc.upcpay.common.entity.PaymentItem;
import lombok.extern.slf4j.Slf4j;
import ml.yidreamc.upcpay.common.dto.*;
import ml.yidreamc.upcpay.common.entity.*;
import ml.yidreamc.upcpay.common.entity.entityenum.FillType;
import ml.yidreamc.upcpay.common.entity.entityenum.ParamType;
import ml.yidreamc.upcpay.common.entity.entityenum.ProType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.*;

@RestController
@RequestMapping("/manage")
@Slf4j
public class ManageRestController {


    private String qrcodeBase = "http://qr.liantu.com/api.php?&w=200&text=";

    @Value("${app.fronturl}")
    private String fronturl;


    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private ParamItemRepository paramItemRepository;

    @Autowired
    private PaymentItemRepository paymentItemRepository;

    @Autowired
    private PaymentItemTypeRepository paymentItemTypeRepository;

    @Autowired
    private HttpSession httpSession;

    @Autowired
    private OldToNewMapRepository oldToNewMapRepository;

    @PostMapping("/create")
    @Transactional
    public Response create(@RequestBody PaymentForm paymentForm) {

        try {
            Manage manage = (Manage) httpSession.getAttribute("manage");
            if (manage == null) {
                return new Response(2, "你没有权限操作，请重新登陆");
            }
            Payment payment = new Payment(paymentForm.getName(), paymentForm.getRemark(), paymentForm.getP1name(), paymentForm.getP1code(), paymentForm.getP2name(), paymentForm.getP2code(), paymentForm.getP1method(), paymentForm.getP2method(), paymentForm.getType(), paymentForm.getIsBill(), ProType.COMMON, paymentForm.getSysid(), paymentForm.getSubsysid(), paymentForm.getFeeitemid(), paymentForm.getCert());
            payment = paymentRepository.save(payment);
            payment.setCreateUser(manage.getId());


            //老版本兼容 map
            if (paymentForm.getOldId() != 0) {
                log.info("兼容处理: " + paymentForm.getOldId() + " => " + payment.getId());
                OldToNewMap oldToNewMap = new OldToNewMap(paymentForm.getOldId(), payment.getId());
                oldToNewMapRepository.save(oldToNewMap);
            }


            //参数1为用户选择
            if (FillType.SELECT.equals(paymentForm.getP1method())) {
                List<POpt> p1opt = paymentForm.getP1opt();
                Iterator<POpt> pOptIterator = p1opt.iterator();
                while (pOptIterator.hasNext()) {
                    POpt p = pOptIterator.next();
                    ParamItem paramItem = new ParamItem(payment.getId(), ParamType.ONE, p.getValue());
                    paramItemRepository.save(paramItem);
                }
            }

            //参数2为用户选择
            if (FillType.SELECT.equals(paymentForm.getP2method())) {
                List<POpt> p2opt = paymentForm.getP2opt();
                Iterator<POpt> pOptIterator = p2opt.iterator();
                while (pOptIterator.hasNext()) {
                    POpt p = pOptIterator.next();
                    ParamItem paramItem = new ParamItem(payment.getId(), ParamType.TWO, p.getValue());
                    paramItemRepository.save(paramItem);
                }
            }

            //收费项
            List<Items> items = paymentForm.getItems();
            Iterator<Items> itemsIterator = items.iterator();
            while (itemsIterator.hasNext()) {
                Items i = itemsIterator.next();
                PaymentItem paymentItem = new PaymentItem(payment.getId(), i.getName(), i.getMethod());

                paymentItem = paymentItemRepository.save(paymentItem);

                //用户选择
                if (FillType.SELECT.equals(i.getMethod())) {
                    List<ItemOpt> opt = i.getOpt();
                    Iterator<ItemOpt> optIterator = opt.iterator();
                    while (optIterator.hasNext()) {
                        ItemOpt itemOpt = optIterator.next();
                        PaymentItemType paymentItemType = new PaymentItemType(paymentItem.getId(), itemOpt.getName(), itemOpt.getAmt());
                        paymentItemTypeRepository.save(paymentItemType);
                    }
                }
            }


            String url = qrcodeBase + fronturl + "/%23/pay?id=" + payment.getId();
            return new Response(0, url);
        } catch (Exception e) {
            return new Response(1, "创建失败，请稍后再试！");
        }
    }


    @PostMapping("/edit")
    @Transactional
    public Response edit(@RequestBody PaymentForm paymentForm) {
        try {
            Payment payment = paymentRepository.findById(paymentForm.getId()).get();
            payment.setData(paymentForm.getName(), paymentForm.getRemark(), paymentForm.getP1name(), paymentForm.getP1code(), paymentForm.getP2name(), paymentForm.getP2code(), paymentForm.getP1method(), paymentForm.getP2method(), paymentForm.getType(), paymentForm.getIsBill(), ProType.COMMON, paymentForm.getSysid(), paymentForm.getSubsysid(), paymentForm.getFeeitemid(), paymentForm.getCert());
            payment = paymentRepository.save(payment);

            //参数1为用户选择
            if (FillType.SELECT.equals(paymentForm.getP1method())) {

                //删除原来
                Iterable<ParamItem> paramItems = paramItemRepository.findByPaymentIdAndAndPnum(payment.getId(), ParamType.ONE);
                paramItemRepository.deleteAll(paramItems);

                List<POpt> p1opt = paymentForm.getP1opt();
                Iterator<POpt> pOptIterator = p1opt.iterator();
                while (pOptIterator.hasNext()) {
                    POpt p = pOptIterator.next();
                    ParamItem paramItem = new ParamItem(payment.getId(), ParamType.ONE, p.getValue());
                    paramItemRepository.save(paramItem);
                }
            }

            //参数2为用户选择
            if (FillType.SELECT.equals(paymentForm.getP2method())) {

                //删除原来
                Iterable<ParamItem> paramItems = paramItemRepository.findByPaymentIdAndAndPnum(payment.getId(), ParamType.TWO);
                paramItemRepository.deleteAll(paramItems);

                List<POpt> p2opt = paymentForm.getP2opt();
                Iterator<POpt> pOptIterator = p2opt.iterator();
                while (pOptIterator.hasNext()) {
                    POpt p = pOptIterator.next();
                    ParamItem paramItem = new ParamItem(payment.getId(), ParamType.TWO, p.getValue());
                    paramItemRepository.save(paramItem);
                }
            }

            //收费项
            //删除原来的收费项

            Iterable<PaymentItem> itemsIterable = paymentItemRepository.findByPaymentId(payment.getId());
            paymentItemRepository.deleteAll(itemsIterable);

            List<Items> items = paymentForm.getItems();
            Iterator<Items> itemsIterator = items.iterator();
            while (itemsIterator.hasNext()) {
                Items i = itemsIterator.next();
                PaymentItem paymentItem = new PaymentItem(payment.getId(), i.getName(), i.getMethod());
                paymentItem = paymentItemRepository.save(paymentItem);
                //用户选择
                if (FillType.SELECT.equals(i.getMethod())) {
                    List<ItemOpt> opt = i.getOpt();
                    Iterator<ItemOpt> optIterator = opt.iterator();
                    while (optIterator.hasNext()) {
                        ItemOpt itemOpt = optIterator.next();
                        PaymentItemType paymentItemType = new PaymentItemType(paymentItem.getId(), itemOpt.getName(), itemOpt.getAmt());
                        paymentItemTypeRepository.save(paymentItemType);
                    }
                }
            }
            String url = qrcodeBase + fronturl + "/%23/pay?id=" + payment.getId();
            return new Response(0, url);
        } catch (Exception e) {
            return new Response(1, "更新失败，请稍后再试！");
        }
    }


    @GetMapping("/allList")
    public Response allList() {
        Iterable<Payment> list = paymentRepository.findByOrderByIdDesc();
        return new Response(0, "", list);
    }

    @GetMapping("/getOne")
    public Response getOne(int id) {
        Random random = new Random(System.currentTimeMillis());


        int paymentId = id;
        Payment payment = paymentRepository.findById(paymentId).get();
        PaymentForm paymentForm = new PaymentForm(payment.getName(), payment.getType(), payment.getP1name(), payment.getP1method(), payment.getP1Check(), payment.getP2name(), payment.getP2method(), payment.getP2Check(), payment.getBill(), payment.getRemark(), payment.getSubsysid(), payment.getSysid(), payment.getFeeitemid(), payment.getCert());

        //参数1为用户选择
        if (FillType.SELECT.equals(paymentForm.getP1method())) {
            Iterable<ParamItem> paramItems = paramItemRepository.findByPaymentIdAndAndPnum(paymentId, ParamType.ONE);
            Iterator<ParamItem> paramItemIterator = paramItems.iterator();
            List<POpt> opt1 = new ArrayList<>();
            while (paramItemIterator.hasNext()) {
                ParamItem p = paramItemIterator.next();
                POpt o = new POpt(p.getValue(), String.valueOf(random.nextInt(10000)));
                opt1.add(o);
            }
            paymentForm.setP1opt(opt1);
        }

        //参数2为用户选择
        if (FillType.SELECT.equals(paymentForm.getP2method())) {
            Iterable<ParamItem> paramItems = paramItemRepository.findByPaymentIdAndAndPnum(paymentId, ParamType.TWO);
            Iterator<ParamItem> paramItemIterator = paramItems.iterator();
            List<POpt> opt2 = new ArrayList<>();
            while (paramItemIterator.hasNext()) {
                ParamItem p = paramItemIterator.next();
                POpt o = new POpt(p.getValue(), String.valueOf(random.nextInt(10000)));
                opt2.add(o);
            }
            paymentForm.setP1opt(opt2);
        }

        //items
        Iterable<PaymentItem> items = paymentItemRepository.findByPaymentId(paymentId);
        Iterator<PaymentItem> itemIterator = items.iterator();

        List<Items> itemList = new ArrayList<>();
        while (itemIterator.hasNext()) {
            PaymentItem paymentItem = itemIterator.next();
            Items i = new Items(paymentItem.getName(), String.valueOf(random.nextInt(10000)), paymentItem.getType());
            if (FillType.SELECT.equals(paymentItem.getType())) {
                int itemId = paymentItem.getId();
                Iterable<PaymentItemType> paymentItemTypes = paymentItemTypeRepository.findByItemId(itemId);
                Iterator<PaymentItemType> paymentItemTypeIterator = paymentItemTypes.iterator();
                List<ItemOpt> opt = new ArrayList<>();
                while (paymentItemTypeIterator.hasNext()) {
                    PaymentItemType p = paymentItemTypeIterator.next();
                    opt.add(new ItemOpt(p.getName(), String.valueOf(random.nextInt(10000)), p.getPrice()));
                }
                i.setOpt(opt);
            }
            itemList.add(i);
        }
        paymentForm.setItems(itemList);
        return new Response(0, "", paymentForm);
    }

    @PostMapping("/delete")
    public Response delete(@RequestBody Map<String, Integer> param) {
        int id = param.get("id");
        try {
            paymentRepository.deleteById(id);
            return new Response(0, "删除成功");
        } catch (Exception e) {
            return new Response(1, "删除失败，请稍后再试！");
        }
    }

    @GetMapping("/level")
    public Response level() {
        Manage manage = (Manage) httpSession.getAttribute("manage");
        if (manage == null) {
            return new Response(1, "没有权限");
        } else {
            return new Response(0, "", manage.getAdminType());
        }
    }


}
