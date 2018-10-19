package ml.yidreamc.upcpay.common.entity;

import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

public interface ManageRepository extends CrudRepository<Manage, Integer> {

    Manage findByUname(String un);

    Iterable<Manage> findByCreateId(int id);

    Manage findFirstByUnameAndPwd(String uname, String pwd);
}
