package com.discardpast.louwailou.dao.program_filter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ProgramAreaFilterTypeItem implements Serializable {

    private String ProgramAreaFilterTypeItemName;

    private List<ProgramAreaFilterTypeCity> programAreaFilterTypeCities;

     public ProgramAreaFilterTypeItem(){
        this.programAreaFilterTypeCities = new ArrayList<>();
    }

    public String getProgramAreaFilterTypeItemName() {
        return ProgramAreaFilterTypeItemName;
    }

    public void setProgramAreaFilterTypeItemName(String programAreaFilterTypeItemName) {
        ProgramAreaFilterTypeItemName = programAreaFilterTypeItemName;
    }

    public List<ProgramAreaFilterTypeCity> getProgramAreaFilterTypeCities() {
        return programAreaFilterTypeCities;
    }

    public void setProgramAreaFilterTypeCities(List<ProgramAreaFilterTypeCity> programAreaFilterTypeCities) {
        this.programAreaFilterTypeCities = programAreaFilterTypeCities;
    }
}
