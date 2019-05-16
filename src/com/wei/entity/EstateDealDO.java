package com.wei.entity;

import java.util.Date;

public class EstateDealDO {


    public EstateDealDO() {
    }

    public EstateDealDO(Long estateId, Long cityId) {
        this.estateId = estateId;
        this.cityId = cityId;
    }

    /**
     * id
     */
    private Long id;

    /**
     * 城市id
     */
    private Long cityId;

    /**
     * 成交公司
     */
    private String companyName;

    /**
     * 成交公司id
     */
    private Long companyId;

    /**
     * 物业地址
     */
    private String propertyAddress;

    /**
     * 楼盘地址
     */
    private Long estateId;

    /**
     * 楼盘名称
     */
    private String estateName;

    /**
     * 面积
     */
    private String area;

    /**
     * 成交总价
     */
    private String dealPrice;

    /**
     * 成交日期
     */
    private Date dealDate;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 最后更新时间
     */
    private Date lastModified;

    /**
     * 删除标识
     */
    private Boolean deleteFlag;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getPropertyAddress() {
        return propertyAddress;
    }

    public void setPropertyAddress(String propertyAddress) {
        this.propertyAddress = propertyAddress;
    }

    public Long getEstateId() {
        return estateId;
    }

    public void setEstateId(Long estateId) {
        this.estateId = estateId;
    }

    public String getEstateName() {
        return estateName;
    }

    public void setEstateName(String estateName) {
        this.estateName = estateName;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDealPrice() {
        return dealPrice;
    }

    public void setDealPrice(String dealPrice) {
        this.dealPrice = dealPrice;
    }

    public Date getDealDate() {
        return dealDate;
    }

    public void setDealDate(Date dealDate) {
        this.dealDate = dealDate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    public Boolean getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }


    @Override
    public String toString() {
        return "[id=" + id + ", cityId=" + cityId + ", companyName=" + companyName + ", companyId=" + companyId + ", propertyAddress=" + propertyAddress + ", estateId=" + estateId + ", estateName=" + estateName + ", area=" + area + ", dealPrice=" + dealPrice + ", dealDate=" + dealDate + ", createTime=" + createTime + ", lastModified=" + lastModified + ", deleteFlag=" + deleteFlag + "]";
    }
}