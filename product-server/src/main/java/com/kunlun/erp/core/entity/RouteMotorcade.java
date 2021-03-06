package com.kunlun.erp.core.entity;

import java.math.BigDecimal;
import java.util.Date;

public class RouteMotorcade {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route_motorcade.id
     *
     * @mbggenerated Sun Dec 22 21:24:59 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route_motorcade.motorcade_code
     *
     * @mbggenerated Sun Dec 22 21:24:59 CST 2019
     */
    private String motorcade_code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route_motorcade.order_code
     *
     * @mbggenerated Sun Dec 22 21:24:59 CST 2019
     */
    private String group_code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route_motorcade.company_code
     *
     * @mbggenerated Sun Dec 22 21:24:59 CST 2019
     */
    private String company_code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route_motorcade.person_code
     *
     * @mbggenerated Sun Dec 22 21:24:59 CST 2019
     */
    private String person_code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route_motorcade.start_date
     *
     * @mbggenerated Sun Dec 22 21:24:59 CST 2019
     */
    private Date start_date;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route_motorcade.end_date
     *
     * @mbggenerated Sun Dec 22 21:24:59 CST 2019
     */
    private Date end_date;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route_motorcade.currency
     *
     * @mbggenerated Sun Dec 22 21:24:59 CST 2019
     */
    private String currency;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route_motorcade.fee
     *
     * @mbggenerated Sun Dec 22 21:24:59 CST 2019
     */
    private BigDecimal fee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route_motorcade.car_count
     *
     * @mbggenerated Sun Dec 22 21:24:59 CST 2019
     */
    private Integer car_count;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route_motorcade.fee_total
     *
     * @mbggenerated Sun Dec 22 21:24:59 CST 2019
     */
    private BigDecimal fee_total;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route_motorcade.remarks
     *
     * @mbggenerated Sun Dec 22 21:24:59 CST 2019
     */
    private String remarks;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route_motorcade.create_time
     *
     * @mbggenerated Sun Dec 22 21:24:59 CST 2019
     */
    private Date create_time;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route_motorcade.update_time
     *
     * @mbggenerated Sun Dec 22 21:24:59 CST 2019
     */
    private Date update_time;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route_motorcade.creator_id
     *
     * @mbggenerated Sun Dec 22 21:24:59 CST 2019
     */
    private Integer creator_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route_motorcade.creator_name
     *
     * @mbggenerated Sun Dec 22 21:24:59 CST 2019
     */
    private String creator_name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route_motorcade.id
     *
     * @return the value of route_motorcade.id
     *
     * @mbggenerated Sun Dec 22 21:24:59 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route_motorcade.id
     *
     * @param id the value for route_motorcade.id
     *
     * @mbggenerated Sun Dec 22 21:24:59 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route_motorcade.motorcade_code
     *
     * @return the value of route_motorcade.motorcade_code
     *
     * @mbggenerated Sun Dec 22 21:24:59 CST 2019
     */
    public String getMotorcade_code() {
        return motorcade_code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route_motorcade.motorcade_code
     *
     * @param motorcade_code the value for route_motorcade.motorcade_code
     *
     * @mbggenerated Sun Dec 22 21:24:59 CST 2019
     */
    public void setMotorcade_code(String motorcade_code) {
        this.motorcade_code = motorcade_code == null ? null : motorcade_code.trim();
    }

    public String getGroup_code() {
        return group_code;
    }

    public void setGroup_code(String group_code) {
        this.group_code = group_code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route_motorcade.company_code
     *
     * @return the value of route_motorcade.company_code
     *
     * @mbggenerated Sun Dec 22 21:24:59 CST 2019
     */
    public String getCompany_code() {
        return company_code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route_motorcade.company_code
     *
     * @param company_code the value for route_motorcade.company_code
     *
     * @mbggenerated Sun Dec 22 21:24:59 CST 2019
     */
    public void setCompany_code(String company_code) {
        this.company_code = company_code == null ? null : company_code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route_motorcade.person_code
     *
     * @return the value of route_motorcade.person_code
     *
     * @mbggenerated Sun Dec 22 21:24:59 CST 2019
     */
    public String getPerson_code() {
        return person_code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route_motorcade.person_code
     *
     * @param person_code the value for route_motorcade.person_code
     *
     * @mbggenerated Sun Dec 22 21:24:59 CST 2019
     */
    public void setPerson_code(String person_code) {
        this.person_code = person_code == null ? null : person_code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route_motorcade.start_date
     *
     * @return the value of route_motorcade.start_date
     *
     * @mbggenerated Sun Dec 22 21:24:59 CST 2019
     */
    public Date getStart_date() {
        return start_date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route_motorcade.start_date
     *
     * @param start_date the value for route_motorcade.start_date
     *
     * @mbggenerated Sun Dec 22 21:24:59 CST 2019
     */
    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route_motorcade.end_date
     *
     * @return the value of route_motorcade.end_date
     *
     * @mbggenerated Sun Dec 22 21:24:59 CST 2019
     */
    public Date getEnd_date() {
        return end_date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route_motorcade.end_date
     *
     * @param end_date the value for route_motorcade.end_date
     *
     * @mbggenerated Sun Dec 22 21:24:59 CST 2019
     */
    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route_motorcade.currency
     *
     * @return the value of route_motorcade.currency
     *
     * @mbggenerated Sun Dec 22 21:24:59 CST 2019
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route_motorcade.currency
     *
     * @param currency the value for route_motorcade.currency
     *
     * @mbggenerated Sun Dec 22 21:24:59 CST 2019
     */
    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route_motorcade.fee
     *
     * @return the value of route_motorcade.fee
     *
     * @mbggenerated Sun Dec 22 21:24:59 CST 2019
     */
    public BigDecimal getFee() {
        return fee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route_motorcade.fee
     *
     * @param fee the value for route_motorcade.fee
     *
     * @mbggenerated Sun Dec 22 21:24:59 CST 2019
     */
    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route_motorcade.car_count
     *
     * @return the value of route_motorcade.car_count
     *
     * @mbggenerated Sun Dec 22 21:24:59 CST 2019
     */
    public Integer getCar_count() {
        return car_count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route_motorcade.car_count
     *
     * @param car_count the value for route_motorcade.car_count
     *
     * @mbggenerated Sun Dec 22 21:24:59 CST 2019
     */
    public void setCar_count(Integer car_count) {
        this.car_count = car_count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route_motorcade.fee_total
     *
     * @return the value of route_motorcade.fee_total
     *
     * @mbggenerated Sun Dec 22 21:24:59 CST 2019
     */
    public BigDecimal getFee_total() {
        return fee_total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route_motorcade.fee_total
     *
     * @param fee_total the value for route_motorcade.fee_total
     *
     * @mbggenerated Sun Dec 22 21:24:59 CST 2019
     */
    public void setFee_total(BigDecimal fee_total) {
        this.fee_total = fee_total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route_motorcade.remarks
     *
     * @return the value of route_motorcade.remarks
     *
     * @mbggenerated Sun Dec 22 21:24:59 CST 2019
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route_motorcade.remarks
     *
     * @param remarks the value for route_motorcade.remarks
     *
     * @mbggenerated Sun Dec 22 21:24:59 CST 2019
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route_motorcade.create_time
     *
     * @return the value of route_motorcade.create_time
     *
     * @mbggenerated Sun Dec 22 21:24:59 CST 2019
     */
    public Date getCreate_time() {
        return create_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route_motorcade.create_time
     *
     * @param create_time the value for route_motorcade.create_time
     *
     * @mbggenerated Sun Dec 22 21:24:59 CST 2019
     */
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route_motorcade.update_time
     *
     * @return the value of route_motorcade.update_time
     *
     * @mbggenerated Sun Dec 22 21:24:59 CST 2019
     */
    public Date getUpdate_time() {
        return update_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route_motorcade.update_time
     *
     * @param update_time the value for route_motorcade.update_time
     *
     * @mbggenerated Sun Dec 22 21:24:59 CST 2019
     */
    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route_motorcade.creator_id
     *
     * @return the value of route_motorcade.creator_id
     *
     * @mbggenerated Sun Dec 22 21:24:59 CST 2019
     */
    public Integer getCreator_id() {
        return creator_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route_motorcade.creator_id
     *
     * @param creator_id the value for route_motorcade.creator_id
     *
     * @mbggenerated Sun Dec 22 21:24:59 CST 2019
     */
    public void setCreator_id(Integer creator_id) {
        this.creator_id = creator_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route_motorcade.creator_name
     *
     * @return the value of route_motorcade.creator_name
     *
     * @mbggenerated Sun Dec 22 21:24:59 CST 2019
     */
    public String getCreator_name() {
        return creator_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route_motorcade.creator_name
     *
     * @param creator_name the value for route_motorcade.creator_name
     *
     * @mbggenerated Sun Dec 22 21:24:59 CST 2019
     */
    public void setCreator_name(String creator_name) {
        this.creator_name = creator_name == null ? null : creator_name.trim();
    }
}