package com.iwonder.alice.pro.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class ProRepayMethod implements Serializable {
    private String repayMethodId;

    private String repayMethodCode;

    private String repayMethod;

    private BigDecimal monthRate;

    private BigDecimal penaltyRate;

    private static final long serialVersionUID = 1L;

    public String getRepayMethodId() {
        return repayMethodId;
    }

    public void setRepayMethodId(String repayMethodId) {
        this.repayMethodId = repayMethodId == null ? null : repayMethodId.trim();
    }

    public String getRepayMethodCode() {
        return repayMethodCode;
    }

    public void setRepayMethodCode(String repayMethodCode) {
        this.repayMethodCode = repayMethodCode == null ? null : repayMethodCode.trim();
    }

    public String getRepayMethod() {
        return repayMethod;
    }

    public void setRepayMethod(String repayMethod) {
        this.repayMethod = repayMethod == null ? null : repayMethod.trim();
    }

    public BigDecimal getMonthRate() {
        return monthRate;
    }

    public void setMonthRate(BigDecimal monthRate) {
        this.monthRate = monthRate;
    }

    public BigDecimal getPenaltyRate() {
        return penaltyRate;
    }

    public void setPenaltyRate(BigDecimal penaltyRate) {
        this.penaltyRate = penaltyRate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", repayMethodId=").append(repayMethodId);
        sb.append(", repayMethodCode=").append(repayMethodCode);
        sb.append(", repayMethod=").append(repayMethod);
        sb.append(", monthRate=").append(monthRate);
        sb.append(", penaltyRate=").append(penaltyRate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}