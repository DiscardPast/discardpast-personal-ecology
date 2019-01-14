package com.discardpast.louwailou.dao.user.admin;

import com.discardpast.louwailou.dao.user.User;

import java.io.Serializable;
import java.util.List;

public class UserList implements Serializable {

    private List<User> userList;

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
