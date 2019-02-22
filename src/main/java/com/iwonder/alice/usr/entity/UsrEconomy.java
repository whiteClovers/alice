package com.iwonder.alice.usr.entity;

import java.io.Serializable;

public class UsrEconomy implements Serializable {
    private String economyId;

    private String economyCode;

    private String userId;

    private String economyWork;

    private String economySalary;

    private String economyHouse;

    private String economyCar;

    private String economyEducation;

    private static final long serialVersionUID = 1L;

    public String getEconomyId() {
        return economyId;
    }

    public void setEconomyId(String economyId) {
        this.economyId = economyId == null ? null : economyId.trim();
    }

    public String getEconomyCode() {
        return economyCode;
    }

    public void setEconomyCode(String economyCode) {
        this.economyCode = economyCode == null ? null : economyCode.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getEconomyWork() {
        return economyWork;
    }

    public void setEconomyWork(String economyWork) {
        this.economyWork = economyWork == null ? null : economyWork.trim();
    }

    public String getEconomySalary() {
        return economySalary;
    }

    public void setEconomySalary(String economySalary) {
        this.economySalary = economySalary == null ? null : economySalary.trim();
    }

    public String getEconomyHouse() {
        return economyHouse;
    }

    public void setEconomyHouse(String economyHouse) {
        this.economyHouse = economyHouse == null ? null : economyHouse.trim();
    }

    public String getEconomyCar() {
        return economyCar;
    }

    public void setEconomyCar(String economyCar) {
        this.economyCar = economyCar == null ? null : economyCar.trim();
    }

    public String getEconomyEducation() {
        return economyEducation;
    }

    public void setEconomyEducation(String economyEducation) {
        this.economyEducation = economyEducation == null ? null : economyEducation.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", economyId=").append(economyId);
        sb.append(", economyCode=").append(economyCode);
        sb.append(", userId=").append(userId);
        sb.append(", economyWork=").append(economyWork);
        sb.append(", economySalary=").append(economySalary);
        sb.append(", economyHouse=").append(economyHouse);
        sb.append(", economyCar=").append(economyCar);
        sb.append(", economyEducation=").append(economyEducation);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}