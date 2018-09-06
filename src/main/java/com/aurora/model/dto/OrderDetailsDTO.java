package com.aurora.model.dto;



import lombok.*;

import java.util.Date;
import java.util.Objects;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor

public class OrderDetailsDTO {
    private Integer custId;
    private Integer orderId;
    private Float   orderPrice;
    private Integer orderStatus;
    private Date    orderTime;
    private String  orderNumber;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDetailsDTO that = (OrderDetailsDTO) o;
        return Objects.equals(custId, that.custId) &&
                Objects.equals(orderId, that.orderId) &&
                Objects.equals(orderPrice, that.orderPrice) &&
                Objects.equals(orderStatus, that.orderStatus) &&
                Objects.equals(orderTime, that.orderTime) &&
                Objects.equals(orderNumber, that.orderNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(custId, orderId, orderPrice, orderStatus, orderTime, orderNumber);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("OrderDetailsDTO{");
        sb.append("custId=").append(custId);
        sb.append(", orderId=").append(orderId);
        sb.append(", orderPrice=").append(orderPrice);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", orderTime=").append(orderTime);
        sb.append(", orderNumber='").append(orderNumber).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
