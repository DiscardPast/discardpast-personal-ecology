package com.discardpast.louwailou.dao.house;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class HouseImageLinkList implements Serializable {

    private List<String> houseImageLinkList;

    public HouseImageLinkList(){
        this.houseImageLinkList = new ArrayList<String>();
    }

    public List<String> getHouseImageLinkList() {
        return houseImageLinkList;
    }

    public void setHouseImageLinkList(List<String> houseImageLinkList) {
        this.houseImageLinkList = houseImageLinkList;
    }
}
