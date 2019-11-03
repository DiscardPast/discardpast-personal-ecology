package com.discardpast.louwailou.service;

import com.discardpast.louwailou.domain.HouseImage;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author discardpast@yeah.net
 * @apiNote 房屋信息图片表(HouseImage)服务接口
 * @since 2019-10-15 12:41:26
 */
@Service
public interface HouseImageService {

    /**
     * 通过id查询一条房屋信息图片表数据
     * @param id
     * @return
     */
     HouseImage queryById(Long id);

    /**
     * 通过UserId查询一条房屋信息图片表数据
     *
     * @param houseId
     * @return
     */
     List<HouseImage> queryHouseImageByHouseId(Long houseId);


    /**
     * 插入一条房屋信息图片表数据
     * @param houseImage
     * @return
     */
     Integer addHouseImage(HouseImage houseImage);

    /**
     * 更新一条房屋信息图片表数据
     * @param houseImage
     * @return
     */
     Integer updateHouseImage(HouseImage houseImage);

    /**
     * 移除一条房屋信息图片表数据
     * @param id
     * @return
     */
     Integer deleteHouseImageById(Long id);
}
