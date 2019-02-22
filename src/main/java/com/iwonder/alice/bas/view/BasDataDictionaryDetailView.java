package com.iwonder.alice.bas.view;

import java.io.Serializable;

import com.iwonder.alice.bas.entity.BasDataDictionaryDetail;

public class BasDataDictionaryDetailView extends BasDataDictionaryDetail implements Serializable {
	private String dataDictionaryLabel;

	public String getDataDictionaryLabel() {
		return dataDictionaryLabel;
	}

	public void setDataDictionaryLabel(String dataDictionaryLabel) {
		this.dataDictionaryLabel = dataDictionaryLabel;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BasDataDictionaryDetailView [dataDictionaryLabel=");
		builder.append(dataDictionaryLabel);
		builder.append("]");
		return builder.toString();
	}

}