package com.jerry.banquet.model;

import java.util.Date;

public class TSysSetmeal {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_setmeal.setmealId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private String setmealid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_setmeal.setmealName
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private String setmealname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_setmeal.restaurantlId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private String restaurantlid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_setmeal.restaurantName
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private String restaurantname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_setmeal.sequenceNumber
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private String sequencenumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_setmeal.price
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private Integer price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_setmeal.isValid
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private Integer isvalid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_setmeal.totalCounts
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private Integer totalcounts;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_setmeal.hotCounts
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private Integer hotcounts;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_setmeal.coldCounts
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private Integer coldcounts;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_setmeal.soupCounts
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private Integer soupcounts;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_setmeal.stapleCounts
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private Integer staplecounts;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_setmeal.giftCounts
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private Integer giftcounts;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_setmeal.currentUseCounts
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private Integer currentusecounts;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_setmeal.historyUseCounts
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private Integer historyusecounts;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_setmeal.createTime
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private Date createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_setmeal.createUserId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private String createuserid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_setmeal.createUser
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private String createuser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_setmeal.updateTime
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private Date updatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_setmeal.updateUserId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private String updateuserid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_setmeal.updateUser
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private String updateuser;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_setmeal.setmealId
     *
     * @return the value of t_sys_setmeal.setmealId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public String getSetmealid() {
        return setmealid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_setmeal.setmealId
     *
     * @param setmealid the value for t_sys_setmeal.setmealId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setSetmealid(String setmealid) {
        this.setmealid = setmealid == null ? null : setmealid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_setmeal.setmealName
     *
     * @return the value of t_sys_setmeal.setmealName
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public String getSetmealname() {
        return setmealname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_setmeal.setmealName
     *
     * @param setmealname the value for t_sys_setmeal.setmealName
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setSetmealname(String setmealname) {
        this.setmealname = setmealname == null ? null : setmealname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_setmeal.restaurantlId
     *
     * @return the value of t_sys_setmeal.restaurantlId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public String getRestaurantlid() {
        return restaurantlid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_setmeal.restaurantlId
     *
     * @param restaurantlid the value for t_sys_setmeal.restaurantlId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setRestaurantlid(String restaurantlid) {
        this.restaurantlid = restaurantlid == null ? null : restaurantlid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_setmeal.restaurantName
     *
     * @return the value of t_sys_setmeal.restaurantName
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public String getRestaurantname() {
        return restaurantname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_setmeal.restaurantName
     *
     * @param restaurantname the value for t_sys_setmeal.restaurantName
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setRestaurantname(String restaurantname) {
        this.restaurantname = restaurantname == null ? null : restaurantname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_setmeal.sequenceNumber
     *
     * @return the value of t_sys_setmeal.sequenceNumber
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public String getSequencenumber() {
        return sequencenumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_setmeal.sequenceNumber
     *
     * @param sequencenumber the value for t_sys_setmeal.sequenceNumber
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setSequencenumber(String sequencenumber) {
        this.sequencenumber = sequencenumber == null ? null : sequencenumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_setmeal.price
     *
     * @return the value of t_sys_setmeal.price
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_setmeal.price
     *
     * @param price the value for t_sys_setmeal.price
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_setmeal.isValid
     *
     * @return the value of t_sys_setmeal.isValid
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public Integer getIsvalid() {
        return isvalid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_setmeal.isValid
     *
     * @param isvalid the value for t_sys_setmeal.isValid
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setIsvalid(Integer isvalid) {
        this.isvalid = isvalid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_setmeal.totalCounts
     *
     * @return the value of t_sys_setmeal.totalCounts
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public Integer getTotalcounts() {
        return totalcounts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_setmeal.totalCounts
     *
     * @param totalcounts the value for t_sys_setmeal.totalCounts
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setTotalcounts(Integer totalcounts) {
        this.totalcounts = totalcounts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_setmeal.hotCounts
     *
     * @return the value of t_sys_setmeal.hotCounts
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public Integer getHotcounts() {
        return hotcounts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_setmeal.hotCounts
     *
     * @param hotcounts the value for t_sys_setmeal.hotCounts
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setHotcounts(Integer hotcounts) {
        this.hotcounts = hotcounts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_setmeal.coldCounts
     *
     * @return the value of t_sys_setmeal.coldCounts
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public Integer getColdcounts() {
        return coldcounts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_setmeal.coldCounts
     *
     * @param coldcounts the value for t_sys_setmeal.coldCounts
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setColdcounts(Integer coldcounts) {
        this.coldcounts = coldcounts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_setmeal.soupCounts
     *
     * @return the value of t_sys_setmeal.soupCounts
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public Integer getSoupcounts() {
        return soupcounts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_setmeal.soupCounts
     *
     * @param soupcounts the value for t_sys_setmeal.soupCounts
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setSoupcounts(Integer soupcounts) {
        this.soupcounts = soupcounts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_setmeal.stapleCounts
     *
     * @return the value of t_sys_setmeal.stapleCounts
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public Integer getStaplecounts() {
        return staplecounts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_setmeal.stapleCounts
     *
     * @param staplecounts the value for t_sys_setmeal.stapleCounts
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setStaplecounts(Integer staplecounts) {
        this.staplecounts = staplecounts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_setmeal.giftCounts
     *
     * @return the value of t_sys_setmeal.giftCounts
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public Integer getGiftcounts() {
        return giftcounts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_setmeal.giftCounts
     *
     * @param giftcounts the value for t_sys_setmeal.giftCounts
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setGiftcounts(Integer giftcounts) {
        this.giftcounts = giftcounts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_setmeal.currentUseCounts
     *
     * @return the value of t_sys_setmeal.currentUseCounts
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public Integer getCurrentusecounts() {
        return currentusecounts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_setmeal.currentUseCounts
     *
     * @param currentusecounts the value for t_sys_setmeal.currentUseCounts
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setCurrentusecounts(Integer currentusecounts) {
        this.currentusecounts = currentusecounts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_setmeal.historyUseCounts
     *
     * @return the value of t_sys_setmeal.historyUseCounts
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public Integer getHistoryusecounts() {
        return historyusecounts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_setmeal.historyUseCounts
     *
     * @param historyusecounts the value for t_sys_setmeal.historyUseCounts
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setHistoryusecounts(Integer historyusecounts) {
        this.historyusecounts = historyusecounts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_setmeal.createTime
     *
     * @return the value of t_sys_setmeal.createTime
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_setmeal.createTime
     *
     * @param createtime the value for t_sys_setmeal.createTime
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_setmeal.createUserId
     *
     * @return the value of t_sys_setmeal.createUserId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public String getCreateuserid() {
        return createuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_setmeal.createUserId
     *
     * @param createuserid the value for t_sys_setmeal.createUserId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setCreateuserid(String createuserid) {
        this.createuserid = createuserid == null ? null : createuserid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_setmeal.createUser
     *
     * @return the value of t_sys_setmeal.createUser
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public String getCreateuser() {
        return createuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_setmeal.createUser
     *
     * @param createuser the value for t_sys_setmeal.createUser
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setCreateuser(String createuser) {
        this.createuser = createuser == null ? null : createuser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_setmeal.updateTime
     *
     * @return the value of t_sys_setmeal.updateTime
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_setmeal.updateTime
     *
     * @param updatetime the value for t_sys_setmeal.updateTime
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_setmeal.updateUserId
     *
     * @return the value of t_sys_setmeal.updateUserId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public String getUpdateuserid() {
        return updateuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_setmeal.updateUserId
     *
     * @param updateuserid the value for t_sys_setmeal.updateUserId
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setUpdateuserid(String updateuserid) {
        this.updateuserid = updateuserid == null ? null : updateuserid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_setmeal.updateUser
     *
     * @return the value of t_sys_setmeal.updateUser
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public String getUpdateuser() {
        return updateuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_setmeal.updateUser
     *
     * @param updateuser the value for t_sys_setmeal.updateUser
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setUpdateuser(String updateuser) {
        this.updateuser = updateuser == null ? null : updateuser.trim();
    }
}