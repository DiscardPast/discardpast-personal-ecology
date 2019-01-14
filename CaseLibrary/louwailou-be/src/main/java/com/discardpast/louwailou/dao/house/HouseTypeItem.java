package com.discardpast.louwailou.dao.house;

import java.io.Serializable;

public class HouseTypeItem implements Serializable {

    private String houseTypeImageLink;

    private String houseTypeContent;

    public String getHouseTypeImageLink() {
        return houseTypeImageLink;
    }

    public void setHouseTypeImageLink(String houseTypeImageLink) {
        this.houseTypeImageLink = houseTypeImageLink;
    }

    public String getHouseTypeContent() {
        return houseTypeContent;
    }

    public void setHouseTypeContent(String houseTypeContent) {
        this.houseTypeContent = houseTypeContent;
    }
}
