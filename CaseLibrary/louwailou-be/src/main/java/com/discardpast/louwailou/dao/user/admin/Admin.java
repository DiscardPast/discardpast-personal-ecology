package com.discardpast.louwailou.dao.user.admin;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Admin {

    @Id
    private Integer admindId;

    //管理员姓名
    private String adminName;

    //管理员密码
    private String adminPassword;

    //客户列表
    @Lob
    private ClientList clientList;

    //房源列表
    @Lob
    private HouseList houseList;

    //员工列表
    @Lob
    private StaffList staffList;

    //用户列表
    @Lob
    private UserList userList;

    public Integer getAdmindId() {
        return admindId;
    }

    public void setAdmindId(Integer admindId) {
        this.admindId = admindId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public ClientList getClientList() {
        return clientList;
    }

    public void setClientList(ClientList clientList) {
        this.clientList = clientList;
    }

    public HouseList getHouseList() {
        return houseList;
    }

    public void setHouseList(HouseList houseList) {
        this.houseList = houseList;
    }

    public StaffList getStaffList() {
        return staffList;
    }

    public void setStaffList(StaffList staffList) {
        this.staffList = staffList;
    }

    public UserList getUserList() {
        return userList;
    }

    public void setUserList(UserList userList) {
        this.userList = userList;
    }
}
