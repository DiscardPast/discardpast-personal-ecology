package com.discardpast.louwailou.dao.user.staff;

import java.io.Serializable;
import java.util.Date;

public class StaffHouseRecordItem implements Serializable {

    //员工带看日期
    private Date staffHouseRecordItemDate;

    //员工带看描述
    private String staffHouseRecordItemContent;

    public Date getStaffHouseRecordItemDate() {
        return staffHouseRecordItemDate;
    }

    public void setStaffHouseRecordItemDate(Date staffHouseRecordItemDate) {
        this.staffHouseRecordItemDate = staffHouseRecordItemDate;
    }

    public String getStaffHouseRecordItemContent() {
        return staffHouseRecordItemContent;
    }

    public void setStaffHouseRecordItemContent(String staffHouseRecordItemContent) {
        this.staffHouseRecordItemContent = staffHouseRecordItemContent;
    }
}
