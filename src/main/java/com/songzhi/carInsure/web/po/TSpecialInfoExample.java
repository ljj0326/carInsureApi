package com.songzhi.carInsure.web.po;

import java.util.ArrayList;
import java.util.List;

public class TSpecialInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSpecialInfoExample() {
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

        public Criteria andSiIdIsNull() {
            addCriterion("si_id is null");
            return (Criteria) this;
        }

        public Criteria andSiIdIsNotNull() {
            addCriterion("si_id is not null");
            return (Criteria) this;
        }

        public Criteria andSiIdEqualTo(Integer value) {
            addCriterion("si_id =", value, "siId");
            return (Criteria) this;
        }

        public Criteria andSiIdNotEqualTo(Integer value) {
            addCriterion("si_id <>", value, "siId");
            return (Criteria) this;
        }

        public Criteria andSiIdGreaterThan(Integer value) {
            addCriterion("si_id >", value, "siId");
            return (Criteria) this;
        }

        public Criteria andSiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("si_id >=", value, "siId");
            return (Criteria) this;
        }

        public Criteria andSiIdLessThan(Integer value) {
            addCriterion("si_id <", value, "siId");
            return (Criteria) this;
        }

        public Criteria andSiIdLessThanOrEqualTo(Integer value) {
            addCriterion("si_id <=", value, "siId");
            return (Criteria) this;
        }

        public Criteria andSiIdIn(List<Integer> values) {
            addCriterion("si_id in", values, "siId");
            return (Criteria) this;
        }

        public Criteria andSiIdNotIn(List<Integer> values) {
            addCriterion("si_id not in", values, "siId");
            return (Criteria) this;
        }

        public Criteria andSiIdBetween(Integer value1, Integer value2) {
            addCriterion("si_id between", value1, value2, "siId");
            return (Criteria) this;
        }

        public Criteria andSiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("si_id not between", value1, value2, "siId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andSiSpecliCodeIsNull() {
            addCriterion("si_specLi_code is null");
            return (Criteria) this;
        }

        public Criteria andSiSpecliCodeIsNotNull() {
            addCriterion("si_specLi_code is not null");
            return (Criteria) this;
        }

        public Criteria andSiSpecliCodeEqualTo(String value) {
            addCriterion("si_specLi_code =", value, "siSpecliCode");
            return (Criteria) this;
        }

        public Criteria andSiSpecliCodeNotEqualTo(String value) {
            addCriterion("si_specLi_code <>", value, "siSpecliCode");
            return (Criteria) this;
        }

        public Criteria andSiSpecliCodeGreaterThan(String value) {
            addCriterion("si_specLi_code >", value, "siSpecliCode");
            return (Criteria) this;
        }

        public Criteria andSiSpecliCodeGreaterThanOrEqualTo(String value) {
            addCriterion("si_specLi_code >=", value, "siSpecliCode");
            return (Criteria) this;
        }

        public Criteria andSiSpecliCodeLessThan(String value) {
            addCriterion("si_specLi_code <", value, "siSpecliCode");
            return (Criteria) this;
        }

        public Criteria andSiSpecliCodeLessThanOrEqualTo(String value) {
            addCriterion("si_specLi_code <=", value, "siSpecliCode");
            return (Criteria) this;
        }

        public Criteria andSiSpecliCodeLike(String value) {
            addCriterion("si_specLi_code like", value, "siSpecliCode");
            return (Criteria) this;
        }

        public Criteria andSiSpecliCodeNotLike(String value) {
            addCriterion("si_specLi_code not like", value, "siSpecliCode");
            return (Criteria) this;
        }

        public Criteria andSiSpecliCodeIn(List<String> values) {
            addCriterion("si_specLi_code in", values, "siSpecliCode");
            return (Criteria) this;
        }

        public Criteria andSiSpecliCodeNotIn(List<String> values) {
            addCriterion("si_specLi_code not in", values, "siSpecliCode");
            return (Criteria) this;
        }

        public Criteria andSiSpecliCodeBetween(String value1, String value2) {
            addCriterion("si_specLi_code between", value1, value2, "siSpecliCode");
            return (Criteria) this;
        }

        public Criteria andSiSpecliCodeNotBetween(String value1, String value2) {
            addCriterion("si_specLi_code not between", value1, value2, "siSpecliCode");
            return (Criteria) this;
        }

        public Criteria andSiSpecliInfoIsNull() {
            addCriterion("si_specLi_info is null");
            return (Criteria) this;
        }

        public Criteria andSiSpecliInfoIsNotNull() {
            addCriterion("si_specLi_info is not null");
            return (Criteria) this;
        }

        public Criteria andSiSpecliInfoEqualTo(String value) {
            addCriterion("si_specLi_info =", value, "siSpecliInfo");
            return (Criteria) this;
        }

        public Criteria andSiSpecliInfoNotEqualTo(String value) {
            addCriterion("si_specLi_info <>", value, "siSpecliInfo");
            return (Criteria) this;
        }

        public Criteria andSiSpecliInfoGreaterThan(String value) {
            addCriterion("si_specLi_info >", value, "siSpecliInfo");
            return (Criteria) this;
        }

        public Criteria andSiSpecliInfoGreaterThanOrEqualTo(String value) {
            addCriterion("si_specLi_info >=", value, "siSpecliInfo");
            return (Criteria) this;
        }

        public Criteria andSiSpecliInfoLessThan(String value) {
            addCriterion("si_specLi_info <", value, "siSpecliInfo");
            return (Criteria) this;
        }

        public Criteria andSiSpecliInfoLessThanOrEqualTo(String value) {
            addCriterion("si_specLi_info <=", value, "siSpecliInfo");
            return (Criteria) this;
        }

        public Criteria andSiSpecliInfoLike(String value) {
            addCriterion("si_specLi_info like", value, "siSpecliInfo");
            return (Criteria) this;
        }

        public Criteria andSiSpecliInfoNotLike(String value) {
            addCriterion("si_specLi_info not like", value, "siSpecliInfo");
            return (Criteria) this;
        }

        public Criteria andSiSpecliInfoIn(List<String> values) {
            addCriterion("si_specLi_info in", values, "siSpecliInfo");
            return (Criteria) this;
        }

        public Criteria andSiSpecliInfoNotIn(List<String> values) {
            addCriterion("si_specLi_info not in", values, "siSpecliInfo");
            return (Criteria) this;
        }

        public Criteria andSiSpecliInfoBetween(String value1, String value2) {
            addCriterion("si_specLi_info between", value1, value2, "siSpecliInfo");
            return (Criteria) this;
        }

        public Criteria andSiSpecliInfoNotBetween(String value1, String value2) {
            addCriterion("si_specLi_info not between", value1, value2, "siSpecliInfo");
            return (Criteria) this;
        }

        public Criteria andSiSpecliTypeIsNull() {
            addCriterion("si_specLi_type is null");
            return (Criteria) this;
        }

        public Criteria andSiSpecliTypeIsNotNull() {
            addCriterion("si_specLi_type is not null");
            return (Criteria) this;
        }

        public Criteria andSiSpecliTypeEqualTo(Integer value) {
            addCriterion("si_specLi_type =", value, "siSpecliType");
            return (Criteria) this;
        }

        public Criteria andSiSpecliTypeNotEqualTo(Integer value) {
            addCriterion("si_specLi_type <>", value, "siSpecliType");
            return (Criteria) this;
        }

        public Criteria andSiSpecliTypeGreaterThan(Integer value) {
            addCriterion("si_specLi_type >", value, "siSpecliType");
            return (Criteria) this;
        }

        public Criteria andSiSpecliTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("si_specLi_type >=", value, "siSpecliType");
            return (Criteria) this;
        }

        public Criteria andSiSpecliTypeLessThan(Integer value) {
            addCriterion("si_specLi_type <", value, "siSpecliType");
            return (Criteria) this;
        }

        public Criteria andSiSpecliTypeLessThanOrEqualTo(Integer value) {
            addCriterion("si_specLi_type <=", value, "siSpecliType");
            return (Criteria) this;
        }

        public Criteria andSiSpecliTypeIn(List<Integer> values) {
            addCriterion("si_specLi_type in", values, "siSpecliType");
            return (Criteria) this;
        }

        public Criteria andSiSpecliTypeNotIn(List<Integer> values) {
            addCriterion("si_specLi_type not in", values, "siSpecliType");
            return (Criteria) this;
        }

        public Criteria andSiSpecliTypeBetween(Integer value1, Integer value2) {
            addCriterion("si_specLi_type between", value1, value2, "siSpecliType");
            return (Criteria) this;
        }

        public Criteria andSiSpecliTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("si_specLi_type not between", value1, value2, "siSpecliType");
            return (Criteria) this;
        }

        public Criteria andSiStrIsNull() {
            addCriterion("si_str is null");
            return (Criteria) this;
        }

        public Criteria andSiStrIsNotNull() {
            addCriterion("si_str is not null");
            return (Criteria) this;
        }

        public Criteria andSiStrEqualTo(String value) {
            addCriterion("si_str =", value, "siStr");
            return (Criteria) this;
        }

        public Criteria andSiStrNotEqualTo(String value) {
            addCriterion("si_str <>", value, "siStr");
            return (Criteria) this;
        }

        public Criteria andSiStrGreaterThan(String value) {
            addCriterion("si_str >", value, "siStr");
            return (Criteria) this;
        }

        public Criteria andSiStrGreaterThanOrEqualTo(String value) {
            addCriterion("si_str >=", value, "siStr");
            return (Criteria) this;
        }

        public Criteria andSiStrLessThan(String value) {
            addCriterion("si_str <", value, "siStr");
            return (Criteria) this;
        }

        public Criteria andSiStrLessThanOrEqualTo(String value) {
            addCriterion("si_str <=", value, "siStr");
            return (Criteria) this;
        }

        public Criteria andSiStrLike(String value) {
            addCriterion("si_str like", value, "siStr");
            return (Criteria) this;
        }

        public Criteria andSiStrNotLike(String value) {
            addCriterion("si_str not like", value, "siStr");
            return (Criteria) this;
        }

        public Criteria andSiStrIn(List<String> values) {
            addCriterion("si_str in", values, "siStr");
            return (Criteria) this;
        }

        public Criteria andSiStrNotIn(List<String> values) {
            addCriterion("si_str not in", values, "siStr");
            return (Criteria) this;
        }

        public Criteria andSiStrBetween(String value1, String value2) {
            addCriterion("si_str between", value1, value2, "siStr");
            return (Criteria) this;
        }

        public Criteria andSiStrNotBetween(String value1, String value2) {
            addCriterion("si_str not between", value1, value2, "siStr");
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