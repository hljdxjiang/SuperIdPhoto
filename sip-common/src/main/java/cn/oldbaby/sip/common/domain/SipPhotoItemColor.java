package cn.oldbaby.sip.common.domain;

/**
 * 
 * @TableName sip_photo_item_color
 */
public class SipPhotoItemColor {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 颜色变化
     */
    private String colorId;

    /**
     * 相片模型 ID
     */
    private String itemId;

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
     * 相片模型 ID
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * 相片模型 ID
     */
    public void setItemId(String itemId) {
        this.itemId = itemId;
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
        SipPhotoItemColor other = (SipPhotoItemColor) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getColorId() == null ? other.getColorId() == null : this.getColorId().equals(other.getColorId()))
            && (this.getItemId() == null ? other.getItemId() == null : this.getItemId().equals(other.getItemId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getColorId() == null) ? 0 : getColorId().hashCode());
        result = prime * result + ((getItemId() == null) ? 0 : getItemId().hashCode());
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
        sb.append(", itemId=").append(itemId);
        sb.append("]");
        return sb.toString();
    }
}