package com.iwonder.alice.constant;

/**
 * @author mirror
 * 
 */
public enum WebConstant {
	
	AUDIT_STATUS("审核状态", "audit_status"), 
	AUDIT_STATUS_UNDER_AUDIT("审核中", "audit_status_under_audit"), 
	AUDIT_STATUS_REJECT("审核失败", "audit_status_reject"), 
	AUDIT_STATUS_SUCCESS("审核通过", "audit_status_success"),

	USER_STATUS("用户状态", "user_isblacklist"), 
	USER_STATUS_ISBLACKLIST("用户黑名单", "user_status_isblacklist"), 
	USER_STATUS_NOTBLACKLIST("用户不是黑名单", "user_status_notblacklist"),

	PAY_STATUS("还款状态", "pay_status"), 
	PAY_STATUS_ISREPAY("已还款", "repay_status_isrepay"), 
	PAY_STATUS_NOTREPAY("未还款", "user_status_isblacklist"),

	//额度审批资质
	//第一要素  +10
	ECONOMY_HOUSE("房产", "economy_house"), 
	HAVING_HOUSE("有房", "having_house"), //+10
	NO_HOUSE("没房", "no_house"),//+0
	
	//第二要素 +8
	CONOMY_WORK("工作状态", "economy_work"), 
	GET_JOB("就业", "get_job"), //+8
	LOSE_JOB("失业", "lose_job"),//+0
	
	//第三要素 +5
	ECONOMY_CAR("是否有车", "economy_car"), 
	HAVING_CAR("有车", "having_car"), //+5
	NO_CAR("没车", "no_car"),//+0
	
	//第三要素 +5
	SECURITY_RELATION("担保性质", "security_relation"), 
	COMPANY("企业", "company"),//+5
	PERSONAL("个人", "personal"), //+2
	NOTHING("无", "nothing"),//+0
	
	//第三要素 +5
	ECONOMY_EDUCATION("学历", "economy_education"), 
	UNDERGRADUATE("本科", "undergraduate"), //+5
	SPECIALTY("专科", "specialty"),//+2
	NOEDUCATION("无学历", "no_education");//+0
	
	
//	already_audit	审核通过
//	yes_isblacklist	黑名单标记
//	no_isblacklist	黑名单未标记
//	yes_repeat_loan	已重复借贷
//	no_repeat_loan	未重复借贷
//	equal_amount_ of_ interest	等额本息
//	equal_amount_of_principal	等额本金
//	yes_staff	在职
//	no_staff	离职
//	no_audit	审核不通过
//	in_audit	审核中
//	already_pay	已经还款
//	no_pay	未还款
//	already_overdue	已逾期
//	no_overdue	未逾期
//	yes_pay_each	本期已还款
//	no_pay_each	本期未还款
	
	
	
	
	private String label;
	private String value;

	private WebConstant(String label, String value) {
		this.label= label;
		this.value= value;
	}

	public String getLabel() {
		return label;
	}

	public String getValue() {
		return value;
	}

}
