package com.discardpast.louwailou.mapper;

import com.discardpast.louwailou.domain.HouseImage;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 *
 * @author discardpast@yeah.net
 * @apiNote 房屋信息图片表(HouseImage)表数据库访问层
 * @since  2019-10-15 12:41:26
 */
@Mapper
public interface HouseImageMapper extends BaseMapper<HouseImage> {


    /**
     * 通过UserId查询房屋信息图片表
     *
     * @param houseId
     * @return
     */
     List<HouseImage> selectHouseImageListByHouseId(Long houseId);

}
