package com.iwonder.alice.pro.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ProLoan implements Serializable {
    private String loanId;

    private String userId;

    private String loanCode;

    private String repayMethodId;

    private BigDecimal loanAmount;

    private BigDecimal actualAmount;

    private Date term;

    private String auditStatus;

    private BigDecimal serviceCharge;

    private BigDecimal managementExpense;

    private String payStatus;

    private Integer period;

    private String releaseStatus;

    private Date startDate;

    private String termLabel;

    private static final long serialVersionUID = 1L;

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId == null ? null : loanId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getLoanCode() {
        return loanCode;
    }

    public void setLoanCode(String loanCode) {
        this.loanCode = loanCode == null ? null : loanCode.trim();
    }

    public String getRepayMethodId() {
        return repayMethodId;
    }

    public void setRepayMethodId(String repayMethodId) {
        this.repayMethodId = repayMethodId == null ? null : repayMethodId.trim();
    }

    public BigDecimal getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(BigDecimal loanAmount) {
        this.loanAmount = loanAmount;
    }

    public BigDecimal getActualAmount() {
        return actualAmount;
    }

    public void setActualAmount(BigDecimal actualAmount) {
        this.actualAmount = actualAmount;
    }

    public Date getTerm() {
        return term;
    }

    public void setTerm(Date term) {
        this.term = term;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus == null ? null : auditStatus.trim();
    }

    public BigDecimal getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(BigDecimal serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public BigDecimal getManagementExpense() {
        return managementExpense;
    }

    public void setManagementExpense(BigDecimal managementExpense) {
        this.managementExpense = managementExpense;
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus == null ? null : payStatus.trim();
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public String getReleaseStatus() {
        return releaseStatus;
    }

    public void setReleaseStatus(String releaseStatus) {
        this.releaseStatus = releaseStatus == null ? null : releaseStatus.trim();
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getTermLabel() {
        return termLabel;
    }

    public void setTermLabel(String termLabel) {
        this.termLabel = termLabel == null ? null : termLabel.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", loanId=").append(loanId);
        sb.append(", userId=").append(userId);
        sb.append(", loanCode=").append(loanCode);
        sb.append(", repayMethodId=").append(repayMethodId);
        sb.append(", loanAmount=").append(loanAmount);
        sb.append(", actualAmount=").append(actualAmount);
        sb.append(", term=").append(term);
        sb.append(", auditStatus=").append(auditStatus);
        sb.append(", serviceCharge=").append(serviceCharge);
        sb.append(", managementExpense=").append(managementExpense);
        sb.append(", payStatus=").append(payStatus);
        sb.append(", period=").append(period);
        sb.append(", releaseStatus=").append(releaseStatus);
        sb.append(", startDate=").append(startDate);
        sb.append(", termLabel=").append(termLabel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}