package com.discardpast.louwailou.service;

import com.discardpast.louwailou.domain.Staff;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author discardpast@yeah.net
 * @apiNote 员工表(Staff)服务接口
 * @since 2019-10-15 12:41:26
 */
@Service
public interface StaffService {

    /**
     * 通过id查询一条员工表数据
     * @param id
     * @return
     */
     Staff queryById(Long id);

    /**
     * 通过UserId查询一条员工表数据
     *
     * @param staff
     * @return
     */
     Staff queryStaffByStaff(Staff staff);


    /**
     * 插入一条员工表数据
     * @param staff
     * @return
     */
     Integer addStaff(Staff staff);

    /**
     * 更新一条员工表数据
     * @param staff
     * @return
     */
     Integer updateStaff(Staff staff);

    /**
     * 移除一条员工表数据
     * @param id
     * @return
     */
     Integer deleteStaffById(Long id);
}
