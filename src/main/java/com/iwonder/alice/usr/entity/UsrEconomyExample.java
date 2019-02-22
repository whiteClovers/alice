package com.iwonder.alice.usr.entity;

import java.util.ArrayList;
import java.util.List;

public class UsrEconomyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsrEconomyExample() {
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

        public Criteria andEconomyIdIsNull() {
            addCriterion("economy_id is null");
            return (Criteria) this;
        }

        public Criteria andEconomyIdIsNotNull() {
            addCriterion("economy_id is not null");
            return (Criteria) this;
        }

        public Criteria andEconomyIdEqualTo(String value) {
            addCriterion("economy_id =", value, "economyId");
            return (Criteria) this;
        }

        public Criteria andEconomyIdNotEqualTo(String value) {
            addCriterion("economy_id <>", value, "economyId");
            return (Criteria) this;
        }

        public Criteria andEconomyIdGreaterThan(String value) {
            addCriterion("economy_id >", value, "economyId");
            return (Criteria) this;
        }

        public Criteria andEconomyIdGreaterThanOrEqualTo(String value) {
            addCriterion("economy_id >=", value, "economyId");
            return (Criteria) this;
        }

        public Criteria andEconomyIdLessThan(String value) {
            addCriterion("economy_id <", value, "economyId");
            return (Criteria) this;
        }

        public Criteria andEconomyIdLessThanOrEqualTo(String value) {
            addCriterion("economy_id <=", value, "economyId");
            return (Criteria) this;
        }

        public Criteria andEconomyIdLike(String value) {
            addCriterion("economy_id like", value, "economyId");
            return (Criteria) this;
        }

        public Criteria andEconomyIdNotLike(String value) {
            addCriterion("economy_id not like", value, "economyId");
            return (Criteria) this;
        }

        public Criteria andEconomyIdIn(List<String> values) {
            addCriterion("economy_id in", values, "economyId");
            return (Criteria) this;
        }

        public Criteria andEconomyIdNotIn(List<String> values) {
            addCriterion("economy_id not in", values, "economyId");
            return (Criteria) this;
        }

        public Criteria andEconomyIdBetween(String value1, String value2) {
            addCriterion("economy_id between", value1, value2, "economyId");
            return (Criteria) this;
        }

        public Criteria andEconomyIdNotBetween(String value1, String value2) {
            addCriterion("economy_id not between", value1, value2, "economyId");
            return (Criteria) this;
        }

        public Criteria andEconomyCodeIsNull() {
            addCriterion("economy_code is null");
            return (Criteria) this;
        }

        public Criteria andEconomyCodeIsNotNull() {
            addCriterion("economy_code is not null");
            return (Criteria) this;
        }

        public Criteria andEconomyCodeEqualTo(String value) {
            addCriterion("economy_code =", value, "economyCode");
            return (Criteria) this;
        }

        public Criteria andEconomyCodeNotEqualTo(String value) {
            addCriterion("economy_code <>", value, "economyCode");
            return (Criteria) this;
        }

        public Criteria andEconomyCodeGreaterThan(String value) {
            addCriterion("economy_code >", value, "economyCode");
            return (Criteria) this;
        }

