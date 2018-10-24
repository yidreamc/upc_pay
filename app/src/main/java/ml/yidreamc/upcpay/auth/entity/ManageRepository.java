package ml.yidreamc.upcpay.auth.entity;

import org.springframework.data.repository.CrudRepository;

public interface ManageRepository extends CrudRepository<Manage, Integer> {

    Manage findByUname(String un);

    Iterable<Manage> findByCreateId(int id);

    Manage findFirstByUnameAndPwd(String uname, String pwd);
}
