package com.jerry.banquet.mapper;

import com.jerry.banquet.model.TSysDepartment;

public interface TSysDepartmentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_department
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    int deleteByPrimaryKey(String departid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_department
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    int insert(TSysDepartment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_department
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    int insertSelective(TSysDepartment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_department
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    TSysDepartment selectByPrimaryKey(String departid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_department
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    int updateByPrimaryKeySelective(TSysDepartment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_department
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    int updateByPrimaryKey(TSysDepartment record);
}