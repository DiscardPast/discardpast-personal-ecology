package com.discardpast.louwailou.dao.user.staff;

import com.discardpast.louwailou.dao.user.ReservationInfo;
import com.discardpast.louwailou.dao.user.client.Client;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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

    //员工客户列表
    @Lob
    private List<Client> clientList;

    //员工带看列表
    @Lob
    private List<ReservationInfo> reservationInfoList;

    //员工带看项目记录
    @Lob
    private StaffHouseRecord staffHouseRecord;

    public Staff() {
        this.staffHouseRecord = new StaffHouseRecord();
        this.clientList = new ArrayList<Client>();
        this.reservationInfoList = new ArrayList<ReservationInfo>();
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


    public StaffHouseRecord getStaffHouseRecord() {
        return staffHouseRecord;
    }

    public void setStaffHouseRecord(StaffHouseRecord staffHouseRecord) {
        this.staffHouseRecord = staffHouseRecord;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }

    public void setReservationInfoList(List<ReservationInfo> reservationInfoList) {
        this.reservationInfoList = reservationInfoList;
    }
}
