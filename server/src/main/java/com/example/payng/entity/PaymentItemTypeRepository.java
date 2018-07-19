package com.example.payng.entity;

import org.springframework.data.repository.CrudRepository;

public interface PaymentItemTypeRepository extends CrudRepository<PaymentItemType,Integer> {

    Iterable<PaymentItemType> findByItemId(int id);
}
