package com.jerry.banquet.mapper;

import com.jerry.banquet.model.TBanquetOrderTemplateFields;

public interface TBanquetOrderTemplateFieldsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banquet_order_template_fields
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    int deleteByPrimaryKey(String templatefiedid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banquet_order_template_fields
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    int insert(TBanquetOrderTemplateFields record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banquet_order_template_fields
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    int insertSelective(TBanquetOrderTemplateFields record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banquet_order_template_fields
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    TBanquetOrderTemplateFields selectByPrimaryKey(String templatefiedid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banquet_order_template_fields
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    int updateByPrimaryKeySelective(TBanquetOrderTemplateFields record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banquet_order_template_fields
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    int updateByPrimaryKey(TBanquetOrderTemplateFields record);
}