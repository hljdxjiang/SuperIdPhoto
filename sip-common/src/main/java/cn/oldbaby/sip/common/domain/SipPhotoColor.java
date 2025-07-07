package cn.oldbaby.sip.common.domain;

/**
 * 背景颜色表
 * @TableName sip_photo_color
 */
public class SipPhotoColor {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 颜色变化
     */
    private String colorId;

    /**
     * 颜色中文描述
     */
    private String colorName;

    /**
     * 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 颜色变化
     */
    public String getColorId() {
        return colorId;
    }

    /**
     * 颜色变化
     */
    public void setColorId(String colorId) {
        this.colorId = colorId;
    }

    /**
     * 颜色中文描述
     */
    public String getColorName() {
        return colorName;
    }

    /**
     * 颜色中文描述
     */
    public void setColorName(String colorName) {
        this.colorName = colorName;
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
        SipPhotoColor other = (SipPhotoColor) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getColorId() == null ? other.getColorId() == null : this.getColorId().equals(other.getColorId()))
            && (this.getColorName() == null ? other.getColorName() == null : this.getColorName().equals(other.getColorName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getColorId() == null) ? 0 : getColorId().hashCode());
        result = prime * result + ((getColorName() == null) ? 0 : getColorName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", colorId=").append(colorId);
        sb.append(", colorName=").append(colorName);
        sb.append("]");
        return sb.toString();
    }
}