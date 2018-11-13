package com.xiaotang.test.entity;

import java.io.Serializable;

public class User implements Serializable {
    private Integer id;

    private String userName;

    private String userPwd;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    @Override
    public String toString() {
        return "id = " + getId() + ", username = " + getUserName() + ", userpwd =" + getUserPwd();
    }
}