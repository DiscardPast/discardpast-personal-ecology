package com.discardpast.louwailou.mapper;

import com.discardpast.louwailou.domain.UserIntention;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 *
 * @author discardpast@yeah.net
 * @apiNote 用户意向表(UserIntention)表数据库访问层
 * @since  2019-10-15 12:41:26
 */
@Mapper
public interface UserIntentionMapper extends BaseMapper<UserIntention> {


    /**
     * 通过UserId查询用户意向表
     *
     * @param userId
     * @return
     */
     List<UserIntention> selectUserIntentionByUserId(Long userId);

}
