package com.aurora.model.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * shoes
 * @author 
 */
public class Shoes implements Serializable {
    /**
     * 鞋ID
     */
    private Integer shoesId;

    /**
     * 鞋款号
     */
    private Integer shoesNumber;

    /**
     * 鞋名称
     */
    private String shoesName;

    /**
     * 吊牌价
     */
    private Float shoesPriceSale;

    /**
     * 折扣
     */
    private Float shoesDiscount;

    /**
     * 鞋描述
     */
    private String shoesDesc;

    /**
     * 上架时间
     */
    private Date shoesOnsaleTime;

    /**
     * 下架时间
     */
    private Date shoesOffsaleTime;

    /**
     * 鞋销量
     */
    private Integer shoesSaleCount;

    /**
     * 适用性别（0：男性，1：女性，2：通用）
     */
    private Byte shoesGender;

    /**
     * 鞋状态（0：在售，1：下架）
     */
    private Byte shoesStatus;

    /**
     * 鞋类别ID
     */
    private Integer categoryId;

    private static final long serialVersionUID = 1L;

    public Integer getShoesId() {
        return shoesId;
    }

    public void setShoesId(Integer shoesId) {
        this.shoesId = shoesId;
    }

    public Integer getShoesNumber() {
        return shoesNumber;
    }

    public void setShoesNumber(Integer shoesNumber) {
        this.shoesNumber = shoesNumber;
    }

    public String getShoesName() {
        return shoesName;
    }

    public void setShoesName(String shoesName) {
        this.shoesName = shoesName;
    }

    public Float getShoesPriceSale() {
        return shoesPriceSale;
    }

    public void setShoesPriceSale(Float shoesPriceSale) {
        this.shoesPriceSale = shoesPriceSale;
    }

    public Float getShoesDiscount() {
        return shoesDiscount;
    }

    public void setShoesDiscount(Float shoesDiscount) {
        this.shoesDiscount = shoesDiscount;
    }

    public String getShoesDesc() {
        return shoesDesc;
    }

    public void setShoesDesc(String shoesDesc) {
        this.shoesDesc = shoesDesc;
    }

    public Date getShoesOnsaleTime() {
        return shoesOnsaleTime;
    }

    public void setShoesOnsaleTime(Date shoesOnsaleTime) {
        this.shoesOnsaleTime = shoesOnsaleTime;
    }

    public Date getShoesOffsaleTime() {
        return shoesOffsaleTime;
    }

    public void setShoesOffsaleTime(Date shoesOffsaleTime) {
        this.shoesOffsaleTime = shoesOffsaleTime;
    }

    public Integer getShoesSaleCount() {
        return shoesSaleCount;
    }

    public void setShoesSaleCount(Integer shoesSaleCount) {
        this.shoesSaleCount = shoesSaleCount;
    }

    public Byte getShoesGender() {
        return shoesGender;
    }

    public void setShoesGender(Byte shoesGender) {
        this.shoesGender = shoesGender;
    }

    public Byte getShoesStatus() {
        return shoesStatus;
    }

    public void setShoesStatus(Byte shoesStatus) {
        this.shoesStatus = shoesStatus;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
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
        Shoes other = (Shoes) that;
        return (this.getShoesId() == null ? other.getShoesId() == null : this.getShoesId().equals(other.getShoesId()))
            && (this.getShoesNumber() == null ? other.getShoesNumber() == null : this.getShoesNumber().equals(other.getShoesNumber()))
            && (this.getShoesName() == null ? other.getShoesName() == null : this.getShoesName().equals(other.getShoesName()))
            && (this.getShoesPriceSale() == null ? other.getShoesPriceSale() == null : this.getShoesPriceSale().equals(other.getShoesPriceSale()))
            && (this.getShoesDiscount() == null ? other.getShoesDiscount() == null : this.getShoesDiscount().equals(other.getShoesDiscount()))
            && (this.getShoesDesc() == null ? other.getShoesDesc() == null : this.getShoesDesc().equals(other.getShoesDesc()))
            && (this.getShoesOnsaleTime() == null ? other.getShoesOnsaleTime() == null : this.getShoesOnsaleTime().equals(other.getShoesOnsaleTime()))
            && (this.getShoesOffsaleTime() == null ? other.getShoesOffsaleTime() == null : this.getShoesOffsaleTime().equals(other.getShoesOffsaleTime()))
            && (this.getShoesSaleCount() == null ? other.getShoesSaleCount() == null : this.getShoesSaleCount().equals(other.getShoesSaleCount()))
            && (this.getShoesGender() == null ? other.getShoesGender() == null : this.getShoesGender().equals(other.getShoesGender()))
            && (this.getShoesStatus() == null ? other.getShoesStatus() == null : this.getShoesStatus().equals(other.getShoesStatus()))
            && (this.getCategoryId() == null ? other.getCategoryId() == null : this.getCategoryId().equals(other.getCategoryId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getShoesId() == null) ? 0 : getShoesId().hashCode());
        result = prime * result + ((getShoesNumber() == null) ? 0 : getShoesNumber().hashCode());
        result = prime * result + ((getShoesName() == null) ? 0 : getShoesName().hashCode());
        result = prime * result + ((getShoesPriceSale() == null) ? 0 : getShoesPriceSale().hashCode());
        result = prime * result + ((getShoesDiscount() == null) ? 0 : getShoesDiscount().hashCode());
        result = prime * result + ((getShoesDesc() == null) ? 0 : getShoesDesc().hashCode());
        result = prime * result + ((getShoesOnsaleTime() == null) ? 0 : getShoesOnsaleTime().hashCode());
        result = prime * result + ((getShoesOffsaleTime() == null) ? 0 : getShoesOffsaleTime().hashCode());
        result = prime * result + ((getShoesSaleCount() == null) ? 0 : getShoesSaleCount().hashCode());
        result = prime * result + ((getShoesGender() == null) ? 0 : getShoesGender().hashCode());
        result = prime * result + ((getShoesStatus() == null) ? 0 : getShoesStatus().hashCode());
        result = prime * result + ((getCategoryId() == null) ? 0 : getCategoryId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", shoesId=").append(shoesId);
        sb.append(", shoesNumber=").append(shoesNumber);
        sb.append(", shoesName=").append(shoesName);
        sb.append(", shoesPriceSale=").append(shoesPriceSale);
        sb.append(", shoesDiscount=").append(shoesDiscount);
        sb.append(", shoesDesc=").append(shoesDesc);
        sb.append(", shoesOnsaleTime=").append(shoesOnsaleTime);
        sb.append(", shoesOffsaleTime=").append(shoesOffsaleTime);
        sb.append(", shoesSaleCount=").append(shoesSaleCount);
        sb.append(", shoesGender=").append(shoesGender);
        sb.append(", shoesStatus=").append(shoesStatus);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}