package com.kunlun.erp.core.entity;

public class SysDistrict {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_district.district_id
     *
     * @mbggenerated Mon Nov 25 12:16:32 CST 2019
     */
    private Integer district_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_district.country_id
     *
     * @mbggenerated Mon Nov 25 12:16:32 CST 2019
     */
    private Integer country_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_district.zh_name
     *
     * @mbggenerated Mon Nov 25 12:16:32 CST 2019
     */
    private String zh_name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_district.state
     *
     * @mbggenerated Mon Nov 25 12:16:32 CST 2019
     */
    private Integer state;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_district
     *
     * @mbggenerated Mon Nov 25 12:16:32 CST 2019
     */
    public SysDistrict(Integer district_id, Integer country_id, String zh_name, Integer state) {
        this.district_id = district_id;
        this.country_id = country_id;
        this.zh_name = zh_name;
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_district
     *
     * @mbggenerated Mon Nov 25 12:16:32 CST 2019
     */
    public SysDistrict() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_district.district_id
     *
     * @return the value of sys_district.district_id
     *
     * @mbggenerated Mon Nov 25 12:16:32 CST 2019
     */
    public Integer getDistrict_id() {
        return district_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_district.district_id
     *
     * @param district_id the value for sys_district.district_id
     *
     * @mbggenerated Mon Nov 25 12:16:32 CST 2019
     */
    public void setDistrict_id(Integer district_id) {
        this.district_id = district_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_district.country_id
     *
     * @return the value of sys_district.country_id
     *
     * @mbggenerated Mon Nov 25 12:16:32 CST 2019
     */
    public Integer getCountry_id() {
        return country_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_district.country_id
     *
     * @param country_id the value for sys_district.country_id
     *
     * @mbggenerated Mon Nov 25 12:16:32 CST 2019
     */
    public void setCountry_id(Integer country_id) {
        this.country_id = country_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_district.zh_name
     *
     * @return the value of sys_district.zh_name
     *
     * @mbggenerated Mon Nov 25 12:16:32 CST 2019
     */
    public String getZh_name() {
        return zh_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_district.zh_name
     *
     * @param zh_name the value for sys_district.zh_name
     *
     * @mbggenerated Mon Nov 25 12:16:32 CST 2019
     */
    public void setZh_name(String zh_name) {
        this.zh_name = zh_name == null ? null : zh_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_district.state
     *
     * @return the value of sys_district.state
     *
     * @mbggenerated Mon Nov 25 12:16:32 CST 2019
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_district.state
     *
     * @param state the value for sys_district.state
     *
     * @mbggenerated Mon Nov 25 12:16:32 CST 2019
     */
    public void setState(Integer state) {
        this.state = state;
    }
}