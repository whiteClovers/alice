package com.iwonder.alice.usr.entity;

import java.io.Serializable;

public class UsrSecurity implements Serializable {
    private String securityId;

    private String userId;

    private String securityCode;

    private String securityRelation;

    private String securityName;

    private static final long serialVersionUID = 1L;

    public String getSecurityId() {
        return securityId;
    }

    public void setSecurityId(String securityId) {
        this.securityId = securityId == null ? null : securityId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode == null ? null : securityCode.trim();
    }

    public String getSecurityRelation() {
        return securityRelation;
    }

    public void setSecurityRelation(String securityRelation) {
        this.securityRelation = securityRelation == null ? null : securityRelation.trim();
    }

    public String getSecurityName() {
        return securityName;
    }

    public void setSecurityName(String securityName) {
        this.securityName = securityName == null ? null : securityName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", securityId=").append(securityId);
        sb.append(", userId=").append(userId);
        sb.append(", securityCode=").append(securityCode);
        sb.append(", securityRelation=").append(securityRelation);
        sb.append(", securityName=").append(securityName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}