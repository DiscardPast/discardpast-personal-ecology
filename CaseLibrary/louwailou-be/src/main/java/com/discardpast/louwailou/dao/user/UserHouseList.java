package com.discardpast.louwailou.dao.user;

import com.discardpast.louwailou.dao.house.House;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UserHouseList implements Serializable {

    //用户关注项目列表
    private List<House> houseList;

    UserHouseList()
    {
        this.houseList = new ArrayList<>();
    }

    public List<House> getHouseList() {
        return houseList;
    }

    public void setHouseList(List<House> houseList) {
        this.houseList = houseList;
    }
}
