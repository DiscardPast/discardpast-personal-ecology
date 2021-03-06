package com.discardpast.louwailou.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.discardpast.louwailou.domain.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.discardpast.louwailou.service.HouseService;
import com.discardpast.louwailou.mapper.HouseMapper;
import com.discardpast.louwailou.domain.House;

import java.util.List;


/**
 * @author discardpast@yeah.net
 * @apiNote 房屋信息表(House)服务实现类
 * @since 2019-10-15 12:41:26
 */
@Service
public class HouseServiceImpl implements HouseService {

    @Autowired
    private HouseMapper houseMapper;

    @Override
    public House queryById(Long id) {
        return this.houseMapper.selectById(id);
    }

    @Override
    public IPage<House> queryByPage(int pageNo, int pageSize) {
        Page<House> housePage = new Page<>(pageNo,pageSize);
        return this.houseMapper.selectPage(housePage,null);
    }

    @Override
    public List<House> queryHouseByUserId(Long userId) {
        return this.houseMapper.selectHouseByUserId(userId);
    }

    @Override
    public Integer addHouse(House house) {
        return this.houseMapper.insert(house);
    }

    @Override
    public Integer updateHouse(House house) {
        return this.houseMapper.updateById(house);
    }

    @Override
    public Integer deleteHouseById(Long id) {
        return this.houseMapper.deleteById(id);
    }
}
