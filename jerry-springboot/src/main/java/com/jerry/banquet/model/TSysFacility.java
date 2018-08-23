package com.jerry.banquet.model;

import java.math.BigDecimal;
import java.util.Date;

public class TSysFacility {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_facility.facilityId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private String facilityid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_facility.facilityName
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private String facilityname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_facility.restaurantId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private String restaurantid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_facility.restaurantName
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private String restaurantname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_facility.unit
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private String unit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_facility.price
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private BigDecimal price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_facility.stock
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private Integer stock;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_facility.departmentId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private String departmentid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_facility.departmentName
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private String departmentname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_facility.sequenceNumber
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private String sequencenumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_facility.negotiable
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private Integer negotiable;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_facility.isValid
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private Integer isvalid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_facility.createTime
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private Date createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_facility.createUserId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private String createuserid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_facility.createUser
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private String createuser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_facility.updateTime
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private Date updatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_facility.updateUserId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private String updateuserid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_facility.updateUser
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private String updateuser;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_facility.facilityId
     *
     * @return the value of t_sys_facility.facilityId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public String getFacilityid() {
        return facilityid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_facility.facilityId
     *
     * @param facilityid the value for t_sys_facility.facilityId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setFacilityid(String facilityid) {
        this.facilityid = facilityid == null ? null : facilityid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_facility.facilityName
     *
     * @return the value of t_sys_facility.facilityName
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public String getFacilityname() {
        return facilityname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_facility.facilityName
     *
     * @param facilityname the value for t_sys_facility.facilityName
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setFacilityname(String facilityname) {
        this.facilityname = facilityname == null ? null : facilityname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_facility.restaurantId
     *
     * @return the value of t_sys_facility.restaurantId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public String getRestaurantid() {
        return restaurantid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_facility.restaurantId
     *
     * @param restaurantid the value for t_sys_facility.restaurantId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setRestaurantid(String restaurantid) {
        this.restaurantid = restaurantid == null ? null : restaurantid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_facility.restaurantName
     *
     * @return the value of t_sys_facility.restaurantName
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public String getRestaurantname() {
        return restaurantname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_facility.restaurantName
     *
     * @param restaurantname the value for t_sys_facility.restaurantName
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setRestaurantname(String restaurantname) {
        this.restaurantname = restaurantname == null ? null : restaurantname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_facility.unit
     *
     * @return the value of t_sys_facility.unit
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public String getUnit() {
        return unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_facility.unit
     *
     * @param unit the value for t_sys_facility.unit
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_facility.price
     *
     * @return the value of t_sys_facility.price
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_facility.price
     *
     * @param price the value for t_sys_facility.price
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_facility.stock
     *
     * @return the value of t_sys_facility.stock
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_facility.stock
     *
     * @param stock the value for t_sys_facility.stock
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_facility.departmentId
     *
     * @return the value of t_sys_facility.departmentId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public String getDepartmentid() {
        return departmentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_facility.departmentId
     *
     * @param departmentid the value for t_sys_facility.departmentId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid == null ? null : departmentid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_facility.departmentName
     *
     * @return the value of t_sys_facility.departmentName
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public String getDepartmentname() {
        return departmentname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_facility.departmentName
     *
     * @param departmentname the value for t_sys_facility.departmentName
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname == null ? null : departmentname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_facility.sequenceNumber
     *
     * @return the value of t_sys_facility.sequenceNumber
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public String getSequencenumber() {
        return sequencenumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_facility.sequenceNumber
     *
     * @param sequencenumber the value for t_sys_facility.sequenceNumber
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setSequencenumber(String sequencenumber) {
        this.sequencenumber = sequencenumber == null ? null : sequencenumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_facility.negotiable
     *
     * @return the value of t_sys_facility.negotiable
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public Integer getNegotiable() {
        return negotiable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_facility.negotiable
     *
     * @param negotiable the value for t_sys_facility.negotiable
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setNegotiable(Integer negotiable) {
        this.negotiable = negotiable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_facility.isValid
     *
     * @return the value of t_sys_facility.isValid
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public Integer getIsvalid() {
        return isvalid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_facility.isValid
     *
     * @param isvalid the value for t_sys_facility.isValid
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setIsvalid(Integer isvalid) {
        this.isvalid = isvalid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_facility.createTime
     *
     * @return the value of t_sys_facility.createTime
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_facility.createTime
     *
     * @param createtime the value for t_sys_facility.createTime
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_facility.createUserId
     *
     * @return the value of t_sys_facility.createUserId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public String getCreateuserid() {
        return createuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_facility.createUserId
     *
     * @param createuserid the value for t_sys_facility.createUserId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setCreateuserid(String createuserid) {
        this.createuserid = createuserid == null ? null : createuserid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_facility.createUser
     *
     * @return the value of t_sys_facility.createUser
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public String getCreateuser() {
        return createuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_facility.createUser
     *
     * @param createuser the value for t_sys_facility.createUser
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setCreateuser(String createuser) {
        this.createuser = createuser == null ? null : createuser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_facility.updateTime
     *
     * @return the value of t_sys_facility.updateTime
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_facility.updateTime
     *
     * @param updatetime the value for t_sys_facility.updateTime
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_facility.updateUserId
     *
     * @return the value of t_sys_facility.updateUserId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public String getUpdateuserid() {
        return updateuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_facility.updateUserId
     *
     * @param updateuserid the value for t_sys_facility.updateUserId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setUpdateuserid(String updateuserid) {
        this.updateuserid = updateuserid == null ? null : updateuserid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_facility.updateUser
     *
     * @return the value of t_sys_facility.updateUser
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public String getUpdateuser() {
        return updateuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_facility.updateUser
     *
     * @param updateuser the value for t_sys_facility.updateUser
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setUpdateuser(String updateuser) {
        this.updateuser = updateuser == null ? null : updateuser.trim();
    }
}