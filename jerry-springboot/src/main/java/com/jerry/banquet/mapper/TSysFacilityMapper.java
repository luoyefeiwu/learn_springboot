package com.jerry.banquet.mapper;

import com.jerry.banquet.model.TSysFacility;

public interface TSysFacilityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_facility
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    int deleteByPrimaryKey(String facilityid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_facility
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    int insert(TSysFacility record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_facility
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    int insertSelective(TSysFacility record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_facility
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    TSysFacility selectByPrimaryKey(String facilityid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_facility
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    int updateByPrimaryKeySelective(TSysFacility record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_facility
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    int updateByPrimaryKey(TSysFacility record);
}