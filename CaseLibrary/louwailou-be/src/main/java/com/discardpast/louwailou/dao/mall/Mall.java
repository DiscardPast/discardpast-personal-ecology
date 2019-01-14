package com.discardpast.louwailou.dao.mall;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.io.Serializable;

@Entity
public class Mall implements Serializable {

    @Id
    @GeneratedValue
    private Integer mallId;

    @Lob
    private MallImageList mallImageList;

    @Lob
    private CommodityList commodityList;

    public Mall()
    {
        this.mallImageList = new MallImageList();
        this.commodityList = new CommodityList();
    }

    public Integer getMallId() {
        return mallId;
    }

    public void setMallId(Integer mallId) {
        this.mallId = mallId;
    }

    public MallImageList getMallImageList() {
        return mallImageList;
    }

    public void setMallImageList(MallImageList mallImageList) {
        this.mallImageList = mallImageList;
    }

    public CommodityList getCommodityList() {
        return commodityList;
    }

    public void setCommodityList(CommodityList commodityList) {
        this.commodityList = commodityList;
    }
}
