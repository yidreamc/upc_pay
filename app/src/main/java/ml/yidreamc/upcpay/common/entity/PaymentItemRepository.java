package ml.yidreamc.upcpay.common.entity;

import org.springframework.data.repository.CrudRepository;


public interface PaymentItemRepository extends CrudRepository<PaymentItem,Integer> {

    Iterable<PaymentItem> findByPaymentId(int id);
}
