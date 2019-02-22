package com.iwonder.alice.sys.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysStaffExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysStaffExample() {
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

        public Criteria andStaffIdIsNull() {
            addCriterion("staff_id is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNotNull() {
            addCriterion("staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdEqualTo(String value) {
            addCriterion("staff_id =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(String value) {
            addCriterion("staff_id <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(String value) {
            addCriterion("staff_id >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(String value) {
            addCriterion("staff_id >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(String value) {
            addCriterion("staff_id <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(String value) {
            addCriterion("staff_id <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLike(String value) {
            addCriterion("staff_id like", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotLike(String value) {
            addCriterion("staff_id not like", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<String> values) {
            addCriterion("staff_id in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<String> values) {
            addCriterion("staff_id not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(String value1, String value2) {
            addCriterion("staff_id between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(String value1, String value2) {
            addCriterion("staff_id not between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffCodeIsNull() {
            addCriterion("staff_code is null");
            return (Criteria) this;
        }

        public Criteria andStaffCodeIsNotNull() {
            addCriterion("staff_code is not null");
            return (Criteria) this;
        }

        public Criteria andStaffCodeEqualTo(String value) {
            addCriterion("staff_code =", value, "staffCode");
            return (Criteria) this;
        }

        public Criteria andStaffCodeNotEqualTo(String value) {
            addCriterion("staff_code <>", value, "staffCode");
            return (Criteria) this;
        }

        public Criteria andStaffCodeGreaterThan(String value) {
            addCriterion("staff_code >", value, "staffCode");
            return (Criteria) this;
        }

        public Criteria andStaffCodeGreaterThanOrEqualTo(String value) {
            addCriterion("staff_code >=", value, "staffCode");
            return (Criteria) this;
        }

        public Criteria andStaffCodeLessThan(String value) {
            addCriterion("staff_code <", value, "staffCode");
            return (Criteria) this;
        }

        public Criteria andStaffCodeLessThanOrEqualTo(String value) {
            addCriterion("staff_code <=", value, "staffCode");
            return (Criteria) this;
        }

        public Criteria andStaffCodeLike(String value) {
            addCriterion("staff_code like", value, "staffCode");
            return (Criteria) this;
        }

        public Criteria andStaffCodeNotLike(String value) {
            addCriterion("staff_code not like", value, "staffCode");
            return (Criteria) this;
        }

        public Criteria andStaffCodeIn(List<String> values) {
            addCriterion("staff_code in", values, "staffCode");
            return (Criteria) this;
        }

        public Criteria andStaffCodeNotIn(List<String> values) {
            addCriterion("staff_code not in", values, "staffCode");
            return (Criteria) this;
        }

        public Criteria andStaffCodeBetween(String value1, String value2) {
            addCriterion("staff_code between", value1, value2, "staffCode");
            return (Criteria) this;
        }

        public Criteria andStaffCodeNotBetween(String value1, String value2) {
            addCriterion("staff_code not between", value1, value2, "staffCode");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNull() {
            addCriterion("staff_name is null");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNotNull() {
            addCriterion("staff_name is not null");
            return (Criteria) this;
        }

        public Criteria andStaffNameEqualTo(String value) {
            addCriterion("staff_name =", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotEqualTo(String value) {
            addCriterion("staff_name <>", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThan(String value) {
            addCriterion("staff_name >", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThanOrEqualTo(String value) {
            addCriterion("staff_name >=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThan(String value) {
            addCriterion("staff_name <", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThanOrEqualTo(String value) {
            addCriterion("staff_name <=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLike(String value) {
            addCriterion("staff_name like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotLike(String value) {
            addCriterion("staff_name not like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameIn(List<String> values) {
            addCriterion("staff_name in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotIn(List<String> values) {
            addCriterion("staff_name not in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameBetween(String value1, String value2) {
            addCriterion("staff_name between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotBetween(String value1, String value2) {
            addCriterion("staff_name not between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffGenderIsNull() {
            addCriterion("staff_gender is null");
            return (Criteria) this;
        }

        public Criteria andStaffGenderIsNotNull() {
            addCriterion("staff_gender is not null");
            return (Criteria) this;
        }

        public Criteria andStaffGenderEqualTo(String value) {
            addCriterion("staff_gender =", value, "staffGender");
            return (Criteria) this;
        }

        public Criteria andStaffGenderNotEqualTo(String value) {
            addCriterion("staff_gender <>", value, "staffGender");
            return (Criteria) this;
        }

        public Criteria andStaffGenderGreaterThan(String value) {
            addCriterion("staff_gender >", value, "staffGender");
            return (Criteria) this;
        }

        public Criteria andStaffGenderGreaterThanOrEqualTo(String value) {
            addCriterion("staff_gender >=", value, "staffGender");
            return (Criteria) this;
        }

        public Criteria andStaffGenderLessThan(String value) {
            addCriterion("staff_gender <", value, "staffGender");
            return (Criteria) this;
        }

        public Criteria andStaffGenderLessThanOrEqualTo(String value) {
            addCriterion("staff_gender <=", value, "staffGender");
            return (Criteria) this;
        }

        public Criteria andStaffGenderLike(String value) {
            addCriterion("staff_gender like", value, "staffGender");
            return (Criteria) this;
        }

        public Criteria andStaffGenderNotLike(String value) {
            addCriterion("staff_gender not like", value, "staffGender");
            return (Criteria) this;
        }

        public Criteria andStaffGenderIn(List<String> values) {
            addCriterion("staff_gender in", values, "staffGender");
            return (Criteria) this;
        }

        public Criteria andStaffGenderNotIn(List<String> values) {
            addCriterion("staff_gender not in", values, "staffGender");
            return (Criteria) this;
        }

        public Criteria andStaffGenderBetween(String value1, String value2) {
            addCriterion("staff_gender between", value1, value2, "staffGender");
            return (Criteria) this;
        }

        public Criteria andStaffGenderNotBetween(String value1, String value2) {
            addCriterion("staff_gender not between", value1, value2, "staffGender");
            return (Criteria) this;
        }

        public Criteria andStaffBirthdayIsNull() {
            addCriterion("staff_birthday is null");
            return (Criteria) this;
        }

        public Criteria andStaffBirthdayIsNotNull() {
            addCriterion("staff_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andStaffBirthdayEqualTo(Date value) {
            addCriterion("staff_birthday =", value, "staffBirthday");
            return (Criteria) this;
        }

        public Criteria andStaffBirthdayNotEqualTo(Date value) {
            addCriterion("staff_birthday <>", value, "staffBirthday");
            return (Criteria) this;
        }

        public Criteria andStaffBirthdayGreaterThan(Date value) {
            addCriterion("staff_birthday >", value, "staffBirthday");
            return (Criteria) this;
        }

        public Criteria andStaffBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("staff_birthday >=", value, "staffBirthday");
            return (Criteria) this;
        }

        public Criteria andStaffBirthdayLessThan(Date value) {
            addCriterion("staff_birthday <", value, "staffBirthday");
            return (Criteria) this;
        }

        public Criteria andStaffBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("staff_birthday <=", value, "staffBirthday");
            return (Criteria) this;
        }

        public Criteria andStaffBirthdayIn(List<Date> values) {
            addCriterion("staff_birthday in", values, "staffBirthday");
            return (Criteria) this;
        }

        public Criteria andStaffBirthdayNotIn(List<Date> values) {
            addCriterion("staff_birthday not in", values, "staffBirthday");
            return (Criteria) this;
        }

        public Criteria andStaffBirthdayBetween(Date value1, Date value2) {
            addCriterion("staff_birthday between", value1, value2, "staffBirthday");
            return (Criteria) this;
        }

        public Criteria andStaffBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("staff_birthday not between", value1, value2, "staffBirthday");
            return (Criteria) this;
        }

        public Criteria andStaffMoblieIsNull() {
            addCriterion("staff_moblie is null");
            return (Criteria) this;
        }

        public Criteria andStaffMoblieIsNotNull() {
            addCriterion("staff_moblie is not null");
            return (Criteria) this;
        }

        public Criteria andStaffMoblieEqualTo(String value) {
            addCriterion("staff_moblie =", value, "staffMoblie");
            return (Criteria) this;
        }

        public Criteria andStaffMoblieNotEqualTo(String value) {
            addCriterion("staff_moblie <>", value, "staffMoblie");
            return (Criteria) this;
        }

        public Criteria andStaffMoblieGreaterThan(String value) {
            addCriterion("staff_moblie >", value, "staffMoblie");
            return (Criteria) this;
        }

        public Criteria andStaffMoblieGreaterThanOrEqualTo(String value) {
            addCriterion("staff_moblie >=", value, "staffMoblie");
            return (Criteria) this;
        }

        public Criteria andStaffMoblieLessThan(String value) {
            addCriterion("staff_moblie <", value, "staffMoblie");
            return (Criteria) this;
        }

        public Criteria andStaffMoblieLessThanOrEqualTo(String value) {
            addCriterion("staff_moblie <=", value, "staffMoblie");
            return (Criteria) this;
        }

        public Criteria andStaffMoblieLike(String value) {
            addCriterion("staff_moblie like", value, "staffMoblie");
            return (Criteria) this;
        }

        public Criteria andStaffMoblieNotLike(String value) {
            addCriterion("staff_moblie not like", value, "staffMoblie");
            return (Criteria) this;
        }

        public Criteria andStaffMoblieIn(List<String> values) {
            addCriterion("staff_moblie in", values, "staffMoblie");
            return (Criteria) this;
        }

        public Criteria andStaffMoblieNotIn(List<String> values) {
            addCriterion("staff_moblie not in", values, "staffMoblie");
            return (Criteria) this;
        }

        public Criteria andStaffMoblieBetween(String value1, String value2) {
            addCriterion("staff_moblie between", value1, value2, "staffMoblie");
            return (Criteria) this;
        }

        public Criteria andStaffMoblieNotBetween(String value1, String value2) {
            addCriterion("staff_moblie not between", value1, value2, "staffMoblie");
            return (Criteria) this;
        }

        public Criteria andStaffAddressIsNull() {
            addCriterion("staff_address is null");
            return (Criteria) this;
        }

        public Criteria andStaffAddressIsNotNull() {
            addCriterion("staff_address is not null");
            return (Criteria) this;
        }

        public Criteria andStaffAddressEqualTo(String value) {
            addCriterion("staff_address =", value, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressNotEqualTo(String value) {
            addCriterion("staff_address <>", value, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressGreaterThan(String value) {
            addCriterion("staff_address >", value, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressGreaterThanOrEqualTo(String value) {
            addCriterion("staff_address >=", value, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressLessThan(String value) {
            addCriterion("staff_address <", value, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressLessThanOrEqualTo(String value) {
            addCriterion("staff_address <=", value, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressLike(String value) {
            addCriterion("staff_address like", value, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressNotLike(String value) {
            addCriterion("staff_address not like", value, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressIn(List<String> values) {
            addCriterion("staff_address in", values, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressNotIn(List<String> values) {
            addCriterion("staff_address not in", values, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressBetween(String value1, String value2) {
            addCriterion("staff_address between", value1, value2, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressNotBetween(String value1, String value2) {
            addCriterion("staff_address not between", value1, value2, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffStatusIsNull() {
            addCriterion("staff_status is null");
            return (Criteria) this;
        }

        public Criteria andStaffStatusIsNotNull() {
            addCriterion("staff_status is not null");
            return (Criteria) this;
        }

        public Criteria andStaffStatusEqualTo(String value) {
            addCriterion("staff_status =", value, "staffStatus");
            return (Criteria) this;
        }

        public Criteria andStaffStatusNotEqualTo(String value) {
            addCriterion("staff_status <>", value, "staffStatus");
            return (Criteria) this;
        }

        public Criteria andStaffStatusGreaterThan(String value) {
            addCriterion("staff_status >", value, "staffStatus");
            return (Criteria) this;
        }

        public Criteria andStaffStatusGreaterThanOrEqualTo(String value) {
            addCriterion("staff_status >=", value, "staffStatus");
            return (Criteria) this;
        }

        public Criteria andStaffStatusLessThan(String value) {
            addCriterion("staff_status <", value, "staffStatus");
            return (Criteria) this;
        }

        public Criteria andStaffStatusLessThanOrEqualTo(String value) {
            addCriterion("staff_status <=", value, "staffStatus");
            return (Criteria) this;
        }

        public Criteria andStaffStatusLike(String value) {
            addCriterion("staff_status like", value, "staffStatus");
            return (Criteria) this;
        }

        public Criteria andStaffStatusNotLike(String value) {
            addCriterion("staff_status not like", value, "staffStatus");
            return (Criteria) this;
        }

        public Criteria andStaffStatusIn(List<String> values) {
            addCriterion("staff_status in", values, "staffStatus");
            return (Criteria) this;
        }

        public Criteria andStaffStatusNotIn(List<String> values) {
            addCriterion("staff_status not in", values, "staffStatus");
            return (Criteria) this;
        }

        public Criteria andStaffStatusBetween(String value1, String value2) {
            addCriterion("staff_status between", value1, value2, "staffStatus");
            return (Criteria) this;
        }

        public Criteria andStaffStatusNotBetween(String value1, String value2) {
            addCriterion("staff_status not between", value1, value2, "staffStatus");
            return (Criteria) this;
        }

        public Criteria andPwdLoginIsNull() {
            addCriterion("pwd_login is null");
            return (Criteria) this;
        }

        public Criteria andPwdLoginIsNotNull() {
            addCriterion("pwd_login is not null");
            return (Criteria) this;
        }

        public Criteria andPwdLoginEqualTo(String value) {
            addCriterion("pwd_login =", value, "pwdLogin");
            return (Criteria) this;
        }

        public Criteria andPwdLoginNotEqualTo(String value) {
            addCriterion("pwd_login <>", value, "pwdLogin");
            return (Criteria) this;
        }

        public Criteria andPwdLoginGreaterThan(String value) {
            addCriterion("pwd_login >", value, "pwdLogin");
            return (Criteria) this;
        }

        public Criteria andPwdLoginGreaterThanOrEqualTo(String value) {
            addCriterion("pwd_login >=", value, "pwdLogin");
            return (Criteria) this;
        }

        public Criteria andPwdLoginLessThan(String value) {
            addCriterion("pwd_login <", value, "pwdLogin");
            return (Criteria) this;
        }

        public Criteria andPwdLoginLessThanOrEqualTo(String value) {
            addCriterion("pwd_login <=", value, "pwdLogin");
            return (Criteria) this;
        }

        public Criteria andPwdLoginLike(String value) {
            addCriterion("pwd_login like", value, "pwdLogin");
            return (Criteria) this;
        }

        public Criteria andPwdLoginNotLike(String value) {
            addCriterion("pwd_login not like", value, "pwdLogin");
            return (Criteria) this;
        }

        public Criteria andPwdLoginIn(List<String> values) {
            addCriterion("pwd_login in", values, "pwdLogin");
            return (Criteria) this;
        }

        public Criteria andPwdLoginNotIn(List<String> values) {
            addCriterion("pwd_login not in", values, "pwdLogin");
            return (Criteria) this;
        }

        public Criteria andPwdLoginBetween(String value1, String value2) {
            addCriterion("pwd_login between", value1, value2, "pwdLogin");
            return (Criteria) this;
        }

        public Criteria andPwdLoginNotBetween(String value1, String value2) {
            addCriterion("pwd_login not between", value1, value2, "pwdLogin");
            return (Criteria) this;
        }

        public Criteria andStaffInfoIsNull() {
            addCriterion("staff_info is null");
            return (Criteria) this;
        }

        public Criteria andStaffInfoIsNotNull() {
            addCriterion("staff_info is not null");
            return (Criteria) this;
        }

        public Criteria andStaffInfoEqualTo(String value) {
            addCriterion("staff_info =", value, "staffInfo");
            return (Criteria) this;
        }

        public Criteria andStaffInfoNotEqualTo(String value) {
            addCriterion("staff_info <>", value, "staffInfo");
            return (Criteria) this;
        }

        public Criteria andStaffInfoGreaterThan(String value) {
            addCriterion("staff_info >", value, "staffInfo");
            return (Criteria) this;
        }

        public Criteria andStaffInfoGreaterThanOrEqualTo(String value) {
            addCriterion("staff_info >=", value, "staffInfo");
            return (Criteria) this;
        }

        public Criteria andStaffInfoLessThan(String value) {
            addCriterion("staff_info <", value, "staffInfo");
            return (Criteria) this;
        }

        public Criteria andStaffInfoLessThanOrEqualTo(String value) {
            addCriterion("staff_info <=", value, "staffInfo");
            return (Criteria) this;
        }

        public Criteria andStaffInfoLike(String value) {
            addCriterion("staff_info like", value, "staffInfo");
            return (Criteria) this;
        }

        public Criteria andStaffInfoNotLike(String value) {
            addCriterion("staff_info not like", value, "staffInfo");
            return (Criteria) this;
        }

        public Criteria andStaffInfoIn(List<String> values) {
            addCriterion("staff_info in", values, "staffInfo");
            return (Criteria) this;
        }

        public Criteria andStaffInfoNotIn(List<String> values) {
            addCriterion("staff_info not in", values, "staffInfo");
            return (Criteria) this;
        }

        public Criteria andStaffInfoBetween(String value1, String value2) {
            addCriterion("staff_info between", value1, value2, "staffInfo");
            return (Criteria) this;
        }

        public Criteria andStaffInfoNotBetween(String value1, String value2) {
            addCriterion("staff_info not between", value1, value2, "staffInfo");
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