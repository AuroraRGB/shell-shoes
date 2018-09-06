package com.aurora.entity;

import java.io.Serializable;

/**
 * receive_address
 * @author 
 */
public class ReceiveAddress implements Serializable {
    /**
     * 收件地址id
     */
    private Integer addressId;

    /**
     * 省份
     */
    private String addressProvince;

    /**
     * 城市
     */
    private String addressCity;

    /**
     * 区
     */
    private String addressArea;

    /**
     * 街道
     */
    private String addressStreet;

    /**
     * 详细地址
     */
    private String addressDetail;

    /**
     * 邮政编码
     */
    private Integer addressPostCode;

    /**
     * 收件人姓名
     */
    private String addressRecipientName;

    /**
     * 收件人电话
     */
    private Long addressRecipientTelno;

    /**
     * 是否设置为默认收件地址
     */
    private Integer isDefaultAddress;

    /**
     * 用户id
     */
    private Integer custId;

    private static final long serialVersionUID = 1L;

    public ReceiveAddress(Integer addressId, String addressProvince, String addressCity, String addressArea, String addressStreet, String addressDetail, Integer addressPostCode, String addressRecipientName, Long addressRecipientTelno, Integer isDefaultAddress, Integer custId) {
        this.addressId = addressId;
        this.addressProvince = addressProvince;
        this.addressCity = addressCity;
        this.addressArea = addressArea;
        this.addressStreet = addressStreet;
        this.addressDetail = addressDetail;
        this.addressPostCode = addressPostCode;
        this.addressRecipientName = addressRecipientName;
        this.addressRecipientTelno = addressRecipientTelno;
        this.isDefaultAddress = isDefaultAddress;
        this.custId = custId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
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

    public String getAddressArea() {
        return addressArea;
    }

    public void setAddressArea(String addressArea) {
        this.addressArea = addressArea;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    public Integer getAddressPostCode() {
        return addressPostCode;
    }

    public void setAddressPostCode(Integer addressPostCode) {
        this.addressPostCode = addressPostCode;
    }

    public String getAddressRecipientName() {
        return addressRecipientName;
    }

    public void setAddressRecipientName(String addressRecipientName) {
        this.addressRecipientName = addressRecipientName;
    }

    public Long getAddressRecipientTelno() {
        return addressRecipientTelno;
    }

    public void setAddressRecipientTelno(Long addressRecipientTelno) {
        this.addressRecipientTelno = addressRecipientTelno;
    }

    public Integer getIsDefaultAddress() {
        return isDefaultAddress;
    }

    public void setIsDefaultAddress(Integer isDefaultAddress) {
        this.isDefaultAddress = isDefaultAddress;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
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
        ReceiveAddress other = (ReceiveAddress) that;
        return (this.getAddressId() == null ? other.getAddressId() == null : this.getAddressId().equals(other.getAddressId()))
            && (this.getAddressProvince() == null ? other.getAddressProvince() == null : this.getAddressProvince().equals(other.getAddressProvince()))
            && (this.getAddressCity() == null ? other.getAddressCity() == null : this.getAddressCity().equals(other.getAddressCity()))
            && (this.getAddressArea() == null ? other.getAddressArea() == null : this.getAddressArea().equals(other.getAddressArea()))
            && (this.getAddressStreet() == null ? other.getAddressStreet() == null : this.getAddressStreet().equals(other.getAddressStreet()))
            && (this.getAddressDetail() == null ? other.getAddressDetail() == null : this.getAddressDetail().equals(other.getAddressDetail()))
            && (this.getAddressPostCode() == null ? other.getAddressPostCode() == null : this.getAddressPostCode().equals(other.getAddressPostCode()))
            && (this.getAddressRecipientName() == null ? other.getAddressRecipientName() == null : this.getAddressRecipientName().equals(other.getAddressRecipientName()))
            && (this.getAddressRecipientTelno() == null ? other.getAddressRecipientTelno() == null : this.getAddressRecipientTelno().equals(other.getAddressRecipientTelno()))
            && (this.getIsDefaultAddress() == null ? other.getIsDefaultAddress() == null : this.getIsDefaultAddress().equals(other.getIsDefaultAddress()))
            && (this.getCustId() == null ? other.getCustId() == null : this.getCustId().equals(other.getCustId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAddressId() == null) ? 0 : getAddressId().hashCode());
        result = prime * result + ((getAddressProvince() == null) ? 0 : getAddressProvince().hashCode());
        result = prime * result + ((getAddressCity() == null) ? 0 : getAddressCity().hashCode());
        result = prime * result + ((getAddressArea() == null) ? 0 : getAddressArea().hashCode());
        result = prime * result + ((getAddressStreet() == null) ? 0 : getAddressStreet().hashCode());
        result = prime * result + ((getAddressDetail() == null) ? 0 : getAddressDetail().hashCode());
        result = prime * result + ((getAddressPostCode() == null) ? 0 : getAddressPostCode().hashCode());
        result = prime * result + ((getAddressRecipientName() == null) ? 0 : getAddressRecipientName().hashCode());
        result = prime * result + ((getAddressRecipientTelno() == null) ? 0 : getAddressRecipientTelno().hashCode());
        result = prime * result + ((getIsDefaultAddress() == null) ? 0 : getIsDefaultAddress().hashCode());
        result = prime * result + ((getCustId() == null) ? 0 : getCustId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", addressId=").append(addressId);
        sb.append(", addressProvince=").append(addressProvince);
        sb.append(", addressCity=").append(addressCity);
        sb.append(", addressArea=").append(addressArea);
        sb.append(", addressStreet=").append(addressStreet);
        sb.append(", addressDetail=").append(addressDetail);
        sb.append(", addressPostCode=").append(addressPostCode);
        sb.append(", addressRecipientName=").append(addressRecipientName);
        sb.append(", addressRecipientTelno=").append(addressRecipientTelno);
        sb.append(", isDefaultAddress=").append(isDefaultAddress);
        sb.append(", custId=").append(custId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}