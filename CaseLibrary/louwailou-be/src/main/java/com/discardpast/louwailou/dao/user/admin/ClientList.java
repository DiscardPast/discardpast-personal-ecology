package com.discardpast.louwailou.dao.user.admin;

import com.discardpast.louwailou.dao.user.client.Client;

import java.io.Serializable;
import java.util.List;

public class ClientList implements Serializable {

    //所有用户信息
    private List<Client> clientList;

    public List<Client> getClientList() {
        return clientList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }
}
