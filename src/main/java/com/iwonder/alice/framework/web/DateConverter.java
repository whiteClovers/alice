package com.iwonder.alice.framework.web;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class DateConverter implements Converter<String, Date>{
	@Override
	public Date convert(String source) {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		if(source.length() == 19){
			dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		}else if(source.length() == 16){
			dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		}
		
		dateFormat.setLenient(false);
		try {
			return dateFormat.parse(source);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
}
