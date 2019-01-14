package com.discardpast.louwailou.dao.mall;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CommodityList implements Serializable {

    private List<Commodity> commodityList;

    public CommodityList() {
        this.commodityList = new ArrayList<Commodity>();
    }

    public List<Commodity> getCommodityList() {
        return commodityList;
    }

    public void setCommodityList(List<Commodity> commodityList) {
        this.commodityList = commodityList;
    }
}
