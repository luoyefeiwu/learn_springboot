package com.jerry.banquet.model;

import java.util.Date;

public class TSysMealDishes {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_meal_dishes.mealDishesId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private String mealdishesid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_meal_dishes.setmealId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private String setmealid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_meal_dishes.dishesId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private String dishesid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_meal_dishes.type
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_meal_dishes.unit
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private String unit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_meal_dishes.number
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private Integer number;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_meal_dishes.isAdjust
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private Integer isadjust;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_meal_dishes.createTime
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private Date createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_meal_dishes.createUserId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private String createuserid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_meal_dishes.createUser
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private String createuser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_meal_dishes.updateTime
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private Date updatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_meal_dishes.updateUserId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private String updateuserid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_meal_dishes.updateUser
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private String updateuser;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_meal_dishes.mealDishesId
     *
     * @return the value of t_sys_meal_dishes.mealDishesId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public String getMealdishesid() {
        return mealdishesid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_meal_dishes.mealDishesId
     *
     * @param mealdishesid the value for t_sys_meal_dishes.mealDishesId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setMealdishesid(String mealdishesid) {
        this.mealdishesid = mealdishesid == null ? null : mealdishesid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_meal_dishes.setmealId
     *
     * @return the value of t_sys_meal_dishes.setmealId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public String getSetmealid() {
        return setmealid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_meal_dishes.setmealId
     *
     * @param setmealid the value for t_sys_meal_dishes.setmealId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setSetmealid(String setmealid) {
        this.setmealid = setmealid == null ? null : setmealid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_meal_dishes.dishesId
     *
     * @return the value of t_sys_meal_dishes.dishesId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public String getDishesid() {
        return dishesid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_meal_dishes.dishesId
     *
     * @param dishesid the value for t_sys_meal_dishes.dishesId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setDishesid(String dishesid) {
        this.dishesid = dishesid == null ? null : dishesid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_meal_dishes.type
     *
     * @return the value of t_sys_meal_dishes.type
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_meal_dishes.type
     *
     * @param type the value for t_sys_meal_dishes.type
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_meal_dishes.unit
     *
     * @return the value of t_sys_meal_dishes.unit
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public String getUnit() {
        return unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_meal_dishes.unit
     *
     * @param unit the value for t_sys_meal_dishes.unit
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_meal_dishes.number
     *
     * @return the value of t_sys_meal_dishes.number
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_meal_dishes.number
     *
     * @param number the value for t_sys_meal_dishes.number
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_meal_dishes.isAdjust
     *
     * @return the value of t_sys_meal_dishes.isAdjust
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public Integer getIsadjust() {
        return isadjust;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_meal_dishes.isAdjust
     *
     * @param isadjust the value for t_sys_meal_dishes.isAdjust
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setIsadjust(Integer isadjust) {
        this.isadjust = isadjust;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_meal_dishes.createTime
     *
     * @return the value of t_sys_meal_dishes.createTime
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_meal_dishes.createTime
     *
     * @param createtime the value for t_sys_meal_dishes.createTime
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_meal_dishes.createUserId
     *
     * @return the value of t_sys_meal_dishes.createUserId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public String getCreateuserid() {
        return createuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_meal_dishes.createUserId
     *
     * @param createuserid the value for t_sys_meal_dishes.createUserId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setCreateuserid(String createuserid) {
        this.createuserid = createuserid == null ? null : createuserid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_meal_dishes.createUser
     *
     * @return the value of t_sys_meal_dishes.createUser
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public String getCreateuser() {
        return createuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_meal_dishes.createUser
     *
     * @param createuser the value for t_sys_meal_dishes.createUser
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setCreateuser(String createuser) {
        this.createuser = createuser == null ? null : createuser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_meal_dishes.updateTime
     *
     * @return the value of t_sys_meal_dishes.updateTime
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_meal_dishes.updateTime
     *
     * @param updatetime the value for t_sys_meal_dishes.updateTime
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_meal_dishes.updateUserId
     *
     * @return the value of t_sys_meal_dishes.updateUserId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public String getUpdateuserid() {
        return updateuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_meal_dishes.updateUserId
     *
     * @param updateuserid the value for t_sys_meal_dishes.updateUserId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setUpdateuserid(String updateuserid) {
        this.updateuserid = updateuserid == null ? null : updateuserid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_meal_dishes.updateUser
     *
     * @return the value of t_sys_meal_dishes.updateUser
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public String getUpdateuser() {
        return updateuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_meal_dishes.updateUser
     *
     * @param updateuser the value for t_sys_meal_dishes.updateUser
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setUpdateuser(String updateuser) {
        this.updateuser = updateuser == null ? null : updateuser.trim();
    }
}