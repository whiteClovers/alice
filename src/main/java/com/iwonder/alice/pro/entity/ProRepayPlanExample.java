package com.iwonder.alice.pro.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProRepayPlanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProRepayPlanExample() {
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

        public Criteria andRepayIdIsNull() {
            addCriterion("repay_id is null");
            return (Criteria) this;
        }

        public Criteria andRepayIdIsNotNull() {
            addCriterion("repay_id is not null");
            return (Criteria) this;
        }

        public Criteria andRepayIdEqualTo(String value) {
            addCriterion("repay_id =", value, "repayId");
            return (Criteria) this;
        }

        public Criteria andRepayIdNotEqualTo(String value) {
            addCriterion("repay_id <>", value, "repayId");
            return (Criteria) this;
        }

        public Criteria andRepayIdGreaterThan(String value) {
            addCriterion("repay_id >", value, "repayId");
            return (Criteria) this;
        }

        public Criteria andRepayIdGreaterThanOrEqualTo(String value) {
            addCriterion("repay_id >=", value, "repayId");
            return (Criteria) this;
        }

        public Criteria andRepayIdLessThan(String value) {
            addCriterion("repay_id <", value, "repayId");
            return (Criteria) this;
        }

        public Criteria andRepayIdLessThanOrEqualTo(String value) {
            addCriterion("repay_id <=", value, "repayId");
            return (Criteria) this;
        }

        public Criteria andRepayIdLike(String value) {
            addCriterion("repay_id like", value, "repayId");
            return (Criteria) this;
        }

        public Criteria andRepayIdNotLike(String value) {
            addCriterion("repay_id not like", value, "repayId");
            return (Criteria) this;
        }

        public Criteria andRepayIdIn(List<String> values) {
            addCriterion("repay_id in", values, "repayId");
            return (Criteria) this;
        }

        public Criteria andRepayIdNotIn(List<String> values) {
            addCriterion("repay_id not in", values, "repayId");
            return (Criteria) this;
        }

        public Criteria andRepayIdBetween(String value1, String value2) {
            addCriterion("repay_id between", value1, value2, "repayId");
            return (Criteria) this;
        }

        public Criteria andRepayIdNotBetween(String value1, String value2) {
            addCriterion("repay_id not between", value1, value2, "repayId");
            return (Criteria) this;
        }

        public Criteria andLoanIdIsNull() {
            addCriterion("loan_id is null");
            return (Criteria) this;
        }

        public Criteria andLoanIdIsNotNull() {
            addCriterion("loan_id is not null");
            return (Criteria) this;
        }

        public Criteria andLoanIdEqualTo(String value) {
            addCriterion("loan_id =", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdNotEqualTo(String value) {
            addCriterion("loan_id <>", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdGreaterThan(String value) {
            addCriterion("loan_id >", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdGreaterThanOrEqualTo(String value) {
            addCriterion("loan_id >=", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdLessThan(String value) {
            addCriterion("loan_id <", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdLessThanOrEqualTo(String value) {
            addCriterion("loan_id <=", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdLike(String value) {
            addCriterion("loan_id like", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdNotLike(String value) {
            addCriterion("loan_id not like", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdIn(List<String> values) {
            addCriterion("loan_id in", values, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdNotIn(List<String> values) {
            addCriterion("loan_id not in", values, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdBetween(String value1, String value2) {
            addCriterion("loan_id between", value1, value2, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdNotBetween(String value1, String value2) {
            addCriterion("loan_id not between", value1, value2, "loanId");
            return (Criteria) this;
        }

        public Criteria andRepayCodeIsNull() {
            addCriterion("repay_code is null");
            return (Criteria) this;
        }

        public Criteria andRepayCodeIsNotNull() {
            addCriterion("repay_code is not null");
            return (Criteria) this;
        }

        public Criteria andRepayCodeEqualTo(String value) {
            addCriterion("repay_code =", value, "repayCode");
            return (Criteria) this;
        }

        public Criteria andRepayCodeNotEqualTo(String value) {
            addCriterion("repay_code <>", value, "repayCode");
            return (Criteria) this;
        }

        public Criteria andRepayCodeGreaterThan(String value) {
            addCriterion("repay_code >", value, "repayCode");
            return (Criteria) this;
        }

        public Criteria andRepayCodeGreaterThanOrEqualTo(String value) {
            addCriterion("repay_code >=", value, "repayCode");
            return (Criteria) this;
        }

        public Criteria andRepayCodeLessThan(String value) {
            addCriterion("repay_code <", value, "repayCode");
            return (Criteria) this;
        }

        public Criteria andRepayCodeLessThanOrEqualTo(String value) {
            addCriterion("repay_code <=", value, "repayCode");
            return (Criteria) this;
        }

        public Criteria andRepayCodeLike(String value) {
            addCriterion("repay_code like", value, "repayCode");
            return (Criteria) this;
        }

        public Criteria andRepayCodeNotLike(String value) {
            addCriterion("repay_code not like", value, "repayCode");
            return (Criteria) this;
        }

        public Criteria andRepayCodeIn(List<String> values) {
            addCriterion("repay_code in", values, "repayCode");
            return (Criteria) this;
        }

        public Criteria andRepayCodeNotIn(List<String> values) {
            addCriterion("repay_code not in", values, "repayCode");
            return (Criteria) this;
        }

        public Criteria andRepayCodeBetween(String value1, String value2) {
            addCriterion("repay_code between", value1, value2, "repayCode");
            return (Criteria) this;
        }

        public Criteria andRepayCodeNotBetween(String value1, String value2) {
            addCriterion("repay_code not between", value1, value2, "repayCode");
            return (Criteria) this;
        }

        public Criteria andTermNumberIsNull() {
            addCriterion("term_number is null");
            return (Criteria) this;
        }

        public Criteria andTermNumberIsNotNull() {
            addCriterion("term_number is not null");
            return (Criteria) this;
        }

        public Criteria andTermNumberEqualTo(Integer value) {
            addCriterion("term_number =", value, "termNumber");
            return (Criteria) this;
        }

        public Criteria andTermNumberNotEqualTo(Integer value) {
            addCriterion("term_number <>", value, "termNumber");
            return (Criteria) this;
        }

        public Criteria andTermNumberGreaterThan(Integer value) {
            addCriterion("term_number >", value, "termNumber");
            return (Criteria) this;
        }

        public Criteria andTermNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("term_number >=", value, "termNumber");
            return (Criteria) this;
        }

        public Criteria andTermNumberLessThan(Integer value) {
            addCriterion("term_number <", value, "termNumber");
            return (Criteria) this;
        }

        public Criteria andTermNumberLessThanOrEqualTo(Integer value) {
            addCriterion("term_number <=", value, "termNumber");
            return (Criteria) this;
        }

        public Criteria andTermNumberIn(List<Integer> values) {
            addCriterion("term_number in", values, "termNumber");
            return (Criteria) this;
        }

        public Criteria andTermNumberNotIn(List<Integer> values) {
            addCriterion("term_number not in", values, "termNumber");
            return (Criteria) this;
        }

        public Criteria andTermNumberBetween(Integer value1, Integer value2) {
            addCriterion("term_number between", value1, value2, "termNumber");
            return (Criteria) this;
        }

        public Criteria andTermNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("term_number not between", value1, value2, "termNumber");
            return (Criteria) this;
        }

        public Criteria andTheoryRepayDateIsNull() {
            addCriterion("theory_repay_date is null");
            return (Criteria) this;
        }

        public Criteria andTheoryRepayDateIsNotNull() {
            addCriterion("theory_repay_date is not null");
            return (Criteria) this;
        }

        public Criteria andTheoryRepayDateEqualTo(Date value) {
            addCriterion("theory_repay_date =", value, "theoryRepayDate");
            return (Criteria) this;
        }

        public Criteria andTheoryRepayDateNotEqualTo(Date value) {
            addCriterion("theory_repay_date <>", value, "theoryRepayDate");
            return (Criteria) this;
        }

        public Criteria andTheoryRepayDateGreaterThan(Date value) {
            addCriterion("theory_repay_date >", value, "theoryRepayDate");
            return (Criteria) this;
        }

        public Criteria andTheoryRepayDateGreaterThanOrEqualTo(Date value) {
            addCriterion("theory_repay_date >=", value, "theoryRepayDate");
            return (Criteria) this;
        }

        public Criteria andTheoryRepayDateLessThan(Date value) {
            addCriterion("theory_repay_date <", value, "theoryRepayDate");
            return (Criteria) this;
        }

        public Criteria andTheoryRepayDateLessThanOrEqualTo(Date value) {
            addCriterion("theory_repay_date <=", value, "theoryRepayDate");
            return (Criteria) this;
        }

        public Criteria andTheoryRepayDateIn(List<Date> values) {
            addCriterion("theory_repay_date in", values, "theoryRepayDate");
            return (Criteria) this;
        }

        public Criteria andTheoryRepayDateNotIn(List<Date> values) {
            addCriterion("theory_repay_date not in", values, "theoryRepayDate");
            return (Criteria) this;
        }

        public Criteria andTheoryRepayDateBetween(Date value1, Date value2) {
            addCriterion("theory_repay_date between", value1, value2, "theoryRepayDate");
            return (Criteria) this;
        }

        public Criteria andTheoryRepayDateNotBetween(Date value1, Date value2) {
            addCriterion("theory_repay_date not between", value1, value2, "theoryRepayDate");
            return (Criteria) this;
        }

        public Criteria andActualRepayDateIsNull() {
            addCriterion("actual_repay_date is null");
            return (Criteria) this;
        }

        public Criteria andActualRepayDateIsNotNull() {
            addCriterion("actual_repay_date is not null");
            return (Criteria) this;
        }

        public Criteria andActualRepayDateEqualTo(Date value) {
            addCriterion("actual_repay_date =", value, "actualRepayDate");
            return (Criteria) this;
        }

        public Criteria andActualRepayDateNotEqualTo(Date value) {
            addCriterion("actual_repay_date <>", value, "actualRepayDate");
            return (Criteria) this;
        }

        public Criteria andActualRepayDateGreaterThan(Date value) {
            addCriterion("actual_repay_date >", value, "actualRepayDate");
            return (Criteria) this;
        }

        public Criteria andActualRepayDateGreaterThanOrEqualTo(Date value) {
            addCriterion("actual_repay_date >=", value, "actualRepayDate");
            return (Criteria) this;
        }

        public Criteria andActualRepayDateLessThan(Date value) {
            addCriterion("actual_repay_date <", value, "actualRepayDate");
            return (Criteria) this;
        }

        public Criteria andActualRepayDateLessThanOrEqualTo(Date value) {
            addCriterion("actual_repay_date <=", value, "actualRepayDate");
            return (Criteria) this;
        }

        public Criteria andActualRepayDateIn(List<Date> values) {
            addCriterion("actual_repay_date in", values, "actualRepayDate");
            return (Criteria) this;
        }

        public Criteria andActualRepayDateNotIn(List<Date> values) {
            addCriterion("actual_repay_date not in", values, "actualRepayDate");
            return (Criteria) this;
        }

        public Criteria andActualRepayDateBetween(Date value1, Date value2) {
            addCriterion("actual_repay_date between", value1, value2, "actualRepayDate");
            return (Criteria) this;
        }

        public Criteria andActualRepayDateNotBetween(Date value1, Date value2) {
            addCriterion("actual_repay_date not between", value1, value2, "actualRepayDate");
            return (Criteria) this;
        }

        public Criteria andNeedPrincipalIsNull() {
            addCriterion("need_principal is null");
            return (Criteria) this;
        }

        public Criteria andNeedPrincipalIsNotNull() {
            addCriterion("need_principal is not null");
            return (Criteria) this;
        }

        public Criteria andNeedPrincipalEqualTo(BigDecimal value) {
            addCriterion("need_principal =", value, "needPrincipal");
            return (Criteria) this;
        }

        public Criteria andNeedPrincipalNotEqualTo(BigDecimal value) {
            addCriterion("need_principal <>", value, "needPrincipal");
            return (Criteria) this;
        }

        public Criteria andNeedPrincipalGreaterThan(BigDecimal value) {
            addCriterion("need_principal >", value, "needPrincipal");
            return (Criteria) this;
        }

        public Criteria andNeedPrincipalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("need_principal >=", value, "needPrincipal");
            return (Criteria) this;
        }

        public Criteria andNeedPrincipalLessThan(BigDecimal value) {
            addCriterion("need_principal <", value, "needPrincipal");
            return (Criteria) this;
        }

        public Criteria andNeedPrincipalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("need_principal <=", value, "needPrincipal");
            return (Criteria) this;
        }

        public Criteria andNeedPrincipalIn(List<BigDecimal> values) {
            addCriterion("need_principal in", values, "needPrincipal");
            return (Criteria) this;
        }

        public Criteria andNeedPrincipalNotIn(List<BigDecimal> values) {
            addCriterion("need_principal not in", values, "needPrincipal");
            return (Criteria) this;
        }

        public Criteria andNeedPrincipalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("need_principal between", value1, value2, "needPrincipal");
            return (Criteria) this;
        }

        public Criteria andNeedPrincipalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("need_principal not between", value1, value2, "needPrincipal");
            return (Criteria) this;
        }

        public Criteria andOverDaysIsNull() {
            addCriterion("over_days is null");
            return (Criteria) this;
        }

        public Criteria andOverDaysIsNotNull() {
            addCriterion("over_days is not null");
            return (Criteria) this;
        }

        public Criteria andOverDaysEqualTo(Integer value) {
            addCriterion("over_days =", value, "overDays");
            return (Criteria) this;
        }

        public Criteria andOverDaysNotEqualTo(Integer value) {
            addCriterion("over_days <>", value, "overDays");
            return (Criteria) this;
        }

        public Criteria andOverDaysGreaterThan(Integer value) {
            addCriterion("over_days >", value, "overDays");
            return (Criteria) this;
        }

        public Criteria andOverDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("over_days >=", value, "overDays");
            return (Criteria) this;
        }

        public Criteria andOverDaysLessThan(Integer value) {
            addCriterion("over_days <", value, "overDays");
            return (Criteria) this;
        }

        public Criteria andOverDaysLessThanOrEqualTo(Integer value) {
            addCriterion("over_days <=", value, "overDays");
            return (Criteria) this;
        }

        public Criteria andOverDaysIn(List<Integer> values) {
            addCriterion("over_days in", values, "overDays");
            return (Criteria) this;
        }

        public Criteria andOverDaysNotIn(List<Integer> values) {
            addCriterion("over_days not in", values, "overDays");
            return (Criteria) this;
        }

        public Criteria andOverDaysBetween(Integer value1, Integer value2) {
            addCriterion("over_days between", value1, value2, "overDays");
            return (Criteria) this;
        }

        public Criteria andOverDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("over_days not between", value1, value2, "overDays");
            return (Criteria) this;
        }

        public Criteria andFineIsNull() {
            addCriterion("fine is null");
            return (Criteria) this;
        }

        public Criteria andFineIsNotNull() {
            addCriterion("fine is not null");
            return (Criteria) this;
        }

        public Criteria andFineEqualTo(BigDecimal value) {
            addCriterion("fine =", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineNotEqualTo(BigDecimal value) {
            addCriterion("fine <>", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineGreaterThan(BigDecimal value) {
            addCriterion("fine >", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fine >=", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineLessThan(BigDecimal value) {
            addCriterion("fine <", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fine <=", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineIn(List<BigDecimal> values) {
            addCriterion("fine in", values, "fine");
            return (Criteria) this;
        }

        public Criteria andFineNotIn(List<BigDecimal> values) {
            addCriterion("fine not in", values, "fine");
            return (Criteria) this;
        }

        public Criteria andFineBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fine between", value1, value2, "fine");
            return (Criteria) this;
        }

        public Criteria andFineNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fine not between", value1, value2, "fine");
            return (Criteria) this;
        }

        public Criteria andInterestIsNull() {
            addCriterion("interest is null");
            return (Criteria) this;
        }

        public Criteria andInterestIsNotNull() {
            addCriterion("interest is not null");
            return (Criteria) this;
        }

        public Criteria andInterestEqualTo(BigDecimal value) {
            addCriterion("interest =", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotEqualTo(BigDecimal value) {
            addCriterion("interest <>", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestGreaterThan(BigDecimal value) {
            addCriterion("interest >", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("interest >=", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestLessThan(BigDecimal value) {
            addCriterion("interest <", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("interest <=", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestIn(List<BigDecimal> values) {
            addCriterion("interest in", values, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotIn(List<BigDecimal> values) {
            addCriterion("interest not in", values, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interest between", value1, value2, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interest not between", value1, value2, "interest");
            return (Criteria) this;
        }

        public Criteria andOverStatusIsNull() {
            addCriterion("over_status is null");
            return (Criteria) this;
        }

        public Criteria andOverStatusIsNotNull() {
            addCriterion("over_status is not null");
            return (Criteria) this;
        }

        public Criteria andOverStatusEqualTo(String value) {
            addCriterion("over_status =", value, "overStatus");
            return (Criteria) this;
        }

        public Criteria andOverStatusNotEqualTo(String value) {
            addCriterion("over_status <>", value, "overStatus");
            return (Criteria) this;
        }

        public Criteria andOverStatusGreaterThan(String value) {
            addCriterion("over_status >", value, "overStatus");
            return (Criteria) this;
        }

        public Criteria andOverStatusGreaterThanOrEqualTo(String value) {
            addCriterion("over_status >=", value, "overStatus");
            return (Criteria) this;
        }

        public Criteria andOverStatusLessThan(String value) {
            addCriterion("over_status <", value, "overStatus");
            return (Criteria) this;
        }

        public Criteria andOverStatusLessThanOrEqualTo(String value) {
            addCriterion("over_status <=", value, "overStatus");
            return (Criteria) this;
        }

        public Criteria andOverStatusLike(String value) {
            addCriterion("over_status like", value, "overStatus");
            return (Criteria) this;
        }

        public Criteria andOverStatusNotLike(String value) {
            addCriterion("over_status not like", value, "overStatus");
            return (Criteria) this;
        }

        public Criteria andOverStatusIn(List<String> values) {
            addCriterion("over_status in", values, "overStatus");
            return (Criteria) this;
        }

        public Criteria andOverStatusNotIn(List<String> values) {
            addCriterion("over_status not in", values, "overStatus");
            return (Criteria) this;
        }

        public Criteria andOverStatusBetween(String value1, String value2) {
            addCriterion("over_status between", value1, value2, "overStatus");
            return (Criteria) this;
        }

        public Criteria andOverStatusNotBetween(String value1, String value2) {
            addCriterion("over_status not between", value1, value2, "overStatus");
            return (Criteria) this;
        }

        public Criteria andPaidPrincipalIsNull() {
            addCriterion("paid_principal is null");
            return (Criteria) this;
        }

        public Criteria andPaidPrincipalIsNotNull() {
            addCriterion("paid_principal is not null");
            return (Criteria) this;
        }

        public Criteria andPaidPrincipalEqualTo(BigDecimal value) {
            addCriterion("paid_principal =", value, "paidPrincipal");
            return (Criteria) this;
        }

        public Criteria andPaidPrincipalNotEqualTo(BigDecimal value) {
            addCriterion("paid_principal <>", value, "paidPrincipal");
            return (Criteria) this;
        }

        public Criteria andPaidPrincipalGreaterThan(BigDecimal value) {
            addCriterion("paid_principal >", value, "paidPrincipal");
            return (Criteria) this;
        }

        public Criteria andPaidPrincipalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("paid_principal >=", value, "paidPrincipal");
            return (Criteria) this;
        }

        public Criteria andPaidPrincipalLessThan(BigDecimal value) {
            addCriterion("paid_principal <", value, "paidPrincipal");
            return (Criteria) this;
        }

        public Criteria andPaidPrincipalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("paid_principal <=", value, "paidPrincipal");
            return (Criteria) this;
        }

        public Criteria andPaidPrincipalIn(List<BigDecimal> values) {
            addCriterion("paid_principal in", values, "paidPrincipal");
            return (Criteria) this;
        }

        public Criteria andPaidPrincipalNotIn(List<BigDecimal> values) {
            addCriterion("paid_principal not in", values, "paidPrincipal");
            return (Criteria) this;
        }

        public Criteria andPaidPrincipalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("paid_principal between", value1, value2, "paidPrincipal");
            return (Criteria) this;
        }

        public Criteria andPaidPrincipalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("paid_principal not between", value1, value2, "paidPrincipal");
            return (Criteria) this;
        }

        public Criteria andPaidInterestIsNull() {
            addCriterion("paid_interest is null");
            return (Criteria) this;
        }

        public Criteria andPaidInterestIsNotNull() {
            addCriterion("paid_interest is not null");
            return (Criteria) this;
        }

        public Criteria andPaidInterestEqualTo(BigDecimal value) {
            addCriterion("paid_interest =", value, "paidInterest");
            return (Criteria) this;
        }

        public Criteria andPaidInterestNotEqualTo(BigDecimal value) {
            addCriterion("paid_interest <>", value, "paidInterest");
            return (Criteria) this;
        }

        public Criteria andPaidInterestGreaterThan(BigDecimal value) {
            addCriterion("paid_interest >", value, "paidInterest");
            return (Criteria) this;
        }

        public Criteria andPaidInterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("paid_interest >=", value, "paidInterest");
            return (Criteria) this;
        }

        public Criteria andPaidInterestLessThan(BigDecimal value) {
            addCriterion("paid_interest <", value, "paidInterest");
            return (Criteria) this;
        }

        public Criteria andPaidInterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("paid_interest <=", value, "paidInterest");
            return (Criteria) this;
        }

        public Criteria andPaidInterestIn(List<BigDecimal> values) {
            addCriterion("paid_interest in", values, "paidInterest");
            return (Criteria) this;
        }

        public Criteria andPaidInterestNotIn(List<BigDecimal> values) {
            addCriterion("paid_interest not in", values, "paidInterest");
            return (Criteria) this;
        }

        public Criteria andPaidInterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("paid_interest between", value1, value2, "paidInterest");
            return (Criteria) this;
        }

        public Criteria andPaidInterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("paid_interest not between", value1, value2, "paidInterest");
            return (Criteria) this;
        }

        public Criteria andPaidFineIsNull() {
            addCriterion("paid_fine is null");
            return (Criteria) this;
        }

        public Criteria andPaidFineIsNotNull() {
            addCriterion("paid_fine is not null");
            return (Criteria) this;
        }

        public Criteria andPaidFineEqualTo(BigDecimal value) {
            addCriterion("paid_fine =", value, "paidFine");
            return (Criteria) this;
        }

        public Criteria andPaidFineNotEqualTo(BigDecimal value) {
            addCriterion("paid_fine <>", value, "paidFine");
            return (Criteria) this;
        }

        public Criteria andPaidFineGreaterThan(BigDecimal value) {
            addCriterion("paid_fine >", value, "paidFine");
            return (Criteria) this;
        }

        public Criteria andPaidFineGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("paid_fine >=", value, "paidFine");
            return (Criteria) this;
        }

        public Criteria andPaidFineLessThan(BigDecimal value) {
            addCriterion("paid_fine <", value, "paidFine");
            return (Criteria) this;
        }

        public Criteria andPaidFineLessThanOrEqualTo(BigDecimal value) {
            addCriterion("paid_fine <=", value, "paidFine");
            return (Criteria) this;
        }

        public Criteria andPaidFineIn(List<BigDecimal> values) {
            addCriterion("paid_fine in", values, "paidFine");
            return (Criteria) this;
        }

        public Criteria andPaidFineNotIn(List<BigDecimal> values) {
            addCriterion("paid_fine not in", values, "paidFine");
            return (Criteria) this;
        }

        public Criteria andPaidFineBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("paid_fine between", value1, value2, "paidFine");
            return (Criteria) this;
        }

        public Criteria andPaidFineNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("paid_fine not between", value1, value2, "paidFine");
            return (Criteria) this;
        }

        public Criteria andPayEachStatusIsNull() {
            addCriterion("pay_each_status is null");
            return (Criteria) this;
        }

        public Criteria andPayEachStatusIsNotNull() {
            addCriterion("pay_each_status is not null");
            return (Criteria) this;
        }

        public Criteria andPayEachStatusEqualTo(String value) {
            addCriterion("pay_each_status =", value, "payEachStatus");
            return (Criteria) this;
        }

        public Criteria andPayEachStatusNotEqualTo(String value) {
            addCriterion("pay_each_status <>", value, "payEachStatus");
            return (Criteria) this;
        }

        public Criteria andPayEachStatusGreaterThan(String value) {
            addCriterion("pay_each_status >", value, "payEachStatus");
            return (Criteria) this;
        }

        public Criteria andPayEachStatusGreaterThanOrEqualTo(String value) {
            addCriterion("pay_each_status >=", value, "payEachStatus");
            return (Criteria) this;
        }

        public Criteria andPayEachStatusLessThan(String value) {
            addCriterion("pay_each_status <", value, "payEachStatus");
            return (Criteria) this;
        }

        public Criteria andPayEachStatusLessThanOrEqualTo(String value) {
            addCriterion("pay_each_status <=", value, "payEachStatus");
            return (Criteria) this;
        }

        public Criteria andPayEachStatusLike(String value) {
            addCriterion("pay_each_status like", value, "payEachStatus");
            return (Criteria) this;
        }

        public Criteria andPayEachStatusNotLike(String value) {
            addCriterion("pay_each_status not like", value, "payEachStatus");
            return (Criteria) this;
        }

        public Criteria andPayEachStatusIn(List<String> values) {
            addCriterion("pay_each_status in", values, "payEachStatus");
            return (Criteria) this;
        }

        public Criteria andPayEachStatusNotIn(List<String> values) {
            addCriterion("pay_each_status not in", values, "payEachStatus");
            return (Criteria) this;
        }

        public Criteria andPayEachStatusBetween(String value1, String value2) {
            addCriterion("pay_each_status between", value1, value2, "payEachStatus");
            return (Criteria) this;
        }

        public Criteria andPayEachStatusNotBetween(String value1, String value2) {
            addCriterion("pay_each_status not between", value1, value2, "payEachStatus");
            return (Criteria) this;
        }

        public Criteria andEachStartDateIsNull() {
            addCriterion("each_start_date is null");
            return (Criteria) this;
        }

        public Criteria andEachStartDateIsNotNull() {
            addCriterion("each_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andEachStartDateEqualTo(Date value) {
            addCriterion("each_start_date =", value, "eachStartDate");
            return (Criteria) this;
        }

        public Criteria andEachStartDateNotEqualTo(Date value) {
            addCriterion("each_start_date <>", value, "eachStartDate");
            return (Criteria) this;
        }

        public Criteria andEachStartDateGreaterThan(Date value) {
            addCriterion("each_start_date >", value, "eachStartDate");
            return (Criteria) this;
        }

        public Criteria andEachStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("each_start_date >=", value, "eachStartDate");
            return (Criteria) this;
        }

        public Criteria andEachStartDateLessThan(Date value) {
            addCriterion("each_start_date <", value, "eachStartDate");
            return (Criteria) this;
        }

        public Criteria andEachStartDateLessThanOrEqualTo(Date value) {
            addCriterion("each_start_date <=", value, "eachStartDate");
            return (Criteria) this;
        }

        public Criteria andEachStartDateIn(List<Date> values) {
            addCriterion("each_start_date in", values, "eachStartDate");
            return (Criteria) this;
        }

        public Criteria andEachStartDateNotIn(List<Date> values) {
            addCriterion("each_start_date not in", values, "eachStartDate");
            return (Criteria) this;
        }

        public Criteria andEachStartDateBetween(Date value1, Date value2) {
            addCriterion("each_start_date between", value1, value2, "eachStartDate");
            return (Criteria) this;
        }

        public Criteria andEachStartDateNotBetween(Date value1, Date value2) {
            addCriterion("each_start_date not between", value1, value2, "eachStartDate");
            return (Criteria) this;
        }

        public Criteria andNowDateIsNull() {
            addCriterion("now_date is null");
            return (Criteria) this;
        }

        public Criteria andNowDateIsNotNull() {
            addCriterion("now_date is not null");
            return (Criteria) this;
        }

        public Criteria andNowDateEqualTo(Date value) {
            addCriterion("now_date =", value, "nowDate");
            return (Criteria) this;
        }

        public Criteria andNowDateNotEqualTo(Date value) {
            addCriterion("now_date <>", value, "nowDate");
            return (Criteria) this;
        }

        public Criteria andNowDateGreaterThan(Date value) {
            addCriterion("now_date >", value, "nowDate");
            return (Criteria) this;
        }

        public Criteria andNowDateGreaterThanOrEqualTo(Date value) {
            addCriterion("now_date >=", value, "nowDate");
            return (Criteria) this;
        }

        public Criteria andNowDateLessThan(Date value) {
            addCriterion("now_date <", value, "nowDate");
            return (Criteria) this;
        }

        public Criteria andNowDateLessThanOrEqualTo(Date value) {
            addCriterion("now_date <=", value, "nowDate");
            return (Criteria) this;
        }

        public Criteria andNowDateIn(List<Date> values) {
            addCriterion("now_date in", values, "nowDate");
            return (Criteria) this;
        }

        public Criteria andNowDateNotIn(List<Date> values) {
            addCriterion("now_date not in", values, "nowDate");
            return (Criteria) this;
        }

        public Criteria andNowDateBetween(Date value1, Date value2) {
            addCriterion("now_date between", value1, value2, "nowDate");
            return (Criteria) this;
        }

        public Criteria andNowDateNotBetween(Date value1, Date value2) {
            addCriterion("now_date not between", value1, value2, "nowDate");
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