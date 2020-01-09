package com.kunlun.erp.core.entity;

import java.math.BigDecimal;
import java.util.Date;

public class RouteMeal {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route_meal.id
     *
     * @mbggenerated Sun Dec 22 18:01:16 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route_meal.meal_code
     *
     * @mbggenerated Sun Dec 22 18:01:16 CST 2019
     */
    private String meal_code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route_meal.groupr_code
     *
     * @mbggenerated Sun Dec 22 18:01:16 CST 2019
     */
    private String group_code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route_meal.company_code
     *
     * @mbggenerated Sun Dec 22 18:01:16 CST 2019
     */
    private String company_code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route_meal.person_code
     *
     * @mbggenerated Sun Dec 22 18:01:16 CST 2019
     */
    private String person_code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route_meal.meal_type
     *
     * @mbggenerated Sun Dec 22 18:01:16 CST 2019
     */
    private Integer meal_type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route_meal.mealt_date
     *
     * @mbggenerated Sun Dec 22 18:01:16 CST 2019
     */
    private Date meal_date;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route_meal.currency
     *
     * @mbggenerated Sun Dec 22 18:01:16 CST 2019
     */
    private String currency;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route_meal.fee
     *
     * @mbggenerated Sun Dec 22 18:01:16 CST 2019
     */
    private BigDecimal fee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route_meal.diners_count
     *
     * @mbggenerated Sun Dec 22 18:01:16 CST 2019
     */
    private Integer diners_count;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route_meal.free_count
     *
     * @mbggenerated Sun Dec 22 18:01:16 CST 2019
     */
    private Integer free_count;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route_meal.fee_total
     *
     * @mbggenerated Sun Dec 22 18:01:16 CST 2019
     */
    private BigDecimal fee_total;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route_meal.remarks
     *
     * @mbggenerated Sun Dec 22 18:01:16 CST 2019
     */
    private String remarks;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route_meal.create_time
     *
     * @mbggenerated Sun Dec 22 18:01:16 CST 2019
     */
    private Date create_time;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route_meal.update_time
     *
     * @mbggenerated Sun Dec 22 18:01:16 CST 2019
     */
    private Date update_time;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route_meal.creator_id
     *
     * @mbggenerated Sun Dec 22 18:01:16 CST 2019
     */
    private Integer creator_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route_meal.creator_name
     *
     * @mbggenerated Sun Dec 22 18:01:16 CST 2019
     */
    private String creator_name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route_meal.id
     *
     * @return the value of route_meal.id
     *
     * @mbggenerated Sun Dec 22 18:01:16 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route_meal.id
     *
     * @param id the value for route_meal.id
     *
     * @mbggenerated Sun Dec 22 18:01:16 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route_meal.meal_code
     *
     * @return the value of route_meal.meal_code
     *
     * @mbggenerated Sun Dec 22 18:01:16 CST 2019
     */
    public String getMeal_code() {
        return meal_code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route_meal.meal_code
     *
     * @param meal_code the value for route_meal.meal_code
     *
     * @mbggenerated Sun Dec 22 18:01:16 CST 2019
     */
    public void setMeal_code(String meal_code) {
        this.meal_code = meal_code == null ? null : meal_code.trim();
    }



    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route_meal.company_code
     *
     * @return the value of route_meal.company_code
     *
     * @mbggenerated Sun Dec 22 18:01:16 CST 2019
     */
    public String getCompany_code() {
        return company_code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route_meal.company_code
     *
     * @param company_code the value for route_meal.company_code
     *
     * @mbggenerated Sun Dec 22 18:01:16 CST 2019
     */
    public void setCompany_code(String company_code) {
        this.company_code = company_code == null ? null : company_code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route_meal.person_code
     *
     * @return the value of route_meal.person_code
     *
     * @mbggenerated Sun Dec 22 18:01:16 CST 2019
     */
    public String getPerson_code() {
        return person_code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route_meal.person_code
     *
     * @param person_code the value for route_meal.person_code
     *
     * @mbggenerated Sun Dec 22 18:01:16 CST 2019
     */
    public void setPerson_code(String person_code) {
        this.person_code = person_code == null ? null : person_code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route_meal.meal_type
     *
     * @return the value of route_meal.meal_type
     *
     * @mbggenerated Sun Dec 22 18:01:16 CST 2019
     */
    public Integer getMeal_type() {
        return meal_type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route_meal.meal_type
     *
     * @param meal_type the value for route_meal.meal_type
     *
     * @mbggenerated Sun Dec 22 18:01:16 CST 2019
     */
    public void setMeal_type(Integer meal_type) {
        this.meal_type = meal_type;
    }

    public String getGroup_code() {
        return group_code;
    }

    public void setGroup_code(String group_code) {
        this.group_code = group_code;
    }

    public Date getMeal_date() {
        return meal_date;
    }

    public void setMeal_date(Date meal_date) {
        this.meal_date = meal_date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route_meal.currency
     *
     * @return the value of route_meal.currency
     *
     * @mbggenerated Sun Dec 22 18:01:16 CST 2019
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route_meal.currency
     *
     * @param currency the value for route_meal.currency
     *
     * @mbggenerated Sun Dec 22 18:01:16 CST 2019
     */
    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route_meal.fee
     *
     * @return the value of route_meal.fee
     *
     * @mbggenerated Sun Dec 22 18:01:16 CST 2019
     */
    public BigDecimal getFee() {
        return fee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route_meal.fee
     *
     * @param fee the value for route_meal.fee
     *
     * @mbggenerated Sun Dec 22 18:01:16 CST 2019
     */
    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route_meal.diners_count
     *
     * @return the value of route_meal.diners_count
     *
     * @mbggenerated Sun Dec 22 18:01:16 CST 2019
     */
    public Integer getDiners_count() {
        return diners_count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route_meal.diners_count
     *
     * @param diners_count the value for route_meal.diners_count
     *
     * @mbggenerated Sun Dec 22 18:01:16 CST 2019
     */
    public void setDiners_count(Integer diners_count) {
        this.diners_count = diners_count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route_meal.free_count
     *
     * @return the value of route_meal.free_count
     *
     * @mbggenerated Sun Dec 22 18:01:16 CST 2019
     */
    public Integer getFree_count() {
        return free_count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route_meal.free_count
     *
     * @param free_count the value for route_meal.free_count
     *
     * @mbggenerated Sun Dec 22 18:01:16 CST 2019
     */
    public void setFree_count(Integer free_count) {
        this.free_count = free_count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route_meal.fee_total
     *
     * @return the value of route_meal.fee_total
     *
     * @mbggenerated Sun Dec 22 18:01:16 CST 2019
     */
    public BigDecimal getFee_total() {
        return fee_total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route_meal.fee_total
     *
     * @param fee_total the value for route_meal.fee_total
     *
     * @mbggenerated Sun Dec 22 18:01:16 CST 2019
     */
    public void setFee_total(BigDecimal fee_total) {
        this.fee_total = fee_total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route_meal.remarks
     *
     * @return the value of route_meal.remarks
     *
     * @mbggenerated Sun Dec 22 18:01:16 CST 2019
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route_meal.remarks
     *
     * @param remarks the value for route_meal.remarks
     *
     * @mbggenerated Sun Dec 22 18:01:16 CST 2019
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route_meal.create_time
     *
     * @return the value of route_meal.create_time
     *
     * @mbggenerated Sun Dec 22 18:01:16 CST 2019
     */
    public Date getCreate_time() {
        return create_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route_meal.create_time
     *
     * @param create_time the value for route_meal.create_time
     *
     * @mbggenerated Sun Dec 22 18:01:16 CST 2019
     */
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route_meal.update_time
     *
     * @return the value of route_meal.update_time
     *
     * @mbggenerated Sun Dec 22 18:01:16 CST 2019
     */
    public Date getUpdate_time() {
        return update_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route_meal.update_time
     *
     * @param update_time the value for route_meal.update_time
     *
     * @mbggenerated Sun Dec 22 18:01:16 CST 2019
     */
    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route_meal.creator_id
     *
     * @return the value of route_meal.creator_id
     *
     * @mbggenerated Sun Dec 22 18:01:16 CST 2019
     */
    public Integer getCreator_id() {
        return creator_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route_meal.creator_id
     *
     * @param creator_id the value for route_meal.creator_id
     *
     * @mbggenerated Sun Dec 22 18:01:16 CST 2019
     */
    public void setCreator_id(Integer creator_id) {
        this.creator_id = creator_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route_meal.creator_name
     *
     * @return the value of route_meal.creator_name
     *
     * @mbggenerated Sun Dec 22 18:01:16 CST 2019
     */
    public String getCreator_name() {
        return creator_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route_meal.creator_name
     *
     * @param creator_name the value for route_meal.creator_name
     *
     * @mbggenerated Sun Dec 22 18:01:16 CST 2019
     */
    public void setCreator_name(String creator_name) {
        this.creator_name = creator_name == null ? null : creator_name.trim();
    }
}