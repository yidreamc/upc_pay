package com.example.payng.entity;

import org.springframework.data.repository.CrudRepository;

public interface OldToNewMapRepository extends CrudRepository<OldToNewMap, Integer> {

    OldToNewMap findByOldId(int oldid);
}
