package com.discardpast.louwailou.dao.program_filter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ProgramAreaFilterTypeList implements Serializable {

    private List<ProgramAreaFilterTypeItem> programAreaFilterTypeItems;

    public ProgramAreaFilterTypeList(){
        this.programAreaFilterTypeItems = new ArrayList<>();
    }

    public List<ProgramAreaFilterTypeItem> getProgramAreaFilterTypeItems() {
        return programAreaFilterTypeItems;
    }

    public void setProgramAreaFilterTypeItems(List<ProgramAreaFilterTypeItem> programAreaFilterTypeItems) {
        this.programAreaFilterTypeItems = programAreaFilterTypeItems;
    }
}