        public Criteria andEconomyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("economy_code >=", value, "economyCode");
            return (Criteria) this;
        }

        public Criteria andEconomyCodeLessThan(String value) {
            addCriterion("economy_code <", value, "economyCode");
            return (Criteria) this;
        }

        public Criteria andEconomyCodeLessThanOrEqualTo(String value) {
            addCriterion("economy_code <=", value, "economyCode");
            return (Criteria) this;
        }

        public Criteria andEconomyCodeLike(String value) {
            addCriterion("economy_code like", value, "economyCode");
            return (Criteria) this;
        }

        public Criteria andEconomyCodeNotLike(String value) {
            addCriterion("economy_code not like", value, "economyCode");
            return (Criteria) this;
        }

        public Criteria andEconomyCodeIn(List<String> values) {
            addCriterion("economy_code in", values, "economyCode");
            return (Criteria) this;
        }

        public Criteria andEconomyCodeNotIn(List<String> values) {
            addCriterion("economy_code not in", values, "economyCode");
            return (Criteria) this;
        }

        public Criteria andEconomyCodeBetween(String value1, String value2) {
            addCriterion("economy_code between", value1, value2, "economyCode");
            return (Criteria) this;
        }

        public Criteria andEconomyCodeNotBetween(String value1, String value2) {
            addCriterion("economy_code not between", value1, value2, "economyCode");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andEconomyWorkIsNull() {
            addCriterion("economy_work is null");
            return (Criteria) this;
        }

        public Criteria andEconomyWorkIsNotNull() {
            addCriterion("economy_work is not null");
            return (Criteria) this;
        }

        public Criteria andEconomyWorkEqualTo(String value) {
            addCriterion("economy_work =", value, "economyWork");
            return (Criteria) this;
        }

        public Criteria andEconomyWorkNotEqualTo(String value) {
            addCriterion("economy_work <>", value, "economyWork");
            return (Criteria) this;
        }

        public Criteria andEconomyWorkGreaterThan(String value) {
            addCriterion("economy_work >", value, "economyWork");
            return (Criteria) this;
        }

        public Criteria andEconomyWorkGreaterThanOrEqualTo(String value) {
            addCriterion("economy_work >=", value, "economyWork");
            return (Criteria) this;
        }

        public Criteria andEconomyWorkLessThan(String value) {
            addCriterion("economy_work <", value, "economyWork");
            return (Criteria) this;
        }

        public Criteria andEconomyWorkLessThanOrEqualTo(String value) {
            addCriterion("economy_work <=", value, "economyWork");
            return (Criteria) this;
        }

        public Criteria andEconomyWorkLike(String value) {
            addCriterion("economy_work like", value, "economyWork");
            return (Criteria) this;
        }

        public Criteria andEconomyWorkNotLike(String value) {
            addCriterion("economy_work not like", value, "economyWork");
            return (Criteria) this;
        }

        public Criteria andEconomyWorkIn(List<String> values) {
            addCriterion("economy_work in", values, "economyWork");
            return (Criteria) this;
        }

        public Criteria andEconomyWorkNotIn(List<String> values) {
            addCriterion("economy_work not in", values, "economyWork");
            return (Criteria) this;
        }

        public Criteria andEconomyWorkBetween(String value1, String value2) {
            addCriterion("economy_work between", value1, value2, "economyWork");
            return (Criteria) this;
        }

        public Criteria andEconomyWorkNotBetween(String value1, String value2) {
            addCriterion("economy_work not between", value1, value2, "economyWork");
            return (Criteria) this;
        }

        public Criteria andEconomySalaryIsNull() {
            addCriterion("economy_salary is null");
            return (Criteria) this;
        }

        public Criteria andEconomySalaryIsNotNull() {
            addCriterion("economy_salary is not null");
            return (Criteria) this;
        }

        public Criteria andEconomySalaryEqualTo(String value) {
            addCriterion("economy_salary =", value, "economySalary");
            return (Criteria) this;
        }

        public Criteria andEconomySalaryNotEqualTo(String value) {
            addCriterion("economy_salary <>", value, "economySalary");
            return (Criteria) this;
        }

        public Criteria andEconomySalaryGreaterThan(String value) {
            addCriterion("economy_salary >", value, "economySalary");
            return (Criteria) this;
        }

        public Criteria andEconomySalaryGreaterThanOrEqualTo(String value) {
            addCriterion("economy_salary >=", value, "economySalary");
            return (Criteria) this;
        }

        public Criteria andEconomySalaryLessThan(String value) {
            addCriterion("economy_salary <", value, "economySalary");
            return (Criteria) this;
        }

        public Criteria andEconomySalaryLessThanOrEqualTo(String value) {
            addCriterion("economy_salary <=", value, "economySalary");
            return (Criteria) this;
        }

        public Criteria andEconomySalaryLike(String value) {
            addCriterion("economy_salary like", value, "economySalary");
            return (Criteria) this;
        }

        public Criteria andEconomySalaryNotLike(String value) {
            addCriterion("economy_salary not like", value, "economySalary");
            return (Criteria) this;
        }

        public Criteria andEconomySalaryIn(List<String> values) {
            addCriterion("economy_salary in", values, "economySalary");
            return (Criteria) this;
        }

        public Criteria andEconomySalaryNotIn(List<String> values) {
            addCriterion("economy_salary not in", values, "economySalary");
            return (Criteria) this;
        }

        public Criteria andEconomySalaryBetween(String value1, String value2) {
            addCriterion("economy_salary between", value1, value2, "economySalary");
            return (Criteria) this;
        }

        public Criteria andEconomySalaryNotBetween(String value1, String value2) {
            addCriterion("economy_salary not between", value1, value2, "economySalary");
            return (Criteria) this;
        }

        public Criteria andEconomyHouseIsNull() {
            addCriterion("economy_house is null");
            return (Criteria) this;
        }

        public Criteria andEconomyHouseIsNotNull() {
            addCriterion("economy_house is not null");
            return (Criteria) this;
        }

        public Criteria andEconomyHouseEqualTo(String value) {
            addCriterion("economy_house =", value, "economyHouse");
            return (Criteria) this;
        }

        public Criteria andEconomyHouseNotEqualTo(String value) {
            addCriterion("economy_house <>", value, "economyHouse");
            return (Criteria) this;
        }

        public Criteria andEconomyHouseGreaterThan(String value) {
            addCriterion("economy_house >", value, "economyHouse");
            return (Criteria) this;
        }

        public Criteria andEconomyHouseGreaterThanOrEqualTo(String value) {
            addCriterion("economy_house >=", value, "economyHouse");
            return (Criteria) this;
        }

        public Criteria andEconomyHouseLessThan(String value) {
            addCriterion("economy_house <", value, "economyHouse");
            return (Criteria) this;
        }

        public Criteria andEconomyHouseLessThanOrEqualTo(String value) {
            addCriterion("economy_house <=", value, "economyHouse");
            return (Criteria) this;
        }

        public Criteria andEconomyHouseLike(String value) {
            addCriterion("economy_house like", value, "economyHouse");
            return (Criteria) this;
        }

        public Criteria andEconomyHouseNotLike(String value) {
            addCriterion("economy_house not like", value, "economyHouse");
            return (Criteria) this;
        }

        public Criteria andEconomyHouseIn(List<String> values) {
            addCriterion("economy_house in", values, "economyHouse");
            return (Criteria) this;
        }

        public Criteria andEconomyHouseNotIn(List<String> values) {
            addCriterion("economy_house not in", values, "economyHouse");
            return (Criteria) this;
        }

        public Criteria andEconomyHouseBetween(String value1, String value2) {
            addCriterion("economy_house between", value1, value2, "economyHouse");
            return (Criteria) this;
        }

        public Criteria andEconomyHouseNotBetween(String value1, String value2) {
            addCriterion("economy_house not between", value1, value2, "economyHouse");
            return (Criteria) this;
        }

        public Criteria andEconomyCarIsNull() {
            addCriterion("economy_car is null");
            return (Criteria) this;
        }

        public Criteria andEconomyCarIsNotNull() {
            addCriterion("economy_car is not null");
            return (Criteria) this;
        }

        public Criteria andEconomyCarEqualTo(String value) {
            addCriterion("economy_car =", value, "economyCar");
            return (Criteria) this;
        }

        public Criteria andEconomyCarNotEqualTo(String value) {
            addCriterion("economy_car <>", value, "economyCar");
            return (Criteria) this;
        }

        public Criteria andEconomyCarGreaterThan(String value) {
            addCriterion("economy_car >", value, "economyCar");
            return (Criteria) this;
        }

        public Criteria andEconomyCarGreaterThanOrEqualTo(String value) {
            addCriterion("economy_car >=", value, "economyCar");
            return (Criteria) this;
        }

        public Criteria andEconomyCarLessThan(String value) {
            addCriterion("economy_car <", value, "economyCar");
            return (Criteria) this;
        }

        public Criteria andEconomyCarLessThanOrEqualTo(String value) {
            addCriterion("economy_car <=", value, "economyCar");
            return (Criteria) this;
        }

        public Criteria andEconomyCarLike(String value) {
            addCriterion("economy_car like", value, "economyCar");
            return (Criteria) this;
        }

        public Criteria andEconomyCarNotLike(String value) {
            addCriterion("economy_car not like", value, "economyCar");
            return (Criteria) this;
        }

        public Criteria andEconomyCarIn(List<String> values) {
            addCriterion("economy_car in", values, "economyCar");
            return (Criteria) this;
        }

        public Criteria andEconomyCarNotIn(List<String> values) {
            addCriterion("economy_car not in", values, "economyCar");
            return (Criteria) this;
        }

        public Criteria andEconomyCarBetween(String value1, String value2) {
            addCriterion("economy_car between", value1, value2, "economyCar");
            return (Criteria) this;
        }

        public Criteria andEconomyCarNotBetween(String value1, String value2) {
            addCriterion("economy_car not between", value1, value2, "economyCar");
            return (Criteria) this;
        }

        public Criteria andEconomyEducationIsNull() {
            addCriterion("economy_education is null");
            return (Criteria) this;
        }

        public Criteria andEconomyEducationIsNotNull() {
            addCriterion("economy_education is not null");
            return (Criteria) this;
        }

        public Criteria andEconomyEducationEqualTo(String value) {
            addCriterion("economy_education =", value, "economyEducation");
            return (Criteria) this;
        }

        public Criteria andEconomyEducationNotEqualTo(String value) {
            addCriterion("economy_education <>", value, "economyEducation");
            return (Criteria) this;
        }

        public Criteria andEconomyEducationGreaterThan(String value) {
            addCriterion("economy_education >", value, "economyEducation");
            return (Criteria) this;
        }

        public Criteria andEconomyEducationGreaterThanOrEqualTo(String value) {
            addCriterion("economy_education >=", value, "economyEducation");
            return (Criteria) this;
        }

        public Criteria andEconomyEducationLessThan(String value) {
            addCriterion("economy_education <", value, "economyEducation");
            return (Criteria) this;
        }

        public Criteria andEconomyEducationLessThanOrEqualTo(String value) {
            addCriterion("economy_education <=", value, "economyEducation");
            return (Criteria) this;
        }

        public Criteria andEconomyEducationLike(String value) {
            addCriterion("economy_education like", value, "economyEducation");
            return (Criteria) this;
        }

        public Criteria andEconomyEducationNotLike(String value) {
            addCriterion("economy_education not like", value, "economyEducation");
            return (Criteria) this;
        }

        public Criteria andEconomyEducationIn(List<String> values) {
            addCriterion("economy_education in", values, "economyEducation");
            return (Criteria) this;
        }

        public Criteria andEconomyEducationNotIn(List<String> values) {
            addCriterion("economy_education not in", values, "economyEducation");
            return (Criteria) this;
        }

        public Criteria andEconomyEducationBetween(String value1, String value2) {
            addCriterion("economy_education between", value1, value2, "economyEducation");
            return (Criteria) this;
        }

        public Criteria andEconomyEducationNotBetween(String value1, String value2) {
            addCriterion("economy_education not between", value1, value2, "economyEducation");
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