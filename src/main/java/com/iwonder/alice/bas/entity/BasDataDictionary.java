package com.iwonder.alice.bas.entity;

import java.io.Serializable;

public class BasDataDictionary implements Serializable {
    private String dataDictionaryId;

    private String dataDictionaryCode;

    private String dataDictionaryLabel;

    private static final long serialVersionUID = 1L;

    public String getDataDictionaryId() {
        return dataDictionaryId;
    }

    public void setDataDictionaryId(String dataDictionaryId) {
        this.dataDictionaryId = dataDictionaryId == null ? null : dataDictionaryId.trim();
    }

    public String getDataDictionaryCode() {
        return dataDictionaryCode;
    }

    public void setDataDictionaryCode(String dataDictionaryCode) {
        this.dataDictionaryCode = dataDictionaryCode == null ? null : dataDictionaryCode.trim();
    }

    public String getDataDictionaryLabel() {
        return dataDictionaryLabel;
    }

    public void setDataDictionaryLabel(String dataDictionaryLabel) {
        this.dataDictionaryLabel = dataDictionaryLabel == null ? null : dataDictionaryLabel.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dataDictionaryId=").append(dataDictionaryId);
        sb.append(", dataDictionaryCode=").append(dataDictionaryCode);
        sb.append(", dataDictionaryLabel=").append(dataDictionaryLabel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}