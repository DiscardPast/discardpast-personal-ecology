package com.discardpast.louwailou.mapper;

import com.discardpast.louwailou.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 *
 * @author discardpast@yeah.net
 * @apiNote 用户表(User)表数据库访问层
 * @since  2019-10-15 12:41:26
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {


    /**
     * 通过UserId查询用户表
     *
     * @param userId
     * @return
     */
     List<User> selectUserByUserId(Long userId);

}
