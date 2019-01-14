package com.discardpast.louwailou.dao.house;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class HouseTypeList implements Serializable {
    private List<HouseType> houseTypeList;

    public HouseTypeList(){
        this.houseTypeList = new ArrayList<HouseType>();
    }

    public List<HouseType> getHouseTypeList() {
        return houseTypeList;
    }

    public void setHouseTypeList(List<HouseType> houseTypeList) {
        this.houseTypeList = houseTypeList;
    }
}
