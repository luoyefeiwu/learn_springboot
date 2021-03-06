package com.jerry.banquet.mapper;

import com.jerry.banquet.model.TBanquetDishes;

public interface TBanquetDishesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banquet_dishes
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    int deleteByPrimaryKey(String dishesid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banquet_dishes
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    int insert(TBanquetDishes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banquet_dishes
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    int insertSelective(TBanquetDishes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banquet_dishes
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    TBanquetDishes selectByPrimaryKey(String dishesid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banquet_dishes
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    int updateByPrimaryKeySelective(TBanquetDishes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banquet_dishes
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    int updateByPrimaryKey(TBanquetDishes record);
}