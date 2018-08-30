package com.aurora.entity;

import java.io.Serializable;

/**
 * order_detail
 * @author 
 */
public class OrderDetailKey implements Serializable {
    private Integer orderId;

    private Integer shoesDetailId;

    private static final long serialVersionUID = 1L;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getShoesDetailId() {
        return shoesDetailId;
    }

    public void setShoesDetailId(Integer shoesDetailId) {
        this.shoesDetailId = shoesDetailId;
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
        OrderDetailKey other = (OrderDetailKey) that;
        return (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getShoesDetailId() == null ? other.getShoesDetailId() == null : this.getShoesDetailId().equals(other.getShoesDetailId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getShoesDetailId() == null) ? 0 : getShoesDetailId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", shoesDetailId=").append(shoesDetailId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}