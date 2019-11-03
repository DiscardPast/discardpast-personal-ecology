package com.discardpast.louwailou.service;

import com.discardpast.louwailou.domain.FollowRecord;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author discardpast@yeah.net
 * @apiNote 跟进记录表(FollowRecord)服务接口
 * @since 2019-10-15 12:41:26
 */
@Service
public interface FollowRecordService {

    /**
     * 通过id查询一条跟进记录表数据
     * @param id
     * @return
     */
     FollowRecord queryById(Long id);

    /**
     * 通过UserId查询一条跟进记录表数据
     *
     * @param userId
     * @return
     */
     List<FollowRecord> queryFollowRecordByUserId(Long userId);


    /**
     * 插入一条跟进记录表数据
     * @param followRecord
     * @return
     */
     Integer addFollowRecord(FollowRecord followRecord);

    /**
     * 更新一条跟进记录表数据
     * @param followRecord
     * @return
     */
     Integer updateFollowRecord(FollowRecord followRecord);

    /**
     * 移除一条跟进记录表数据
     * @param id
     * @return
     */
     Integer deleteFollowRecordById(Long id);
}
