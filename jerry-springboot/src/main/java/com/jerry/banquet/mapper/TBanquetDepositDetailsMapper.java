package com.jerry.banquet.mapper;

import com.jerry.banquet.model.TBanquetDepositDetails;

public interface TBanquetDepositDetailsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banquet_deposit_details
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    int deleteByPrimaryKey(String detailsid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banquet_deposit_details
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    int insert(TBanquetDepositDetails record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banquet_deposit_details
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    int insertSelective(TBanquetDepositDetails record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banquet_deposit_details
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    TBanquetDepositDetails selectByPrimaryKey(String detailsid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banquet_deposit_details
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    int updateByPrimaryKeySelective(TBanquetDepositDetails record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banquet_deposit_details
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    int updateByPrimaryKey(TBanquetDepositDetails record);
}