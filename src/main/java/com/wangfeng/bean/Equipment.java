package com.wangfeng.bean;

public class Equipment {
    private Integer eId;

    private String eName;

    private String eType;

    private String eFactory;

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName == null ? null : eName.trim();
    }

    public String geteType() {
        return eType;
    }

    public void seteType(String eType) {
        this.eType = eType == null ? null : eType.trim();
    }

    public String geteFactory() {
        return eFactory;
    }

    public void seteFactory(String eFactory) {
        this.eFactory = eFactory == null ? null : eFactory.trim();
    }

	public Equipment() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public Equipment(Integer eId, String eName, String eType, String eFactory) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eType = eType;
		this.eFactory = eFactory;
	}
    
}