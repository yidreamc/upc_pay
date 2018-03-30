package com.example.payment.model;

import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item,Integer>{

    Iterable<Item> findByNameid(int nameid);
}
