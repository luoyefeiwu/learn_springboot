package com.jerry.banquet.model;

public class TOutBanquetType {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_out_banquet_type.typeID
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private String typeid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_out_banquet_type.typeName
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private String typename;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_out_banquet_type.sequence
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private Integer sequence;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_out_banquet_type.parentTypeID
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private String parenttypeid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_out_banquet_type.freezeFlag
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    private Integer freezeflag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_out_banquet_type.typeID
     *
     * @return the value of t_out_banquet_type.typeID
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public String getTypeid() {
        return typeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_out_banquet_type.typeID
     *
     * @param typeid the value for t_out_banquet_type.typeID
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setTypeid(String typeid) {
        this.typeid = typeid == null ? null : typeid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_out_banquet_type.typeName
     *
     * @return the value of t_out_banquet_type.typeName
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public String getTypename() {
        return typename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_out_banquet_type.typeName
     *
     * @param typename the value for t_out_banquet_type.typeName
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_out_banquet_type.sequence
     *
     * @return the value of t_out_banquet_type.sequence
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public Integer getSequence() {
        return sequence;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_out_banquet_type.sequence
     *
     * @param sequence the value for t_out_banquet_type.sequence
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_out_banquet_type.parentTypeID
     *
     * @return the value of t_out_banquet_type.parentTypeID
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public String getParenttypeid() {
        return parenttypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_out_banquet_type.parentTypeID
     *
     * @param parenttypeid the value for t_out_banquet_type.parentTypeID
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setParenttypeid(String parenttypeid) {
        this.parenttypeid = parenttypeid == null ? null : parenttypeid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_out_banquet_type.freezeFlag
     *
     * @return the value of t_out_banquet_type.freezeFlag
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public Integer getFreezeflag() {
        return freezeflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_out_banquet_type.freezeFlag
     *
     * @param freezeflag the value for t_out_banquet_type.freezeFlag
     *
     * @mbg.generated Wed Aug 22 17:51:13 CST 2018
     */
    public void setFreezeflag(Integer freezeflag) {
        this.freezeflag = freezeflag;
    }
}