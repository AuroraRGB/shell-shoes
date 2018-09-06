package com.aurora.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * customer
 * @author 
 */
public class Customer implements Serializable {
    private Integer custId;

    private String custName;

    private String custPwd;

    private Integer custAge;

    private Long custPhone;

    private String custEmail;

    private Date custCreateTime;

    private Date custUpdateTime;

    private String custProfile;

    private static final long serialVersionUID = 1L;

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustPwd() {
        return custPwd;
    }

    public void setCustPwd(String custPwd) {
        this.custPwd = custPwd;
    }

    public Integer getCustAge() {
        return custAge;
    }

    public void setCustAge(Integer custAge) {
        this.custAge = custAge;
    }

    public Long getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(Long custPhone) {
        this.custPhone = custPhone;
    }

    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    public Date getCustCreateTime() {
        return custCreateTime;
    }

    public void setCustCreateTime(Date custCreateTime) {
        this.custCreateTime = custCreateTime;
    }

    public Date getCustUpdateTime() {
        return custUpdateTime;
    }

    public void setCustUpdateTime(Date custUpdateTime) {
        this.custUpdateTime = custUpdateTime;
    }

    public String getCustProfile() {
        return custProfile;
    }

    public void setCustProfile(String custProfile) {
        this.custProfile = custProfile;
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
        Customer other = (Customer) that;
        return (this.getCustId() == null ? other.getCustId() == null : this.getCustId().equals(other.getCustId()))
            && (this.getCustName() == null ? other.getCustName() == null : this.getCustName().equals(other.getCustName()))
            && (this.getCustPwd() == null ? other.getCustPwd() == null : this.getCustPwd().equals(other.getCustPwd()))
            && (this.getCustAge() == null ? other.getCustAge() == null : this.getCustAge().equals(other.getCustAge()))
            && (this.getCustPhone() == null ? other.getCustPhone() == null : this.getCustPhone().equals(other.getCustPhone()))
            && (this.getCustEmail() == null ? other.getCustEmail() == null : this.getCustEmail().equals(other.getCustEmail()))
            && (this.getCustCreateTime() == null ? other.getCustCreateTime() == null : this.getCustCreateTime().equals(other.getCustCreateTime()))
            && (this.getCustUpdateTime() == null ? other.getCustUpdateTime() == null : this.getCustUpdateTime().equals(other.getCustUpdateTime()))
            && (this.getCustProfile() == null ? other.getCustProfile() == null : this.getCustProfile().equals(other.getCustProfile()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCustId() == null) ? 0 : getCustId().hashCode());
        result = prime * result + ((getCustName() == null) ? 0 : getCustName().hashCode());
        result = prime * result + ((getCustPwd() == null) ? 0 : getCustPwd().hashCode());
        result = prime * result + ((getCustAge() == null) ? 0 : getCustAge().hashCode());
        result = prime * result + ((getCustPhone() == null) ? 0 : getCustPhone().hashCode());
        result = prime * result + ((getCustEmail() == null) ? 0 : getCustEmail().hashCode());
        result = prime * result + ((getCustCreateTime() == null) ? 0 : getCustCreateTime().hashCode());
        result = prime * result + ((getCustUpdateTime() == null) ? 0 : getCustUpdateTime().hashCode());
        result = prime * result + ((getCustProfile() == null) ? 0 : getCustProfile().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", custId=").append(custId);
        sb.append(", custName=").append(custName);
        sb.append(", custPwd=").append(custPwd);
        sb.append(", custAge=").append(custAge);
        sb.append(", custPhone=").append(custPhone);
        sb.append(", custEmail=").append(custEmail);
        sb.append(", custCreateTime=").append(custCreateTime);
        sb.append(", custUpdateTime=").append(custUpdateTime);
        sb.append(", custProfile=").append(custProfile);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}