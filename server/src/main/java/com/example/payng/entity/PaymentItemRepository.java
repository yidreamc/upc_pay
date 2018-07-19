package com.example.payng.entity;

import org.springframework.data.repository.CrudRepository;


public interface PaymentItemRepository extends CrudRepository<PaymentItem,Integer> {

    Iterable<PaymentItem> findByPaymentId(int id);
}
