package com.iwonder.alice.pro.entity.view;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.iwonder.alice.pro.entity.ProLoan;

public class ProLoanView extends ProLoan implements Serializable {
 
   private String userCode;
   private String userPwd;
   private String userName;
   private String  userIdcard;
   private String auditStatusLabel;
   private String	payStatusLabel;
   private String repayMethod;
   private BigDecimal monthRate;
   private BigDecimal penaltyRate;
   private String releaseStatusLabel;
public String getUserCode() {
	return userCode;
}
public void setUserCode(String userCode) {
	this.userCode = userCode;
}
public String getUserPwd() {
	return userPwd;
}
public void setUserPwd(String userPwd) {
	this.userPwd = userPwd;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getUserIdcard() {
	return userIdcard;
}
public void setUserIdcard(String userIdcard) {
	this.userIdcard = userIdcard;
}
public String getAuditStatusLabel() {
	return auditStatusLabel;
}
public void setAuditStatusLabel(String auditStatusLabel) {
	this.auditStatusLabel = auditStatusLabel;
}
public String getPayStatusLabel() {
	return payStatusLabel;
}
public void setPayStatusLabel(String payStatusLabel) {
	this.payStatusLabel = payStatusLabel;
}
public String getRepayMethod() {
	return repayMethod;
}
public void setRepayMethod(String repayMethod) {
	this.repayMethod = repayMethod;
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

public String getReleaseStatusLabel() {
	return releaseStatusLabel;
}
public void setReleaseStatusLabel(String releaseStatusLabel) {
	this.releaseStatusLabel = releaseStatusLabel;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("ProLoanView [userCode=");
	builder.append(userCode);
	builder.append(", userPwd=");
	builder.append(userPwd);
	builder.append(", userName=");
	builder.append(userName);
	builder.append(", userIdcard=");
	builder.append(userIdcard);
	builder.append(", auditStatusLabel=");
	builder.append(auditStatusLabel);
	builder.append(", payStatusLabel=");
	builder.append(payStatusLabel);
	builder.append(", repayMethod=");
	builder.append(repayMethod);
	builder.append(", monthRate=");
	builder.append(monthRate);
	builder.append(", penaltyRate=");
	builder.append(penaltyRate);
	builder.append(", releaseStatusLabel=");
	builder.append(releaseStatusLabel);
	builder.append("]");
	return builder.toString();
}


    
  
    
}