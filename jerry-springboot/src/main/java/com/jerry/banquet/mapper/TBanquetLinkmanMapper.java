package com.jerry.banquet.mapper;

import com.jerry.banquet.model.TBanquetLinkman;

public interface TBanquetLinkmanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banquet_linkman
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    int deleteByPrimaryKey(String linkmanid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banquet_linkman
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    int insert(TBanquetLinkman record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banquet_linkman
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    int insertSelective(TBanquetLinkman record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banquet_linkman
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    TBanquetLinkman selectByPrimaryKey(String linkmanid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banquet_linkman
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    int updateByPrimaryKeySelective(TBanquetLinkman record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banquet_linkman
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    int updateByPrimaryKey(TBanquetLinkman record);
}