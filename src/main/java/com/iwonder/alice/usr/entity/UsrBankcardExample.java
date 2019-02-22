package com.iwonder.alice.usr.entity;

import java.util.ArrayList;
import java.util.List;

public class UsrBankcardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsrBankcardExample() {
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

        public Criteria andBankcardIdIsNull() {
            addCriterion("bankcard_id is null");
            return (Criteria) this;
        }

        public Criteria andBankcardIdIsNotNull() {
            addCriterion("bankcard_id is not null");
            return (Criteria) this;
        }

        public Criteria andBankcardIdEqualTo(String value) {
            addCriterion("bankcard_id =", value, "bankcardId");
            return (Criteria) this;
        }

        public Criteria andBankcardIdNotEqualTo(String value) {
            addCriterion("bankcard_id <>", value, "bankcardId");
            return (Criteria) this;
        }

        public Criteria andBankcardIdGreaterThan(String value) {
            addCriterion("bankcard_id >", value, "bankcardId");
            return (Criteria) this;
        }

        public Criteria andBankcardIdGreaterThanOrEqualTo(String value) {
            addCriterion("bankcard_id >=", value, "bankcardId");
            return (Criteria) this;
        }

        public Criteria andBankcardIdLessThan(String value) {
            addCriterion("bankcard_id <", value, "bankcardId");
            return (Criteria) this;
        }

        public Criteria andBankcardIdLessThanOrEqualTo(String value) {
            addCriterion("bankcard_id <=", value, "bankcardId");
            return (Criteria) this;
        }

        public Criteria andBankcardIdLike(String value) {
            addCriterion("bankcard_id like", value, "bankcardId");
            return (Criteria) this;
        }

        public Criteria andBankcardIdNotLike(String value) {
            addCriterion("bankcard_id not like", value, "bankcardId");
            return (Criteria) this;
        }

        public Criteria andBankcardIdIn(List<String> values) {
            addCriterion("bankcard_id in", values, "bankcardId");
            return (Criteria) this;
        }

        public Criteria andBankcardIdNotIn(List<String> values) {
            addCriterion("bankcard_id not in", values, "bankcardId");
            return (Criteria) this;
        }

        public Criteria andBankcardIdBetween(String value1, String value2) {
            addCriterion("bankcard_id between", value1, value2, "bankcardId");
            return (Criteria) this;
        }

        public Criteria andBankcardIdNotBetween(String value1, String value2) {
            addCriterion("bankcard_id not between", value1, value2, "bankcardId");
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

        public Criteria andBankcardCodeIsNull() {
            addCriterion("bankcard_code is null");
            return (Criteria) this;
        }

        public Criteria andBankcardCodeIsNotNull() {
            addCriterion("bankcard_code is not null");
            return (Criteria) this;
        }

        public Criteria andBankcardCodeEqualTo(String value) {
            addCriterion("bankcard_code =", value, "bankcardCode");
            return (Criteria) this;
        }

        public Criteria andBankcardCodeNotEqualTo(String value) {
            addCriterion("bankcard_code <>", value, "bankcardCode");
            return (Criteria) this;
        }

        public Criteria andBankcardCodeGreaterThan(String value) {
            addCriterion("bankcard_code >", value, "bankcardCode");
            return (Criteria) this;
        }

        public Criteria andBankcardCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bankcard_code >=", value, "bankcardCode");
            return (Criteria) this;
        }

        public Criteria andBankcardCodeLessThan(String value) {
            addCriterion("bankcard_code <", value, "bankcardCode");
            return (Criteria) this;
        }

        public Criteria andBankcardCodeLessThanOrEqualTo(String value) {
            addCriterion("bankcard_code <=", value, "bankcardCode");
            return (Criteria) this;
        }

        public Criteria andBankcardCodeLike(String value) {
            addCriterion("bankcard_code like", value, "bankcardCode");
            return (Criteria) this;
        }

        public Criteria andBankcardCodeNotLike(String value) {
            addCriterion("bankcard_code not like", value, "bankcardCode");
            return (Criteria) this;
        }

        public Criteria andBankcardCodeIn(List<String> values) {
            addCriterion("bankcard_code in", values, "bankcardCode");
            return (Criteria) this;
        }

        public Criteria andBankcardCodeNotIn(List<String> values) {
            addCriterion("bankcard_code not in", values, "bankcardCode");
            return (Criteria) this;
        }

        public Criteria andBankcardCodeBetween(String value1, String value2) {
            addCriterion("bankcard_code between", value1, value2, "bankcardCode");
            return (Criteria) this;
        }

