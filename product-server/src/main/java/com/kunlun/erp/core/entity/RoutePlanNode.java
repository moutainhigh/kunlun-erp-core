package com.kunlun.erp.core.entity;

import java.util.Date;

public class RoutePlanNode {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route_plan_node.id
     *
     * @mbggenerated Sat Dec 07 13:58:45 CST 2019
     */
    private Integer id;

    private String node_code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route_plan_node.route_plan_code
     *
     * @mbggenerated Sat Dec 07 13:58:45 CST 2019
     */
    private String route_plan_code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route_plan_node.node_day
     *
     * @mbggenerated Sat Dec 07 13:58:45 CST 2019
     */
    private Integer node_day;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route_plan_node.traffic_type
     *
     * @mbggenerated Sat Dec 07 13:58:45 CST 2019
     */
    private Integer traffic_type;


    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route_plan_node.locale_country_name
     *
     * @mbggenerated Sat Dec 07 13:58:45 CST 2019
     */
    private String locale_area;


    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route_plan_node.description
     *
     * @mbggenerated Sat Dec 07 13:58:45 CST 2019
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route_plan_node.has_breakfast
     *
     * @mbggenerated Sat Dec 07 13:58:45 CST 2019
     */
    private Integer has_breakfast;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route_plan_node.has_lunch
     *
     * @mbggenerated Sat Dec 07 13:58:45 CST 2019
     */
    private Integer has_lunch;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route_plan_node.has_dinner
     *
     * @mbggenerated Sat Dec 07 13:58:45 CST 2019
     */
    private Integer has_dinner;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route_plan_node.hotel_description
     *
     * @mbggenerated Sat Dec 07 13:58:45 CST 2019
     */
    private String hotel_description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route_plan_node.create_time
     *
     * @mbggenerated Sat Dec 07 13:58:45 CST 2019
     */
    private Date create_time;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route_plan_node.update_time
     *
     * @mbggenerated Sat Dec 07 13:58:45 CST 2019
     */
    private Date update_time;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route_plan_node.creator_id
     *
     * @mbggenerated Sat Dec 07 13:58:45 CST 2019
     */
    private Integer creator_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route_plan_node.creator_name
     *
     * @mbggenerated Sat Dec 07 13:58:45 CST 2019
     */
    private String creator_name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route_plan_node.id
     *
     * @return the value of route_plan_node.id
     *
     * @mbggenerated Sat Dec 07 13:58:45 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route_plan_node.id
     *
     * @param id the value for route_plan_node.id
     *
     * @mbggenerated Sat Dec 07 13:58:45 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route_plan_node.route_plan_code
     *
     * @return the value of route_plan_node.route_plan_code
     *
     * @mbggenerated Sat Dec 07 13:58:45 CST 2019
     */
    public String getRoute_plan_code() {
        return route_plan_code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route_plan_node.route_plan_code
     *
     * @param route_plan_code the value for route_plan_node.route_plan_code
     *
     * @mbggenerated Sat Dec 07 13:58:45 CST 2019
     */
    public void setRoute_plan_code(String route_plan_code) {
        this.route_plan_code = route_plan_code == null ? null : route_plan_code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route_plan_node.node_day
     *
     * @return the value of route_plan_node.node_day
     *
     * @mbggenerated Sat Dec 07 13:58:45 CST 2019
     */
    public Integer getNode_day() {
        return node_day;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route_plan_node.node_day
     *
     * @param node_day the value for route_plan_node.node_day
     *
     * @mbggenerated Sat Dec 07 13:58:45 CST 2019
     */
    public void setNode_day(Integer node_day) {
        this.node_day = node_day;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route_plan_node.traffic_type
     *
     * @return the value of route_plan_node.traffic_type
     *
     * @mbggenerated Sat Dec 07 13:58:45 CST 2019
     */
    public Integer getTraffic_type() {
        return traffic_type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route_plan_node.traffic_type
     *
     * @param traffic_type the value for route_plan_node.traffic_type
     *
     * @mbggenerated Sat Dec 07 13:58:45 CST 2019
     */
    public void setTraffic_type(Integer traffic_type) {
        this.traffic_type = traffic_type;
    }



    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route_plan_node.description
     *
     * @return the value of route_plan_node.description
     *
     * @mbggenerated Sat Dec 07 13:58:45 CST 2019
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route_plan_node.description
     *
     * @param description the value for route_plan_node.description
     *
     * @mbggenerated Sat Dec 07 13:58:45 CST 2019
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route_plan_node.has_breakfast
     *
     * @return the value of route_plan_node.has_breakfast
     *
     * @mbggenerated Sat Dec 07 13:58:45 CST 2019
     */
    public Integer getHas_breakfast() {
        return has_breakfast;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route_plan_node.has_breakfast
     *
     * @param has_breakfast the value for route_plan_node.has_breakfast
     *
     * @mbggenerated Sat Dec 07 13:58:45 CST 2019
     */
    public void setHas_breakfast(Integer has_breakfast) {
        this.has_breakfast = has_breakfast;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route_plan_node.has_lunch
     *
     * @return the value of route_plan_node.has_lunch
     *
     * @mbggenerated Sat Dec 07 13:58:45 CST 2019
     */
    public Integer getHas_lunch() {
        return has_lunch;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route_plan_node.has_lunch
     *
     * @param has_lunch the value for route_plan_node.has_lunch
     *
     * @mbggenerated Sat Dec 07 13:58:45 CST 2019
     */
    public void setHas_lunch(Integer has_lunch) {
        this.has_lunch = has_lunch;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route_plan_node.has_dinner
     *
     * @return the value of route_plan_node.has_dinner
     *
     * @mbggenerated Sat Dec 07 13:58:45 CST 2019
     */
    public Integer getHas_dinner() {
        return has_dinner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route_plan_node.has_dinner
     *
     * @param has_dinner the value for route_plan_node.has_dinner
     *
     * @mbggenerated Sat Dec 07 13:58:45 CST 2019
     */
    public void setHas_dinner(Integer has_dinner) {
        this.has_dinner = has_dinner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route_plan_node.hotel_description
     *
     * @return the value of route_plan_node.hotel_description
     *
     * @mbggenerated Sat Dec 07 13:58:45 CST 2019
     */
    public String getHotel_description() {
        return hotel_description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route_plan_node.hotel_description
     *
     * @param hotel_description the value for route_plan_node.hotel_description
     *
     * @mbggenerated Sat Dec 07 13:58:45 CST 2019
     */
    public void setHotel_description(String hotel_description) {
        this.hotel_description = hotel_description == null ? null : hotel_description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route_plan_node.create_time
     *
     * @return the value of route_plan_node.create_time
     *
     * @mbggenerated Sat Dec 07 13:58:45 CST 2019
     */
    public Date getCreate_time() {
        return create_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route_plan_node.create_time
     *
     * @param create_time the value for route_plan_node.create_time
     *
     * @mbggenerated Sat Dec 07 13:58:45 CST 2019
     */
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route_plan_node.update_time
     *
     * @return the value of route_plan_node.update_time
     *
     * @mbggenerated Sat Dec 07 13:58:45 CST 2019
     */
    public Date getUpdate_time() {
        return update_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route_plan_node.update_time
     *
     * @param update_time the value for route_plan_node.update_time
     *
     * @mbggenerated Sat Dec 07 13:58:45 CST 2019
     */
    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route_plan_node.creator_id
     *
     * @return the value of route_plan_node.creator_id
     *
     * @mbggenerated Sat Dec 07 13:58:45 CST 2019
     */
    public Integer getCreator_id() {
        return creator_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route_plan_node.creator_id
     *
     * @param creator_id the value for route_plan_node.creator_id
     *
     * @mbggenerated Sat Dec 07 13:58:45 CST 2019
     */
    public void setCreator_id(Integer creator_id) {
        this.creator_id = creator_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route_plan_node.creator_name
     *
     * @return the value of route_plan_node.creator_name
     *
     * @mbggenerated Sat Dec 07 13:58:45 CST 2019
     */
    public String getCreator_name() {
        return creator_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route_plan_node.creator_name
     *
     * @param creator_name the value for route_plan_node.creator_name
     *
     * @mbggenerated Sat Dec 07 13:58:45 CST 2019
     */
    public void setCreator_name(String creator_name) {
        this.creator_name = creator_name == null ? null : creator_name.trim();
    }

    public String getNode_code() {
        return node_code;
    }

    public void setNode_code(String node_code) {
        this.node_code = node_code;
    }

    public String getLocale_area() {
        return locale_area;
    }

    public void setLocale_area(String locale_area) {
        this.locale_area = locale_area;
    }
}