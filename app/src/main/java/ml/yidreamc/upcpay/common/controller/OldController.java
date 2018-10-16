package ml.yidreamc.upcpay.common.controller;

import ml.yidreamc.upcpay.common.entity.OldToNewMap;
import ml.yidreamc.upcpay.common.entity.OldToNewMapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 兼容旧版本
 */
@Controller
public class OldController {

    @Autowired
    private OldToNewMapRepository oldToNewMapRepository;

    @Value("${app.fronturl}")
    private String fronturl;

    @GetMapping(value = "/pay", params = {"id"})
    public String map(int id){
        OldToNewMap oldToNewMap = oldToNewMapRepository.findByOldId(id);
        int newId = oldToNewMap.getNewId();
        return "redirect:" + fronturl + "/%23/pay?id=" + newId;
    }

}
