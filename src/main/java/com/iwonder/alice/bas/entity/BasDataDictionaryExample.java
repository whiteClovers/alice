package com.iwonder.alice.bas.entity;

import java.util.ArrayList;
import java.util.List;

public class BasDataDictionaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BasDataDictionaryExample() {
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

        public Criteria andDataDictionaryIdIsNull() {
            addCriterion("data_dictionary_id is null");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryIdIsNotNull() {
            addCriterion("data_dictionary_id is not null");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryIdEqualTo(String value) {
            addCriterion("data_dictionary_id =", value, "dataDictionaryId");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryIdNotEqualTo(String value) {
            addCriterion("data_dictionary_id <>", value, "dataDictionaryId");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryIdGreaterThan(String value) {
            addCriterion("data_dictionary_id >", value, "dataDictionaryId");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryIdGreaterThanOrEqualTo(String value) {
            addCriterion("data_dictionary_id >=", value, "dataDictionaryId");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryIdLessThan(String value) {
            addCriterion("data_dictionary_id <", value, "dataDictionaryId");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryIdLessThanOrEqualTo(String value) {
            addCriterion("data_dictionary_id <=", value, "dataDictionaryId");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryIdLike(String value) {
            addCriterion("data_dictionary_id like", value, "dataDictionaryId");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryIdNotLike(String value) {
            addCriterion("data_dictionary_id not like", value, "dataDictionaryId");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryIdIn(List<String> values) {
            addCriterion("data_dictionary_id in", values, "dataDictionaryId");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryIdNotIn(List<String> values) {
            addCriterion("data_dictionary_id not in", values, "dataDictionaryId");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryIdBetween(String value1, String value2) {
            addCriterion("data_dictionary_id between", value1, value2, "dataDictionaryId");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryIdNotBetween(String value1, String value2) {
            addCriterion("data_dictionary_id not between", value1, value2, "dataDictionaryId");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryCodeIsNull() {
            addCriterion("data_dictionary_code is null");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryCodeIsNotNull() {
            addCriterion("data_dictionary_code is not null");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryCodeEqualTo(String value) {
            addCriterion("data_dictionary_code =", value, "dataDictionaryCode");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryCodeNotEqualTo(String value) {
            addCriterion("data_dictionary_code <>", value, "dataDictionaryCode");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryCodeGreaterThan(String value) {
            addCriterion("data_dictionary_code >", value, "dataDictionaryCode");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("data_dictionary_code >=", value, "dataDictionaryCode");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryCodeLessThan(String value) {
            addCriterion("data_dictionary_code <", value, "dataDictionaryCode");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryCodeLessThanOrEqualTo(String value) {
            addCriterion("data_dictionary_code <=", value, "dataDictionaryCode");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryCodeLike(String value) {
            addCriterion("data_dictionary_code like", value, "dataDictionaryCode");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryCodeNotLike(String value) {
            addCriterion("data_dictionary_code not like", value, "dataDictionaryCode");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryCodeIn(List<String> values) {
            addCriterion("data_dictionary_code in", values, "dataDictionaryCode");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryCodeNotIn(List<String> values) {
            addCriterion("data_dictionary_code not in", values, "dataDictionaryCode");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryCodeBetween(String value1, String value2) {
            addCriterion("data_dictionary_code between", value1, value2, "dataDictionaryCode");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryCodeNotBetween(String value1, String value2) {
            addCriterion("data_dictionary_code not between", value1, value2, "dataDictionaryCode");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryLabelIsNull() {
            addCriterion("data_dictionary_label is null");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryLabelIsNotNull() {
            addCriterion("data_dictionary_label is not null");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryLabelEqualTo(String value) {
            addCriterion("data_dictionary_label =", value, "dataDictionaryLabel");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryLabelNotEqualTo(String value) {
            addCriterion("data_dictionary_label <>", value, "dataDictionaryLabel");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryLabelGreaterThan(String value) {
            addCriterion("data_dictionary_label >", value, "dataDictionaryLabel");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryLabelGreaterThanOrEqualTo(String value) {
            addCriterion("data_dictionary_label >=", value, "dataDictionaryLabel");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryLabelLessThan(String value) {
            addCriterion("data_dictionary_label <", value, "dataDictionaryLabel");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryLabelLessThanOrEqualTo(String value) {
            addCriterion("data_dictionary_label <=", value, "dataDictionaryLabel");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryLabelLike(String value) {
            addCriterion("data_dictionary_label like", value, "dataDictionaryLabel");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryLabelNotLike(String value) {
            addCriterion("data_dictionary_label not like", value, "dataDictionaryLabel");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryLabelIn(List<String> values) {
            addCriterion("data_dictionary_label in", values, "dataDictionaryLabel");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryLabelNotIn(List<String> values) {
            addCriterion("data_dictionary_label not in", values, "dataDictionaryLabel");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryLabelBetween(String value1, String value2) {
            addCriterion("data_dictionary_label between", value1, value2, "dataDictionaryLabel");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryLabelNotBetween(String value1, String value2) {
            addCriterion("data_dictionary_label not between", value1, value2, "dataDictionaryLabel");
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