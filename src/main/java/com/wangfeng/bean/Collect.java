package com.wangfeng.bean;

import java.util.Date;

public class Collect {
    private Integer cId;

    private Date cTime;

    private Integer pointId;

    private Double soilTemper;

    private Double soilHumid;

    private Double airTemper;

    private Double airHumid;

    private Double windSpeed;

    private String windDirection;

    private Double rain;

    public Collect() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public Collect(Integer cId, Date cTime, Integer pointId, Double soilTemper, Double soilHumid, Double airTemper,
			Double airHumid, Double windSpeed, String windDirection, Double rain) {
		super();
		this.cId = cId;
		this.cTime = cTime;
		this.pointId = pointId;
		this.soilTemper = soilTemper;
		this.soilHumid = soilHumid;
		this.airTemper = airTemper;
		this.airHumid = airHumid;
		this.windSpeed = windSpeed;
		this.windDirection = windDirection;
		this.rain = rain;
	}

	public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Date getcTime() {
        return cTime;
    }

    public void setcTime(Date cTime) {
        this.cTime = cTime;
    }

    public Integer getPointId() {
        return pointId;
    }

    public void setPointId(Integer pointId) {
        this.pointId = pointId;
    }

    public Double getSoilTemper() {
        return soilTemper;
    }

    public void setSoilTemper(Double soilTemper) {
        this.soilTemper = soilTemper;
    }

    public Double getSoilHumid() {
        return soilHumid;
    }

    public void setSoilHumid(Double soilHumid) {
        this.soilHumid = soilHumid;
    }

    public Double getAirTemper() {
        return airTemper;
    }

    public void setAirTemper(Double airTemper) {
        this.airTemper = airTemper;
    }

    public Double getAirHumid() {
        return airHumid;
    }

    public void setAirHumid(Double airHumid) {
        this.airHumid = airHumid;
    }

    public Double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection == null ? null : windDirection.trim();
    }

    public Double getRain() {
        return rain;
    }

    public void setRain(Double rain) {
        this.rain = rain;
    }
}