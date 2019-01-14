package com.discardpast.louwailou.dao.house;

import java.io.Serializable;

public class HousePoint implements Serializable {

    private boolean isStay0;

    private boolean isStay1;

    private boolean isStay2;

    private boolean isStay3;

    private boolean isStay4;

    public HousePoint() {
        this.isStay0 = false;
        this.isStay1 = false;
        this.isStay2 = false;
        this.isStay3 = false;
        this.isStay4 = false;
    }

    public boolean isStay0() {
        return isStay0;
    }

    public void setStay0(boolean stay0) {
        isStay0 = stay0;
    }

    public boolean isStay1() {
        return isStay1;
    }

    public void setStay1(boolean stay1) {
        isStay1 = stay1;
    }

    public boolean isStay2() {
        return isStay2;
    }

    public void setStay2(boolean stay2) {
        isStay2 = stay2;
    }

    public boolean isStay3() {
        return isStay3;
    }

    public void setStay3(boolean stay3) {
        isStay3 = stay3;
    }

    public boolean isStay4() {
        return isStay4;
    }

    public void setStay4(boolean stay4) {
        isStay4 = stay4;
    }
}
