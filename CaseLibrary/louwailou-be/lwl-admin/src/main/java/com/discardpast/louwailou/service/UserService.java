package com.discardpast.louwailou.service;

import com.discardpast.louwailou.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author discardpast@yeah.net
 * @apiNote 用户表(User)服务接口
 * @since 2019-10-15 12:41:26
 */
@Service
public interface UserService {

    /**
     * 通过id查询一条用户表数据
     * @param id
     * @return
     */
     User queryById(Long id);

    /**
     * 查询所有用户数据
     *
     * @return
     */
     List<User> queryUserList();

    /**
     * 通过UserId查询一条用户表数据
     *
     * @param userId
     * @return
     */
     List<User> queryUserByUserId(Long userId);


    /**
     * 插入一条用户表数据
     * @param user
     * @return
     */
     Integer addUser(User user);

    /**
     * 更新一条用户表数据
     * @param user
     * @return
     */
     Integer updateUser(User user);

    /**
     * 移除一条用户表数据
     * @param id
     * @return
     */
     Integer deleteUserById(Long id);
}
