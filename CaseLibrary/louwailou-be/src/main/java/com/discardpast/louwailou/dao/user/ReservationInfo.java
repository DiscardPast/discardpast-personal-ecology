package com.discardpast.louwailou.dao.user;

import com.discardpast.louwailou.dao.house.House;
import com.discardpast.louwailou.dao.user.staff.Staff;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class ReservationInfo implements Serializable {

    @Id
    @GeneratedValue
    private Integer reservationId;

    //预约客户姓名
    private String reservationName;

    //预约客户手机号
    private String reservationPhone;

    //预约客户性别
    private String reservationGander;

    //预约客户意向项目
    private House reservationHouse;

    //预约客户带看时间
    private Date reservationDate;

    //预约带看备注
    private String reservationTips;

    //预约带看默认员工
    private Staff reservationStaff;

    //预约带看用户
    private User reservationUser;

    public ReservationInfo(House reservationHouse, Staff reservationStaff, User reservationUser) {
        this.reservationHouse = reservationHouse;
        this.reservationStaff = reservationStaff;
        this.reservationUser = reservationUser;
    }

    public Integer getReservationId() {
        return reservationId;
    }

    public void setReservationId(Integer reservationId) {
        this.reservationId = reservationId;
    }

    public String getReservationName() {
        return reservationName;
    }

    public void setReservationName(String reservationName) {
        this.reservationName = reservationName;
    }

    public String getReservationPhone() {
        return reservationPhone;
    }

    public void setReservationPhone(String reservationPhone) {
        this.reservationPhone = reservationPhone;
    }

    public String getReservationGander() {
        return reservationGander;
    }

    public void setReservationGander(String reservationGander) {
        this.reservationGander = reservationGander;
    }

    public House getReservationHouse() {
        return reservationHouse;
    }

    public void setReservationHouse(House reservationHouse) {
        this.reservationHouse = reservationHouse;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public String getReservationTips() {
        return reservationTips;
    }

    public void setReservationTips(String reservationTips) {
        this.reservationTips = reservationTips;
    }

    public Staff getReservationStaff() {
        return reservationStaff;
    }

    public void setReservationStaff(Staff reservationStaff) {
        this.reservationStaff = reservationStaff;
    }

    public User getReservationUser() {
        return reservationUser;
    }

    public void setReservationUser(User reservationUser) {
        this.reservationUser = reservationUser;
    }
}
