package com.discardpast.louwailou.dao.mall;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Commodity implements Serializable{

    @Id
    @GeneratedValue
    private Integer CommodityId;

    private String commodityTitle;

    //兑换所需积分
    private Integer commodityIntegral;

    //市场价格
    private Integer commodityPrice;

    @Lob
    private CommodityImageList commodityImageList;

    public Commodity(){
        this.commodityImageList = new CommodityImageList();
    }

    public Integer getCommodityId() {
        return CommodityId;
    }

    public void setCommodityId(Integer commodityId) {
        CommodityId = commodityId;
    }

    public String getCommodityTitle() {
        return commodityTitle;
    }

    public void setCommodityTitle(String commodityTitle) {
        this.commodityTitle = commodityTitle;
    }

    public Integer getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(Integer commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    public CommodityImageList getCommodityImageList() {
        return commodityImageList;
    }

    public void setCommodityImageList(CommodityImageList commodityImageList) {
        this.commodityImageList = commodityImageList;
    }

    public Integer getCommodityIntegral() {
        return commodityIntegral;
    }

    public void setCommodityIntegral(Integer commodityIntegral) {
        this.commodityIntegral = commodityIntegral;
    }
}
