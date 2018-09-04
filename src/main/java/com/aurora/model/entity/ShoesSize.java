package com.aurora.model.entity;

import java.io.Serializable;

/**
 * shoes_size
 * @author 
 */
public class ShoesSize implements Serializable {
    private Integer shoesSizeId;

    private Float shoesSize;

    private Boolean shoesState;

    private static final long serialVersionUID = 1L;

    public Integer getShoesSizeId() {
        return shoesSizeId;
    }

    public void setShoesSizeId(Integer shoesSizeId) {
        this.shoesSizeId = shoesSizeId;
    }

    public Float getShoesSize() {
        return shoesSize;
    }

    public void setShoesSize(Float shoesSize) {
        this.shoesSize = shoesSize;
    }

    public Boolean getShoesState() {
        return shoesState;
    }

    public void setShoesState(Boolean shoesState) {
        this.shoesState = shoesState;
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
        ShoesSize other = (ShoesSize) that;
        return (this.getShoesSizeId() == null ? other.getShoesSizeId() == null : this.getShoesSizeId().equals(other.getShoesSizeId()))
            && (this.getShoesSize() == null ? other.getShoesSize() == null : this.getShoesSize().equals(other.getShoesSize()))
            && (this.getShoesState() == null ? other.getShoesState() == null : this.getShoesState().equals(other.getShoesState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getShoesSizeId() == null) ? 0 : getShoesSizeId().hashCode());
        result = prime * result + ((getShoesSize() == null) ? 0 : getShoesSize().hashCode());
        result = prime * result + ((getShoesState() == null) ? 0 : getShoesState().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", shoesSizeId=").append(shoesSizeId);
        sb.append(", shoesSize=").append(shoesSize);
        sb.append(", shoesState=").append(shoesState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}