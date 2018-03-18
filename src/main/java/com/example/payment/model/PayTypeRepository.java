package com.example.payment.model;

import org.springframework.data.repository.CrudRepository;

public interface PayTypeRepository extends CrudRepository<PayType,Integer>{
    Iterable<PayType> findByPid(int pid);
}
