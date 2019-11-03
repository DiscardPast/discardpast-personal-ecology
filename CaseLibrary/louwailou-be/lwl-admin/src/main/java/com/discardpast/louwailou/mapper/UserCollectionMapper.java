package com.discardpast.louwailou.mapper;

import com.discardpast.louwailou.domain.UserCollection;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 *
 * @author discardpast@yeah.net
 * @apiNote 用户收藏表(UserCollection)表数据库访问层
 * @since  2019-10-15 12:41:26
 */
@Mapper
public interface UserCollectionMapper extends BaseMapper<UserCollection> {


    /**
     * 通过UserId查询用户收藏表
     *
     * @param userId
     * @return
     */
     List<UserCollection> selectUserCollectionByUserId(Long userId);

}
