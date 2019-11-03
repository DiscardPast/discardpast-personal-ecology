package com.discardpast.louwailou.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.discardpast.louwailou.service.HouseImageService;
import com.discardpast.louwailou.mapper.HouseImageMapper;
import com.discardpast.louwailou.domain.HouseImage;

import java.util.List;


/**
 * @author discardpast@yeah.net
 * @apiNote 房屋信息图片表(HouseImage)服务实现类
 * @since 2019-10-15 12:41:26
 */
@Service
public class HouseImageServiceImpl implements HouseImageService {

    @Autowired
    private HouseImageMapper houseImageMapper;

    @Override
    public HouseImage queryById(Long id) {
        return this.houseImageMapper.selectById(id);
    }

    @Override
    public List<HouseImage> queryHouseImageByHouseId(Long houseId) {
        return this.houseImageMapper.selectHouseImageListByHouseId(houseId);
    }

    @Override
    public Integer addHouseImage(HouseImage houseImage) {
        return this.houseImageMapper.insert(houseImage);
    }

    @Override
    public Integer updateHouseImage(HouseImage houseImage) {
        return this.houseImageMapper.updateById(houseImage);
    }

    @Override
    public Integer deleteHouseImageById(Long id) {
        return this.houseImageMapper.deleteById(id);
    }
}
