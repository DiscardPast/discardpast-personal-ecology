package com.discardpast.louwailou.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.discardpast.louwailou.domain.HouseApartmentImage;

import java.util.List;


/**
 * @author discardpast@yeah.net
 * @apiNote 房屋信息图片表(HouseApartmentImage)服务接口
 * @since 2019-10-31 11:59:36
 */
public interface HouseApartmentImageService {

    /**
     * 通过id查询一条房屋信息图片表数据
     * @param id
     * @return
     */
     HouseApartmentImage queryById(Long id);

    /**
     * 通过id查询一条房屋信息图片表数据
     * @param houseApartmentIdList
     * @return
     */
     List<HouseApartmentImage> queryHouseApartmentImageListByIdList(List<Long> houseApartmentIdList);


    /**
     * 分页查询所有房屋户型信息图片表数据
     *
     * @param page
     * @return
     */
    IPage<HouseApartmentImage> queryByPage(IPage<HouseApartmentImage> page);

    /**
     * 插入一条房屋户型信息图片表数据
     * @param houseApartmentImage
     * @return
     */
     Integer addHouseApartmentImage(HouseApartmentImage houseApartmentImage);

    /**
     * 更新一条房屋户型信息图片表数据
     * @param houseApartmentImage
     * @return
     */
     Integer updateHouseApartmentImage(HouseApartmentImage houseApartmentImage);

    /**
     * 移除一条房屋户型信息图片表数据
     * @param id
     * @return
     */
     Integer removeHouseApartmentImageById(Long id);
}
