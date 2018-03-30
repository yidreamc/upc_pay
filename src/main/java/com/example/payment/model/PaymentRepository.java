package com.example.payment.model;

import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment,Integer>{

    Iterable<Payment> findByOrderByIdDesc();
    Iterable<Payment> findByAidOrderById(int aid);
}
