package com.discardpast.louwailou.dao.user;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue
    //用户Id
    private Integer userId;

    //用户key
    private String userKey;

    //用户类型
    private UserType userType;

    //用户微信昵称
    private String userNickName;

    //用户微信头像
    private String userAvatar;

    //用户推荐积分
    private Integer userIntegral;

    //用户姓名
    private String userName;

    //用户手机号
    private String userPhone;

    //员工邀请码
    private String staffCode;

    //用户手机验证码
    private String phoneCode;

    //身份证正面
    private String idCardPositive;

    //身份证背面
    private String idCardBack;

    //用户关注项目列表
    @Lob
    private UserHouseList userHouseList;

    //置业顾问佣金
    private Integer userBonus;

    //用户推荐列表
    @Lob
    private ConsultantClientList consultantClientList;

    public User(){
        this.userType = UserType.USER;
        this.userHouseList = new UserHouseList();
        this.consultantClientList = new ConsultantClientList();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    public Integer getUserIntegral() {
        return userIntegral;
    }

    public void setUserIntegral(Integer userIntegral) {
        this.userIntegral = userIntegral;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getStaffCode() {
        return staffCode;
    }

    public void setStaffCode(String staffCode) {
        this.staffCode = staffCode;
    }

    public String getIdCardPositive() {
        return idCardPositive;
    }

    public void setIdCardPositive(String idCardPositive) {
        this.idCardPositive = idCardPositive;
    }

    public String getIdCardBack() {
        return idCardBack;
    }

    public void setIdCardBack(String idCardBack) {
        this.idCardBack = idCardBack;
    }

    public UserHouseList getUserHouseList() {
        return userHouseList;
    }

    public void setUserHouseList(UserHouseList userHouseList) {
        this.userHouseList = userHouseList;
    }

    public ConsultantClientList getConsultantClientList() {
        return consultantClientList;
    }

    public void setConsultantClientList(ConsultantClientList consultantClientList) {
        this.consultantClientList = consultantClientList;
    }

    public String getUserKey() {
        return userKey;
    }

    public void setUserKey(String userKey) {
        this.userKey = userKey;
    }

    public Integer getUserBonus() {
        return userBonus;
    }

    public void setUserBonus(Integer userBonus) {
        this.userBonus = userBonus;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }
}
