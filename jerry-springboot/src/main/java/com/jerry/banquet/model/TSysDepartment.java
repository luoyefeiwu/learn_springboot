package com.jerry.banquet.model;

import java.util.Date;

public class TSysDepartment {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_department.departId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private String departid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_department.departName
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private String departname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_department.restaurantId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private String restaurantid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_department.restaurantName
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private String restaurantname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_department.sequenceNumber
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private String sequencenumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_department.duty
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private String duty;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_department.staffCount
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private Integer staffcount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_department.isValid
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private Integer isvalid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_department.createTime
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private Date createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_department.createUserId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private String createuserid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_department.createUser
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private String createuser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_department.updateTime
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private Date updatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_department.updateUserId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private String updateuserid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_department.updateUser
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private String updateuser;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_department.departId
     *
     * @return the value of t_sys_department.departId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public String getDepartid() {
        return departid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_department.departId
     *
     * @param departid the value for t_sys_department.departId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setDepartid(String departid) {
        this.departid = departid == null ? null : departid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_department.departName
     *
     * @return the value of t_sys_department.departName
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public String getDepartname() {
        return departname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_department.departName
     *
     * @param departname the value for t_sys_department.departName
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setDepartname(String departname) {
        this.departname = departname == null ? null : departname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_department.restaurantId
     *
     * @return the value of t_sys_department.restaurantId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public String getRestaurantid() {
        return restaurantid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_department.restaurantId
     *
     * @param restaurantid the value for t_sys_department.restaurantId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setRestaurantid(String restaurantid) {
        this.restaurantid = restaurantid == null ? null : restaurantid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_department.restaurantName
     *
     * @return the value of t_sys_department.restaurantName
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public String getRestaurantname() {
        return restaurantname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_department.restaurantName
     *
     * @param restaurantname the value for t_sys_department.restaurantName
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setRestaurantname(String restaurantname) {
        this.restaurantname = restaurantname == null ? null : restaurantname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_department.sequenceNumber
     *
     * @return the value of t_sys_department.sequenceNumber
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public String getSequencenumber() {
        return sequencenumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_department.sequenceNumber
     *
     * @param sequencenumber the value for t_sys_department.sequenceNumber
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setSequencenumber(String sequencenumber) {
        this.sequencenumber = sequencenumber == null ? null : sequencenumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_department.duty
     *
     * @return the value of t_sys_department.duty
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public String getDuty() {
        return duty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_department.duty
     *
     * @param duty the value for t_sys_department.duty
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setDuty(String duty) {
        this.duty = duty == null ? null : duty.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_department.staffCount
     *
     * @return the value of t_sys_department.staffCount
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public Integer getStaffcount() {
        return staffcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_department.staffCount
     *
     * @param staffcount the value for t_sys_department.staffCount
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setStaffcount(Integer staffcount) {
        this.staffcount = staffcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_department.isValid
     *
     * @return the value of t_sys_department.isValid
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public Integer getIsvalid() {
        return isvalid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_department.isValid
     *
     * @param isvalid the value for t_sys_department.isValid
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setIsvalid(Integer isvalid) {
        this.isvalid = isvalid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_department.createTime
     *
     * @return the value of t_sys_department.createTime
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_department.createTime
     *
     * @param createtime the value for t_sys_department.createTime
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_department.createUserId
     *
     * @return the value of t_sys_department.createUserId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public String getCreateuserid() {
        return createuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_department.createUserId
     *
     * @param createuserid the value for t_sys_department.createUserId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setCreateuserid(String createuserid) {
        this.createuserid = createuserid == null ? null : createuserid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_department.createUser
     *
     * @return the value of t_sys_department.createUser
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public String getCreateuser() {
        return createuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_department.createUser
     *
     * @param createuser the value for t_sys_department.createUser
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setCreateuser(String createuser) {
        this.createuser = createuser == null ? null : createuser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_department.updateTime
     *
     * @return the value of t_sys_department.updateTime
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_department.updateTime
     *
     * @param updatetime the value for t_sys_department.updateTime
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_department.updateUserId
     *
     * @return the value of t_sys_department.updateUserId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public String getUpdateuserid() {
        return updateuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_department.updateUserId
     *
     * @param updateuserid the value for t_sys_department.updateUserId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setUpdateuserid(String updateuserid) {
        this.updateuserid = updateuserid == null ? null : updateuserid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_department.updateUser
     *
     * @return the value of t_sys_department.updateUser
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public String getUpdateuser() {
        return updateuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_department.updateUser
     *
     * @param updateuser the value for t_sys_department.updateUser
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setUpdateuser(String updateuser) {
        this.updateuser = updateuser == null ? null : updateuser.trim();
    }
}