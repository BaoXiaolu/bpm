package com.bxl.bpm.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.Date;

/**
 * 系统菜单
 */
public class SysNavigation {
    private Integer id;

    /**
     * 应用系统Id
     */
    @NotNull
    private Integer appId;

    /**
     * 菜单名称
     */
    @NotEmpty
    private String name;

    /**
     * 菜单代码
     */
    @NotEmpty
    private String code;

    /**
     * 上级菜单
     */
    private Integer pid;

    /**
     * 导航图标
     */
    private String iconCls;

    /**
     * 图标路径
     */
    private String iconUrl;

    /**
     * 排序
     */
    @NotNull
    private Integer sort;

    /**
     * 备注
     */
    private String remark;

    /**
     * 是否可见
     */
    @NotNull
    private Boolean isVisible;

    /**
     * 创建者Id
     */
    @NotNull
    private Integer createrId;

    /**
     * 创建时间
     */
    @NotNull
    private Date createTime;

    /**
     * 修改者Id
     */
    @NotNull
    private Integer modifierId;

    /**
     * 修改时间
     */
    @NotNull
    private Date modifiedTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls == null ? null : iconCls.trim();
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl == null ? null : iconUrl.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Boolean getIsVisible() {
        return isVisible;
    }

    public void setIsVisible(Boolean isVisible) {
        this.isVisible = isVisible;
    }

    public Integer getCreaterId() {
        return createrId;
    }

    public void setCreaterId(Integer createrId) {
        this.createrId = createrId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime == null ? new Timestamp(System.currentTimeMillis()) : createTime;
    }

    public Integer getModifierId() {
        return modifierId;
    }

    public void setModifierId(Integer modifierId) {
        this.modifierId = modifierId;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime == null ? new Timestamp(System.currentTimeMillis()) : modifiedTime;
    }
}