package com.discardpast.louwailou.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.discardpast.louwailou.service.UserRecommendService;
import com.discardpast.louwailou.mapper.UserRecommendMapper;
import com.discardpast.louwailou.domain.UserRecommend;

import java.util.List;


/**
 * @author discardpast@yeah.net
 * @apiNote 用户推荐表(UserRecommend)服务实现类
 * @since 2019-10-15 12:41:26
 */
@Service
public class UserRecommendServiceImpl implements UserRecommendService {

    @Autowired
    private UserRecommendMapper userRecommendMapper;

    @Override
    public UserRecommend queryById(Long id) {
        return this.userRecommendMapper.selectById(id);
    }

    @Override
    public List<UserRecommend> queryUserRecommendByUserId(Long userId) {
        return this.userRecommendMapper.selectUserRecommendByUserId(userId);
    }

    @Override
    public Integer addUserRecommend(UserRecommend userRecommend) {
        return this.userRecommendMapper.insert(userRecommend);
    }

    @Override
    public Integer updateUserRecommend(UserRecommend userRecommend) {
        return this.userRecommendMapper.updateById(userRecommend);
    }

    @Override
    public Integer deleteUserRecommendById(Long id) {
        return this.userRecommendMapper.deleteById(id);
    }
}
