package com.example.payng.entity;

import org.springframework.data.repository.CrudRepository;

public interface ManageRepository extends CrudRepository<Manage,Integer> {

    Manage findByUname(String un);

    Iterable<Manage> findByCreateId(int id);
}
