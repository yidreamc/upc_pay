package ml.yidreamc.upcpay.common.entity;

import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment,Integer> {

    Iterable<Payment> findByOrderByIdDesc();
}
