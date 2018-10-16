package ml.yidreamc.upcpay.common.entity;

import org.springframework.data.repository.CrudRepository;

public interface BillRepository extends CrudRepository<Bill,Integer> {

    Bill findByTaxCode(String taxcode);
}
