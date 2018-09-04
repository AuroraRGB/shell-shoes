package com.aurora.model.entity;

import java.io.Serializable;

/**
 * order_detail
 * @author 
 */
public class OrderDetail extends OrderDetailKey implements Serializable {
    private Integer quality;

    /**
     * 鞋子颜色
     */
    private String orderShoesColor;

    /**
     * 鞋子尺码
     */
    private String orderShoesSize;

    private static final long serialVersionUID = 1L;

    public Integer getQuality() {
        return quality;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
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
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        OrderDetail other = (OrderDetail) that;
        return (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getShoesDetailId() == null ? other.getShoesDetailId() == null : this.getShoesDetailId().equals(other.getShoesDetailId()))
            && (this.getQuality() == null ? other.getQuality() == null : this.getQuality().equals(other.getQuality()))
            && (this.getOrderShoesColor() == null ? other.getOrderShoesColor() == null : this.getOrderShoesColor().equals(other.getOrderShoesColor()))
            && (this.getOrderShoesSize() == null ? other.getOrderShoesSize() == null : this.getOrderShoesSize().equals(other.getOrderShoesSize()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getShoesDetailId() == null) ? 0 : getShoesDetailId().hashCode());
        result = prime * result + ((getQuality() == null) ? 0 : getQuality().hashCode());
        result = prime * result + ((getOrderShoesColor() == null) ? 0 : getOrderShoesColor().hashCode());
        result = prime * result + ((getOrderShoesSize() == null) ? 0 : getOrderShoesSize().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", quality=").append(quality);
        sb.append(", orderShoesColor=").append(orderShoesColor);
        sb.append(", orderShoesSize=").append(orderShoesSize);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}