package com.discardpast.louwailou.mapper;

import com.discardpast.louwailou.domain.HouseComment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 *
 * @author discardpast@yeah.net
 * @apiNote 房屋评论信息表(HouseComment)表数据库访问层
 * @since  2019-10-15 12:41:26
 */
@Mapper
public interface HouseCommentMapper extends BaseMapper<HouseComment> {


    /**
     * 通过UserId查询房屋评论信息表
     *
     * @param userId
     * @return
     */
     List<HouseComment> selectHouseCommentByUserId(Long userId);

}
