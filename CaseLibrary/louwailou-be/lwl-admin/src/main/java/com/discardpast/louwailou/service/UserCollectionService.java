package com.discardpast.louwailou.service;

import com.discardpast.louwailou.domain.UserCollection;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author discardpast@yeah.net
 * @apiNote 用户收藏表(UserCollection)服务接口
 * @since 2019-10-15 12:41:26
 */
@Service
public interface UserCollectionService {

    /**
     * 通过id查询一条用户收藏表数据
     * @param id
     * @return
     */
     UserCollection queryById(Long id);

    /**
     * 通过UserId查询一条用户收藏表数据
     *
     * @param userId
     * @return
     */
     List<UserCollection> queryUserCollectionByUserId(Long userId);


    /**
     * 插入一条用户收藏表数据
     * @param userCollection
     * @return
     */
     Integer addUserCollection(UserCollection userCollection);

    /**
     * 更新一条用户收藏表数据
     * @param userCollection
     * @return
     */
     Integer updateUserCollection(UserCollection userCollection);

    /**
     * 移除一条用户收藏表数据
     * @param id
     * @return
     */
     Integer deleteUserCollectionById(Long id);
}
