package com.jerry.banquet.mapper;

import com.jerry.banquet.model.TBanquetPhase;

public interface TBanquetPhaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banquet_phase
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    int deleteByPrimaryKey(String phaseid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banquet_phase
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    int insert(TBanquetPhase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banquet_phase
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    int insertSelective(TBanquetPhase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banquet_phase
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    TBanquetPhase selectByPrimaryKey(String phaseid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banquet_phase
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    int updateByPrimaryKeySelective(TBanquetPhase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_banquet_phase
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    int updateByPrimaryKey(TBanquetPhase record);
}