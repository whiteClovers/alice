package com.iwonder.alice.framework.util;

import java.math.BigDecimal;

public class CalculationUtil {

	private BigDecimal principal;// 本金A

	private BigDecimal monthlyInterestRate;// 月利率B

	private Integer repaymentMonths;// 还款月数|还款期数C

	private Integer monthlyNumber;// 第几月|第几期|期数D

	/**
	 * 每月还款总额 =(A*B*(1+B)^C)/((1+B)^C-1)
	 * 
	 * @return
	 */
	public BigDecimal getMonthlyAmount() {

		// 判断值是否为空
		if (principal != null && monthlyInterestRate != null && repaymentMonths != null) {
			// 利率值=1+月利率=1+B
			BigDecimal rate = BigDecimalUtil.add(monthlyInterestRate.toString(), "1");
			// A*B
			BigDecimal multi = BigDecimalUtil.multi(principal.toString(), monthlyInterestRate.toString());
			// (1+B)^C
			BigDecimal pow = rate.pow(repaymentMonths);
			// A*B*(1+B)^C
			multi = BigDecimalUtil.multi(multi.toString(), pow.toString());
			// (1+B)^C-1
			BigDecimal subtract = BigDecimalUtil.subtract(pow.toString(), "1");
			// (A*B*(1+B)^C)/((1+B)^C-1)
			return BigDecimalUtil.divide(multi.toString(), subtract.toString());
		}

		return null;
	}

	/**
	 * 每月还款本金 ==((getMonthlyAmount)-A*B)*(1+B)^(D-1)
	 * 
	 * @return
	 */
	public BigDecimal getMonthlyPrincipal() {

		// 判断值是否为空
		if (principal != null && monthlyInterestRate != null && repaymentMonths != null && monthlyNumber != null) {
			// A*B
			BigDecimal multi = BigDecimalUtil.multi(principal.toString(), monthlyInterestRate.toString());
			// 利率值=1+B
			BigDecimal rate = BigDecimalUtil.add(monthlyInterestRate.toString(), "1");
			// 月数差=D-1
			Integer monthlySub = monthlyNumber - 1;
			// (1+B)^(D-1)
			BigDecimal pow = rate.pow(monthlySub);
			// ((getMonthlyAmount)-A*B)*(1+B)^(D-1)
			multi = BigDecimalUtil.multi(BigDecimalUtil.subtract(getMonthlyAmount().toString(), multi.toString()).toString(),
					pow.toString());

			return multi;
		}
		return null;
	}

	/**
	 * 每月还款利息，每月都不一样
	 * 
	 * @return
	 */
	public BigDecimal getInterest() {

		if (getMonthlyAmount() != null && getMonthlyPrincipal() != null) {
			return BigDecimalUtil.subtract(getMonthlyAmount().toString(), getMonthlyPrincipal().toString());
		}
		return null;
	}

	public CalculationUtil() {
		super();
	}

	public CalculationUtil(BigDecimal principal, BigDecimal monthlyInterestRate, Integer repaymentMonths,
			Integer monthlyNumber) {
		super();
		this.principal = principal;
		this.monthlyInterestRate = monthlyInterestRate;
		this.repaymentMonths = repaymentMonths;
		this.monthlyNumber = monthlyNumber;
	}

	public BigDecimal getPrincipal() {
		return principal;
	}

	public void setPrincipal(BigDecimal principal) {
		this.principal = principal;
	}

	public BigDecimal getMonthlyInterestRate() {
		return monthlyInterestRate;
	}

	public void setMonthlyInterestRate(BigDecimal monthlyInterestRate) {
		this.monthlyInterestRate = monthlyInterestRate;
	}

	public Integer getRepaymentMonths() {
		return repaymentMonths;
	}

	public void setRepaymentMonths(Integer repaymentMonths) {
		this.repaymentMonths = repaymentMonths;
	}

	public Integer getMonthlyNumber() {
		return monthlyNumber;
	}

	public void setMonthlyNumber(Integer monthlyNumber) {
		this.monthlyNumber = monthlyNumber;
	}

}
