package com.discardpast.louwailou.mapper;

import com.discardpast.louwailou.domain.House;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 *
 * @author discardpast@yeah.net
 * @apiNote 房屋信息表(House)表数据库访问层
 * @since  2019-10-15 12:41:26
 */
@Mapper
public interface HouseMapper extends BaseMapper<House> {


    /**
     * 通过UserId查询房屋信息表
     *
     * @param userId
     * @return
     */
     List<House> selectHouseByUserId(Long userId);

}
