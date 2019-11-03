package com.discardpast.louwailou.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.discardpast.louwailou.service.UserCollectionService;
import com.discardpast.louwailou.mapper.UserCollectionMapper;
import com.discardpast.louwailou.domain.UserCollection;

import java.util.List;


/**
 * @author discardpast@yeah.net
 * @apiNote 用户收藏表(UserCollection)服务实现类
 * @since 2019-10-15 12:41:26
 */
@Service
public class UserCollectionServiceImpl implements UserCollectionService {

    @Autowired
    private UserCollectionMapper userCollectionMapper;

    @Override
    public UserCollection queryById(Long id) {
        return this.userCollectionMapper.selectById(id);
    }

    @Override
    public List<UserCollection> queryUserCollectionByUserId(Long userId) {
        return this.userCollectionMapper.selectUserCollectionByUserId(userId);
    }

    @Override
    public Integer addUserCollection(UserCollection userCollection) {
        return this.userCollectionMapper.insert(userCollection);
    }

    @Override
    public Integer updateUserCollection(UserCollection userCollection) {
        return this.userCollectionMapper.updateById(userCollection);
    }

    @Override
    public Integer deleteUserCollectionById(Long id) {
        return this.userCollectionMapper.deleteById(id);
    }
}
