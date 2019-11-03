package com.discardpast.louwailou.mapper;

import com.discardpast.louwailou.domain.Staff;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 *
 * @author discardpast@yeah.net
 * @apiNote 员工表(Staff)表数据库访问层
 * @since  2019-10-15 12:41:26
 */
@Mapper
public interface StaffMapper extends BaseMapper<Staff> {


    /**
     * 通过UserId查询员工表
     *
     * @param userId
     * @return
     */
     List<Staff> selectStaffByUserId(Long userId);

}
