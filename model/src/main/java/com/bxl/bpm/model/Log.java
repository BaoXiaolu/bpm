package com.bxl.bpm.model;

import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.Date;

/**
 * 操作日志
 */
public class Log {
    private Integer id;

    /**
     * 操作类型
     */
    @NotNull
    private Integer operationType;

    /**
     * 操作者Id
     */
    @NotNull
    private Integer operatorId;

    /**
     * 操作时间
     */
    @NotNull
    private Date operationTime;

    private String tableName;

    private String bizName;

    private String bizKeyValue;

    private String bizSql;

    /**
     * 操作者Ip
     */
    @NotNull
    private String operationIp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOperationType() {
        return operationType;
    }

    public void setOperationType(Integer operationType) {
        this.operationType = operationType;
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public Date getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(Date operationTime) {
        this.operationTime = operationTime == null ? new Timestamp(System.currentTimeMillis()) : operationTime ;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    public String getBizName() {
        return bizName;
    }

    public void setBizName(String bizName) {
        this.bizName = bizName == null ? null : bizName.trim();
    }

    public String getBizKeyValue() {
        return bizKeyValue;
    }

    public void setBizKeyValue(String bizKeyValue) {
        this.bizKeyValue = bizKeyValue == null ? null : bizKeyValue.trim();
    }

    public String getBizSql() {
        return bizSql;
    }

    public void setBizSql(String bizSql) {
        this.bizSql = bizSql == null ? null : bizSql.trim();
    }

    public String getOperationIp() {
        return operationIp;
    }

    public void setOperationIp(String operationIp) {
        this.operationIp = operationIp == null ? null : operationIp.trim();
    }
}