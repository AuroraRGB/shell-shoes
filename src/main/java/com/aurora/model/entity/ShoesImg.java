package com.aurora.model.entity;

import java.io.Serializable;

/**
 * shoes_img
 * @author 
 */
public class ShoesImg implements Serializable {
    private Integer imgId;

    private Integer shoesId;

    private String imgPath;

    private Integer sortNo;

    private static final long serialVersionUID = 1L;

    public Integer getImgId() {
        return imgId;
    }

    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }

    public Integer getShoesId() {
        return shoesId;
    }

    public void setShoesId(Integer shoesId) {
        this.shoesId = shoesId;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    public ShoesImg() {
    }

    public ShoesImg(Integer imgId, Integer shoesId, String imgPath, Integer sortNo) {
        this.imgId = imgId;
        this.shoesId = shoesId;
        this.imgPath = imgPath;
        this.sortNo = sortNo;
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
        ShoesImg other = (ShoesImg) that;
        return (this.getImgId() == null ? other.getImgId() == null : this.getImgId().equals(other.getImgId()))
            && (this.getShoesId() == null ? other.getShoesId() == null : this.getShoesId().equals(other.getShoesId()))
            && (this.getImgPath() == null ? other.getImgPath() == null : this.getImgPath().equals(other.getImgPath()))
            && (this.getSortNo() == null ? other.getSortNo() == null : this.getSortNo().equals(other.getSortNo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getImgId() == null) ? 0 : getImgId().hashCode());
        result = prime * result + ((getShoesId() == null) ? 0 : getShoesId().hashCode());
        result = prime * result + ((getImgPath() == null) ? 0 : getImgPath().hashCode());
        result = prime * result + ((getSortNo() == null) ? 0 : getSortNo().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", imgId=").append(imgId);
        sb.append(", shoesId=").append(shoesId);
        sb.append(", imgPath=").append(imgPath);
        sb.append(", sortNo=").append(sortNo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}