package com.bxl.bpm.model;

import java.util.Date;

public class Log {
    private Integer id;

    private Integer operationType;

    private Integer operatorId;

    private Date operationTime;

    private String tableName;

    private String bizName;

    private String bizKeyValue;

    private String bizSql;

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
        this.operationTime = operationTime;
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