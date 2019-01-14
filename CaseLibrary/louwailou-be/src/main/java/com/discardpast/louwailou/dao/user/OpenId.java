package com.discardpast.louwailou.dao.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class OpenId implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;

    private String code;

    private String OpenIdKey;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getOpenIdKey() {
        return OpenIdKey;
    }

    public void setOpenIdKey(String openIdKey) {
        OpenIdKey = openIdKey;
    }
}
