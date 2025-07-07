package cn.oldbaby.sip.common.domain;

import java.util.Date;

/**
 * 照片参数表
 * @TableName sip_photo_param
 */
public class SipPhotoParam {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 相片类型编码
     */
    private String itemId;

    /**
     * 相片类型名称
     */
    private String itemName;

    /**
     * 照片宽度
     */
    private String widthPx;

    /**
     * 照片高度
     */
    private String heightPx;

    /**
     * 像素
     */
    private Integer dpi;

    /**
     * 文件大小描述
     */
    private String fileSizeMsg;

    /**
     * 分类
     */
    private String category;

    /**
     * 分类 ID
     */
    private String categoryId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 最后修改时间
     */
    private Date lastModifiedTime;

    /**
     * 状态 0 有效 1 无效
     */
    private Integer itemStatus;

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
     * 相片类型编码
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * 相片类型编码
     */
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * 相片类型名称
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * 相片类型名称
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * 照片宽度
     */
    public String getWidthPx() {
        return widthPx;
    }

    /**
     * 照片宽度
     */
    public void setWidthPx(String widthPx) {
        this.widthPx = widthPx;
    }

    /**
     * 照片高度
     */
    public String getHeightPx() {
        return heightPx;
    }

    /**
     * 照片高度
     */
    public void setHeightPx(String heightPx) {
        this.heightPx = heightPx;
    }

    /**
     * 像素
     */
    public Integer getDpi() {
        return dpi;
    }

    /**
     * 像素
     */
    public void setDpi(Integer dpi) {
        this.dpi = dpi;
    }

    /**
     * 文件大小描述
     */
    public String getFileSizeMsg() {
        return fileSizeMsg;
    }

    /**
     * 文件大小描述
     */
    public void setFileSizeMsg(String fileSizeMsg) {
        this.fileSizeMsg = fileSizeMsg;
    }

    /**
     * 分类
     */
    public String getCategory() {
        return category;
    }

    /**
     * 分类
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * 分类 ID
     */
    public String getCategoryId() {
        return categoryId;
    }

    /**
     * 分类 ID
     */
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 最后修改时间
     */
    public Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * 最后修改时间
     */
    public void setLastModifiedTime(Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * 状态 0 有效 1 无效
     */
    public Integer getItemStatus() {
        return itemStatus;
    }

    /**
     * 状态 0 有效 1 无效
     */
    public void setItemStatus(Integer itemStatus) {
        this.itemStatus = itemStatus;
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
        SipPhotoParam other = (SipPhotoParam) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getItemId() == null ? other.getItemId() == null : this.getItemId().equals(other.getItemId()))
            && (this.getItemName() == null ? other.getItemName() == null : this.getItemName().equals(other.getItemName()))
            && (this.getWidthPx() == null ? other.getWidthPx() == null : this.getWidthPx().equals(other.getWidthPx()))
            && (this.getHeightPx() == null ? other.getHeightPx() == null : this.getHeightPx().equals(other.getHeightPx()))
            && (this.getDpi() == null ? other.getDpi() == null : this.getDpi().equals(other.getDpi()))
            && (this.getFileSizeMsg() == null ? other.getFileSizeMsg() == null : this.getFileSizeMsg().equals(other.getFileSizeMsg()))
            && (this.getCategory() == null ? other.getCategory() == null : this.getCategory().equals(other.getCategory()))
            && (this.getCategoryId() == null ? other.getCategoryId() == null : this.getCategoryId().equals(other.getCategoryId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getLastModifiedTime() == null ? other.getLastModifiedTime() == null : this.getLastModifiedTime().equals(other.getLastModifiedTime()))
            && (this.getItemStatus() == null ? other.getItemStatus() == null : this.getItemStatus().equals(other.getItemStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getItemId() == null) ? 0 : getItemId().hashCode());
        result = prime * result + ((getItemName() == null) ? 0 : getItemName().hashCode());
        result = prime * result + ((getWidthPx() == null) ? 0 : getWidthPx().hashCode());
        result = prime * result + ((getHeightPx() == null) ? 0 : getHeightPx().hashCode());
        result = prime * result + ((getDpi() == null) ? 0 : getDpi().hashCode());
        result = prime * result + ((getFileSizeMsg() == null) ? 0 : getFileSizeMsg().hashCode());
        result = prime * result + ((getCategory() == null) ? 0 : getCategory().hashCode());
        result = prime * result + ((getCategoryId() == null) ? 0 : getCategoryId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        result = prime * result + ((getItemStatus() == null) ? 0 : getItemStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", itemId=").append(itemId);
        sb.append(", itemName=").append(itemName);
        sb.append(", widthPx=").append(widthPx);
        sb.append(", heightPx=").append(heightPx);
        sb.append(", dpi=").append(dpi);
        sb.append(", fileSizeMsg=").append(fileSizeMsg);
        sb.append(", category=").append(category);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastModifiedTime=").append(lastModifiedTime);
        sb.append(", itemStatus=").append(itemStatus);
        sb.append("]");
        return sb.toString();
    }
}