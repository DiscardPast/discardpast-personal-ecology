package com.discardpast.louwailou.dao.mall;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CommodityImageList implements Serializable {

    private List<String> commodityImageList;

    public CommodityImageList() {
        this.commodityImageList = new ArrayList<String>();
    }

    public List<String> getCommodityImageList() {
        return commodityImageList;
    }

    public void setCommodityImageList(List<String> commodityImageList) {
        this.commodityImageList = commodityImageList;
    }
}
