package com.discardpast.louwailou.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.discardpast.louwailou.service.StaffService;
import com.discardpast.louwailou.mapper.StaffMapper;
import com.discardpast.louwailou.domain.Staff;

import java.util.List;


/**
 * @author discardpast@yeah.net
 * @apiNote 员工表(Staff)服务实现类
 * @since 2019-10-15 12:41:26
 */
@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffMapper staffMapper;

    @Override
    public Staff queryById(Long id) {
        return this.staffMapper.selectById(id);
    }

    @Override
    public IPage<Staff> queryByPage(IPage<Staff> staffPage) {
        return this.staffMapper.selectPage(staffPage,null);
    }

    @Override
    public Staff queryStaffByStaff(Staff staff) {
        QueryWrapper<Staff> queryWrapper = new QueryWrapper<Staff>().eq("username",staff.getUsername()).eq("password",staff.getPassword());
        return this.staffMapper.selectOne(queryWrapper);
    }

    @Override
    public Integer addStaff(Staff staff) {
        return this.staffMapper.insert(staff);
    }

    @Override
    public Integer updateStaff(Staff staff) {
        return this.staffMapper.updateById(staff);
    }

    @Override
    public Integer deleteStaffById(Long id) {
        return this.staffMapper.deleteById(id);
    }
}
