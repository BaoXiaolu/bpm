package com.bxl.bpm.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.Date;

/**
 * 数据字典目录
 */
public class DicCategory {
    private Integer id;

    /**
     * 目录名称
     */
    @NotEmpty
    private String name;

    /**
     * 目录代码
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


    public static final class Builder {
        private Integer id;
        private String name;
        private String code;
        private Integer sort;
        private String remark;
        private Integer createrId;
        private Date createTime;
        private Integer modifierId;
        private Date modifiedTime;

        private Builder() {
        }

        public static Builder aDicCategory() {
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

        public Builder createrId(Integer createrId) {
            this.createrId = createrId;
            return this;
        }

        public Builder createTime(Date createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder modifierId(Integer modifierId) {
            this.modifierId = modifierId;
            return this;
        }

        public Builder modifiedTime(Date modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }

        public DicCategory build() {
            DicCategory dicCategory = new DicCategory();
            dicCategory.setId(id);
            dicCategory.setName(name);
            dicCategory.setCode(code);
            dicCategory.setSort(sort);
            dicCategory.setRemark(remark);
            dicCategory.setCreaterId(createrId);
            dicCategory.setCreateTime(createTime);
            dicCategory.setModifierId(modifierId);
            dicCategory.setModifiedTime(modifiedTime);
            return dicCategory;
        }
    }
}