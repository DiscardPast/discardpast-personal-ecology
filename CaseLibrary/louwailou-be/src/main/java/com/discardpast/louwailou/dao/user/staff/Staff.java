package com.discardpast.louwailou.dao.user.staff;

import com.discardpast.louwailou.dao.house.House;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Staff implements Serializable{

    @Id
    @GeneratedValue
    //员工Id
    private Integer staffId;

    //员工姓名
    private String staffName;

    //员工性别
    private String staffGender;

    //员工手机号
    private String staffPhone;

    //员工编码
    private String staffCode;

    //员工带看项目列表
    private House staffHouse;

    //员工带看项目记录
    private StaffHouseRecord staffHouseRecord;

    public Staff() {
        this.staffHouse = new House();
        this.staffHouseRecord = new StaffHouseRecord();
    }


    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffGender() {
        return staffGender;
    }

    public void setStaffGender(String staffGender) {
        this.staffGender = staffGender;
    }

    public String getStaffPhone() {
        return staffPhone;
    }

    public void setStaffPhone(String staffPhone) {
        this.staffPhone = staffPhone;
    }

    public String getStaffCode() {
        return staffCode;
    }

    public void setStaffCode(String staffCode) {
        this.staffCode = staffCode;
    }

    public House getStaffHouse() {
        return staffHouse;
    }

    public void setStaffHouse(House staffHouse) {
        this.staffHouse = staffHouse;
    }

    public StaffHouseRecord getStaffHouseRecord() {
        return staffHouseRecord;
    }

    public void setStaffHouseRecord(StaffHouseRecord staffHouseRecord) {
        this.staffHouseRecord = staffHouseRecord;
    }
}
