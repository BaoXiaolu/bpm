package com.bxl.bpm.model;

import javax.validation.constraints.NotNull;

/**
 * 角色应用系统授权
 */
public class RoleAppRef {
    private Integer id;

    /**
     * 角色Id
     */
    @NotNull
    private Integer roleId;

    /**
     * 应用系统Id
     */
    @NotNull
    private Integer appId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }
}