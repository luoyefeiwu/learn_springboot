package com.jerry.banquet.mapper;

import com.jerry.banquet.model.TBanquetDrinks;

public interface TBanquetDrinksMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banquet_drinks
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    int deleteByPrimaryKey(String drinksid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banquet_drinks
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    int insert(TBanquetDrinks record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banquet_drinks
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    int insertSelective(TBanquetDrinks record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banquet_drinks
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    TBanquetDrinks selectByPrimaryKey(String drinksid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banquet_drinks
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    int updateByPrimaryKeySelective(TBanquetDrinks record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banquet_drinks
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    int updateByPrimaryKey(TBanquetDrinks record);
}