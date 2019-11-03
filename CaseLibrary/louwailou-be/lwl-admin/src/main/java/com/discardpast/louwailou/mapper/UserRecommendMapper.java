package com.discardpast.louwailou.mapper;

import com.discardpast.louwailou.domain.UserRecommend;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 *
 * @author discardpast@yeah.net
 * @apiNote 用户推荐表(UserRecommend)表数据库访问层
 * @since  2019-10-15 12:41:26
 */
@Mapper
public interface UserRecommendMapper extends BaseMapper<UserRecommend> {


    /**
     * 通过UserId查询用户推荐表
     *
     * @param userId
     * @return
     */
     List<UserRecommend> selectUserRecommendByUserId(Long userId);

}
