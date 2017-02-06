package com.bxl.bpm.model;

import javax.validation.constraints.NotNull;

/**
 * 角色操作权限
 */
public class RoleBtnRef {
    private Integer id;

    /**
     * 角色Id
     */
    @NotNull
    private Integer roleId;

    /**
     * 系统操作Id
     */
    @NotNull
    private Integer btnId;

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

    public Integer getBtnId() {
        return btnId;
    }

    public void setBtnId(Integer btnId) {
        this.btnId = btnId;
    }

    public static final class Builder {
        private Integer id;
        private Integer roleId;
        private Integer btnId;

        private Builder() {
        }

        public static Builder aRoleBtnRef() {
            return new Builder();
        }

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder roleId(Integer roleId) {
            this.roleId = roleId;
            return this;
        }

        public Builder btnId(Integer btnId) {
            this.btnId = btnId;
            return this;
        }

        public RoleBtnRef build() {
            RoleBtnRef roleBtnRef = new RoleBtnRef();
            roleBtnRef.setId(id);
            roleBtnRef.setRoleId(roleId);
            roleBtnRef.setBtnId(btnId);
            return roleBtnRef;
        }
    }
}