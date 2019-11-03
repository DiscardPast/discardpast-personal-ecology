package com.discardpast.louwailou.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.discardpast.louwailou.service.UserIntentionService;
import com.discardpast.louwailou.mapper.UserIntentionMapper;
import com.discardpast.louwailou.domain.UserIntention;

import java.util.List;


/**
 * @author discardpast@yeah.net
 * @apiNote 用户意向表(UserIntention)服务实现类
 * @since 2019-10-15 12:41:26
 */
@Service
public class UserIntentionServiceImpl implements UserIntentionService {

    @Autowired
    private UserIntentionMapper userIntentionMapper;

    @Override
    public UserIntention queryById(Long id) {
        return this.userIntentionMapper.selectById(id);
    }

    @Override
    public List<UserIntention> queryUserIntentionByUserId(Long userId) {
        return this.userIntentionMapper.selectUserIntentionByUserId(userId);
    }

    @Override
    public Integer addUserIntention(UserIntention userIntention) {
        return this.userIntentionMapper.insert(userIntention);
    }

    @Override
    public Integer updateUserIntention(UserIntention userIntention) {
        return this.userIntentionMapper.updateById(userIntention);
    }

    @Override
    public Integer deleteUserIntentionById(Long id) {
        return this.userIntentionMapper.deleteById(id);
    }
}
