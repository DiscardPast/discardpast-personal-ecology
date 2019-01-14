package com.discardpast.louwailou.repository;

import com.discardpast.louwailou.dao.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

    User findUserByUserKey(String userKey);
}
