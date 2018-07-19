package com.example.payng.entity;

import com.example.payng.entity.entityenum.ParamType;
import org.springframework.data.repository.CrudRepository;

public interface ParamItemRepository extends CrudRepository<ParamItem,Integer> {

    Iterable<ParamItem> findByPaymentIdAndAndPnum(int id, ParamType type);
}
