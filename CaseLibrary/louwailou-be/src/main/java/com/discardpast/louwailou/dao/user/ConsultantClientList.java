package com.discardpast.louwailou.dao.user;

import com.discardpast.louwailou.dao.user.client.Client;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ConsultantClientList implements Serializable {

    private List<Client> clientList;

    public ConsultantClientList() {
        this.clientList = new ArrayList<>();
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }
}
