package com.discardpast.louwailou.dao.program_filter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ProgramAreaFilterTypeCityAreaItem implements Serializable {

    private String ProgramAreaFilterTypeCityAreaItemName;

    private String ProgramAreaFilterTypeCityAreaItemPrice;

    private List<ProgramAreaFilterTypeCityAreaItemStreet> programAreaFilterTypeCityAreaItemStreets;

    public ProgramAreaFilterTypeCityAreaItem(){
        this.programAreaFilterTypeCityAreaItemStreets = new ArrayList<>();
    }

    public String getProgramAreaFilterTypeCityAreaItemName() {
        return ProgramAreaFilterTypeCityAreaItemName;
    }

    public void setProgramAreaFilterTypeCityAreaItemName(String programAreaFilterTypeCityAreaItemName) {
        ProgramAreaFilterTypeCityAreaItemName = programAreaFilterTypeCityAreaItemName;
    }

    public String getProgramAreaFilterTypeCityAreaItemPrice() {
        return ProgramAreaFilterTypeCityAreaItemPrice;
    }

    public void setProgramAreaFilterTypeCityAreaItemPrice(String programAreaFilterTypeCityAreaItemPrice) {
        ProgramAreaFilterTypeCityAreaItemPrice = programAreaFilterTypeCityAreaItemPrice;
    }

    public List<ProgramAreaFilterTypeCityAreaItemStreet> getProgramAreaFilterTypeCityAreaItemStreets() {
        return programAreaFilterTypeCityAreaItemStreets;
    }

    public void setProgramAreaFilterTypeCityAreaItemStreets(List<ProgramAreaFilterTypeCityAreaItemStreet> programAreaFilterTypeCityAreaItemStreets) {
        this.programAreaFilterTypeCityAreaItemStreets = programAreaFilterTypeCityAreaItemStreets;
    }
}
