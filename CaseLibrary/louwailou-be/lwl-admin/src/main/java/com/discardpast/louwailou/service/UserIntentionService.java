package com.discardpast.louwailou.service;

import com.discardpast.louwailou.domain.UserIntention;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author discardpast@yeah.net
 * @apiNote 用户意向表(UserIntention)服务接口
 * @since 2019-10-15 12:41:26
 */
@Service
public interface UserIntentionService {

    /**
     * 通过id查询一条用户意向表数据
     * @param id
     * @return
     */
     UserIntention queryById(Long id);

    /**
     * 通过UserId查询一条用户意向表数据
     *
     * @param userId
     * @return
     */
     List<UserIntention> queryUserIntentionByUserId(Long userId);


    /**
     * 插入一条用户意向表数据
     * @param userIntention
     * @return
     */
     Integer addUserIntention(UserIntention userIntention);

    /**
     * 更新一条用户意向表数据
     * @param userIntention
     * @return
     */
     Integer updateUserIntention(UserIntention userIntention);

    /**
     * 移除一条用户意向表数据
     * @param id
     * @return
     */
     Integer deleteUserIntentionById(Long id);
}
