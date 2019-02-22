package com.iwonder.alice.bas.entity;

import java.util.ArrayList;
import java.util.List;

public class BasAvoidRepeatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BasAvoidRepeatExample() {
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

        public Criteria andAvoidRepeatIdIsNull() {
            addCriterion("avoid_repeat_id is null");
            return (Criteria) this;
        }

        public Criteria andAvoidRepeatIdIsNotNull() {
            addCriterion("avoid_repeat_id is not null");
            return (Criteria) this;
        }

        public Criteria andAvoidRepeatIdEqualTo(String value) {
            addCriterion("avoid_repeat_id =", value, "avoidRepeatId");
            return (Criteria) this;
        }

        public Criteria andAvoidRepeatIdNotEqualTo(String value) {
            addCriterion("avoid_repeat_id <>", value, "avoidRepeatId");
            return (Criteria) this;
        }

        public Criteria andAvoidRepeatIdGreaterThan(String value) {
            addCriterion("avoid_repeat_id >", value, "avoidRepeatId");
            return (Criteria) this;
        }

        public Criteria andAvoidRepeatIdGreaterThanOrEqualTo(String value) {
            addCriterion("avoid_repeat_id >=", value, "avoidRepeatId");
            return (Criteria) this;
        }

        public Criteria andAvoidRepeatIdLessThan(String value) {
            addCriterion("avoid_repeat_id <", value, "avoidRepeatId");
            return (Criteria) this;
        }

        public Criteria andAvoidRepeatIdLessThanOrEqualTo(String value) {
            addCriterion("avoid_repeat_id <=", value, "avoidRepeatId");
            return (Criteria) this;
        }

        public Criteria andAvoidRepeatIdLike(String value) {
            addCriterion("avoid_repeat_id like", value, "avoidRepeatId");
            return (Criteria) this;
        }

        public Criteria andAvoidRepeatIdNotLike(String value) {
            addCriterion("avoid_repeat_id not like", value, "avoidRepeatId");
            return (Criteria) this;
        }

        public Criteria andAvoidRepeatIdIn(List<String> values) {
            addCriterion("avoid_repeat_id in", values, "avoidRepeatId");
            return (Criteria) this;
        }

        public Criteria andAvoidRepeatIdNotIn(List<String> values) {
            addCriterion("avoid_repeat_id not in", values, "avoidRepeatId");
            return (Criteria) this;
        }

        public Criteria andAvoidRepeatIdBetween(String value1, String value2) {
            addCriterion("avoid_repeat_id between", value1, value2, "avoidRepeatId");
            return (Criteria) this;
        }

        public Criteria andAvoidRepeatIdNotBetween(String value1, String value2) {
            addCriterion("avoid_repeat_id not between", value1, value2, "avoidRepeatId");
            return (Criteria) this;
        }

        public Criteria andAvoidCodeIsNull() {
            addCriterion("avoid_code is null");
            return (Criteria) this;
        }

        public Criteria andAvoidCodeIsNotNull() {
            addCriterion("avoid_code is not null");
            return (Criteria) this;
        }

        public Criteria andAvoidCodeEqualTo(String value) {
            addCriterion("avoid_code =", value, "avoidCode");
            return (Criteria) this;
        }

        public Criteria andAvoidCodeNotEqualTo(String value) {
            addCriterion("avoid_code <>", value, "avoidCode");
            return (Criteria) this;
        }

        public Criteria andAvoidCodeGreaterThan(String value) {
            addCriterion("avoid_code >", value, "avoidCode");
            return (Criteria) this;
        }

        public Criteria andAvoidCodeGreaterThanOrEqualTo(String value) {
            addCriterion("avoid_code >=", value, "avoidCode");
            return (Criteria) this;
        }

        public Criteria andAvoidCodeLessThan(String value) {
            addCriterion("avoid_code <", value, "avoidCode");
            return (Criteria) this;
        }

        public Criteria andAvoidCodeLessThanOrEqualTo(String value) {
            addCriterion("avoid_code <=", value, "avoidCode");
            return (Criteria) this;
        }

        public Criteria andAvoidCodeLike(String value) {
            addCriterion("avoid_code like", value, "avoidCode");
            return (Criteria) this;
        }

        public Criteria andAvoidCodeNotLike(String value) {
            addCriterion("avoid_code not like", value, "avoidCode");
            return (Criteria) this;
        }

