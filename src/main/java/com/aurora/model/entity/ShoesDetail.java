package com.aurora.model.entity;

import java.io.Serializable;

/**
 * shoes_detail
 * @author 
 */
public class ShoesDetail implements Serializable {
    private Integer shoesDetailId;

    private Integer shoesId;

    private Integer shoesColorId;

    private Integer shoesSizeId;

    private Integer shoesInventory;

    private Integer shoesSaleCount;

    private Integer status;

    private static final long serialVersionUID = 1L;

    public Integer getShoesDetailId() {
        return shoesDetailId;
    }

    public void setShoesDetailId(Integer shoesDetailId) {
        this.shoesDetailId = shoesDetailId;
    }

    public Integer getShoesId() {
        return shoesId;
    }

    public void setShoesId(Integer shoesId) {
        this.shoesId = shoesId;
    }

    public Integer getShoesColorId() {
        return shoesColorId;
    }

    public void setShoesColorId(Integer shoesColorId) {
        this.shoesColorId = shoesColorId;
    }

    public Integer getShoesSizeId() {
        return shoesSizeId;
    }

    public void setShoesSizeId(Integer shoesSizeId) {
        this.shoesSizeId = shoesSizeId;
    }

    public Integer getShoesInventory() {
        return shoesInventory;
    }

    public void setShoesInventory(Integer shoesInventory) {
        this.shoesInventory = shoesInventory;
    }

    public Integer getShoesSaleCount() {
        return shoesSaleCount;
    }

    public void setShoesSaleCount(Integer shoesSaleCount) {
        this.shoesSaleCount = shoesSaleCount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
        ShoesDetail other = (ShoesDetail) that;
        return (this.getShoesDetailId() == null ? other.getShoesDetailId() == null : this.getShoesDetailId().equals(other.getShoesDetailId()))
            && (this.getShoesId() == null ? other.getShoesId() == null : this.getShoesId().equals(other.getShoesId()))
            && (this.getShoesColorId() == null ? other.getShoesColorId() == null : this.getShoesColorId().equals(other.getShoesColorId()))
            && (this.getShoesSizeId() == null ? other.getShoesSizeId() == null : this.getShoesSizeId().equals(other.getShoesSizeId()))
            && (this.getShoesInventory() == null ? other.getShoesInventory() == null : this.getShoesInventory().equals(other.getShoesInventory()))
            && (this.getShoesSaleCount() == null ? other.getShoesSaleCount() == null : this.getShoesSaleCount().equals(other.getShoesSaleCount()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getShoesDetailId() == null) ? 0 : getShoesDetailId().hashCode());
        result = prime * result + ((getShoesId() == null) ? 0 : getShoesId().hashCode());
        result = prime * result + ((getShoesColorId() == null) ? 0 : getShoesColorId().hashCode());
        result = prime * result + ((getShoesSizeId() == null) ? 0 : getShoesSizeId().hashCode());
        result = prime * result + ((getShoesInventory() == null) ? 0 : getShoesInventory().hashCode());
        result = prime * result + ((getShoesSaleCount() == null) ? 0 : getShoesSaleCount().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", shoesDetailId=").append(shoesDetailId);
        sb.append(", shoesId=").append(shoesId);
        sb.append(", shoesColorId=").append(shoesColorId);
        sb.append(", shoesSizeId=").append(shoesSizeId);
        sb.append(", shoesInventory=").append(shoesInventory);
        sb.append(", shoesSaleCount=").append(shoesSaleCount);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}