package com.discardpast.louwailou.dao.user.client;

import com.discardpast.louwailou.dao.house.House;
import com.discardpast.louwailou.dao.user.staff.Staff;
import com.discardpast.louwailou.dao.user.staff.StaffHouseRecord;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Client implements Serializable {

    @Id
    @GeneratedValue
    //客户Id
    private Integer clientId;

    //客户姓名
    private String clientName;

    //客户手机号
    private String clientPhone;

    //客户性别
    private String clientGender;

    //客户中意项目
    @Lob
    private House clientHouse;

    //客户员工编码
    private String clientStaffCode;

    //备注
    private String clientTips;

    //客户跟进人
    @Lob
    private Staff staff;

    //客户有效期
    //客户有效期起始
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date staffValidityStart;

    //客户有效期结束
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date staffValidityStop;

    //客户最后跟进时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date staffLastTime;



    //客户跟进记录展示
    @Lob
    private StaffHouseRecord staffHouseRecord;

    //跟进状态
    private ClientStatus clientStatus;

    public Client() {
        this.clientHouse = new House();
        this.staff = new Staff();
        this.staffHouseRecord = new StaffHouseRecord();
        this.clientStatus = ClientStatus.NOT_FOLLOWED_UP;
    }


    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    public String getClientGender() {
        return clientGender;
    }

    public void setClientGender(String clientGender) {
        this.clientGender = clientGender;
    }

    public House getClientHouse() {
        return clientHouse;
    }

    public void setClientHouse(House clientHouse) {
        this.clientHouse = clientHouse;
    }

    public String getClientStaffCode() {
        return clientStaffCode;
    }

    public void setClientStaffCode(String clientStaffCode) {
        this.clientStaffCode = clientStaffCode;
    }

    public String getClientTips() {
        return clientTips;
    }

    public void setClientTips(String clientTips) {
        this.clientTips = clientTips;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Date getStaffValidityStart() {
        return staffValidityStart;
    }

    public void setStaffValidityStart(Date staffValidityStart) {
        this.staffValidityStart = staffValidityStart;
    }

    public Date getStaffValidityStop() {
        return staffValidityStop;
    }

    public void setStaffValidityStop(Date staffValidityStop) {
        this.staffValidityStop = staffValidityStop;
    }

    public Date getStaffLastTime() {
        return staffLastTime;
    }

    public void setStaffLastTime(Date staffLastTime) {
        this.staffLastTime = staffLastTime;
    }
}
