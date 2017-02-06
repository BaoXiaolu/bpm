package com.bxl.bpm.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

/**
 * 用户
 */
public class User {
    private Integer id;

    /**
     * 账号
     */
    @NotEmpty
    private String account;

    /**
     * 密码
     */
    @NotEmpty
    private String password;

    /**
     * 用户名
     */
    @NotEmpty
    private String username;

    /**
     * 是否超管
     */
    @NotNull
    private Boolean isAdmin;

    /**
     * 是否禁用
     */
    @NotNull
    private Boolean isDisable;

    /**
     * 备注
     */
    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin == null ? false : isAdmin;
    }

    public Boolean getIsDisable() {
        return isDisable;
    }

    public void setIsDisable(Boolean isDisable) {
        this.isDisable = isDisable == null ? false : isDisable;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}