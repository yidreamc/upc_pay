package com.example.payment.model;

import com.example.payment.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order,Integer>{
}
