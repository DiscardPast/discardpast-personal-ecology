package com.discardpast.louwailou.dao.user.admin;

import com.discardpast.louwailou.dao.user.staff.Staff;

import java.io.Serializable;
import java.util.List;

public class StaffList implements Serializable {

    private List<Staff> staffList;

    public List<Staff> getStaffList() {
        return staffList;
    }

    public void setStaffList(List<Staff> staffList) {
        this.staffList = staffList;
    }
}
