package com.iwonder.alice.bas.dao;

import org.apache.ibatis.jdbc.SQL;

import com.iwonder.alice.bas.view.BasDataDictionaryDetailView;

/**
 * @author mirror
 * @version 创建时间：2018年11月16日 下午5:06:59
 * 
 */
public class DataDictionaryDetailSQL {
	public String selectWhitEmployeeSql(final BasDataDictionaryDetailView param) {
		return new SQL() {
			{
				SELECT("b.*, a.data_dictionary_label ");
				FROM("bas_data_dictionary a JOIN bas_data_dictionary_detail b ON a.data_dictionary_id = b.data_dictionary_id");
				if (param.getDictionaryDetailId() != null) {
					WHERE("b.dictionary_detail_id = #{dictionaryDetailId}");
				}
				if (param.getDataDictionaryId() != null) {
					WHERE("b.data_dictionary_id = #{dataDictionaryId}");
				}
				if (param.getDictionaryDetailCode() != null) {
					WHERE(" AND b.dictionary_detail_code like concat(concat('%',#{dictionaryDetailCode}),'%')");
				}
				if (param.getDictionaryDetailLabel() != null) {
					WHERE(" AND b.dictionary_detail_label like concat(concat('%',#{dictionaryDetailLabel}),'%')");
				}
				if (param.getDictionaryDetailNumber() != null) {
					WHERE(" AND b.dictionary_detail_number like concat(concat('%',#{dictionaryDetailNumber}),'%')");
				}
				if (param.getDataDictionaryLabel() != null) {
					WHERE(" AND data_dictionary_label = #{dataDictionaryLabel}");
				}
			}
		}.toString();
	}
}
