package com.discardpast.louwailou.mapper;

import com.discardpast.louwailou.domain.HouseApartment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 *
 * @author discardpast@yeah.net
 * @apiNote 房屋户型信息表(HouseApartment)表数据库访问层
 * @since  2019-10-15 12:41:26
 */
@Mapper
public interface HouseApartmentMapper extends BaseMapper<HouseApartment> {


    /**
     * 通过UserId查询房屋户型信息表
     *
     * @param houseId
     * @return
     */
     List<HouseApartment> selectHouseApartmentListByHouseId(Long houseId);

}
