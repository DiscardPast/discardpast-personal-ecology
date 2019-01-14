package com.discardpast.louwailou.dao.house;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ProgramDynamic implements Serializable {

    private Integer programDynamicId;

    private List<ProgramDynamicTip> programDynamicTipList;

    private List<ProgramDynamicItem> programDynamicItemList;

    public ProgramDynamic(){
        this.programDynamicItemList = new ArrayList<ProgramDynamicItem>();
        this.programDynamicTipList = new ArrayList<ProgramDynamicTip>();
    }

    public Integer getProgramDynamicId() {
        return programDynamicId;
    }

    public void setProgramDynamicId(Integer programDynamicId) {
        this.programDynamicId = programDynamicId;
    }

    public List<ProgramDynamicTip> getProgramDynamicTipList() {
        return programDynamicTipList;
    }

    public void setProgramDynamicTipList(List<ProgramDynamicTip> programDynamicTipList) {
        this.programDynamicTipList = programDynamicTipList;
    }

    public List<ProgramDynamicItem> getProgramDynamicItemList() {
        return programDynamicItemList;
    }

    public void setProgramDynamicItemList(List<ProgramDynamicItem> programDynamicItemList) {
        this.programDynamicItemList = programDynamicItemList;
    }
}
