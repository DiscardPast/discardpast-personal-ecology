package com.discardpast.louwailou.action;

import com.discardpast.louwailou.domain.Staff;
import com.discardpast.louwailou.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @apiNote 员工表(Staff)业务逻辑服务类
 * @author discardpast@yeah.net
 * @since 2019-10-15 12:41:26
 */
@Component
public class StaffAction{

    @Autowired
    private StaffService staffService;

    public boolean staffLogin(Staff staff)
    {
        Staff entityStaff = this.staffService.queryStaffByStaff(staff);
        if(entityStaff != null)
        {
            return true;
        }
        return false;
    }
}
