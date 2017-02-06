package com.bxl.bpm.model;

import javax.validation.constraints.NotNull;

/**
 * 用户角色
 */
public class UserRoleRef {
    private Integer id;

    /**
     * 角色Id
     * @see Role
     */
    @NotNull
    private Integer roleId;

    /**
     * 用户Id
     */
    @NotNull
    private Integer userId;

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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}