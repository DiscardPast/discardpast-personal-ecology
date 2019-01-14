package com.discardpast.louwailou.dao.program_filter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ProgramAreaFilterTypeCity implements Serializable {

    private String ProgramAreaFilterTypeCityType;

    private List<ProgramAreaFilterTypeCityAreaItem>  programAreaFilterTypeCityAreaItems;

    public ProgramAreaFilterTypeCity()
    {
        this.programAreaFilterTypeCityAreaItems = new ArrayList<>();
    }

    public String getProgramAreaFilterTypeCityType() {
        return ProgramAreaFilterTypeCityType;
    }

    public void setProgramAreaFilterTypeCityType(String programAreaFilterTypeCityType) {
        ProgramAreaFilterTypeCityType = programAreaFilterTypeCityType;
    }

    public List<ProgramAreaFilterTypeCityAreaItem> getProgramAreaFilterTypeCityAreaItems() {
        return programAreaFilterTypeCityAreaItems;
    }

    public void setProgramAreaFilterTypeCityAreaItems(List<ProgramAreaFilterTypeCityAreaItem> programAreaFilterTypeCityAreaItems) {
        this.programAreaFilterTypeCityAreaItems = programAreaFilterTypeCityAreaItems;
    }
}
