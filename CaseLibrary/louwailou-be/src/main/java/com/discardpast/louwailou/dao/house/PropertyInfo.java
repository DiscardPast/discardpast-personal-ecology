package com.discardpast.louwailou.dao.house;

import java.io.Serializable;
import java.util.Date;

public class PropertyInfo implements Serializable {

    //开发商
    private String propertyDeveloper;

    //区域
    private String propertyArea;

    //销售状态
    private SalesStatus propertySalesStatus;

    //产权年限
    private String propertyYears;

    //物业类别
    private PropertyType propertyType;

    //容积率
    private String propertyVolumeRate;

    //绿化率
    private String propertyGreeningRate;


    //楼栋总户数
    private String propertyHouseholdCount;

    //物业公司
    private String propertyCompany;

    //物业费
    private String propertyPrice;

    //装修状况
    private DecorationStatus propertyDecorationStatus;

    //交房时间
    private Date propertyHandingDate;

    //车位
    private String propertyParkingSpace;

    public String getPropertyDeveloper() {
        return propertyDeveloper;
    }

    public void setPropertyDeveloper(String propertyDeveloper) {
        this.propertyDeveloper = propertyDeveloper;
    }

    public String getPropertyArea() {
        return propertyArea;
    }

    public void setPropertyArea(String propertyArea) {
        this.propertyArea = propertyArea;
    }

    public SalesStatus getPropertySalesStatus() {
        return propertySalesStatus;
    }

    public void setPropertySalesStatus(SalesStatus propertySalesStatus) {
        this.propertySalesStatus = propertySalesStatus;
    }

    public String getPropertyYears() {
        return propertyYears;
    }

    public void setPropertyYears(String propertyYears) {
        this.propertyYears = propertyYears;
    }

    public PropertyType getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(PropertyType propertyType) {
        this.propertyType = propertyType;
    }

    public String getPropertyVolumeRate() {
        return propertyVolumeRate;
    }

    public void setPropertyVolumeRate(String propertyVolumeRate) {
        this.propertyVolumeRate = propertyVolumeRate;
    }

    public String getPropertyHouseholdCount() {
        return propertyHouseholdCount;
    }

    public void setPropertyHouseholdCount(String propertyHouseholdCount) {
        this.propertyHouseholdCount = propertyHouseholdCount;
    }

    public String getPropertyCompany() {
        return propertyCompany;
    }

    public void setPropertyCompany(String propertyCompany) {
        this.propertyCompany = propertyCompany;
    }

    public String getPropertyPrice() {
        return propertyPrice;
    }

    public void setPropertyPrice(String propertyPrice) {
        this.propertyPrice = propertyPrice;
    }

    public DecorationStatus getPropertyDecorationStatus() {
        return propertyDecorationStatus;
    }

    public void setPropertyDecorationStatus(DecorationStatus propertyDecorationStatus) {
        this.propertyDecorationStatus = propertyDecorationStatus;
    }

    public Date getPropertyHandingDate() {
        return propertyHandingDate;
    }

    public void setPropertyHandingDate(Date propertyHandingDate) {
        this.propertyHandingDate = propertyHandingDate;
    }

    public String getPropertyParkingSpace() {
        return propertyParkingSpace;
    }

    public void setPropertyParkingSpace(String propertyParkingSpace) {
        this.propertyParkingSpace = propertyParkingSpace;
    }

    public String getPropertyGreeningRate() {
        return propertyGreeningRate;
    }

    public void setPropertyGreeningRate(String propertyGreeningRate) {
        this.propertyGreeningRate = propertyGreeningRate;
    }
}
