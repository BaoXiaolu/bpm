package com.bxl.bpm.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

/**
 * 系统角色
 */
public class Role {
    private Integer id;

    /**
     * 角色名称
     */
    @NotEmpty
    private String name;

    /**
     * 角色代码
     */
    @NotEmpty
    private String code;

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
     * 是否默认角色
     */
    @NotNull
    private Boolean isDefault;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort == null ? 99 : sort;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault == null ? false : isDefault;
    }

    public static final class Builder {
        private Integer id;
        private String name;
        private String code;
        private Integer sort;
        private String remark;
        private Boolean isDefault;

        private Builder() {
        }

        public static Builder aRole() {
            return new Builder();
        }

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder code(String code) {
            this.code = code;
            return this;
        }

        public Builder sort(Integer sort) {
            this.sort = sort;
            return this;
        }

        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }

        public Builder but() {
            return aRole().id(id).name(name).code(code).sort(sort).remark(remark).isDefault(isDefault);
        }

        public Role build() {
            Role role = new Role();
            role.setId(id);
            role.setName(name);
            role.setCode(code);
            role.setSort(sort);
            role.setRemark(remark);
            role.setIsDefault(isDefault);
            return role;
        }
    }
}