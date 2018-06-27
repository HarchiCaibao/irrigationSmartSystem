package com.wangfeng.bean;

public class User {
    private Integer iId;

    private String username;

    private String password;

    public User(Integer iId, String username, String password) {
		super();
		this.iId = iId;
		this.username = username;
		this.password = password;
	}

	public User() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public Integer getiId() {
        return iId;
    }

    public void setiId(Integer iId) {
        this.iId = iId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}