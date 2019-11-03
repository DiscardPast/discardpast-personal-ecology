package com.discardpast.louwailou.service;

import com.discardpast.louwailou.domain.HouseApartment;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author discardpast@yeah.net
 * @apiNote 房屋户型信息表(HouseApartment)服务接口
 * @since 2019-10-15 12:41:26
 */
@Service
public interface HouseApartmentService {

    /**
     * 通过id查询一条房屋户型信息表数据
     * @param id
     * @return
     */
     HouseApartment queryById(Long id);

    /**
     * 通过UserId查询一条房屋户型信息表数据
     *
     * @param houseId
     * @return
     */
     List<HouseApartment> queryHouseApartmentListByHouseId(Long houseId);


    /**
     * 插入一条房屋户型信息表数据
     * @param houseApartment
     * @return
     */
     Integer addHouseApartment(HouseApartment houseApartment);

    /**
     * 更新一条房屋户型信息表数据
     * @param houseApartment
     * @return
     */
     Integer updateHouseApartment(HouseApartment houseApartment);

    /**
     * 移除一条房屋户型信息表数据
     * @param id
     * @return
     */
     Integer deleteHouseApartmentById(Long id);
}
