package com.aurora.DTO;

import java.util.Date;

public class OrderQueryById {
    private String  orderNumber;
    private Date    orderTime;
    private Float   orderPrice;
    private Integer orderStatus;
    private Integer orderId;
    private String  addressProvince;
    private String  addressCity;
    private String  addressDetail;
    private String  orderShoesColor;
    private String  orderShoesSize;

    public OrderQueryById() {
    }

    public OrderQueryById(String orderNumber, Date orderTime, Float orderPrice, Integer orderStatus, Integer orderId, String addressProvince, String addressCity, String addressDetail, String orderShoesColor, String orderShoesSize) {
        this.orderNumber = orderNumber;
        this.orderTime = orderTime;
        this.orderPrice = orderPrice;
        this.orderStatus = orderStatus;
        this.orderId = orderId;
        this.addressProvince = addressProvince;
        this.addressCity = addressCity;
        this.addressDetail = addressDetail;
        this.orderShoesColor = orderShoesColor;
        this.orderShoesSize = orderShoesSize;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Float getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Float orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getAddressProvince() {
        return addressProvince;
    }

    public void setAddressProvince(String addressProvince) {
        this.addressProvince = addressProvince;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    public String getOrderShoesColor() {
        return orderShoesColor;
    }

    public void setOrderShoesColor(String orderShoesColor) {
        this.orderShoesColor = orderShoesColor;
    }

    public String getOrderShoesSize() {
        return orderShoesSize;
    }

    public void setOrderShoesSize(String orderShoesSize) {
        this.orderShoesSize = orderShoesSize;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("OrderQueryById{");
        sb.append("orderNumber='").append(orderNumber).append('\'');
        sb.append(", orderTime=").append(orderTime);
        sb.append(", orderPrice=").append(orderPrice);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", orderId=").append(orderId);
        sb.append(", addressProvince='").append(addressProvince).append('\'');
        sb.append(", addressCity='").append(addressCity).append('\'');
        sb.append(", addressDetail='").append(addressDetail).append('\'');
        sb.append(", orderShoesColor='").append(orderShoesColor).append('\'');
        sb.append(", orderShoesSize='").append(orderShoesSize).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
