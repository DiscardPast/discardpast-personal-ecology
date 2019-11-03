package com.discardpast.louwailou.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.discardpast.louwailou.service.HouseApartmentImageService;
import com.discardpast.louwailou.mapper.HouseApartmentImageMapper;
import com.discardpast.louwailou.domain.HouseApartmentImage;

import java.util.List;


/**
 * @author discardpast@yeah.net
 * @apiNote 房屋信息图片表(HouseApartmentImage)服务实现类
 * @since 2019-10-31 11:59:36
 */
@Service
public class HouseApartmentImageServiceImpl implements HouseApartmentImageService {

    @Autowired
    private HouseApartmentImageMapper houseApartmentImageMapper;

    @Override
    public HouseApartmentImage queryById(Long id) {
        return this.houseApartmentImageMapper.selectById(id);
    }

    @Override
    public List<HouseApartmentImage> queryHouseApartmentImageListByIdList(List<Long> houseApartmentIdList) {
        return this.houseApartmentImageMapper.selectBatchIds(houseApartmentIdList);
    }

    @Override
    public IPage<HouseApartmentImage> queryByPage(IPage<HouseApartmentImage> page) {
        QueryWrapper<HouseApartmentImage> queryWrapper = new QueryWrapper<HouseApartmentImage>().eq("deleted",0);
        return this.houseApartmentImageMapper.selectPage(page,queryWrapper);
    }

    @Override
    public Integer addHouseApartmentImage(HouseApartmentImage houseApartmentImage) {
        return this.houseApartmentImageMapper.insert(houseApartmentImage);
    }

    @Override
    public Integer updateHouseApartmentImage(HouseApartmentImage houseApartmentImage) {
        return this.houseApartmentImageMapper.updateById(houseApartmentImage);
    }

    @Override
    public Integer removeHouseApartmentImageById(Long id) {
        return this.houseApartmentImageMapper.deleteById(id);
    }
}
