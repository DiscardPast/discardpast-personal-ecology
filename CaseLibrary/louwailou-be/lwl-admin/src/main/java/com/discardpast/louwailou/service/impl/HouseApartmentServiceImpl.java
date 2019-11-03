package com.discardpast.louwailou.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.discardpast.louwailou.service.HouseApartmentService;
import com.discardpast.louwailou.mapper.HouseApartmentMapper;
import com.discardpast.louwailou.domain.HouseApartment;

import java.util.List;


/**
 * @author discardpast@yeah.net
 * @apiNote 房屋户型信息表(HouseApartment)服务实现类
 * @since 2019-10-15 12:41:26
 */
@Service
public class HouseApartmentServiceImpl implements HouseApartmentService {

    @Autowired
    private HouseApartmentMapper houseApartmentMapper;

    @Override
    public HouseApartment queryById(Long id) {
        return this.houseApartmentMapper.selectById(id);
    }

    @Override
    public List<HouseApartment> queryHouseApartmentListByHouseId(Long houseId) {
        return this.houseApartmentMapper.selectHouseApartmentListByHouseId(houseId);
    }

    @Override
    public Integer addHouseApartment(HouseApartment houseApartment) {
        return this.houseApartmentMapper.insert(houseApartment);
    }

    @Override
    public Integer updateHouseApartment(HouseApartment houseApartment) {
        return this.houseApartmentMapper.updateById(houseApartment);
    }

    @Override
    public Integer deleteHouseApartmentById(Long id) {
        return this.houseApartmentMapper.deleteById(id);
    }
}
