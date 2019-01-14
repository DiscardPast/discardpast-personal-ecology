package com.discardpast.louwailou.dao.mall;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MallImageList implements Serializable {

    private List<String> mallImageListItemList;

    public MallImageList(){
        this.mallImageListItemList = new ArrayList<String>();
    }

    public List<String> getMallImageListItemList() {
        return mallImageListItemList;
    }

    public void setMallImageListItemList(List<String> mallImageListItemList) {
        this.mallImageListItemList = mallImageListItemList;
    }
}
