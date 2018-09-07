package com.aurora.model.dto;



import lombok.*;

import java.util.Date;
import java.util.Objects;


@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString

public class OrderDetailsDTO {
    private Integer custId;
    private Integer orderId;
    private Float   orderPrice;
    private Integer orderStatus;
    private Date    orderTime;
    private String  orderNumber;
    private String  orderShoesColor;
    private String  orderShoesSize;
    private String  shoesName;

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
                Objects.equals(orderNumber, that.orderNumber) &&
                Objects.equals(orderShoesColor, that.orderShoesColor) &&
                Objects.equals(orderShoesSize, that.orderShoesSize) &&
                Objects.equals(shoesName, that.shoesName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(custId, orderId, orderPrice, orderStatus, orderTime, orderNumber, orderShoesColor, orderShoesSize, shoesName);
    }
}
