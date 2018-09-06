package com.aurora.model.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * cart
 * @author 
 */
public class Cart implements Serializable {
    private Integer cartId;

    private Integer custId;

    private Integer shoesDetailId;

    private Integer quality;

    private Date addTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Cart() {
    }

    public Cart(Integer cartId, Integer custId, Integer shoesDetailId, Integer quality, Date addTime, Date updateTime) {
        this.cartId = cartId;
        this.custId = custId;
        this.shoesDetailId = shoesDetailId;
        this.quality = quality;
        this.addTime = addTime;
        this.updateTime = updateTime;
    }



    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public Integer getShoesDetailId() {
        return shoesDetailId;
    }

    public void setShoesDetailId(Integer shoesDetailId) {
        this.shoesDetailId = shoesDetailId;
    }

    public Integer getQuality() {
        return quality;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
        Cart other = (Cart) that;
        return (this.getCartId() == null ? other.getCartId() == null : this.getCartId().equals(other.getCartId()))
            && (this.getCustId() == null ? other.getCustId() == null : this.getCustId().equals(other.getCustId()))
            && (this.getShoesDetailId() == null ? other.getShoesDetailId() == null : this.getShoesDetailId().equals(other.getShoesDetailId()))
            && (this.getQuality() == null ? other.getQuality() == null : this.getQuality().equals(other.getQuality()))
            && (this.getAddTime() == null ? other.getAddTime() == null : this.getAddTime().equals(other.getAddTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCartId() == null) ? 0 : getCartId().hashCode());
        result = prime * result + ((getCustId() == null) ? 0 : getCustId().hashCode());
        result = prime * result + ((getShoesDetailId() == null) ? 0 : getShoesDetailId().hashCode());
        result = prime * result + ((getQuality() == null) ? 0 : getQuality().hashCode());
        result = prime * result + ((getAddTime() == null) ? 0 : getAddTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cartId=").append(cartId);
        sb.append(", custId=").append(custId);
        sb.append(", shoesDetailId=").append(shoesDetailId);
        sb.append(", quality=").append(quality);
        sb.append(", addTime=").append(addTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}