package com.discardpast.louwailou.service;

import com.discardpast.louwailou.domain.UserRecommend;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author discardpast@yeah.net
 * @apiNote 用户推荐表(UserRecommend)服务接口
 * @since 2019-10-15 12:41:26
 */
@Service
public interface UserRecommendService {

    /**
     * 通过id查询一条用户推荐表数据
     * @param id
     * @return
     */
     UserRecommend queryById(Long id);

    /**
     * 通过UserId查询一条用户推荐表数据
     *
     * @param userId
     * @return
     */
     List<UserRecommend> queryUserRecommendByUserId(Long userId);


    /**
     * 插入一条用户推荐表数据
     * @param userRecommend
     * @return
     */
     Integer addUserRecommend(UserRecommend userRecommend);

    /**
     * 更新一条用户推荐表数据
     * @param userRecommend
     * @return
     */
     Integer updateUserRecommend(UserRecommend userRecommend);

    /**
     * 移除一条用户推荐表数据
     * @param id
     * @return
     */
     Integer deleteUserRecommendById(Long id);
}
