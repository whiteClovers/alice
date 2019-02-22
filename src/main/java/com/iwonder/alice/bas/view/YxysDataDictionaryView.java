package com.iwonder.alice.bas.view;

import com.iwonder.alice.bas.entity.BasDataDictionary;

public class YxysDataDictionaryView  extends BasDataDictionary{

	

	    private String dictionaryDetailCode;

	    private String dictionaryDetailLabel;

	  

		
		public String getDictionaryDetailCode() {
			return dictionaryDetailCode;
		}

		public void setDictionaryDetailCode(String dictionaryDetailCode) {
			this.dictionaryDetailCode = dictionaryDetailCode;
		}

		public String getDictionaryDetailLabel() {
			return dictionaryDetailLabel;
		}

		public void setDictionaryDetailLabel(String dictionaryDetailLabel) {
			this.dictionaryDetailLabel = dictionaryDetailLabel;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("YxysDataDictionaryView [dictionaryDetailCode=");
			builder.append(dictionaryDetailCode);
			builder.append(", dictionaryDetailLabel=");
			builder.append(dictionaryDetailLabel);
			builder.append("]");
			return builder.toString();
		}


		
	
}
