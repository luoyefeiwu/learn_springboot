package com.jerry.banquet.mapper;

import com.jerry.banquet.model.TBanquetService;

public interface TBanquetServiceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banquet_service
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    int deleteByPrimaryKey(String serviceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banquet_service
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    int insert(TBanquetService record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banquet_service
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    int insertSelective(TBanquetService record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banquet_service
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    TBanquetService selectByPrimaryKey(String serviceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banquet_service
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    int updateByPrimaryKeySelective(TBanquetService record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banquet_service
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    int updateByPrimaryKey(TBanquetService record);
}