        public Criteria andBankcardCodeNotBetween(String value1, String value2) {
            addCriterion("bankcard_code not between", value1, value2, "bankcardCode");
            return (Criteria) this;
        }

        public Criteria andBankcardNumberIsNull() {
            addCriterion("bankcard_number is null");
            return (Criteria) this;
        }

        public Criteria andBankcardNumberIsNotNull() {
            addCriterion("bankcard_number is not null");
            return (Criteria) this;
        }

        public Criteria andBankcardNumberEqualTo(String value) {
            addCriterion("bankcard_number =", value, "bankcardNumber");
            return (Criteria) this;
        }

        public Criteria andBankcardNumberNotEqualTo(String value) {
            addCriterion("bankcard_number <>", value, "bankcardNumber");
            return (Criteria) this;
        }

        public Criteria andBankcardNumberGreaterThan(String value) {
            addCriterion("bankcard_number >", value, "bankcardNumber");
            return (Criteria) this;
        }

        public Criteria andBankcardNumberGreaterThanOrEqualTo(String value) {
            addCriterion("bankcard_number >=", value, "bankcardNumber");
            return (Criteria) this;
        }

        public Criteria andBankcardNumberLessThan(String value) {
            addCriterion("bankcard_number <", value, "bankcardNumber");
            return (Criteria) this;
        }

        public Criteria andBankcardNumberLessThanOrEqualTo(String value) {
            addCriterion("bankcard_number <=", value, "bankcardNumber");
            return (Criteria) this;
        }

        public Criteria andBankcardNumberLike(String value) {
            addCriterion("bankcard_number like", value, "bankcardNumber");
            return (Criteria) this;
        }

        public Criteria andBankcardNumberNotLike(String value) {
            addCriterion("bankcard_number not like", value, "bankcardNumber");
            return (Criteria) this;
        }

        public Criteria andBankcardNumberIn(List<String> values) {
            addCriterion("bankcard_number in", values, "bankcardNumber");
            return (Criteria) this;
        }

        public Criteria andBankcardNumberNotIn(List<String> values) {
            addCriterion("bankcard_number not in", values, "bankcardNumber");
            return (Criteria) this;
        }

        public Criteria andBankcardNumberBetween(String value1, String value2) {
            addCriterion("bankcard_number between", value1, value2, "bankcardNumber");
            return (Criteria) this;
        }

        public Criteria andBankcardNumberNotBetween(String value1, String value2) {
            addCriterion("bankcard_number not between", value1, value2, "bankcardNumber");
            return (Criteria) this;
        }

        public Criteria andBankcardNameIsNull() {
            addCriterion("bankcard_name is null");
            return (Criteria) this;
        }

        public Criteria andBankcardNameIsNotNull() {
            addCriterion("bankcard_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankcardNameEqualTo(String value) {
            addCriterion("bankcard_name =", value, "bankcardName");
            return (Criteria) this;
        }

        public Criteria andBankcardNameNotEqualTo(String value) {
            addCriterion("bankcard_name <>", value, "bankcardName");
            return (Criteria) this;
        }

        public Criteria andBankcardNameGreaterThan(String value) {
            addCriterion("bankcard_name >", value, "bankcardName");
            return (Criteria) this;
        }

        public Criteria andBankcardNameGreaterThanOrEqualTo(String value) {
            addCriterion("bankcard_name >=", value, "bankcardName");
            return (Criteria) this;
        }

        public Criteria andBankcardNameLessThan(String value) {
            addCriterion("bankcard_name <", value, "bankcardName");
            return (Criteria) this;
        }

        public Criteria andBankcardNameLessThanOrEqualTo(String value) {
            addCriterion("bankcard_name <=", value, "bankcardName");
            return (Criteria) this;
        }

        public Criteria andBankcardNameLike(String value) {
            addCriterion("bankcard_name like", value, "bankcardName");
            return (Criteria) this;
        }

        public Criteria andBankcardNameNotLike(String value) {
            addCriterion("bankcard_name not like", value, "bankcardName");
            return (Criteria) this;
        }

        public Criteria andBankcardNameIn(List<String> values) {
            addCriterion("bankcard_name in", values, "bankcardName");
            return (Criteria) this;
        }

        public Criteria andBankcardNameNotIn(List<String> values) {
            addCriterion("bankcard_name not in", values, "bankcardName");
            return (Criteria) this;
        }

        public Criteria andBankcardNameBetween(String value1, String value2) {
            addCriterion("bankcard_name between", value1, value2, "bankcardName");
            return (Criteria) this;
        }

        public Criteria andBankcardNameNotBetween(String value1, String value2) {
            addCriterion("bankcard_name not between", value1, value2, "bankcardName");
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