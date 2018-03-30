package com.example.payment.model;

import org.springframework.data.repository.CrudRepository;

public interface BillRepository extends CrudRepository<Bill,Integer>{

    Bill findByTaxCode(String taxcode);
}
