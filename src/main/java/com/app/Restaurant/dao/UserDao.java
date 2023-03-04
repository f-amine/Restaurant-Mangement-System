package com.app.Restaurant.dao;

import com.app.Restaurant.POJO.User;
import com.app.Restaurant.wrapper.UserWrapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface UserDao extends JpaRepository<User,Integer> {

    User findByEmailId(@Param("email") String email);
    List<UserWrapper> getAllUser();

    List<String> getAllAdmin();

    @Transactional
    @Modifying
    Integer updateStatus(@Param("status") String status,@Param("id") Integer id);
}
