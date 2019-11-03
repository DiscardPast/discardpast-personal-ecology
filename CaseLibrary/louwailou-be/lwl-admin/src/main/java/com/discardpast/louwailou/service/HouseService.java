package com.discardpast.louwailou.service;

import com.discardpast.louwailou.domain.House;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author discardpast@yeah.net
 * @apiNote 房屋信息表(House)服务接口
 * @since 2019-10-15 12:41:26
 */
@Service
public interface HouseService {

    /**
     * 通过id查询一条房屋信息表数据
     * @param id
     * @return
     */
     House queryById(Long id);

    /**
     * 查询所有用户数据
     *
     * @return
     */
    List<House> queryHouseList();

    /**
     * 通过UserId查询一条房屋信息表数据
     *
     * @param userId
     * @return
     */
     List<House> queryHouseByUserId(Long userId);


    /**
     * 插入一条房屋信息表数据
     * @param house
     * @return
     */
     Integer addHouse(House house);

    /**
     * 更新一条房屋信息表数据
     * @param house
     * @return
     */
     Integer updateHouse(House house);

    /**
     * 移除一条房屋信息表数据
     * @param id
     * @return
     */
     Integer deleteHouseById(Long id);
}
