package com.discardpast.louwailou.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.discardpast.louwailou.service.UserService;
import com.discardpast.louwailou.mapper.UserMapper;
import com.discardpast.louwailou.domain.User;

import java.util.List;


/**
 * @author discardpast@yeah.net
 * @apiNote 用户表(User)服务实现类
 * @since 2019-10-15 12:41:26
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryById(Long id) {
        return this.userMapper.selectById(id);
    }

    @Override
    public List<User> queryUserList() {
        return this.userMapper.selectList(new QueryWrapper<User>().eq("deleted",0));
    }

    @Override
    public List<User> queryUserByUserId(Long userId) {
        return this.userMapper.selectUserByUserId(userId);
    }

    @Override
    public Integer addUser(User user) {
        return this.userMapper.insert(user);
    }

    @Override
    public Integer updateUser(User user) {
        return this.userMapper.updateById(user);
    }

    @Override
    public Integer deleteUserById(Long id) {
        return this.userMapper.deleteById(id);
    }
}
