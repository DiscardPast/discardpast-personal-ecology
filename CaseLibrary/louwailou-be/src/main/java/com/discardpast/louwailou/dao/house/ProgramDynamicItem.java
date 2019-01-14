package com.discardpast.louwailou.dao.house;

import java.io.Serializable;
import java.util.Date;

public class ProgramDynamicItem implements Serializable {

    private Date programDynamicItemDate;

    private String programDynamicItemTitle;

    private String programDynamicItemContent;

    private ProgramDynamicTip programDynamicTip;

    public ProgramDynamicItem()
    {
        this.programDynamicTip = new ProgramDynamicTip();
    }

    public Date getProgramDynamicItemDate() {
        return programDynamicItemDate;
    }

    public void setProgramDynamicItemDate(Date programDynamicItemDate) {
        this.programDynamicItemDate = programDynamicItemDate;
    }

    public String getProgramDynamicItemTitle() {
        return programDynamicItemTitle;
    }

    public void setProgramDynamicItemTitle(String programDynamicItemTitle) {
        this.programDynamicItemTitle = programDynamicItemTitle;
    }

    public String getProgramDynamicItemContent() {
        return programDynamicItemContent;
    }

    public void setProgramDynamicItemContent(String programDynamicItemContent) {
        this.programDynamicItemContent = programDynamicItemContent;
    }

    public ProgramDynamicTip getProgramDynamicTip() {
        return programDynamicTip;
    }

    public void setProgramDynamicTip(ProgramDynamicTip programDynamicTip) {
        this.programDynamicTip = programDynamicTip;
    }
}
