package com.aurora.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * category
 * @author 
 */
public class Category implements Serializable {
    private Integer categoryId;

    private String categoryName;

    private String categoryDesc;

    private Date categoryCreateTime;

    private Date categoryUpdateTime;

    private Byte categoryStatus;

    private static final long serialVersionUID = 1L;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryDesc() {
        return categoryDesc;
    }

    public void setCategoryDesc(String categoryDesc) {
        this.categoryDesc = categoryDesc;
    }

    public Date getCategoryCreateTime() {
        return categoryCreateTime;
    }

    public void setCategoryCreateTime(Date categoryCreateTime) {
        this.categoryCreateTime = categoryCreateTime;
    }

    public Date getCategoryUpdateTime() {
        return categoryUpdateTime;
    }

    public void setCategoryUpdateTime(Date categoryUpdateTime) {
        this.categoryUpdateTime = categoryUpdateTime;
    }

    public Byte getCategoryStatus() {
        return categoryStatus;
    }

    public void setCategoryStatus(Byte categoryStatus) {
        this.categoryStatus = categoryStatus;
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
        Category other = (Category) that;
        return (this.getCategoryId() == null ? other.getCategoryId() == null : this.getCategoryId().equals(other.getCategoryId()))
            && (this.getCategoryName() == null ? other.getCategoryName() == null : this.getCategoryName().equals(other.getCategoryName()))
            && (this.getCategoryDesc() == null ? other.getCategoryDesc() == null : this.getCategoryDesc().equals(other.getCategoryDesc()))
            && (this.getCategoryCreateTime() == null ? other.getCategoryCreateTime() == null : this.getCategoryCreateTime().equals(other.getCategoryCreateTime()))
            && (this.getCategoryUpdateTime() == null ? other.getCategoryUpdateTime() == null : this.getCategoryUpdateTime().equals(other.getCategoryUpdateTime()))
            && (this.getCategoryStatus() == null ? other.getCategoryStatus() == null : this.getCategoryStatus().equals(other.getCategoryStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCategoryId() == null) ? 0 : getCategoryId().hashCode());
        result = prime * result + ((getCategoryName() == null) ? 0 : getCategoryName().hashCode());
        result = prime * result + ((getCategoryDesc() == null) ? 0 : getCategoryDesc().hashCode());
        result = prime * result + ((getCategoryCreateTime() == null) ? 0 : getCategoryCreateTime().hashCode());
        result = prime * result + ((getCategoryUpdateTime() == null) ? 0 : getCategoryUpdateTime().hashCode());
        result = prime * result + ((getCategoryStatus() == null) ? 0 : getCategoryStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", categoryId=").append(categoryId);
        sb.append(", categoryName=").append(categoryName);
        sb.append(", categoryDesc=").append(categoryDesc);
        sb.append(", categoryCreateTime=").append(categoryCreateTime);
        sb.append(", categoryUpdateTime=").append(categoryUpdateTime);
        sb.append(", categoryStatus=").append(categoryStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}