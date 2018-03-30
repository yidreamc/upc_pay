package com.example.payment.model;

import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface AdminRepository extends CrudRepository<Admin,Integer>{

    Collection<Admin> findAdminByUnameAndPwd(String uname, String pwd);

    Admin findFirstByUname(String uname);

    Admin findFirstByUnameAndPwd(String uname,String pwd);

    Iterable<Admin> findBySadmin(int s);
}
