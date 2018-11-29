package com.example.demo.dao.repository;

import com.example.demo.dao.vo.User;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by carloswuu on 2018/8/14.
 */
public interface UserRepository extends CrudRepository<User,Integer>{
    @Modifying
    @Query("update User p set p.address =?1 where p.id=?2")
    int updateName(String name,int id);

    @Modifying
    @Query(value = "insert into User (id,address) values(?1,?2)",nativeQuery = true)
    void insertUser(int id, String address);

    List<User> findAll(Sort sort);
}