        public Criteria andAvoidCodeIn(List<String> values) {
            addCriterion("avoid_code in", values, "avoidCode");
            return (Criteria) this;
        }

        public Criteria andAvoidCodeNotIn(List<String> values) {
            addCriterion("avoid_code not in", values, "avoidCode");
            return (Criteria) this;
        }

        public Criteria andAvoidCodeBetween(String value1, String value2) {
            addCriterion("avoid_code between", value1, value2, "avoidCode");
            return (Criteria) this;
        }

        public Criteria andAvoidCodeNotBetween(String value1, String value2) {
            addCriterion("avoid_code not between", value1, value2, "avoidCode");
            return (Criteria) this;
        }

        public Criteria andRepeatLoanStatusIsNull() {
            addCriterion("repeat_loan_status is null");
            return (Criteria) this;
        }

        public Criteria andRepeatLoanStatusIsNotNull() {
            addCriterion("repeat_loan_status is not null");
            return (Criteria) this;
        }

        public Criteria andRepeatLoanStatusEqualTo(String value) {
            addCriterion("repeat_loan_status =", value, "repeatLoanStatus");
            return (Criteria) this;
        }

        public Criteria andRepeatLoanStatusNotEqualTo(String value) {
            addCriterion("repeat_loan_status <>", value, "repeatLoanStatus");
            return (Criteria) this;
        }

        public Criteria andRepeatLoanStatusGreaterThan(String value) {
            addCriterion("repeat_loan_status >", value, "repeatLoanStatus");
            return (Criteria) this;
        }

        public Criteria andRepeatLoanStatusGreaterThanOrEqualTo(String value) {
            addCriterion("repeat_loan_status >=", value, "repeatLoanStatus");
            return (Criteria) this;
        }

        public Criteria andRepeatLoanStatusLessThan(String value) {
            addCriterion("repeat_loan_status <", value, "repeatLoanStatus");
            return (Criteria) this;
        }

        public Criteria andRepeatLoanStatusLessThanOrEqualTo(String value) {
            addCriterion("repeat_loan_status <=", value, "repeatLoanStatus");
            return (Criteria) this;
        }

        public Criteria andRepeatLoanStatusLike(String value) {
            addCriterion("repeat_loan_status like", value, "repeatLoanStatus");
            return (Criteria) this;
        }

        public Criteria andRepeatLoanStatusNotLike(String value) {
            addCriterion("repeat_loan_status not like", value, "repeatLoanStatus");
            return (Criteria) this;
        }

        public Criteria andRepeatLoanStatusIn(List<String> values) {
            addCriterion("repeat_loan_status in", values, "repeatLoanStatus");
            return (Criteria) this;
        }

        public Criteria andRepeatLoanStatusNotIn(List<String> values) {
            addCriterion("repeat_loan_status not in", values, "repeatLoanStatus");
            return (Criteria) this;
        }

        public Criteria andRepeatLoanStatusBetween(String value1, String value2) {
            addCriterion("repeat_loan_status between", value1, value2, "repeatLoanStatus");
            return (Criteria) this;
        }

        public Criteria andRepeatLoanStatusNotBetween(String value1, String value2) {
            addCriterion("repeat_loan_status not between", value1, value2, "repeatLoanStatus");
            return (Criteria) this;
        }

        public Criteria andUserIdcardIsNull() {
            addCriterion("user_idcard is null");
            return (Criteria) this;
        }

        public Criteria andUserIdcardIsNotNull() {
            addCriterion("user_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdcardEqualTo(String value) {
            addCriterion("user_idcard =", value, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardNotEqualTo(String value) {
            addCriterion("user_idcard <>", value, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardGreaterThan(String value) {
            addCriterion("user_idcard >", value, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("user_idcard >=", value, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardLessThan(String value) {
            addCriterion("user_idcard <", value, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardLessThanOrEqualTo(String value) {
            addCriterion("user_idcard <=", value, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardLike(String value) {
            addCriterion("user_idcard like", value, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardNotLike(String value) {
            addCriterion("user_idcard not like", value, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardIn(List<String> values) {
            addCriterion("user_idcard in", values, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardNotIn(List<String> values) {
            addCriterion("user_idcard not in", values, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardBetween(String value1, String value2) {
            addCriterion("user_idcard between", value1, value2, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardNotBetween(String value1, String value2) {
            addCriterion("user_idcard not between", value1, value2, "userIdcard");
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