package com.aurora.model.entity;

import java.io.Serializable;

/**
 * shoes_color
 * @author 
 */
public class ShoesColor implements Serializable {
    private Integer shoesColorId;

    private String shoesColorName;

    private Integer shoesColorStatus;

    private static final long serialVersionUID = 1L;

    public Integer getShoesColorId() {
        return shoesColorId;
    }

    public void setShoesColorId(Integer shoesColorId) {
        this.shoesColorId = shoesColorId;
    }

    public String getShoesColorName() {
        return shoesColorName;
    }

    public void setShoesColorName(String shoesColorName) {
        this.shoesColorName = shoesColorName;
    }

    public Integer getShoesColorStatus() {
        return shoesColorStatus;
    }

    public void setShoesColorStatus(Integer shoesColorStatus) {
        this.shoesColorStatus = shoesColorStatus;
    }

    public ShoesColor() {

    }

    public ShoesColor(Integer shoesColorId, String shoesColorName, Integer shoesColorStatus) {
        this.shoesColorId = shoesColorId;
        this.shoesColorName = shoesColorName;
        this.shoesColorStatus = shoesColorStatus;
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
        ShoesColor other = (ShoesColor) that;
        return (this.getShoesColorId() == null ? other.getShoesColorId() == null : this.getShoesColorId().equals(other.getShoesColorId()))
            && (this.getShoesColorName() == null ? other.getShoesColorName() == null : this.getShoesColorName().equals(other.getShoesColorName()))
            && (this.getShoesColorStatus() == null ? other.getShoesColorStatus() == null : this.getShoesColorStatus().equals(other.getShoesColorStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getShoesColorId() == null) ? 0 : getShoesColorId().hashCode());
        result = prime * result + ((getShoesColorName() == null) ? 0 : getShoesColorName().hashCode());
        result = prime * result + ((getShoesColorStatus() == null) ? 0 : getShoesColorStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", shoesColorId=").append(shoesColorId);
        sb.append(", shoesColorName=").append(shoesColorName);
        sb.append(", shoesColorStatus=").append(shoesColorStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}