package com.example.payng.entity;

import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment,Integer> {

    Iterable<Payment> findByOrderByIdDesc();
}
