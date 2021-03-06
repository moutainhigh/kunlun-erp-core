package com.kunlun.erp.core.dto.product.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName PriceDateDelRespDto
 * @Description 删除日期价格响应
 * @Author Jm.zhang
 * @Date 2019/12/18 10:30
 * @Version 1.0
 **/
@ApiModel(description = "删除日期价格响应")
public class PriceDateDelRespDto {
    @ApiModelProperty(value = "与团相关的订单确认款",example = "5")
    private int order_income_count;

    @ApiModelProperty(value = "与团相关的游客数量",example = "5")
    private int order_client_count;

    @ApiModelProperty(value = "已删除的价格数量",example = "5")
    private int del_price_count;

    @ApiModelProperty(value = "已删除的成本明细数量",example = "7")
    private int del_cost_count;

    @ApiModelProperty(value = "已删除的大厅产品数量",example = "7")
    private int hall_count;

    @ApiModelProperty(value = "已删除的订单数量",example = "7")
    private int order_count;


    @ApiModelProperty(value = "关联导服数量",example = "5")
    private int guides_count;

    @ApiModelProperty(value = "关联交通票务数量",example = "5")
    private  int traffic_count;

    @ApiModelProperty(value = "关联酒店住宿数量",example = "5")
    private  int reside_count;

    @ApiModelProperty(value = "关联景点门票数量",example = "5")
    private int ticket_count;

    @ApiModelProperty(value = "关联餐饮数量",example = "5")
    private int meal_count;

    @ApiModelProperty(value = "关联车队数量",example = "5")
    private int motorcade_count;

    @ApiModelProperty(value = "关联保险数量",example = "5")
    private int insurance_count;

    @ApiModelProperty(value = "关联地接旅游公司团款数量",example = "5")
    private int travel_income_count;

    @ApiModelProperty(value = "关联地接旅游公司数量",example = "5")
    private int travel_count;

    @ApiModelProperty(value = "关联其他供应商数量",example = "5")
    private int other_count;

    public int getDel_price_count() {
        return del_price_count;
    }

    public void setDel_price_count(int del_price_count) {
        this.del_price_count = del_price_count;
    }

    public int getDel_cost_count() {
        return del_cost_count;
    }

    public void setDel_cost_count(int del_cost_count) {
        this.del_cost_count = del_cost_count;
    }

    public int getHall_count() {
        return hall_count;
    }

    public void setHall_count(int hall_count) {
        this.hall_count = hall_count;
    }

    public int getOrder_count() {
        return order_count;
    }

    public void setOrder_count(int order_count) {
        this.order_count = order_count;
    }

    public int getOrder_income_count() {
        return order_income_count;
    }

    public void setOrder_income_count(int order_income_count) {
        this.order_income_count = order_income_count;
    }

    public int getOrder_client_count() {
        return order_client_count;
    }

    public void setOrder_client_count(int order_client_count) {
        this.order_client_count = order_client_count;
    }

    public int getGuides_count() {
        return guides_count;
    }

    public void setGuides_count(int guides_count) {
        this.guides_count = guides_count;
    }

    public int getTraffic_count() {
        return traffic_count;
    }

    public void setTraffic_count(int traffic_count) {
        this.traffic_count = traffic_count;
    }

    public int getReside_count() {
        return reside_count;
    }

    public void setReside_count(int reside_count) {
        this.reside_count = reside_count;
    }

    public int getTicket_count() {
        return ticket_count;
    }

    public void setTicket_count(int ticket_count) {
        this.ticket_count = ticket_count;
    }

    public int getMeal_count() {
        return meal_count;
    }

    public void setMeal_count(int meal_count) {
        this.meal_count = meal_count;
    }

    public int getMotorcade_count() {
        return motorcade_count;
    }

    public void setMotorcade_count(int motorcade_count) {
        this.motorcade_count = motorcade_count;
    }

    public int getInsurance_count() {
        return insurance_count;
    }

    public void setInsurance_count(int insurance_count) {
        this.insurance_count = insurance_count;
    }

    public int getTravel_income_count() {
        return travel_income_count;
    }

    public void setTravel_income_count(int travel_income_count) {
        this.travel_income_count = travel_income_count;
    }

    public int getTravel_count() {
        return travel_count;
    }

    public void setTravel_count(int travel_count) {
        this.travel_count = travel_count;
    }

    public int getOther_count() {
        return other_count;
    }

    public void setOther_count(int other_count) {
        this.other_count = other_count;
    }
}
