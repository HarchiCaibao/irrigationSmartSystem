package com.wangfeng.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CollectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CollectExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCIdIsNull() {
            addCriterion("c_id is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("c_id is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(Integer value) {
            addCriterion("c_id =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(Integer value) {
            addCriterion("c_id <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(Integer value) {
            addCriterion("c_id >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_id >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(Integer value) {
            addCriterion("c_id <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_id <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<Integer> values) {
            addCriterion("c_id in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<Integer> values) {
            addCriterion("c_id not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(Integer value1, Integer value2) {
            addCriterion("c_id between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_id not between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCTimeIsNull() {
            addCriterion("c_time is null");
            return (Criteria) this;
        }

        public Criteria andCTimeIsNotNull() {
            addCriterion("c_time is not null");
            return (Criteria) this;
        }

        public Criteria andCTimeEqualTo(Date value) {
            addCriterion("c_time =", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeNotEqualTo(Date value) {
            addCriterion("c_time <>", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeGreaterThan(Date value) {
            addCriterion("c_time >", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("c_time >=", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeLessThan(Date value) {
            addCriterion("c_time <", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeLessThanOrEqualTo(Date value) {
            addCriterion("c_time <=", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeIn(List<Date> values) {
            addCriterion("c_time in", values, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeNotIn(List<Date> values) {
            addCriterion("c_time not in", values, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeBetween(Date value1, Date value2) {
            addCriterion("c_time between", value1, value2, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeNotBetween(Date value1, Date value2) {
            addCriterion("c_time not between", value1, value2, "cTime");
            return (Criteria) this;
        }

        public Criteria andPointIdIsNull() {
            addCriterion("point_id is null");
            return (Criteria) this;
        }

        public Criteria andPointIdIsNotNull() {
            addCriterion("point_id is not null");
            return (Criteria) this;
        }

        public Criteria andPointIdEqualTo(Integer value) {
            addCriterion("point_id =", value, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdNotEqualTo(Integer value) {
            addCriterion("point_id <>", value, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdGreaterThan(Integer value) {
            addCriterion("point_id >", value, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("point_id >=", value, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdLessThan(Integer value) {
            addCriterion("point_id <", value, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdLessThanOrEqualTo(Integer value) {
            addCriterion("point_id <=", value, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdIn(List<Integer> values) {
            addCriterion("point_id in", values, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdNotIn(List<Integer> values) {
            addCriterion("point_id not in", values, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdBetween(Integer value1, Integer value2) {
            addCriterion("point_id between", value1, value2, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdNotBetween(Integer value1, Integer value2) {
            addCriterion("point_id not between", value1, value2, "pointId");
            return (Criteria) this;
        }

        public Criteria andSoilTemperIsNull() {
            addCriterion("soil_temper is null");
            return (Criteria) this;
        }

        public Criteria andSoilTemperIsNotNull() {
            addCriterion("soil_temper is not null");
            return (Criteria) this;
        }

        public Criteria andSoilTemperEqualTo(Double value) {
            addCriterion("soil_temper =", value, "soilTemper");
            return (Criteria) this;
        }

        public Criteria andSoilTemperNotEqualTo(Double value) {
            addCriterion("soil_temper <>", value, "soilTemper");
            return (Criteria) this;
        }

        public Criteria andSoilTemperGreaterThan(Double value) {
            addCriterion("soil_temper >", value, "soilTemper");
            return (Criteria) this;
        }

        public Criteria andSoilTemperGreaterThanOrEqualTo(Double value) {
            addCriterion("soil_temper >=", value, "soilTemper");
            return (Criteria) this;
        }

        public Criteria andSoilTemperLessThan(Double value) {
            addCriterion("soil_temper <", value, "soilTemper");
            return (Criteria) this;
        }

        public Criteria andSoilTemperLessThanOrEqualTo(Double value) {
            addCriterion("soil_temper <=", value, "soilTemper");
            return (Criteria) this;
        }

        public Criteria andSoilTemperIn(List<Double> values) {
            addCriterion("soil_temper in", values, "soilTemper");
            return (Criteria) this;
        }

        public Criteria andSoilTemperNotIn(List<Double> values) {
            addCriterion("soil_temper not in", values, "soilTemper");
            return (Criteria) this;
        }

        public Criteria andSoilTemperBetween(Double value1, Double value2) {
            addCriterion("soil_temper between", value1, value2, "soilTemper");
            return (Criteria) this;
        }

        public Criteria andSoilTemperNotBetween(Double value1, Double value2) {
            addCriterion("soil_temper not between", value1, value2, "soilTemper");
            return (Criteria) this;
        }

        public Criteria andSoilHumidIsNull() {
            addCriterion("soil_humid is null");
            return (Criteria) this;
        }

        public Criteria andSoilHumidIsNotNull() {
            addCriterion("soil_humid is not null");
            return (Criteria) this;
        }

        public Criteria andSoilHumidEqualTo(Double value) {
            addCriterion("soil_humid =", value, "soilHumid");
            return (Criteria) this;
        }

        public Criteria andSoilHumidNotEqualTo(Double value) {
            addCriterion("soil_humid <>", value, "soilHumid");
            return (Criteria) this;
        }

        public Criteria andSoilHumidGreaterThan(Double value) {
            addCriterion("soil_humid >", value, "soilHumid");
            return (Criteria) this;
        }

        public Criteria andSoilHumidGreaterThanOrEqualTo(Double value) {
            addCriterion("soil_humid >=", value, "soilHumid");
            return (Criteria) this;
        }

        public Criteria andSoilHumidLessThan(Double value) {
            addCriterion("soil_humid <", value, "soilHumid");
            return (Criteria) this;
        }

        public Criteria andSoilHumidLessThanOrEqualTo(Double value) {
            addCriterion("soil_humid <=", value, "soilHumid");
            return (Criteria) this;
        }

        public Criteria andSoilHumidIn(List<Double> values) {
            addCriterion("soil_humid in", values, "soilHumid");
            return (Criteria) this;
        }

        public Criteria andSoilHumidNotIn(List<Double> values) {
            addCriterion("soil_humid not in", values, "soilHumid");
            return (Criteria) this;
        }

        public Criteria andSoilHumidBetween(Double value1, Double value2) {
            addCriterion("soil_humid between", value1, value2, "soilHumid");
            return (Criteria) this;
        }

        public Criteria andSoilHumidNotBetween(Double value1, Double value2) {
            addCriterion("soil_humid not between", value1, value2, "soilHumid");
            return (Criteria) this;
        }

        public Criteria andAirTemperIsNull() {
            addCriterion("air_temper is null");
            return (Criteria) this;
        }

        public Criteria andAirTemperIsNotNull() {
            addCriterion("air_temper is not null");
            return (Criteria) this;
        }

        public Criteria andAirTemperEqualTo(Double value) {
            addCriterion("air_temper =", value, "airTemper");
            return (Criteria) this;
        }

        public Criteria andAirTemperNotEqualTo(Double value) {
            addCriterion("air_temper <>", value, "airTemper");
            return (Criteria) this;
        }

        public Criteria andAirTemperGreaterThan(Double value) {
            addCriterion("air_temper >", value, "airTemper");
            return (Criteria) this;
        }

        public Criteria andAirTemperGreaterThanOrEqualTo(Double value) {
            addCriterion("air_temper >=", value, "airTemper");
            return (Criteria) this;
        }

        public Criteria andAirTemperLessThan(Double value) {
            addCriterion("air_temper <", value, "airTemper");
            return (Criteria) this;
        }

        public Criteria andAirTemperLessThanOrEqualTo(Double value) {
            addCriterion("air_temper <=", value, "airTemper");
            return (Criteria) this;
        }

        public Criteria andAirTemperIn(List<Double> values) {
            addCriterion("air_temper in", values, "airTemper");
            return (Criteria) this;
        }

        public Criteria andAirTemperNotIn(List<Double> values) {
            addCriterion("air_temper not in", values, "airTemper");
            return (Criteria) this;
        }

        public Criteria andAirTemperBetween(Double value1, Double value2) {
            addCriterion("air_temper between", value1, value2, "airTemper");
            return (Criteria) this;
        }

        public Criteria andAirTemperNotBetween(Double value1, Double value2) {
            addCriterion("air_temper not between", value1, value2, "airTemper");
            return (Criteria) this;
        }

        public Criteria andAirHumidIsNull() {
            addCriterion("air_humid is null");
            return (Criteria) this;
        }

        public Criteria andAirHumidIsNotNull() {
            addCriterion("air_humid is not null");
            return (Criteria) this;
        }

        public Criteria andAirHumidEqualTo(Double value) {
            addCriterion("air_humid =", value, "airHumid");
            return (Criteria) this;
        }

        public Criteria andAirHumidNotEqualTo(Double value) {
            addCriterion("air_humid <>", value, "airHumid");
            return (Criteria) this;
        }

        public Criteria andAirHumidGreaterThan(Double value) {
            addCriterion("air_humid >", value, "airHumid");
            return (Criteria) this;
        }

        public Criteria andAirHumidGreaterThanOrEqualTo(Double value) {
            addCriterion("air_humid >=", value, "airHumid");
            return (Criteria) this;
        }

        public Criteria andAirHumidLessThan(Double value) {
            addCriterion("air_humid <", value, "airHumid");
            return (Criteria) this;
        }

        public Criteria andAirHumidLessThanOrEqualTo(Double value) {
            addCriterion("air_humid <=", value, "airHumid");
            return (Criteria) this;
        }

        public Criteria andAirHumidIn(List<Double> values) {
            addCriterion("air_humid in", values, "airHumid");
            return (Criteria) this;
        }

        public Criteria andAirHumidNotIn(List<Double> values) {
            addCriterion("air_humid not in", values, "airHumid");
            return (Criteria) this;
        }

        public Criteria andAirHumidBetween(Double value1, Double value2) {
            addCriterion("air_humid between", value1, value2, "airHumid");
            return (Criteria) this;
        }

        public Criteria andAirHumidNotBetween(Double value1, Double value2) {
            addCriterion("air_humid not between", value1, value2, "airHumid");
            return (Criteria) this;
        }

        public Criteria andWindSpeedIsNull() {
            addCriterion("wind_speed is null");
            return (Criteria) this;
        }

        public Criteria andWindSpeedIsNotNull() {
            addCriterion("wind_speed is not null");
            return (Criteria) this;
        }

        public Criteria andWindSpeedEqualTo(Double value) {
            addCriterion("wind_speed =", value, "windSpeed");
            return (Criteria) this;
        }

        public Criteria andWindSpeedNotEqualTo(Double value) {
            addCriterion("wind_speed <>", value, "windSpeed");
            return (Criteria) this;
        }

        public Criteria andWindSpeedGreaterThan(Double value) {
            addCriterion("wind_speed >", value, "windSpeed");
            return (Criteria) this;
        }

        public Criteria andWindSpeedGreaterThanOrEqualTo(Double value) {
            addCriterion("wind_speed >=", value, "windSpeed");
            return (Criteria) this;
        }

        public Criteria andWindSpeedLessThan(Double value) {
            addCriterion("wind_speed <", value, "windSpeed");
            return (Criteria) this;
        }

        public Criteria andWindSpeedLessThanOrEqualTo(Double value) {
            addCriterion("wind_speed <=", value, "windSpeed");
            return (Criteria) this;
        }

        public Criteria andWindSpeedIn(List<Double> values) {
            addCriterion("wind_speed in", values, "windSpeed");
            return (Criteria) this;
        }

        public Criteria andWindSpeedNotIn(List<Double> values) {
            addCriterion("wind_speed not in", values, "windSpeed");
            return (Criteria) this;
        }

        public Criteria andWindSpeedBetween(Double value1, Double value2) {
            addCriterion("wind_speed between", value1, value2, "windSpeed");
            return (Criteria) this;
        }

        public Criteria andWindSpeedNotBetween(Double value1, Double value2) {
            addCriterion("wind_speed not between", value1, value2, "windSpeed");
            return (Criteria) this;
        }

        public Criteria andWindDirectionIsNull() {
            addCriterion("wind_direction is null");
            return (Criteria) this;
        }

        public Criteria andWindDirectionIsNotNull() {
            addCriterion("wind_direction is not null");
            return (Criteria) this;
        }

        public Criteria andWindDirectionEqualTo(String value) {
            addCriterion("wind_direction =", value, "windDirection");
            return (Criteria) this;
        }

        public Criteria andWindDirectionNotEqualTo(String value) {
            addCriterion("wind_direction <>", value, "windDirection");
            return (Criteria) this;
        }

        public Criteria andWindDirectionGreaterThan(String value) {
            addCriterion("wind_direction >", value, "windDirection");
            return (Criteria) this;
        }

        public Criteria andWindDirectionGreaterThanOrEqualTo(String value) {
            addCriterion("wind_direction >=", value, "windDirection");
            return (Criteria) this;
        }

        public Criteria andWindDirectionLessThan(String value) {
            addCriterion("wind_direction <", value, "windDirection");
            return (Criteria) this;
        }

        public Criteria andWindDirectionLessThanOrEqualTo(String value) {
            addCriterion("wind_direction <=", value, "windDirection");
            return (Criteria) this;
        }

        public Criteria andWindDirectionLike(String value) {
            addCriterion("wind_direction like", value, "windDirection");
            return (Criteria) this;
        }

        public Criteria andWindDirectionNotLike(String value) {
            addCriterion("wind_direction not like", value, "windDirection");
            return (Criteria) this;
        }

        public Criteria andWindDirectionIn(List<String> values) {
            addCriterion("wind_direction in", values, "windDirection");
            return (Criteria) this;
        }

        public Criteria andWindDirectionNotIn(List<String> values) {
            addCriterion("wind_direction not in", values, "windDirection");
            return (Criteria) this;
        }

        public Criteria andWindDirectionBetween(String value1, String value2) {
            addCriterion("wind_direction between", value1, value2, "windDirection");
            return (Criteria) this;
        }

        public Criteria andWindDirectionNotBetween(String value1, String value2) {
            addCriterion("wind_direction not between", value1, value2, "windDirection");
            return (Criteria) this;
        }

        public Criteria andRainIsNull() {
            addCriterion("rain is null");
            return (Criteria) this;
        }

        public Criteria andRainIsNotNull() {
            addCriterion("rain is not null");
            return (Criteria) this;
        }

        public Criteria andRainEqualTo(Double value) {
            addCriterion("rain =", value, "rain");
            return (Criteria) this;
        }

        public Criteria andRainNotEqualTo(Double value) {
            addCriterion("rain <>", value, "rain");
            return (Criteria) this;
        }

        public Criteria andRainGreaterThan(Double value) {
            addCriterion("rain >", value, "rain");
            return (Criteria) this;
        }

        public Criteria andRainGreaterThanOrEqualTo(Double value) {
            addCriterion("rain >=", value, "rain");
            return (Criteria) this;
        }

        public Criteria andRainLessThan(Double value) {
            addCriterion("rain <", value, "rain");
            return (Criteria) this;
        }

        public Criteria andRainLessThanOrEqualTo(Double value) {
            addCriterion("rain <=", value, "rain");
            return (Criteria) this;
        }

        public Criteria andRainIn(List<Double> values) {
            addCriterion("rain in", values, "rain");
            return (Criteria) this;
        }

        public Criteria andRainNotIn(List<Double> values) {
            addCriterion("rain not in", values, "rain");
            return (Criteria) this;
        }

        public Criteria andRainBetween(Double value1, Double value2) {
            addCriterion("rain between", value1, value2, "rain");
            return (Criteria) this;
        }

        public Criteria andRainNotBetween(Double value1, Double value2) {
            addCriterion("rain not between", value1, value2, "rain");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}