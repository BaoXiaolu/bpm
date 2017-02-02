package com.bxl.bpm.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIsNull() {
            addCriterion("operation_type is null");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIsNotNull() {
            addCriterion("operation_type is not null");
            return (Criteria) this;
        }

        public Criteria andOperationTypeEqualTo(Integer value) {
            addCriterion("operation_type =", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotEqualTo(Integer value) {
            addCriterion("operation_type <>", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeGreaterThan(Integer value) {
            addCriterion("operation_type >", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("operation_type >=", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeLessThan(Integer value) {
            addCriterion("operation_type <", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeLessThanOrEqualTo(Integer value) {
            addCriterion("operation_type <=", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIn(List<Integer> values) {
            addCriterion("operation_type in", values, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotIn(List<Integer> values) {
            addCriterion("operation_type not in", values, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeBetween(Integer value1, Integer value2) {
            addCriterion("operation_type between", value1, value2, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("operation_type not between", value1, value2, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdEqualTo(Integer value) {
            addCriterion("operator =", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotEqualTo(Integer value) {
            addCriterion("operator <>", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThan(Integer value) {
            addCriterion("operator >", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("operator >=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThan(Integer value) {
            addCriterion("operator <", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThanOrEqualTo(Integer value) {
            addCriterion("operator <=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIn(List<Integer> values) {
            addCriterion("operator in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotIn(List<Integer> values) {
            addCriterion("operator not in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdBetween(Integer value1, Integer value2) {
            addCriterion("operator between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("operator not between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperationTimeIsNull() {
            addCriterion("operation_time is null");
            return (Criteria) this;
        }

        public Criteria andOperationTimeIsNotNull() {
            addCriterion("operation_time is not null");
            return (Criteria) this;
        }

        public Criteria andOperationTimeEqualTo(Date value) {
            addCriterion("operation_time =", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeNotEqualTo(Date value) {
            addCriterion("operation_time <>", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeGreaterThan(Date value) {
            addCriterion("operation_time >", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("operation_time >=", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeLessThan(Date value) {
            addCriterion("operation_time <", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeLessThanOrEqualTo(Date value) {
            addCriterion("operation_time <=", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeIn(List<Date> values) {
            addCriterion("operation_time in", values, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeNotIn(List<Date> values) {
            addCriterion("operation_time not in", values, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeBetween(Date value1, Date value2) {
            addCriterion("operation_time between", value1, value2, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeNotBetween(Date value1, Date value2) {
            addCriterion("operation_time not between", value1, value2, "operationTime");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNull() {
            addCriterion("tablename is null");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNotNull() {
            addCriterion("tablename is not null");
            return (Criteria) this;
        }

        public Criteria andTableNameEqualTo(String value) {
            addCriterion("tablename =", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotEqualTo(String value) {
            addCriterion("tablename <>", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThan(String value) {
            addCriterion("tablename >", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("tablename >=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThan(String value) {
            addCriterion("tablename <", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThanOrEqualTo(String value) {
            addCriterion("tablename <=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLike(String value) {
            addCriterion("tablename like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotLike(String value) {
            addCriterion("tablename not like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameIn(List<String> values) {
            addCriterion("tablename in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotIn(List<String> values) {
            addCriterion("tablename not in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameBetween(String value1, String value2) {
            addCriterion("tablename between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotBetween(String value1, String value2) {
            addCriterion("tablename not between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andBizNameIsNull() {
            addCriterion("biz_name is null");
            return (Criteria) this;
        }

        public Criteria andBizNameIsNotNull() {
            addCriterion("biz_name is not null");
            return (Criteria) this;
        }

        public Criteria andBizNameEqualTo(String value) {
            addCriterion("biz_name =", value, "bizName");
            return (Criteria) this;
        }

        public Criteria andBizNameNotEqualTo(String value) {
            addCriterion("biz_name <>", value, "bizName");
            return (Criteria) this;
        }

        public Criteria andBizNameGreaterThan(String value) {
            addCriterion("biz_name >", value, "bizName");
            return (Criteria) this;
        }

        public Criteria andBizNameGreaterThanOrEqualTo(String value) {
            addCriterion("biz_name >=", value, "bizName");
            return (Criteria) this;
        }

        public Criteria andBizNameLessThan(String value) {
            addCriterion("biz_name <", value, "bizName");
            return (Criteria) this;
        }

        public Criteria andBizNameLessThanOrEqualTo(String value) {
            addCriterion("biz_name <=", value, "bizName");
            return (Criteria) this;
        }

        public Criteria andBizNameLike(String value) {
            addCriterion("biz_name like", value, "bizName");
            return (Criteria) this;
        }

        public Criteria andBizNameNotLike(String value) {
            addCriterion("biz_name not like", value, "bizName");
            return (Criteria) this;
        }

        public Criteria andBizNameIn(List<String> values) {
            addCriterion("biz_name in", values, "bizName");
            return (Criteria) this;
        }

        public Criteria andBizNameNotIn(List<String> values) {
            addCriterion("biz_name not in", values, "bizName");
            return (Criteria) this;
        }

        public Criteria andBizNameBetween(String value1, String value2) {
            addCriterion("biz_name between", value1, value2, "bizName");
            return (Criteria) this;
        }

        public Criteria andBizNameNotBetween(String value1, String value2) {
            addCriterion("biz_name not between", value1, value2, "bizName");
            return (Criteria) this;
        }

        public Criteria andBizKeyValueIsNull() {
            addCriterion("biz_keyvalue is null");
            return (Criteria) this;
        }

        public Criteria andBizKeyValueIsNotNull() {
            addCriterion("biz_keyvalue is not null");
            return (Criteria) this;
        }

        public Criteria andBizKeyValueEqualTo(String value) {
            addCriterion("biz_keyvalue =", value, "bizKeyValue");
            return (Criteria) this;
        }

        public Criteria andBizKeyValueNotEqualTo(String value) {
            addCriterion("biz_keyvalue <>", value, "bizKeyValue");
            return (Criteria) this;
        }

        public Criteria andBizKeyValueGreaterThan(String value) {
            addCriterion("biz_keyvalue >", value, "bizKeyValue");
            return (Criteria) this;
        }

        public Criteria andBizKeyValueGreaterThanOrEqualTo(String value) {
            addCriterion("biz_keyvalue >=", value, "bizKeyValue");
            return (Criteria) this;
        }

        public Criteria andBizKeyValueLessThan(String value) {
            addCriterion("biz_keyvalue <", value, "bizKeyValue");
            return (Criteria) this;
        }

        public Criteria andBizKeyValueLessThanOrEqualTo(String value) {
            addCriterion("biz_keyvalue <=", value, "bizKeyValue");
            return (Criteria) this;
        }

        public Criteria andBizKeyValueLike(String value) {
            addCriterion("biz_keyvalue like", value, "bizKeyValue");
            return (Criteria) this;
        }

        public Criteria andBizKeyValueNotLike(String value) {
            addCriterion("biz_keyvalue not like", value, "bizKeyValue");
            return (Criteria) this;
        }

        public Criteria andBizKeyValueIn(List<String> values) {
            addCriterion("biz_keyvalue in", values, "bizKeyValue");
            return (Criteria) this;
        }

        public Criteria andBizKeyValueNotIn(List<String> values) {
            addCriterion("biz_keyvalue not in", values, "bizKeyValue");
            return (Criteria) this;
        }

        public Criteria andBizKeyValueBetween(String value1, String value2) {
            addCriterion("biz_keyvalue between", value1, value2, "bizKeyValue");
            return (Criteria) this;
        }

        public Criteria andBizKeyValueNotBetween(String value1, String value2) {
            addCriterion("biz_keyvalue not between", value1, value2, "bizKeyValue");
            return (Criteria) this;
        }

        public Criteria andBizSqlIsNull() {
            addCriterion("biz_sql is null");
            return (Criteria) this;
        }

        public Criteria andBizSqlIsNotNull() {
            addCriterion("biz_sql is not null");
            return (Criteria) this;
        }

        public Criteria andBizSqlEqualTo(String value) {
            addCriterion("biz_sql =", value, "bizSql");
            return (Criteria) this;
        }

        public Criteria andBizSqlNotEqualTo(String value) {
            addCriterion("biz_sql <>", value, "bizSql");
            return (Criteria) this;
        }

        public Criteria andBizSqlGreaterThan(String value) {
            addCriterion("biz_sql >", value, "bizSql");
            return (Criteria) this;
        }

        public Criteria andBizSqlGreaterThanOrEqualTo(String value) {
            addCriterion("biz_sql >=", value, "bizSql");
            return (Criteria) this;
        }

        public Criteria andBizSqlLessThan(String value) {
            addCriterion("biz_sql <", value, "bizSql");
            return (Criteria) this;
        }

        public Criteria andBizSqlLessThanOrEqualTo(String value) {
            addCriterion("biz_sql <=", value, "bizSql");
            return (Criteria) this;
        }

        public Criteria andBizSqlLike(String value) {
            addCriterion("biz_sql like", value, "bizSql");
            return (Criteria) this;
        }

        public Criteria andBizSqlNotLike(String value) {
            addCriterion("biz_sql not like", value, "bizSql");
            return (Criteria) this;
        }

        public Criteria andBizSqlIn(List<String> values) {
            addCriterion("biz_sql in", values, "bizSql");
            return (Criteria) this;
        }

        public Criteria andBizSqlNotIn(List<String> values) {
            addCriterion("biz_sql not in", values, "bizSql");
            return (Criteria) this;
        }

        public Criteria andBizSqlBetween(String value1, String value2) {
            addCriterion("biz_sql between", value1, value2, "bizSql");
            return (Criteria) this;
        }

        public Criteria andBizSqlNotBetween(String value1, String value2) {
            addCriterion("biz_sql not between", value1, value2, "bizSql");
            return (Criteria) this;
        }

        public Criteria andOperationIpIsNull() {
            addCriterion("operation_ip is null");
            return (Criteria) this;
        }

        public Criteria andOperationIpIsNotNull() {
            addCriterion("operation_ip is not null");
            return (Criteria) this;
        }

        public Criteria andOperationIpEqualTo(String value) {
            addCriterion("operation_ip =", value, "operationIp");
            return (Criteria) this;
        }

        public Criteria andOperationIpNotEqualTo(String value) {
            addCriterion("operation_ip <>", value, "operationIp");
            return (Criteria) this;
        }

        public Criteria andOperationIpGreaterThan(String value) {
            addCriterion("operation_ip >", value, "operationIp");
            return (Criteria) this;
        }

        public Criteria andOperationIpGreaterThanOrEqualTo(String value) {
            addCriterion("operation_ip >=", value, "operationIp");
            return (Criteria) this;
        }

        public Criteria andOperationIpLessThan(String value) {
            addCriterion("operation_ip <", value, "operationIp");
            return (Criteria) this;
        }

        public Criteria andOperationIpLessThanOrEqualTo(String value) {
            addCriterion("operation_ip <=", value, "operationIp");
            return (Criteria) this;
        }

        public Criteria andOperationIpLike(String value) {
            addCriterion("operation_ip like", value, "operationIp");
            return (Criteria) this;
        }

        public Criteria andOperationIpNotLike(String value) {
            addCriterion("operation_ip not like", value, "operationIp");
            return (Criteria) this;
        }

        public Criteria andOperationIpIn(List<String> values) {
            addCriterion("operation_ip in", values, "operationIp");
            return (Criteria) this;
        }

        public Criteria andOperationIpNotIn(List<String> values) {
            addCriterion("operation_ip not in", values, "operationIp");
            return (Criteria) this;
        }

        public Criteria andOperationIpBetween(String value1, String value2) {
            addCriterion("operation_ip between", value1, value2, "operationIp");
            return (Criteria) this;
        }

        public Criteria andOperationIpNotBetween(String value1, String value2) {
            addCriterion("operation_ip not between", value1, value2, "operationIp");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}