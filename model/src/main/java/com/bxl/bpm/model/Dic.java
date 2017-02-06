package com.bxl.bpm.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.Date;

/**
 * 数据字典
 */
public class Dic {
    private Integer id;

    /**
     * 字典名称
     */
    @NotEmpty
    private String name;

    /**
     * 字典代码
     */
    private String code;

    /**
     * 字典值
     */
    @NotEmpty
    private String value;

    /**
     * 父节点Id
     */
    private Integer pid;

    /**
     * 数据字典目录Id
     */
    @NotNull
    private Integer categoryId;

    /**
     * 备注
     */
    private String remark;

    /**
     * 是否禁用
     */
    @NotNull
    private Boolean isDisable;

    /**
     * 排序
     */
    @NotNull
    private Integer sort;

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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Boolean getIsDisable() {
        return isDisable;
    }

    public void setIsDisable(Boolean isDisable) {
        this.isDisable = isDisable == null ? false : isDisable ;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort == null ? 99 : sort;
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
        private String value;
        private Integer pid;
        private Integer categoryId;
        private String remark;
        private Boolean isDisable;
        private Integer sort;
        private Integer createrId;
        private Date createTime;
        private Integer modifierId;
        private Date modifiedTime;

        private Builder() {
        }

        public static Builder aDic() {
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

        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public Builder pid(Integer pid) {
            this.pid = pid;
            return this;
        }

        public Builder categoryId(Integer categoryId) {
            this.categoryId = categoryId;
            return this;
        }

        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        public Builder isDisable(Boolean isDisable) {
            this.isDisable = isDisable;
            return this;
        }

        public Builder sort(Integer sort) {
            this.sort = sort;
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

        public Dic build() {
            Dic dic = new Dic();
            dic.setId(id);
            dic.setName(name);
            dic.setCode(code);
            dic.setValue(value);
            dic.setPid(pid);
            dic.setCategoryId(categoryId);
            dic.setRemark(remark);
            dic.setIsDisable(isDisable);
            dic.setSort(sort);
            dic.setCreaterId(createrId);
            dic.setCreateTime(createTime);
            dic.setModifierId(modifierId);
            dic.setModifiedTime(modifiedTime);
            return dic;
        }
    }
}