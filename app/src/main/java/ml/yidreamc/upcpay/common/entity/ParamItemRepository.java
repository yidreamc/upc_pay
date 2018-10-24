package ml.yidreamc.upcpay.common.entity;

import ml.yidreamc.upcpay.common.entity.entityenum.ParamType;
import org.springframework.data.repository.CrudRepository;

public interface ParamItemRepository extends CrudRepository<ParamItem,Integer> {

    Iterable<ParamItem> findByPaymentIdAndAndPnum(int id, ParamType type);
}
