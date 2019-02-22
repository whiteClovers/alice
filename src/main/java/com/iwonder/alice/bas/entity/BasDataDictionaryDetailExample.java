package com.iwonder.alice.bas.entity;

import java.util.ArrayList;
import java.util.List;

public class BasDataDictionaryDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BasDataDictionaryDetailExample() {
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

        public Criteria andDictionaryDetailIdIsNull() {
            addCriterion("dictionary_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailIdIsNotNull() {
            addCriterion("dictionary_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailIdEqualTo(String value) {
            addCriterion("dictionary_detail_id =", value, "dictionaryDetailId");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailIdNotEqualTo(String value) {
            addCriterion("dictionary_detail_id <>", value, "dictionaryDetailId");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailIdGreaterThan(String value) {
            addCriterion("dictionary_detail_id >", value, "dictionaryDetailId");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailIdGreaterThanOrEqualTo(String value) {
            addCriterion("dictionary_detail_id >=", value, "dictionaryDetailId");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailIdLessThan(String value) {
            addCriterion("dictionary_detail_id <", value, "dictionaryDetailId");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailIdLessThanOrEqualTo(String value) {
            addCriterion("dictionary_detail_id <=", value, "dictionaryDetailId");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailIdLike(String value) {
            addCriterion("dictionary_detail_id like", value, "dictionaryDetailId");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailIdNotLike(String value) {
            addCriterion("dictionary_detail_id not like", value, "dictionaryDetailId");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailIdIn(List<String> values) {
            addCriterion("dictionary_detail_id in", values, "dictionaryDetailId");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailIdNotIn(List<String> values) {
            addCriterion("dictionary_detail_id not in", values, "dictionaryDetailId");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailIdBetween(String value1, String value2) {
            addCriterion("dictionary_detail_id between", value1, value2, "dictionaryDetailId");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailIdNotBetween(String value1, String value2) {
            addCriterion("dictionary_detail_id not between", value1, value2, "dictionaryDetailId");
            return (Criteria) this;
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

        public Criteria andDictionaryDetailCodeIsNull() {
            addCriterion("dictionary_detail_code is null");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailCodeIsNotNull() {
            addCriterion("dictionary_detail_code is not null");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailCodeEqualTo(String value) {
            addCriterion("dictionary_detail_code =", value, "dictionaryDetailCode");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailCodeNotEqualTo(String value) {
            addCriterion("dictionary_detail_code <>", value, "dictionaryDetailCode");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailCodeGreaterThan(String value) {
            addCriterion("dictionary_detail_code >", value, "dictionaryDetailCode");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailCodeGreaterThanOrEqualTo(String value) {
            addCriterion("dictionary_detail_code >=", value, "dictionaryDetailCode");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailCodeLessThan(String value) {
            addCriterion("dictionary_detail_code <", value, "dictionaryDetailCode");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailCodeLessThanOrEqualTo(String value) {
            addCriterion("dictionary_detail_code <=", value, "dictionaryDetailCode");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailCodeLike(String value) {
            addCriterion("dictionary_detail_code like", value, "dictionaryDetailCode");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailCodeNotLike(String value) {
            addCriterion("dictionary_detail_code not like", value, "dictionaryDetailCode");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailCodeIn(List<String> values) {
            addCriterion("dictionary_detail_code in", values, "dictionaryDetailCode");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailCodeNotIn(List<String> values) {
            addCriterion("dictionary_detail_code not in", values, "dictionaryDetailCode");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailCodeBetween(String value1, String value2) {
            addCriterion("dictionary_detail_code between", value1, value2, "dictionaryDetailCode");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailCodeNotBetween(String value1, String value2) {
            addCriterion("dictionary_detail_code not between", value1, value2, "dictionaryDetailCode");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailLabelIsNull() {
            addCriterion("dictionary_detail_label is null");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailLabelIsNotNull() {
            addCriterion("dictionary_detail_label is not null");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailLabelEqualTo(String value) {
            addCriterion("dictionary_detail_label =", value, "dictionaryDetailLabel");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailLabelNotEqualTo(String value) {
            addCriterion("dictionary_detail_label <>", value, "dictionaryDetailLabel");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailLabelGreaterThan(String value) {
            addCriterion("dictionary_detail_label >", value, "dictionaryDetailLabel");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailLabelGreaterThanOrEqualTo(String value) {
            addCriterion("dictionary_detail_label >=", value, "dictionaryDetailLabel");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailLabelLessThan(String value) {
            addCriterion("dictionary_detail_label <", value, "dictionaryDetailLabel");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailLabelLessThanOrEqualTo(String value) {
            addCriterion("dictionary_detail_label <=", value, "dictionaryDetailLabel");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailLabelLike(String value) {
            addCriterion("dictionary_detail_label like", value, "dictionaryDetailLabel");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailLabelNotLike(String value) {
            addCriterion("dictionary_detail_label not like", value, "dictionaryDetailLabel");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailLabelIn(List<String> values) {
            addCriterion("dictionary_detail_label in", values, "dictionaryDetailLabel");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailLabelNotIn(List<String> values) {
            addCriterion("dictionary_detail_label not in", values, "dictionaryDetailLabel");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailLabelBetween(String value1, String value2) {
            addCriterion("dictionary_detail_label between", value1, value2, "dictionaryDetailLabel");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailLabelNotBetween(String value1, String value2) {
            addCriterion("dictionary_detail_label not between", value1, value2, "dictionaryDetailLabel");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailNumberIsNull() {
            addCriterion("dictionary_detail_number is null");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailNumberIsNotNull() {
            addCriterion("dictionary_detail_number is not null");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailNumberEqualTo(String value) {
            addCriterion("dictionary_detail_number =", value, "dictionaryDetailNumber");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailNumberNotEqualTo(String value) {
            addCriterion("dictionary_detail_number <>", value, "dictionaryDetailNumber");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailNumberGreaterThan(String value) {
            addCriterion("dictionary_detail_number >", value, "dictionaryDetailNumber");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailNumberGreaterThanOrEqualTo(String value) {
            addCriterion("dictionary_detail_number >=", value, "dictionaryDetailNumber");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailNumberLessThan(String value) {
            addCriterion("dictionary_detail_number <", value, "dictionaryDetailNumber");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailNumberLessThanOrEqualTo(String value) {
            addCriterion("dictionary_detail_number <=", value, "dictionaryDetailNumber");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailNumberLike(String value) {
            addCriterion("dictionary_detail_number like", value, "dictionaryDetailNumber");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailNumberNotLike(String value) {
            addCriterion("dictionary_detail_number not like", value, "dictionaryDetailNumber");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailNumberIn(List<String> values) {
            addCriterion("dictionary_detail_number in", values, "dictionaryDetailNumber");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailNumberNotIn(List<String> values) {
            addCriterion("dictionary_detail_number not in", values, "dictionaryDetailNumber");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailNumberBetween(String value1, String value2) {
            addCriterion("dictionary_detail_number between", value1, value2, "dictionaryDetailNumber");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailNumberNotBetween(String value1, String value2) {
            addCriterion("dictionary_detail_number not between", value1, value2, "dictionaryDetailNumber");
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