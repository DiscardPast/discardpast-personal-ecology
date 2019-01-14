package com.discardpast.louwailou.dao.house;

import java.io.Serializable;

public class ProgramDynamicTip implements Serializable {

    private String programDynamicTipTitle;

    private Integer programDynamicTipCount;

    public String getProgramDynamicTipTitle() {
        return programDynamicTipTitle;
    }

    public void setProgramDynamicTipTitle(String programDynamicTipTitle) {
        this.programDynamicTipTitle = programDynamicTipTitle;
    }

    public Integer getProgramDynamicTipCount() {
        return programDynamicTipCount;
    }

    public void setProgramDynamicTipCount(Integer programDynamicTipCount) {
        this.programDynamicTipCount = programDynamicTipCount;
    }
}
