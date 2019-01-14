package com.discardpast.louwailou.dao.house;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class HouseType implements Serializable {

    private String houseTypeName;

    private List<HouseTypeItem> houseTypeList;

    public HouseType(){
        this.houseTypeList = new ArrayList<>();
    }

    public String getHouseTypeName() {
        return houseTypeName;
    }

    public void setHouseTypeName(String houseTypeName) {
        this.houseTypeName = houseTypeName;
    }

    public List<HouseTypeItem> getHouseTypeList() {
        return houseTypeList;
    }

    public void setHouseTypeList(List<HouseTypeItem> houseTypeList) {
        this.houseTypeList = houseTypeList;
    }
}
