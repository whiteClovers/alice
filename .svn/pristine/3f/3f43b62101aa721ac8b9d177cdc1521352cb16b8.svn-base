package com.iwonder.alice.framework.util;

import com.iwonder.alice.constant.WebConstant;
import com.iwonder.alice.usr.entity.UsrInformation;
import com.iwonder.alice.usr.view.UsrEconomyView;
import com.iwonder.alice.usr.view.UsrSecurityView;

public class UsrCreditJudge extends UsrInformation {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 用户评级标准
	 */
	private UsrEconomyView usrEconomyView;

	private UsrSecurityView usrSecurityView;

	private Integer points = 0;
	
	/**
	 * 用户等级判定
	 * @return
	 */
	public String getUsrCredit() {
		// 信用评级--用户经济表
		if (usrEconomyView != null) {
			points += WebConstant.HAVING_HOUSE.getValue().equals(usrEconomyView.getEconomyHouse()) ? 10 : 0;
			points += WebConstant.GET_JOB.getValue().equals(usrEconomyView.getEconomyWork()) ? 8 : 0;
			points += WebConstant.HAVING_CAR.getValue().equals(usrEconomyView.getEconomyCar()) ? 5 : 0;
			points += WebConstant.UNDERGRADUATE.getValue().equals(usrEconomyView.getEconomyEducation()) ? 5 : 0;
			points += WebConstant.SPECIALTY.getValue().equals(usrEconomyView.getEconomyEducation()) ? 2 : 0;
		}
		// 信用评级--用户担保人表
		if (usrSecurityView != null) {
			points += WebConstant.COMPANY.getValue().equals(usrSecurityView.getSecurityRelation()) ? 5 : 0;
			points += WebConstant.PERSONAL.getValue().equals(usrSecurityView.getSecurityRelation()) ? 2 : 0;
		}
		// 信用评级--评分阶段
		String usrScore = getUsrScore(points);
		
		return usrScore;
	}
	
	/**
	 * 信用评级
	 * @param points
	 * @return
	 */
	private String getUsrScore(Integer points){
		if(points>=35){
			return "B";
		}else if(points>=30){
			return "CCC";
		}else if(points>=25){
			return "CC";
		}else if(points>=20){
			return "C";
		}else if(points>=15){
			return "DDD";
		}else if(points>=10){
			return "DD";
		}else if(points>=5){
			return "D";
		}
		//若评分低于5分，则评级为最低,且无贷款额度
		return "E";
	}
	
	/**
	 * 获取用户额度
	 */
	public String getUserAmount(String credit){
		switch (credit) {
		case "B":
			return "128000";
		case "CCC":
			return "64000";
		case "CC":
			return "32000";
		case "C":
			return "16000";
		case "DDD":
			return "8000";
		case "DD":
			return "4000";
		case "D":
			return "2000";
		default:
			break;
		}
		return "0";
	}
	
	public UsrEconomyView getUsrEconomyView() {
		return usrEconomyView;
	}

	public void setUsrEconomyView(UsrEconomyView usrEconomyView) {
		this.usrEconomyView = usrEconomyView;
	}

	public UsrSecurityView getUsrSecurityView() {
		return usrSecurityView;
	}

	public void setUsrSecurityView(UsrSecurityView usrSecurityView) {
		this.usrSecurityView = usrSecurityView;
	}

}