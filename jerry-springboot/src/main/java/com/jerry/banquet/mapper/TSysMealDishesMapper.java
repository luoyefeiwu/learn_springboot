package com.jerry.banquet.mapper;

import com.jerry.banquet.model.TSysMealDishes;

public interface TSysMealDishesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_meal_dishes
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    int deleteByPrimaryKey(String mealdishesid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_meal_dishes
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    int insert(TSysMealDishes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_meal_dishes
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    int insertSelective(TSysMealDishes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_meal_dishes
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    TSysMealDishes selectByPrimaryKey(String mealdishesid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_meal_dishes
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    int updateByPrimaryKeySelective(TSysMealDishes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_meal_dishes
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    int updateByPrimaryKey(TSysMealDishes record);
}