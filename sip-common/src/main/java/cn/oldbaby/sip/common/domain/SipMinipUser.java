package cn.oldbaby.sip.common.domain;

import java.util.Date;

/**
 * 小程序用户表
 * @TableName sip_minip_user
 */
public class SipMinipUser {
    /**
     * id
     */
    private Integer id;

    /**
     * 小程序openId
     */
    private String mopenid;

    /**
     * 开放平台下统一ID
     */
    private String unionid;

    /**
     * 微信昵称
     */
    private String nickname;

    /**
     * 性别1为男,2为女,0为未知
     */
    private Integer gender;

    /**
     * 电话号
     */
    private String mobileNo;

    /**
     * 省
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * 国家
     */
    private String country;

    /**
     * 头像地址
     */
    private String avatarurl;

    /**
     * 备注
     */
    private String wartermark;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 最后修改时间
     */
    private Date lastmodifiedtime;

    /**
     * id
     */
    public Integer getId() {
        return id;
    }

    /**
     * id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 小程序openId
     */
    public String getMopenid() {
        return mopenid;
    }

    /**
     * 小程序openId
     */
    public void setMopenid(String mopenid) {
        this.mopenid = mopenid;
    }

    /**
     * 开放平台下统一ID
     */
    public String getUnionid() {
        return unionid;
    }

    /**
     * 开放平台下统一ID
     */
    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    /**
     * 微信昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 微信昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 性别1为男,2为女,0为未知
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 性别1为男,2为女,0为未知
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 电话号
     */
    public String getMobileNo() {
        return mobileNo;
    }

    /**
     * 电话号
     */
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    /**
     * 省
     */
    public String getProvince() {
        return province;
    }

    /**
     * 省
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 城市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 国家
     */
    public String getCountry() {
        return country;
    }

    /**
     * 国家
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 头像地址
     */
    public String getAvatarurl() {
        return avatarurl;
    }

    /**
     * 头像地址
     */
    public void setAvatarurl(String avatarurl) {
        this.avatarurl = avatarurl;
    }

    /**
     * 备注
     */
    public String getWartermark() {
        return wartermark;
    }

    /**
     * 备注
     */
    public void setWartermark(String wartermark) {
        this.wartermark = wartermark;
    }

    /**
     * 创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 最后修改时间
     */
    public Date getLastmodifiedtime() {
        return lastmodifiedtime;
    }

    /**
     * 最后修改时间
     */
    public void setLastmodifiedtime(Date lastmodifiedtime) {
        this.lastmodifiedtime = lastmodifiedtime;
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
        SipMinipUser other = (SipMinipUser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMopenid() == null ? other.getMopenid() == null : this.getMopenid().equals(other.getMopenid()))
            && (this.getUnionid() == null ? other.getUnionid() == null : this.getUnionid().equals(other.getUnionid()))
            && (this.getNickname() == null ? other.getNickname() == null : this.getNickname().equals(other.getNickname()))
            && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
            && (this.getMobileNo() == null ? other.getMobileNo() == null : this.getMobileNo().equals(other.getMobileNo()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getCountry() == null ? other.getCountry() == null : this.getCountry().equals(other.getCountry()))
            && (this.getAvatarurl() == null ? other.getAvatarurl() == null : this.getAvatarurl().equals(other.getAvatarurl()))
            && (this.getWartermark() == null ? other.getWartermark() == null : this.getWartermark().equals(other.getWartermark()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getLastmodifiedtime() == null ? other.getLastmodifiedtime() == null : this.getLastmodifiedtime().equals(other.getLastmodifiedtime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMopenid() == null) ? 0 : getMopenid().hashCode());
        result = prime * result + ((getUnionid() == null) ? 0 : getUnionid().hashCode());
        result = prime * result + ((getNickname() == null) ? 0 : getNickname().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getMobileNo() == null) ? 0 : getMobileNo().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getCountry() == null) ? 0 : getCountry().hashCode());
        result = prime * result + ((getAvatarurl() == null) ? 0 : getAvatarurl().hashCode());
        result = prime * result + ((getWartermark() == null) ? 0 : getWartermark().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getLastmodifiedtime() == null) ? 0 : getLastmodifiedtime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", mopenid=").append(mopenid);
        sb.append(", unionid=").append(unionid);
        sb.append(", nickname=").append(nickname);
        sb.append(", gender=").append(gender);
        sb.append(", mobileNo=").append(mobileNo);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", country=").append(country);
        sb.append(", avatarurl=").append(avatarurl);
        sb.append(", wartermark=").append(wartermark);
        sb.append(", createtime=").append(createtime);
        sb.append(", lastmodifiedtime=").append(lastmodifiedtime);
        sb.append("]");
        return sb.toString();
    }
}