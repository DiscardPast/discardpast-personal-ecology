package com.discardpast.louwailou.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.discardpast.louwailou.service.FollowRecordService;
import com.discardpast.louwailou.mapper.FollowRecordMapper;
import com.discardpast.louwailou.domain.FollowRecord;

import java.util.List;


/**
 * @author discardpast@yeah.net
 * @apiNote 跟进记录表(FollowRecord)服务实现类
 * @since 2019-10-15 12:41:26
 */
@Service
public class FollowRecordServiceImpl implements FollowRecordService {

    @Autowired
    private FollowRecordMapper followRecordMapper;

    @Override
    public FollowRecord queryById(Long id) {
        return this.followRecordMapper.selectById(id);
    }

    @Override
    public List<FollowRecord> queryFollowRecordByUserId(Long userId) {
        return this.followRecordMapper.selectFollowRecordByUserId(userId);
    }

    @Override
    public Integer addFollowRecord(FollowRecord followRecord) {
        return this.followRecordMapper.insert(followRecord);
    }

    @Override
    public Integer updateFollowRecord(FollowRecord followRecord) {
        return this.followRecordMapper.updateById(followRecord);
    }

    @Override
    public Integer deleteFollowRecordById(Long id) {
        return this.followRecordMapper.deleteById(id);
    }
}
