package com.discardpast.louwailou.dao.program_filter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.io.Serializable;

@Entity
public class ProgramAreaFilter implements Serializable {

    @Id
    @GeneratedValue
    private Integer programAreaFilterId;

    @Lob
    private ProgramAreaFilterTypeList programAreaFilterTypeList;

    public ProgramAreaFilter()
    {
        this.programAreaFilterTypeList = new ProgramAreaFilterTypeList();
    }

    public Integer getProgramAreaFilterId() {
        return programAreaFilterId;
    }

    public void setProgramAreaFilterId(Integer programAreaFilterId) {
        this.programAreaFilterId = programAreaFilterId;
    }

    public ProgramAreaFilterTypeList getProgramAreaFilterTypeList() {
        return programAreaFilterTypeList;
    }

    public void setProgramAreaFilterTypeList(ProgramAreaFilterTypeList programAreaFilterTypeList) {
        this.programAreaFilterTypeList = programAreaFilterTypeList;
    }
}
