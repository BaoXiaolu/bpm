package com.bxl.bpm.model;

import javax.validation.constraints.NotNull;

/**
 * 菜单权限
 */
public class SysNavBtnRef {
    private Integer id;

    /**
     * 菜单Id
     */
    @NotNull
    private Integer navId;

    /**
     * 按钮Id
     */
    private Integer btnId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNavId() {
        return navId;
    }

    public void setNavId(Integer navId) {
        this.navId = navId;
    }

    public Integer getBtnId() {
        return btnId;
    }

    public void setBtnId(Integer btnId) {
        this.btnId = btnId;
    }
}