package com.discardpast.louwailou.dao.user.staff;

import com.discardpast.louwailou.dao.house.House;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class StaffHouseRecord implements Serializable {

    private List<StaffHouseRecordItem> staffHouseRecordItemList;

    public StaffHouseRecord(){
        this.staffHouseRecordItemList = new ArrayList<StaffHouseRecordItem>();
    }

    public List<StaffHouseRecordItem> getStaffHouseRecordItemList() {
        return staffHouseRecordItemList;
    }

    public void setStaffHouseRecordItemList(List<StaffHouseRecordItem> staffHouseRecordItemList) {
        this.staffHouseRecordItemList = staffHouseRecordItemList;
    }
}
