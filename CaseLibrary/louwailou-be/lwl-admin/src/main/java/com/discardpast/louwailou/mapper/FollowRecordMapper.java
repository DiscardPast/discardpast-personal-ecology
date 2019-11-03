package com.discardpast.louwailou.mapper;

import com.discardpast.louwailou.domain.FollowRecord;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 *
 * @author discardpast@yeah.net
 * @apiNote 跟进记录表(FollowRecord)表数据库访问层
 * @since  2019-10-15 12:41:26
 */
@Mapper
public interface FollowRecordMapper extends BaseMapper<FollowRecord> {


    /**
     * 通过UserId查询跟进记录表
     *
     * @param userId
     * @return
     */
     List<FollowRecord> selectFollowRecordByUserId(Long userId);

}
