package com.discardpast.louwailou.dao.user.admin;

import com.discardpast.louwailou.dao.house.House;

import java.io.Serializable;
import java.util.List;

public class HouseList implements Serializable {

    private List<House> houseList;

    public List<House> getHouseList() {
        return houseList;
    }

    public void setHouseList(List<House> houseList) {
        this.houseList = houseList;
    }
}
