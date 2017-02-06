package com.bxl.bpm.model;

import javax.validation.constraints.NotNull;

/**
 * 用户操作权限
 */
public class UserBtnRef {
    private Integer id;

    /**
     * 用户Id
     * @see User
     */
    @NotNull
    private Integer userId;

    /**
     * 操作权限Id
     * @see SysNavBtnRef
     */
    @NotNull
    private Integer btnId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBtnId() {
        return btnId;
    }

    public void setBtnId(Integer btnId) {
        this.btnId = btnId;
    }
}