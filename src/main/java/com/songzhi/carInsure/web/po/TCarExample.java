package com.songzhi.carInsure.web.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TCarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCarExample() {
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

        public Criteria andCarNoIsNull() {
            addCriterion("car_no is null");
            return (Criteria) this;
        }

        public Criteria andCarNoIsNotNull() {
            addCriterion("car_no is not null");
            return (Criteria) this;
        }

        public Criteria andCarNoEqualTo(String value) {
            addCriterion("car_no =", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoNotEqualTo(String value) {
            addCriterion("car_no <>", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoGreaterThan(String value) {
            addCriterion("car_no >", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoGreaterThanOrEqualTo(String value) {
            addCriterion("car_no >=", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoLessThan(String value) {
            addCriterion("car_no <", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoLessThanOrEqualTo(String value) {
            addCriterion("car_no <=", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoLike(String value) {
            addCriterion("car_no like", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoNotLike(String value) {
            addCriterion("car_no not like", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoIn(List<String> values) {
            addCriterion("car_no in", values, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoNotIn(List<String> values) {
            addCriterion("car_no not in", values, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoBetween(String value1, String value2) {
            addCriterion("car_no between", value1, value2, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoNotBetween(String value1, String value2) {
            addCriterion("car_no not between", value1, value2, "carNo");
            return (Criteria) this;
        }

        public Criteria andVinIsNull() {
            addCriterion("vin is null");
            return (Criteria) this;
        }

        public Criteria andVinIsNotNull() {
            addCriterion("vin is not null");
            return (Criteria) this;
        }

        public Criteria andVinEqualTo(String value) {
            addCriterion("vin =", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotEqualTo(String value) {
            addCriterion("vin <>", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinGreaterThan(String value) {
            addCriterion("vin >", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinGreaterThanOrEqualTo(String value) {
            addCriterion("vin >=", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLessThan(String value) {
            addCriterion("vin <", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLessThanOrEqualTo(String value) {
            addCriterion("vin <=", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLike(String value) {
            addCriterion("vin like", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotLike(String value) {
            addCriterion("vin not like", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinIn(List<String> values) {
            addCriterion("vin in", values, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotIn(List<String> values) {
            addCriterion("vin not in", values, "vin");
            return (Criteria) this;
        }

        public Criteria andVinBetween(String value1, String value2) {
            addCriterion("vin between", value1, value2, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotBetween(String value1, String value2) {
            addCriterion("vin not between", value1, value2, "vin");
            return (Criteria) this;
        }

        public Criteria andEngineNoIsNull() {
            addCriterion("engine_no is null");
            return (Criteria) this;
        }

        public Criteria andEngineNoIsNotNull() {
            addCriterion("engine_no is not null");
            return (Criteria) this;
        }

        public Criteria andEngineNoEqualTo(String value) {
            addCriterion("engine_no =", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoNotEqualTo(String value) {
            addCriterion("engine_no <>", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoGreaterThan(String value) {
            addCriterion("engine_no >", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoGreaterThanOrEqualTo(String value) {
            addCriterion("engine_no >=", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoLessThan(String value) {
            addCriterion("engine_no <", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoLessThanOrEqualTo(String value) {
            addCriterion("engine_no <=", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoLike(String value) {
            addCriterion("engine_no like", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoNotLike(String value) {
            addCriterion("engine_no not like", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoIn(List<String> values) {
            addCriterion("engine_no in", values, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoNotIn(List<String> values) {
            addCriterion("engine_no not in", values, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoBetween(String value1, String value2) {
            addCriterion("engine_no between", value1, value2, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoNotBetween(String value1, String value2) {
            addCriterion("engine_no not between", value1, value2, "engineNo");
            return (Criteria) this;
        }

        public Criteria andCPlateTypeCodeIsNull() {
            addCriterion("c_plate_type_code is null");
            return (Criteria) this;
        }

        public Criteria andCPlateTypeCodeIsNotNull() {
            addCriterion("c_plate_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andCPlateTypeCodeEqualTo(String value) {
            addCriterion("c_plate_type_code =", value, "cPlateTypeCode");
            return (Criteria) this;
        }

        public Criteria andCPlateTypeCodeNotEqualTo(String value) {
            addCriterion("c_plate_type_code <>", value, "cPlateTypeCode");
            return (Criteria) this;
        }

        public Criteria andCPlateTypeCodeGreaterThan(String value) {
            addCriterion("c_plate_type_code >", value, "cPlateTypeCode");
            return (Criteria) this;
        }

        public Criteria andCPlateTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("c_plate_type_code >=", value, "cPlateTypeCode");
            return (Criteria) this;
        }

        public Criteria andCPlateTypeCodeLessThan(String value) {
            addCriterion("c_plate_type_code <", value, "cPlateTypeCode");
            return (Criteria) this;
        }

        public Criteria andCPlateTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("c_plate_type_code <=", value, "cPlateTypeCode");
            return (Criteria) this;
        }

        public Criteria andCPlateTypeCodeLike(String value) {
            addCriterion("c_plate_type_code like", value, "cPlateTypeCode");
            return (Criteria) this;
        }

        public Criteria andCPlateTypeCodeNotLike(String value) {
            addCriterion("c_plate_type_code not like", value, "cPlateTypeCode");
            return (Criteria) this;
        }

        public Criteria andCPlateTypeCodeIn(List<String> values) {
            addCriterion("c_plate_type_code in", values, "cPlateTypeCode");
            return (Criteria) this;
        }

        public Criteria andCPlateTypeCodeNotIn(List<String> values) {
            addCriterion("c_plate_type_code not in", values, "cPlateTypeCode");
            return (Criteria) this;
        }

        public Criteria andCPlateTypeCodeBetween(String value1, String value2) {
            addCriterion("c_plate_type_code between", value1, value2, "cPlateTypeCode");
            return (Criteria) this;
        }

        public Criteria andCPlateTypeCodeNotBetween(String value1, String value2) {
            addCriterion("c_plate_type_code not between", value1, value2, "cPlateTypeCode");
            return (Criteria) this;
        }

        public Criteria andCPlateTypeIsNull() {
            addCriterion("c_plate_type is null");
            return (Criteria) this;
        }

        public Criteria andCPlateTypeIsNotNull() {
            addCriterion("c_plate_type is not null");
            return (Criteria) this;
        }

        public Criteria andCPlateTypeEqualTo(String value) {
            addCriterion("c_plate_type =", value, "cPlateType");
            return (Criteria) this;
        }

        public Criteria andCPlateTypeNotEqualTo(String value) {
            addCriterion("c_plate_type <>", value, "cPlateType");
            return (Criteria) this;
        }

        public Criteria andCPlateTypeGreaterThan(String value) {
            addCriterion("c_plate_type >", value, "cPlateType");
            return (Criteria) this;
        }

        public Criteria andCPlateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("c_plate_type >=", value, "cPlateType");
            return (Criteria) this;
        }

        public Criteria andCPlateTypeLessThan(String value) {
            addCriterion("c_plate_type <", value, "cPlateType");
            return (Criteria) this;
        }

        public Criteria andCPlateTypeLessThanOrEqualTo(String value) {
            addCriterion("c_plate_type <=", value, "cPlateType");
            return (Criteria) this;
        }

        public Criteria andCPlateTypeLike(String value) {
            addCriterion("c_plate_type like", value, "cPlateType");
            return (Criteria) this;
        }

        public Criteria andCPlateTypeNotLike(String value) {
            addCriterion("c_plate_type not like", value, "cPlateType");
            return (Criteria) this;
        }

        public Criteria andCPlateTypeIn(List<String> values) {
            addCriterion("c_plate_type in", values, "cPlateType");
            return (Criteria) this;
        }

        public Criteria andCPlateTypeNotIn(List<String> values) {
            addCriterion("c_plate_type not in", values, "cPlateType");
            return (Criteria) this;
        }

        public Criteria andCPlateTypeBetween(String value1, String value2) {
            addCriterion("c_plate_type between", value1, value2, "cPlateType");
            return (Criteria) this;
        }

        public Criteria andCPlateTypeNotBetween(String value1, String value2) {
            addCriterion("c_plate_type not between", value1, value2, "cPlateType");
            return (Criteria) this;
        }

        public Criteria andTFstRegYmIsNull() {
            addCriterion("t_fst_reg_ym is null");
            return (Criteria) this;
        }

        public Criteria andTFstRegYmIsNotNull() {
            addCriterion("t_fst_reg_ym is not null");
            return (Criteria) this;
        }

        public Criteria andTFstRegYmEqualTo(Date value) {
            addCriterion("t_fst_reg_ym =", value, "tFstRegYm");
            return (Criteria) this;
        }

        public Criteria andTFstRegYmNotEqualTo(Date value) {
            addCriterion("t_fst_reg_ym <>", value, "tFstRegYm");
            return (Criteria) this;
        }

        public Criteria andTFstRegYmGreaterThan(Date value) {
            addCriterion("t_fst_reg_ym >", value, "tFstRegYm");
            return (Criteria) this;
        }

        public Criteria andTFstRegYmGreaterThanOrEqualTo(Date value) {
            addCriterion("t_fst_reg_ym >=", value, "tFstRegYm");
            return (Criteria) this;
        }

        public Criteria andTFstRegYmLessThan(Date value) {
            addCriterion("t_fst_reg_ym <", value, "tFstRegYm");
            return (Criteria) this;
        }

        public Criteria andTFstRegYmLessThanOrEqualTo(Date value) {
            addCriterion("t_fst_reg_ym <=", value, "tFstRegYm");
            return (Criteria) this;
        }

        public Criteria andTFstRegYmIn(List<Date> values) {
            addCriterion("t_fst_reg_ym in", values, "tFstRegYm");
            return (Criteria) this;
        }

        public Criteria andTFstRegYmNotIn(List<Date> values) {
            addCriterion("t_fst_reg_ym not in", values, "tFstRegYm");
            return (Criteria) this;
        }

        public Criteria andTFstRegYmBetween(Date value1, Date value2) {
            addCriterion("t_fst_reg_ym between", value1, value2, "tFstRegYm");
            return (Criteria) this;
        }

        public Criteria andTFstRegYmNotBetween(Date value1, Date value2) {
            addCriterion("t_fst_reg_ym not between", value1, value2, "tFstRegYm");
            return (Criteria) this;
        }

        public Criteria andCUsageCdeCodeIsNull() {
            addCriterion("c_usage_cde_code is null");
            return (Criteria) this;
        }

        public Criteria andCUsageCdeCodeIsNotNull() {
            addCriterion("c_usage_cde_code is not null");
            return (Criteria) this;
        }

        public Criteria andCUsageCdeCodeEqualTo(String value) {
            addCriterion("c_usage_cde_code =", value, "cUsageCdeCode");
            return (Criteria) this;
        }

        public Criteria andCUsageCdeCodeNotEqualTo(String value) {
            addCriterion("c_usage_cde_code <>", value, "cUsageCdeCode");
            return (Criteria) this;
        }

        public Criteria andCUsageCdeCodeGreaterThan(String value) {
            addCriterion("c_usage_cde_code >", value, "cUsageCdeCode");
            return (Criteria) this;
        }

        public Criteria andCUsageCdeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("c_usage_cde_code >=", value, "cUsageCdeCode");
            return (Criteria) this;
        }

        public Criteria andCUsageCdeCodeLessThan(String value) {
            addCriterion("c_usage_cde_code <", value, "cUsageCdeCode");
            return (Criteria) this;
        }

        public Criteria andCUsageCdeCodeLessThanOrEqualTo(String value) {
            addCriterion("c_usage_cde_code <=", value, "cUsageCdeCode");
            return (Criteria) this;
        }

        public Criteria andCUsageCdeCodeLike(String value) {
            addCriterion("c_usage_cde_code like", value, "cUsageCdeCode");
            return (Criteria) this;
        }

        public Criteria andCUsageCdeCodeNotLike(String value) {
            addCriterion("c_usage_cde_code not like", value, "cUsageCdeCode");
            return (Criteria) this;
        }

        public Criteria andCUsageCdeCodeIn(List<String> values) {
            addCriterion("c_usage_cde_code in", values, "cUsageCdeCode");
            return (Criteria) this;
        }

        public Criteria andCUsageCdeCodeNotIn(List<String> values) {
            addCriterion("c_usage_cde_code not in", values, "cUsageCdeCode");
            return (Criteria) this;
        }

        public Criteria andCUsageCdeCodeBetween(String value1, String value2) {
            addCriterion("c_usage_cde_code between", value1, value2, "cUsageCdeCode");
            return (Criteria) this;
        }

        public Criteria andCUsageCdeCodeNotBetween(String value1, String value2) {
            addCriterion("c_usage_cde_code not between", value1, value2, "cUsageCdeCode");
            return (Criteria) this;
        }

        public Criteria andCUsageCdeIsNull() {
            addCriterion("c_usage_cde is null");
            return (Criteria) this;
        }

        public Criteria andCUsageCdeIsNotNull() {
            addCriterion("c_usage_cde is not null");
            return (Criteria) this;
        }

        public Criteria andCUsageCdeEqualTo(String value) {
            addCriterion("c_usage_cde =", value, "cUsageCde");
            return (Criteria) this;
        }

        public Criteria andCUsageCdeNotEqualTo(String value) {
            addCriterion("c_usage_cde <>", value, "cUsageCde");
            return (Criteria) this;
        }

        public Criteria andCUsageCdeGreaterThan(String value) {
            addCriterion("c_usage_cde >", value, "cUsageCde");
            return (Criteria) this;
        }

        public Criteria andCUsageCdeGreaterThanOrEqualTo(String value) {
            addCriterion("c_usage_cde >=", value, "cUsageCde");
            return (Criteria) this;
        }

        public Criteria andCUsageCdeLessThan(String value) {
            addCriterion("c_usage_cde <", value, "cUsageCde");
            return (Criteria) this;
        }

        public Criteria andCUsageCdeLessThanOrEqualTo(String value) {
            addCriterion("c_usage_cde <=", value, "cUsageCde");
            return (Criteria) this;
        }

        public Criteria andCUsageCdeLike(String value) {
            addCriterion("c_usage_cde like", value, "cUsageCde");
            return (Criteria) this;
        }

        public Criteria andCUsageCdeNotLike(String value) {
            addCriterion("c_usage_cde not like", value, "cUsageCde");
            return (Criteria) this;
        }

        public Criteria andCUsageCdeIn(List<String> values) {
            addCriterion("c_usage_cde in", values, "cUsageCde");
            return (Criteria) this;
        }

        public Criteria andCUsageCdeNotIn(List<String> values) {
            addCriterion("c_usage_cde not in", values, "cUsageCde");
            return (Criteria) this;
        }

        public Criteria andCUsageCdeBetween(String value1, String value2) {
            addCriterion("c_usage_cde between", value1, value2, "cUsageCde");
            return (Criteria) this;
        }

        public Criteria andCUsageCdeNotBetween(String value1, String value2) {
            addCriterion("c_usage_cde not between", value1, value2, "cUsageCde");
            return (Criteria) this;
        }

        public Criteria andCOpenCdeCodeIsNull() {
            addCriterion("c_open_cde_code is null");
            return (Criteria) this;
        }

        public Criteria andCOpenCdeCodeIsNotNull() {
            addCriterion("c_open_cde_code is not null");
            return (Criteria) this;
        }

        public Criteria andCOpenCdeCodeEqualTo(String value) {
            addCriterion("c_open_cde_code =", value, "cOpenCdeCode");
            return (Criteria) this;
        }

        public Criteria andCOpenCdeCodeNotEqualTo(String value) {
            addCriterion("c_open_cde_code <>", value, "cOpenCdeCode");
            return (Criteria) this;
        }

        public Criteria andCOpenCdeCodeGreaterThan(String value) {
            addCriterion("c_open_cde_code >", value, "cOpenCdeCode");
            return (Criteria) this;
        }

        public Criteria andCOpenCdeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("c_open_cde_code >=", value, "cOpenCdeCode");
            return (Criteria) this;
        }

        public Criteria andCOpenCdeCodeLessThan(String value) {
            addCriterion("c_open_cde_code <", value, "cOpenCdeCode");
            return (Criteria) this;
        }

        public Criteria andCOpenCdeCodeLessThanOrEqualTo(String value) {
            addCriterion("c_open_cde_code <=", value, "cOpenCdeCode");
            return (Criteria) this;
        }

        public Criteria andCOpenCdeCodeLike(String value) {
            addCriterion("c_open_cde_code like", value, "cOpenCdeCode");
            return (Criteria) this;
        }

        public Criteria andCOpenCdeCodeNotLike(String value) {
            addCriterion("c_open_cde_code not like", value, "cOpenCdeCode");
            return (Criteria) this;
        }

        public Criteria andCOpenCdeCodeIn(List<String> values) {
            addCriterion("c_open_cde_code in", values, "cOpenCdeCode");
            return (Criteria) this;
        }

        public Criteria andCOpenCdeCodeNotIn(List<String> values) {
            addCriterion("c_open_cde_code not in", values, "cOpenCdeCode");
            return (Criteria) this;
        }

        public Criteria andCOpenCdeCodeBetween(String value1, String value2) {
            addCriterion("c_open_cde_code between", value1, value2, "cOpenCdeCode");
            return (Criteria) this;
        }

        public Criteria andCOpenCdeCodeNotBetween(String value1, String value2) {
            addCriterion("c_open_cde_code not between", value1, value2, "cOpenCdeCode");
            return (Criteria) this;
        }

        public Criteria andCOpenCdeIsNull() {
            addCriterion("c_open_cde is null");
            return (Criteria) this;
        }

        public Criteria andCOpenCdeIsNotNull() {
            addCriterion("c_open_cde is not null");
            return (Criteria) this;
        }

        public Criteria andCOpenCdeEqualTo(String value) {
            addCriterion("c_open_cde =", value, "cOpenCde");
            return (Criteria) this;
        }

        public Criteria andCOpenCdeNotEqualTo(String value) {
            addCriterion("c_open_cde <>", value, "cOpenCde");
            return (Criteria) this;
        }

        public Criteria andCOpenCdeGreaterThan(String value) {
            addCriterion("c_open_cde >", value, "cOpenCde");
            return (Criteria) this;
        }

        public Criteria andCOpenCdeGreaterThanOrEqualTo(String value) {
            addCriterion("c_open_cde >=", value, "cOpenCde");
            return (Criteria) this;
        }

        public Criteria andCOpenCdeLessThan(String value) {
            addCriterion("c_open_cde <", value, "cOpenCde");
            return (Criteria) this;
        }

        public Criteria andCOpenCdeLessThanOrEqualTo(String value) {
            addCriterion("c_open_cde <=", value, "cOpenCde");
            return (Criteria) this;
        }

        public Criteria andCOpenCdeLike(String value) {
            addCriterion("c_open_cde like", value, "cOpenCde");
            return (Criteria) this;
        }

        public Criteria andCOpenCdeNotLike(String value) {
            addCriterion("c_open_cde not like", value, "cOpenCde");
            return (Criteria) this;
        }

        public Criteria andCOpenCdeIn(List<String> values) {
            addCriterion("c_open_cde in", values, "cOpenCde");
            return (Criteria) this;
        }

        public Criteria andCOpenCdeNotIn(List<String> values) {
            addCriterion("c_open_cde not in", values, "cOpenCde");
            return (Criteria) this;
        }

        public Criteria andCOpenCdeBetween(String value1, String value2) {
            addCriterion("c_open_cde between", value1, value2, "cOpenCde");
            return (Criteria) this;
        }

        public Criteria andCOpenCdeNotBetween(String value1, String value2) {
            addCriterion("c_open_cde not between", value1, value2, "cOpenCde");
            return (Criteria) this;
        }

        public Criteria andCCarTypeCodeIsNull() {
            addCriterion("c_car_type_code is null");
            return (Criteria) this;
        }

        public Criteria andCCarTypeCodeIsNotNull() {
            addCriterion("c_car_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andCCarTypeCodeEqualTo(String value) {
            addCriterion("c_car_type_code =", value, "cCarTypeCode");
            return (Criteria) this;
        }

        public Criteria andCCarTypeCodeNotEqualTo(String value) {
            addCriterion("c_car_type_code <>", value, "cCarTypeCode");
            return (Criteria) this;
        }

        public Criteria andCCarTypeCodeGreaterThan(String value) {
            addCriterion("c_car_type_code >", value, "cCarTypeCode");
            return (Criteria) this;
        }

        public Criteria andCCarTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("c_car_type_code >=", value, "cCarTypeCode");
            return (Criteria) this;
        }

        public Criteria andCCarTypeCodeLessThan(String value) {
            addCriterion("c_car_type_code <", value, "cCarTypeCode");
            return (Criteria) this;
        }

        public Criteria andCCarTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("c_car_type_code <=", value, "cCarTypeCode");
            return (Criteria) this;
        }

        public Criteria andCCarTypeCodeLike(String value) {
            addCriterion("c_car_type_code like", value, "cCarTypeCode");
            return (Criteria) this;
        }

        public Criteria andCCarTypeCodeNotLike(String value) {
            addCriterion("c_car_type_code not like", value, "cCarTypeCode");
            return (Criteria) this;
        }

        public Criteria andCCarTypeCodeIn(List<String> values) {
            addCriterion("c_car_type_code in", values, "cCarTypeCode");
            return (Criteria) this;
        }

        public Criteria andCCarTypeCodeNotIn(List<String> values) {
            addCriterion("c_car_type_code not in", values, "cCarTypeCode");
            return (Criteria) this;
        }

        public Criteria andCCarTypeCodeBetween(String value1, String value2) {
            addCriterion("c_car_type_code between", value1, value2, "cCarTypeCode");
            return (Criteria) this;
        }

        public Criteria andCCarTypeCodeNotBetween(String value1, String value2) {
            addCriterion("c_car_type_code not between", value1, value2, "cCarTypeCode");
            return (Criteria) this;
        }

        public Criteria andCCarTypeIsNull() {
            addCriterion("c_car_type is null");
            return (Criteria) this;
        }

        public Criteria andCCarTypeIsNotNull() {
            addCriterion("c_car_type is not null");
            return (Criteria) this;
        }

        public Criteria andCCarTypeEqualTo(String value) {
            addCriterion("c_car_type =", value, "cCarType");
            return (Criteria) this;
        }

        public Criteria andCCarTypeNotEqualTo(String value) {
            addCriterion("c_car_type <>", value, "cCarType");
            return (Criteria) this;
        }

        public Criteria andCCarTypeGreaterThan(String value) {
            addCriterion("c_car_type >", value, "cCarType");
            return (Criteria) this;
        }

        public Criteria andCCarTypeGreaterThanOrEqualTo(String value) {
            addCriterion("c_car_type >=", value, "cCarType");
            return (Criteria) this;
        }

        public Criteria andCCarTypeLessThan(String value) {
            addCriterion("c_car_type <", value, "cCarType");
            return (Criteria) this;
        }

        public Criteria andCCarTypeLessThanOrEqualTo(String value) {
            addCriterion("c_car_type <=", value, "cCarType");
            return (Criteria) this;
        }

        public Criteria andCCarTypeLike(String value) {
            addCriterion("c_car_type like", value, "cCarType");
            return (Criteria) this;
        }

        public Criteria andCCarTypeNotLike(String value) {
            addCriterion("c_car_type not like", value, "cCarType");
            return (Criteria) this;
        }

        public Criteria andCCarTypeIn(List<String> values) {
            addCriterion("c_car_type in", values, "cCarType");
            return (Criteria) this;
        }

        public Criteria andCCarTypeNotIn(List<String> values) {
            addCriterion("c_car_type not in", values, "cCarType");
            return (Criteria) this;
        }

        public Criteria andCCarTypeBetween(String value1, String value2) {
            addCriterion("c_car_type between", value1, value2, "cCarType");
            return (Criteria) this;
        }

        public Criteria andCCarTypeNotBetween(String value1, String value2) {
            addCriterion("c_car_type not between", value1, value2, "cCarType");
            return (Criteria) this;
        }

        public Criteria andCRefineCodeIsNull() {
            addCriterion("c_refine_code is null");
            return (Criteria) this;
        }

        public Criteria andCRefineCodeIsNotNull() {
            addCriterion("c_refine_code is not null");
            return (Criteria) this;
        }

        public Criteria andCRefineCodeEqualTo(String value) {
            addCriterion("c_refine_code =", value, "cRefineCode");
            return (Criteria) this;
        }

        public Criteria andCRefineCodeNotEqualTo(String value) {
            addCriterion("c_refine_code <>", value, "cRefineCode");
            return (Criteria) this;
        }

        public Criteria andCRefineCodeGreaterThan(String value) {
            addCriterion("c_refine_code >", value, "cRefineCode");
            return (Criteria) this;
        }

        public Criteria andCRefineCodeGreaterThanOrEqualTo(String value) {
            addCriterion("c_refine_code >=", value, "cRefineCode");
            return (Criteria) this;
        }

        public Criteria andCRefineCodeLessThan(String value) {
            addCriterion("c_refine_code <", value, "cRefineCode");
            return (Criteria) this;
        }

        public Criteria andCRefineCodeLessThanOrEqualTo(String value) {
            addCriterion("c_refine_code <=", value, "cRefineCode");
            return (Criteria) this;
        }

        public Criteria andCRefineCodeLike(String value) {
            addCriterion("c_refine_code like", value, "cRefineCode");
            return (Criteria) this;
        }

        public Criteria andCRefineCodeNotLike(String value) {
            addCriterion("c_refine_code not like", value, "cRefineCode");
            return (Criteria) this;
        }

        public Criteria andCRefineCodeIn(List<String> values) {
            addCriterion("c_refine_code in", values, "cRefineCode");
            return (Criteria) this;
        }

        public Criteria andCRefineCodeNotIn(List<String> values) {
            addCriterion("c_refine_code not in", values, "cRefineCode");
            return (Criteria) this;
        }

        public Criteria andCRefineCodeBetween(String value1, String value2) {
            addCriterion("c_refine_code between", value1, value2, "cRefineCode");
            return (Criteria) this;
        }

        public Criteria andCRefineCodeNotBetween(String value1, String value2) {
            addCriterion("c_refine_code not between", value1, value2, "cRefineCode");
            return (Criteria) this;
        }

        public Criteria andCRefineIsNull() {
            addCriterion("c_refine is null");
            return (Criteria) this;
        }

        public Criteria andCRefineIsNotNull() {
            addCriterion("c_refine is not null");
            return (Criteria) this;
        }

        public Criteria andCRefineEqualTo(String value) {
            addCriterion("c_refine =", value, "cRefine");
            return (Criteria) this;
        }

        public Criteria andCRefineNotEqualTo(String value) {
            addCriterion("c_refine <>", value, "cRefine");
            return (Criteria) this;
        }

        public Criteria andCRefineGreaterThan(String value) {
            addCriterion("c_refine >", value, "cRefine");
            return (Criteria) this;
        }

        public Criteria andCRefineGreaterThanOrEqualTo(String value) {
            addCriterion("c_refine >=", value, "cRefine");
            return (Criteria) this;
        }

        public Criteria andCRefineLessThan(String value) {
            addCriterion("c_refine <", value, "cRefine");
            return (Criteria) this;
        }

        public Criteria andCRefineLessThanOrEqualTo(String value) {
            addCriterion("c_refine <=", value, "cRefine");
            return (Criteria) this;
        }

        public Criteria andCRefineLike(String value) {
            addCriterion("c_refine like", value, "cRefine");
            return (Criteria) this;
        }

        public Criteria andCRefineNotLike(String value) {
            addCriterion("c_refine not like", value, "cRefine");
            return (Criteria) this;
        }

        public Criteria andCRefineIn(List<String> values) {
            addCriterion("c_refine in", values, "cRefine");
            return (Criteria) this;
        }

        public Criteria andCRefineNotIn(List<String> values) {
            addCriterion("c_refine not in", values, "cRefine");
            return (Criteria) this;
        }

        public Criteria andCRefineBetween(String value1, String value2) {
            addCriterion("c_refine between", value1, value2, "cRefine");
            return (Criteria) this;
        }

        public Criteria andCRefineNotBetween(String value1, String value2) {
            addCriterion("c_refine not between", value1, value2, "cRefine");
            return (Criteria) this;
        }

        public Criteria andCDriTypCodeIsNull() {
            addCriterion("c_dri_typ_code is null");
            return (Criteria) this;
        }

        public Criteria andCDriTypCodeIsNotNull() {
            addCriterion("c_dri_typ_code is not null");
            return (Criteria) this;
        }

        public Criteria andCDriTypCodeEqualTo(String value) {
            addCriterion("c_dri_typ_code =", value, "cDriTypCode");
            return (Criteria) this;
        }

        public Criteria andCDriTypCodeNotEqualTo(String value) {
            addCriterion("c_dri_typ_code <>", value, "cDriTypCode");
            return (Criteria) this;
        }

        public Criteria andCDriTypCodeGreaterThan(String value) {
            addCriterion("c_dri_typ_code >", value, "cDriTypCode");
            return (Criteria) this;
        }

        public Criteria andCDriTypCodeGreaterThanOrEqualTo(String value) {
            addCriterion("c_dri_typ_code >=", value, "cDriTypCode");
            return (Criteria) this;
        }

        public Criteria andCDriTypCodeLessThan(String value) {
            addCriterion("c_dri_typ_code <", value, "cDriTypCode");
            return (Criteria) this;
        }

        public Criteria andCDriTypCodeLessThanOrEqualTo(String value) {
            addCriterion("c_dri_typ_code <=", value, "cDriTypCode");
            return (Criteria) this;
        }

        public Criteria andCDriTypCodeLike(String value) {
            addCriterion("c_dri_typ_code like", value, "cDriTypCode");
            return (Criteria) this;
        }

        public Criteria andCDriTypCodeNotLike(String value) {
            addCriterion("c_dri_typ_code not like", value, "cDriTypCode");
            return (Criteria) this;
        }

        public Criteria andCDriTypCodeIn(List<String> values) {
            addCriterion("c_dri_typ_code in", values, "cDriTypCode");
            return (Criteria) this;
        }

        public Criteria andCDriTypCodeNotIn(List<String> values) {
            addCriterion("c_dri_typ_code not in", values, "cDriTypCode");
            return (Criteria) this;
        }

        public Criteria andCDriTypCodeBetween(String value1, String value2) {
            addCriterion("c_dri_typ_code between", value1, value2, "cDriTypCode");
            return (Criteria) this;
        }

        public Criteria andCDriTypCodeNotBetween(String value1, String value2) {
            addCriterion("c_dri_typ_code not between", value1, value2, "cDriTypCode");
            return (Criteria) this;
        }

        public Criteria andCDriTypIsNull() {
            addCriterion("c__dri_typ is null");
            return (Criteria) this;
        }

        public Criteria andCDriTypIsNotNull() {
            addCriterion("c__dri_typ is not null");
            return (Criteria) this;
        }

        public Criteria andCDriTypEqualTo(String value) {
            addCriterion("c__dri_typ =", value, "cDriTyp");
            return (Criteria) this;
        }

        public Criteria andCDriTypNotEqualTo(String value) {
            addCriterion("c__dri_typ <>", value, "cDriTyp");
            return (Criteria) this;
        }

        public Criteria andCDriTypGreaterThan(String value) {
            addCriterion("c__dri_typ >", value, "cDriTyp");
            return (Criteria) this;
        }

        public Criteria andCDriTypGreaterThanOrEqualTo(String value) {
            addCriterion("c__dri_typ >=", value, "cDriTyp");
            return (Criteria) this;
        }

        public Criteria andCDriTypLessThan(String value) {
            addCriterion("c__dri_typ <", value, "cDriTyp");
            return (Criteria) this;
        }

        public Criteria andCDriTypLessThanOrEqualTo(String value) {
            addCriterion("c__dri_typ <=", value, "cDriTyp");
            return (Criteria) this;
        }

        public Criteria andCDriTypLike(String value) {
            addCriterion("c__dri_typ like", value, "cDriTyp");
            return (Criteria) this;
        }

        public Criteria andCDriTypNotLike(String value) {
            addCriterion("c__dri_typ not like", value, "cDriTyp");
            return (Criteria) this;
        }

        public Criteria andCDriTypIn(List<String> values) {
            addCriterion("c__dri_typ in", values, "cDriTyp");
            return (Criteria) this;
        }

        public Criteria andCDriTypNotIn(List<String> values) {
            addCriterion("c__dri_typ not in", values, "cDriTyp");
            return (Criteria) this;
        }

        public Criteria andCDriTypBetween(String value1, String value2) {
            addCriterion("c__dri_typ between", value1, value2, "cDriTyp");
            return (Criteria) this;
        }

        public Criteria andCDriTypNotBetween(String value1, String value2) {
            addCriterion("c__dri_typ not between", value1, value2, "cDriTyp");
            return (Criteria) this;
        }

        public Criteria andCModelNameIsNull() {
            addCriterion("c_model_name is null");
            return (Criteria) this;
        }

        public Criteria andCModelNameIsNotNull() {
            addCriterion("c_model_name is not null");
            return (Criteria) this;
        }

        public Criteria andCModelNameEqualTo(String value) {
            addCriterion("c_model_name =", value, "cModelName");
            return (Criteria) this;
        }

        public Criteria andCModelNameNotEqualTo(String value) {
            addCriterion("c_model_name <>", value, "cModelName");
            return (Criteria) this;
        }

        public Criteria andCModelNameGreaterThan(String value) {
            addCriterion("c_model_name >", value, "cModelName");
            return (Criteria) this;
        }

        public Criteria andCModelNameGreaterThanOrEqualTo(String value) {
            addCriterion("c_model_name >=", value, "cModelName");
            return (Criteria) this;
        }

        public Criteria andCModelNameLessThan(String value) {
            addCriterion("c_model_name <", value, "cModelName");
            return (Criteria) this;
        }

        public Criteria andCModelNameLessThanOrEqualTo(String value) {
            addCriterion("c_model_name <=", value, "cModelName");
            return (Criteria) this;
        }

        public Criteria andCModelNameLike(String value) {
            addCriterion("c_model_name like", value, "cModelName");
            return (Criteria) this;
        }

        public Criteria andCModelNameNotLike(String value) {
            addCriterion("c_model_name not like", value, "cModelName");
            return (Criteria) this;
        }

        public Criteria andCModelNameIn(List<String> values) {
            addCriterion("c_model_name in", values, "cModelName");
            return (Criteria) this;
        }

        public Criteria andCModelNameNotIn(List<String> values) {
            addCriterion("c_model_name not in", values, "cModelName");
            return (Criteria) this;
        }

        public Criteria andCModelNameBetween(String value1, String value2) {
            addCriterion("c_model_name between", value1, value2, "cModelName");
            return (Criteria) this;
        }

        public Criteria andCModelNameNotBetween(String value1, String value2) {
            addCriterion("c_model_name not between", value1, value2, "cModelName");
            return (Criteria) this;
        }

        public Criteria andFChinaNameIsNull() {
            addCriterion("f_china_name is null");
            return (Criteria) this;
        }

        public Criteria andFChinaNameIsNotNull() {
            addCriterion("f_china_name is not null");
            return (Criteria) this;
        }

        public Criteria andFChinaNameEqualTo(String value) {
            addCriterion("f_china_name =", value, "fChinaName");
            return (Criteria) this;
        }

        public Criteria andFChinaNameNotEqualTo(String value) {
            addCriterion("f_china_name <>", value, "fChinaName");
            return (Criteria) this;
        }

        public Criteria andFChinaNameGreaterThan(String value) {
            addCriterion("f_china_name >", value, "fChinaName");
            return (Criteria) this;
        }

        public Criteria andFChinaNameGreaterThanOrEqualTo(String value) {
            addCriterion("f_china_name >=", value, "fChinaName");
            return (Criteria) this;
        }

        public Criteria andFChinaNameLessThan(String value) {
            addCriterion("f_china_name <", value, "fChinaName");
            return (Criteria) this;
        }

        public Criteria andFChinaNameLessThanOrEqualTo(String value) {
            addCriterion("f_china_name <=", value, "fChinaName");
            return (Criteria) this;
        }

        public Criteria andFChinaNameLike(String value) {
            addCriterion("f_china_name like", value, "fChinaName");
            return (Criteria) this;
        }

        public Criteria andFChinaNameNotLike(String value) {
            addCriterion("f_china_name not like", value, "fChinaName");
            return (Criteria) this;
        }

        public Criteria andFChinaNameIn(List<String> values) {
            addCriterion("f_china_name in", values, "fChinaName");
            return (Criteria) this;
        }

        public Criteria andFChinaNameNotIn(List<String> values) {
            addCriterion("f_china_name not in", values, "fChinaName");
            return (Criteria) this;
        }

        public Criteria andFChinaNameBetween(String value1, String value2) {
            addCriterion("f_china_name between", value1, value2, "fChinaName");
            return (Criteria) this;
        }

        public Criteria andFChinaNameNotBetween(String value1, String value2) {
            addCriterion("f_china_name not between", value1, value2, "fChinaName");
            return (Criteria) this;
        }

        public Criteria andCChinaNameIsNull() {
            addCriterion("c_china_name is null");
            return (Criteria) this;
        }

        public Criteria andCChinaNameIsNotNull() {
            addCriterion("c_china_name is not null");
            return (Criteria) this;
        }

        public Criteria andCChinaNameEqualTo(String value) {
            addCriterion("c_china_name =", value, "cChinaName");
            return (Criteria) this;
        }

        public Criteria andCChinaNameNotEqualTo(String value) {
            addCriterion("c_china_name <>", value, "cChinaName");
            return (Criteria) this;
        }

        public Criteria andCChinaNameGreaterThan(String value) {
            addCriterion("c_china_name >", value, "cChinaName");
            return (Criteria) this;
        }

        public Criteria andCChinaNameGreaterThanOrEqualTo(String value) {
            addCriterion("c_china_name >=", value, "cChinaName");
            return (Criteria) this;
        }

        public Criteria andCChinaNameLessThan(String value) {
            addCriterion("c_china_name <", value, "cChinaName");
            return (Criteria) this;
        }

        public Criteria andCChinaNameLessThanOrEqualTo(String value) {
            addCriterion("c_china_name <=", value, "cChinaName");
            return (Criteria) this;
        }

        public Criteria andCChinaNameLike(String value) {
            addCriterion("c_china_name like", value, "cChinaName");
            return (Criteria) this;
        }

        public Criteria andCChinaNameNotLike(String value) {
            addCriterion("c_china_name not like", value, "cChinaName");
            return (Criteria) this;
        }

        public Criteria andCChinaNameIn(List<String> values) {
            addCriterion("c_china_name in", values, "cChinaName");
            return (Criteria) this;
        }

        public Criteria andCChinaNameNotIn(List<String> values) {
            addCriterion("c_china_name not in", values, "cChinaName");
            return (Criteria) this;
        }

        public Criteria andCChinaNameBetween(String value1, String value2) {
            addCriterion("c_china_name between", value1, value2, "cChinaName");
            return (Criteria) this;
        }

        public Criteria andCChinaNameNotBetween(String value1, String value2) {
            addCriterion("c_china_name not between", value1, value2, "cChinaName");
            return (Criteria) this;
        }

        public Criteria andNPowerIsNull() {
            addCriterion("n_power is null");
            return (Criteria) this;
        }

        public Criteria andNPowerIsNotNull() {
            addCriterion("n_power is not null");
            return (Criteria) this;
        }

        public Criteria andNPowerEqualTo(String value) {
            addCriterion("n_power =", value, "nPower");
            return (Criteria) this;
        }

        public Criteria andNPowerNotEqualTo(String value) {
            addCriterion("n_power <>", value, "nPower");
            return (Criteria) this;
        }

        public Criteria andNPowerGreaterThan(String value) {
            addCriterion("n_power >", value, "nPower");
            return (Criteria) this;
        }

        public Criteria andNPowerGreaterThanOrEqualTo(String value) {
            addCriterion("n_power >=", value, "nPower");
            return (Criteria) this;
        }

        public Criteria andNPowerLessThan(String value) {
            addCriterion("n_power <", value, "nPower");
            return (Criteria) this;
        }

        public Criteria andNPowerLessThanOrEqualTo(String value) {
            addCriterion("n_power <=", value, "nPower");
            return (Criteria) this;
        }

        public Criteria andNPowerLike(String value) {
            addCriterion("n_power like", value, "nPower");
            return (Criteria) this;
        }

        public Criteria andNPowerNotLike(String value) {
            addCriterion("n_power not like", value, "nPower");
            return (Criteria) this;
        }

        public Criteria andNPowerIn(List<String> values) {
            addCriterion("n_power in", values, "nPower");
            return (Criteria) this;
        }

        public Criteria andNPowerNotIn(List<String> values) {
            addCriterion("n_power not in", values, "nPower");
            return (Criteria) this;
        }

        public Criteria andNPowerBetween(String value1, String value2) {
            addCriterion("n_power between", value1, value2, "nPower");
            return (Criteria) this;
        }

        public Criteria andNPowerNotBetween(String value1, String value2) {
            addCriterion("n_power not between", value1, value2, "nPower");
            return (Criteria) this;
        }

        public Criteria andCMadeTimeIsNull() {
            addCriterion("c_made_time is null");
            return (Criteria) this;
        }

        public Criteria andCMadeTimeIsNotNull() {
            addCriterion("c_made_time is not null");
            return (Criteria) this;
        }

        public Criteria andCMadeTimeEqualTo(Date value) {
            addCriterion("c_made_time =", value, "cMadeTime");
            return (Criteria) this;
        }

        public Criteria andCMadeTimeNotEqualTo(Date value) {
            addCriterion("c_made_time <>", value, "cMadeTime");
            return (Criteria) this;
        }

        public Criteria andCMadeTimeGreaterThan(Date value) {
            addCriterion("c_made_time >", value, "cMadeTime");
            return (Criteria) this;
        }

        public Criteria andCMadeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("c_made_time >=", value, "cMadeTime");
            return (Criteria) this;
        }

        public Criteria andCMadeTimeLessThan(Date value) {
            addCriterion("c_made_time <", value, "cMadeTime");
            return (Criteria) this;
        }

        public Criteria andCMadeTimeLessThanOrEqualTo(Date value) {
            addCriterion("c_made_time <=", value, "cMadeTime");
            return (Criteria) this;
        }

        public Criteria andCMadeTimeIn(List<Date> values) {
            addCriterion("c_made_time in", values, "cMadeTime");
            return (Criteria) this;
        }

        public Criteria andCMadeTimeNotIn(List<Date> values) {
            addCriterion("c_made_time not in", values, "cMadeTime");
            return (Criteria) this;
        }

        public Criteria andCMadeTimeBetween(Date value1, Date value2) {
            addCriterion("c_made_time between", value1, value2, "cMadeTime");
            return (Criteria) this;
        }

        public Criteria andCMadeTimeNotBetween(Date value1, Date value2) {
            addCriterion("c_made_time not between", value1, value2, "cMadeTime");
            return (Criteria) this;
        }

        public Criteria andCGiveTimeIsNull() {
            addCriterion("c_give_time is null");
            return (Criteria) this;
        }

        public Criteria andCGiveTimeIsNotNull() {
            addCriterion("c_give_time is not null");
            return (Criteria) this;
        }

        public Criteria andCGiveTimeEqualTo(Date value) {
            addCriterion("c_give_time =", value, "cGiveTime");
            return (Criteria) this;
        }

        public Criteria andCGiveTimeNotEqualTo(Date value) {
            addCriterion("c_give_time <>", value, "cGiveTime");
            return (Criteria) this;
        }

        public Criteria andCGiveTimeGreaterThan(Date value) {
            addCriterion("c_give_time >", value, "cGiveTime");
            return (Criteria) this;
        }

        public Criteria andCGiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("c_give_time >=", value, "cGiveTime");
            return (Criteria) this;
        }

        public Criteria andCGiveTimeLessThan(Date value) {
            addCriterion("c_give_time <", value, "cGiveTime");
            return (Criteria) this;
        }

        public Criteria andCGiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("c_give_time <=", value, "cGiveTime");
            return (Criteria) this;
        }

        public Criteria andCGiveTimeIn(List<Date> values) {
            addCriterion("c_give_time in", values, "cGiveTime");
            return (Criteria) this;
        }

        public Criteria andCGiveTimeNotIn(List<Date> values) {
            addCriterion("c_give_time not in", values, "cGiveTime");
            return (Criteria) this;
        }

        public Criteria andCGiveTimeBetween(Date value1, Date value2) {
            addCriterion("c_give_time between", value1, value2, "cGiveTime");
            return (Criteria) this;
        }

        public Criteria andCGiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("c_give_time not between", value1, value2, "cGiveTime");
            return (Criteria) this;
        }

        public Criteria andGRoadAwayIsNull() {
            addCriterion("g_road_away is null");
            return (Criteria) this;
        }

        public Criteria andGRoadAwayIsNotNull() {
            addCriterion("g_road_away is not null");
            return (Criteria) this;
        }

        public Criteria andGRoadAwayEqualTo(String value) {
            addCriterion("g_road_away =", value, "gRoadAway");
            return (Criteria) this;
        }

        public Criteria andGRoadAwayNotEqualTo(String value) {
            addCriterion("g_road_away <>", value, "gRoadAway");
            return (Criteria) this;
        }

        public Criteria andGRoadAwayGreaterThan(String value) {
            addCriterion("g_road_away >", value, "gRoadAway");
            return (Criteria) this;
        }

        public Criteria andGRoadAwayGreaterThanOrEqualTo(String value) {
            addCriterion("g_road_away >=", value, "gRoadAway");
            return (Criteria) this;
        }

        public Criteria andGRoadAwayLessThan(String value) {
            addCriterion("g_road_away <", value, "gRoadAway");
            return (Criteria) this;
        }

        public Criteria andGRoadAwayLessThanOrEqualTo(String value) {
            addCriterion("g_road_away <=", value, "gRoadAway");
            return (Criteria) this;
        }

        public Criteria andGRoadAwayLike(String value) {
            addCriterion("g_road_away like", value, "gRoadAway");
            return (Criteria) this;
        }

        public Criteria andGRoadAwayNotLike(String value) {
            addCriterion("g_road_away not like", value, "gRoadAway");
            return (Criteria) this;
        }

        public Criteria andGRoadAwayIn(List<String> values) {
            addCriterion("g_road_away in", values, "gRoadAway");
            return (Criteria) this;
        }

        public Criteria andGRoadAwayNotIn(List<String> values) {
            addCriterion("g_road_away not in", values, "gRoadAway");
            return (Criteria) this;
        }

        public Criteria andGRoadAwayBetween(String value1, String value2) {
            addCriterion("g_road_away between", value1, value2, "gRoadAway");
            return (Criteria) this;
        }

        public Criteria andGRoadAwayNotBetween(String value1, String value2) {
            addCriterion("g_road_away not between", value1, value2, "gRoadAway");
            return (Criteria) this;
        }

        public Criteria andCFromTimeIsNull() {
            addCriterion("c_from_time is null");
            return (Criteria) this;
        }

        public Criteria andCFromTimeIsNotNull() {
            addCriterion("c_from_time is not null");
            return (Criteria) this;
        }

        public Criteria andCFromTimeEqualTo(Date value) {
            addCriterion("c_from_time =", value, "cFromTime");
            return (Criteria) this;
        }

        public Criteria andCFromTimeNotEqualTo(Date value) {
            addCriterion("c_from_time <>", value, "cFromTime");
            return (Criteria) this;
        }

        public Criteria andCFromTimeGreaterThan(Date value) {
            addCriterion("c_from_time >", value, "cFromTime");
            return (Criteria) this;
        }

        public Criteria andCFromTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("c_from_time >=", value, "cFromTime");
            return (Criteria) this;
        }

        public Criteria andCFromTimeLessThan(Date value) {
            addCriterion("c_from_time <", value, "cFromTime");
            return (Criteria) this;
        }

        public Criteria andCFromTimeLessThanOrEqualTo(Date value) {
            addCriterion("c_from_time <=", value, "cFromTime");
            return (Criteria) this;
        }

        public Criteria andCFromTimeIn(List<Date> values) {
            addCriterion("c_from_time in", values, "cFromTime");
            return (Criteria) this;
        }

        public Criteria andCFromTimeNotIn(List<Date> values) {
            addCriterion("c_from_time not in", values, "cFromTime");
            return (Criteria) this;
        }

        public Criteria andCFromTimeBetween(Date value1, Date value2) {
            addCriterion("c_from_time between", value1, value2, "cFromTime");
            return (Criteria) this;
        }

        public Criteria andCFromTimeNotBetween(Date value1, Date value2) {
            addCriterion("c_from_time not between", value1, value2, "cFromTime");
            return (Criteria) this;
        }

        public Criteria andCStartTimeIsNull() {
            addCriterion("c_start_time is null");
            return (Criteria) this;
        }

        public Criteria andCStartTimeIsNotNull() {
            addCriterion("c_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andCStartTimeEqualTo(Date value) {
            addCriterion("c_start_time =", value, "cStartTime");
            return (Criteria) this;
        }

        public Criteria andCStartTimeNotEqualTo(Date value) {
            addCriterion("c_start_time <>", value, "cStartTime");
            return (Criteria) this;
        }

        public Criteria andCStartTimeGreaterThan(Date value) {
            addCriterion("c_start_time >", value, "cStartTime");
            return (Criteria) this;
        }

        public Criteria andCStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("c_start_time >=", value, "cStartTime");
            return (Criteria) this;
        }

        public Criteria andCStartTimeLessThan(Date value) {
            addCriterion("c_start_time <", value, "cStartTime");
            return (Criteria) this;
        }

        public Criteria andCStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("c_start_time <=", value, "cStartTime");
            return (Criteria) this;
        }

        public Criteria andCStartTimeIn(List<Date> values) {
            addCriterion("c_start_time in", values, "cStartTime");
            return (Criteria) this;
        }

        public Criteria andCStartTimeNotIn(List<Date> values) {
            addCriterion("c_start_time not in", values, "cStartTime");
            return (Criteria) this;
        }

        public Criteria andCStartTimeBetween(Date value1, Date value2) {
            addCriterion("c_start_time between", value1, value2, "cStartTime");
            return (Criteria) this;
        }

        public Criteria andCStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("c_start_time not between", value1, value2, "cStartTime");
            return (Criteria) this;
        }

        public Criteria andCUseYearIsNull() {
            addCriterion("c_use_year is null");
            return (Criteria) this;
        }

        public Criteria andCUseYearIsNotNull() {
            addCriterion("c_use_year is not null");
            return (Criteria) this;
        }

        public Criteria andCUseYearEqualTo(String value) {
            addCriterion("c_use_year =", value, "cUseYear");
            return (Criteria) this;
        }

        public Criteria andCUseYearNotEqualTo(String value) {
            addCriterion("c_use_year <>", value, "cUseYear");
            return (Criteria) this;
        }

        public Criteria andCUseYearGreaterThan(String value) {
            addCriterion("c_use_year >", value, "cUseYear");
            return (Criteria) this;
        }

        public Criteria andCUseYearGreaterThanOrEqualTo(String value) {
            addCriterion("c_use_year >=", value, "cUseYear");
            return (Criteria) this;
        }

        public Criteria andCUseYearLessThan(String value) {
            addCriterion("c_use_year <", value, "cUseYear");
            return (Criteria) this;
        }

        public Criteria andCUseYearLessThanOrEqualTo(String value) {
            addCriterion("c_use_year <=", value, "cUseYear");
            return (Criteria) this;
        }

        public Criteria andCUseYearLike(String value) {
            addCriterion("c_use_year like", value, "cUseYear");
            return (Criteria) this;
        }

        public Criteria andCUseYearNotLike(String value) {
            addCriterion("c_use_year not like", value, "cUseYear");
            return (Criteria) this;
        }

        public Criteria andCUseYearIn(List<String> values) {
            addCriterion("c_use_year in", values, "cUseYear");
            return (Criteria) this;
        }

        public Criteria andCUseYearNotIn(List<String> values) {
            addCriterion("c_use_year not in", values, "cUseYear");
            return (Criteria) this;
        }

        public Criteria andCUseYearBetween(String value1, String value2) {
            addCriterion("c_use_year between", value1, value2, "cUseYear");
            return (Criteria) this;
        }

        public Criteria andCUseYearNotBetween(String value1, String value2) {
            addCriterion("c_use_year not between", value1, value2, "cUseYear");
            return (Criteria) this;
        }

        public Criteria andNDisplacementIsNull() {
            addCriterion("n_displacement is null");
            return (Criteria) this;
        }

        public Criteria andNDisplacementIsNotNull() {
            addCriterion("n_displacement is not null");
            return (Criteria) this;
        }

        public Criteria andNDisplacementEqualTo(String value) {
            addCriterion("n_displacement =", value, "nDisplacement");
            return (Criteria) this;
        }

        public Criteria andNDisplacementNotEqualTo(String value) {
            addCriterion("n_displacement <>", value, "nDisplacement");
            return (Criteria) this;
        }

        public Criteria andNDisplacementGreaterThan(String value) {
            addCriterion("n_displacement >", value, "nDisplacement");
            return (Criteria) this;
        }

        public Criteria andNDisplacementGreaterThanOrEqualTo(String value) {
            addCriterion("n_displacement >=", value, "nDisplacement");
            return (Criteria) this;
        }

        public Criteria andNDisplacementLessThan(String value) {
            addCriterion("n_displacement <", value, "nDisplacement");
            return (Criteria) this;
        }

        public Criteria andNDisplacementLessThanOrEqualTo(String value) {
            addCriterion("n_displacement <=", value, "nDisplacement");
            return (Criteria) this;
        }

        public Criteria andNDisplacementLike(String value) {
            addCriterion("n_displacement like", value, "nDisplacement");
            return (Criteria) this;
        }

        public Criteria andNDisplacementNotLike(String value) {
            addCriterion("n_displacement not like", value, "nDisplacement");
            return (Criteria) this;
        }

        public Criteria andNDisplacementIn(List<String> values) {
            addCriterion("n_displacement in", values, "nDisplacement");
            return (Criteria) this;
        }

        public Criteria andNDisplacementNotIn(List<String> values) {
            addCriterion("n_displacement not in", values, "nDisplacement");
            return (Criteria) this;
        }

        public Criteria andNDisplacementBetween(String value1, String value2) {
            addCriterion("n_displacement between", value1, value2, "nDisplacement");
            return (Criteria) this;
        }

        public Criteria andNDisplacementNotBetween(String value1, String value2) {
            addCriterion("n_displacement not between", value1, value2, "nDisplacement");
            return (Criteria) this;
        }

        public Criteria andNPoWeightIsNull() {
            addCriterion("n_po_weight is null");
            return (Criteria) this;
        }

        public Criteria andNPoWeightIsNotNull() {
            addCriterion("n_po_weight is not null");
            return (Criteria) this;
        }

        public Criteria andNPoWeightEqualTo(String value) {
            addCriterion("n_po_weight =", value, "nPoWeight");
            return (Criteria) this;
        }

        public Criteria andNPoWeightNotEqualTo(String value) {
            addCriterion("n_po_weight <>", value, "nPoWeight");
            return (Criteria) this;
        }

        public Criteria andNPoWeightGreaterThan(String value) {
            addCriterion("n_po_weight >", value, "nPoWeight");
            return (Criteria) this;
        }

        public Criteria andNPoWeightGreaterThanOrEqualTo(String value) {
            addCriterion("n_po_weight >=", value, "nPoWeight");
            return (Criteria) this;
        }

        public Criteria andNPoWeightLessThan(String value) {
            addCriterion("n_po_weight <", value, "nPoWeight");
            return (Criteria) this;
        }

        public Criteria andNPoWeightLessThanOrEqualTo(String value) {
            addCriterion("n_po_weight <=", value, "nPoWeight");
            return (Criteria) this;
        }

        public Criteria andNPoWeightLike(String value) {
            addCriterion("n_po_weight like", value, "nPoWeight");
            return (Criteria) this;
        }

        public Criteria andNPoWeightNotLike(String value) {
            addCriterion("n_po_weight not like", value, "nPoWeight");
            return (Criteria) this;
        }

        public Criteria andNPoWeightIn(List<String> values) {
            addCriterion("n_po_weight in", values, "nPoWeight");
            return (Criteria) this;
        }

        public Criteria andNPoWeightNotIn(List<String> values) {
            addCriterion("n_po_weight not in", values, "nPoWeight");
            return (Criteria) this;
        }

        public Criteria andNPoWeightBetween(String value1, String value2) {
            addCriterion("n_po_weight between", value1, value2, "nPoWeight");
            return (Criteria) this;
        }

        public Criteria andNPoWeightNotBetween(String value1, String value2) {
            addCriterion("n_po_weight not between", value1, value2, "nPoWeight");
            return (Criteria) this;
        }

        public Criteria andNTonageIsNull() {
            addCriterion("n_tonage is null");
            return (Criteria) this;
        }

        public Criteria andNTonageIsNotNull() {
            addCriterion("n_tonage is not null");
            return (Criteria) this;
        }

        public Criteria andNTonageEqualTo(String value) {
            addCriterion("n_tonage =", value, "nTonage");
            return (Criteria) this;
        }

        public Criteria andNTonageNotEqualTo(String value) {
            addCriterion("n_tonage <>", value, "nTonage");
            return (Criteria) this;
        }

        public Criteria andNTonageGreaterThan(String value) {
            addCriterion("n_tonage >", value, "nTonage");
            return (Criteria) this;
        }

        public Criteria andNTonageGreaterThanOrEqualTo(String value) {
            addCriterion("n_tonage >=", value, "nTonage");
            return (Criteria) this;
        }

        public Criteria andNTonageLessThan(String value) {
            addCriterion("n_tonage <", value, "nTonage");
            return (Criteria) this;
        }

        public Criteria andNTonageLessThanOrEqualTo(String value) {
            addCriterion("n_tonage <=", value, "nTonage");
            return (Criteria) this;
        }

        public Criteria andNTonageLike(String value) {
            addCriterion("n_tonage like", value, "nTonage");
            return (Criteria) this;
        }

        public Criteria andNTonageNotLike(String value) {
            addCriterion("n_tonage not like", value, "nTonage");
            return (Criteria) this;
        }

        public Criteria andNTonageIn(List<String> values) {
            addCriterion("n_tonage in", values, "nTonage");
            return (Criteria) this;
        }

        public Criteria andNTonageNotIn(List<String> values) {
            addCriterion("n_tonage not in", values, "nTonage");
            return (Criteria) this;
        }

        public Criteria andNTonageBetween(String value1, String value2) {
            addCriterion("n_tonage between", value1, value2, "nTonage");
            return (Criteria) this;
        }

        public Criteria andNTonageNotBetween(String value1, String value2) {
            addCriterion("n_tonage not between", value1, value2, "nTonage");
            return (Criteria) this;
        }

        public Criteria andNLimitLoadPersonIsNull() {
            addCriterion("n_limit_load_person is null");
            return (Criteria) this;
        }

        public Criteria andNLimitLoadPersonIsNotNull() {
            addCriterion("n_limit_load_person is not null");
            return (Criteria) this;
        }

        public Criteria andNLimitLoadPersonEqualTo(String value) {
            addCriterion("n_limit_load_person =", value, "nLimitLoadPerson");
            return (Criteria) this;
        }

        public Criteria andNLimitLoadPersonNotEqualTo(String value) {
            addCriterion("n_limit_load_person <>", value, "nLimitLoadPerson");
            return (Criteria) this;
        }

        public Criteria andNLimitLoadPersonGreaterThan(String value) {
            addCriterion("n_limit_load_person >", value, "nLimitLoadPerson");
            return (Criteria) this;
        }

        public Criteria andNLimitLoadPersonGreaterThanOrEqualTo(String value) {
            addCriterion("n_limit_load_person >=", value, "nLimitLoadPerson");
            return (Criteria) this;
        }

        public Criteria andNLimitLoadPersonLessThan(String value) {
            addCriterion("n_limit_load_person <", value, "nLimitLoadPerson");
            return (Criteria) this;
        }

        public Criteria andNLimitLoadPersonLessThanOrEqualTo(String value) {
            addCriterion("n_limit_load_person <=", value, "nLimitLoadPerson");
            return (Criteria) this;
        }

        public Criteria andNLimitLoadPersonLike(String value) {
            addCriterion("n_limit_load_person like", value, "nLimitLoadPerson");
            return (Criteria) this;
        }

        public Criteria andNLimitLoadPersonNotLike(String value) {
            addCriterion("n_limit_load_person not like", value, "nLimitLoadPerson");
            return (Criteria) this;
        }

        public Criteria andNLimitLoadPersonIn(List<String> values) {
            addCriterion("n_limit_load_person in", values, "nLimitLoadPerson");
            return (Criteria) this;
        }

        public Criteria andNLimitLoadPersonNotIn(List<String> values) {
            addCriterion("n_limit_load_person not in", values, "nLimitLoadPerson");
            return (Criteria) this;
        }

        public Criteria andNLimitLoadPersonBetween(String value1, String value2) {
            addCriterion("n_limit_load_person between", value1, value2, "nLimitLoadPerson");
            return (Criteria) this;
        }

        public Criteria andNLimitLoadPersonNotBetween(String value1, String value2) {
            addCriterion("n_limit_load_person not between", value1, value2, "nLimitLoadPerson");
            return (Criteria) this;
        }

        public Criteria andCNewPurchaseValueIsNull() {
            addCriterion("c_new_purchase_value is null");
            return (Criteria) this;
        }

        public Criteria andCNewPurchaseValueIsNotNull() {
            addCriterion("c_new_purchase_value is not null");
            return (Criteria) this;
        }

        public Criteria andCNewPurchaseValueEqualTo(String value) {
            addCriterion("c_new_purchase_value =", value, "cNewPurchaseValue");
            return (Criteria) this;
        }

        public Criteria andCNewPurchaseValueNotEqualTo(String value) {
            addCriterion("c_new_purchase_value <>", value, "cNewPurchaseValue");
            return (Criteria) this;
        }

        public Criteria andCNewPurchaseValueGreaterThan(String value) {
            addCriterion("c_new_purchase_value >", value, "cNewPurchaseValue");
            return (Criteria) this;
        }

        public Criteria andCNewPurchaseValueGreaterThanOrEqualTo(String value) {
            addCriterion("c_new_purchase_value >=", value, "cNewPurchaseValue");
            return (Criteria) this;
        }

        public Criteria andCNewPurchaseValueLessThan(String value) {
            addCriterion("c_new_purchase_value <", value, "cNewPurchaseValue");
            return (Criteria) this;
        }

        public Criteria andCNewPurchaseValueLessThanOrEqualTo(String value) {
            addCriterion("c_new_purchase_value <=", value, "cNewPurchaseValue");
            return (Criteria) this;
        }

        public Criteria andCNewPurchaseValueLike(String value) {
            addCriterion("c_new_purchase_value like", value, "cNewPurchaseValue");
            return (Criteria) this;
        }

        public Criteria andCNewPurchaseValueNotLike(String value) {
            addCriterion("c_new_purchase_value not like", value, "cNewPurchaseValue");
            return (Criteria) this;
        }

        public Criteria andCNewPurchaseValueIn(List<String> values) {
            addCriterion("c_new_purchase_value in", values, "cNewPurchaseValue");
            return (Criteria) this;
        }

        public Criteria andCNewPurchaseValueNotIn(List<String> values) {
            addCriterion("c_new_purchase_value not in", values, "cNewPurchaseValue");
            return (Criteria) this;
        }

        public Criteria andCNewPurchaseValueBetween(String value1, String value2) {
            addCriterion("c_new_purchase_value between", value1, value2, "cNewPurchaseValue");
            return (Criteria) this;
        }

        public Criteria andCNewPurchaseValueNotBetween(String value1, String value2) {
            addCriterion("c_new_purchase_value not between", value1, value2, "cNewPurchaseValue");
            return (Criteria) this;
        }

        public Criteria andNActualValueIsNull() {
            addCriterion("n_actual_value is null");
            return (Criteria) this;
        }

        public Criteria andNActualValueIsNotNull() {
            addCriterion("n_actual_value is not null");
            return (Criteria) this;
        }

        public Criteria andNActualValueEqualTo(String value) {
            addCriterion("n_actual_value =", value, "nActualValue");
            return (Criteria) this;
        }

        public Criteria andNActualValueNotEqualTo(String value) {
            addCriterion("n_actual_value <>", value, "nActualValue");
            return (Criteria) this;
        }

        public Criteria andNActualValueGreaterThan(String value) {
            addCriterion("n_actual_value >", value, "nActualValue");
            return (Criteria) this;
        }

        public Criteria andNActualValueGreaterThanOrEqualTo(String value) {
            addCriterion("n_actual_value >=", value, "nActualValue");
            return (Criteria) this;
        }

        public Criteria andNActualValueLessThan(String value) {
            addCriterion("n_actual_value <", value, "nActualValue");
            return (Criteria) this;
        }

        public Criteria andNActualValueLessThanOrEqualTo(String value) {
            addCriterion("n_actual_value <=", value, "nActualValue");
            return (Criteria) this;
        }

        public Criteria andNActualValueLike(String value) {
            addCriterion("n_actual_value like", value, "nActualValue");
            return (Criteria) this;
        }

        public Criteria andNActualValueNotLike(String value) {
            addCriterion("n_actual_value not like", value, "nActualValue");
            return (Criteria) this;
        }

        public Criteria andNActualValueIn(List<String> values) {
            addCriterion("n_actual_value in", values, "nActualValue");
            return (Criteria) this;
        }

        public Criteria andNActualValueNotIn(List<String> values) {
            addCriterion("n_actual_value not in", values, "nActualValue");
            return (Criteria) this;
        }

        public Criteria andNActualValueBetween(String value1, String value2) {
            addCriterion("n_actual_value between", value1, value2, "nActualValue");
            return (Criteria) this;
        }

        public Criteria andNActualValueNotBetween(String value1, String value2) {
            addCriterion("n_actual_value not between", value1, value2, "nActualValue");
            return (Criteria) this;
        }

        public Criteria andNDiscusUsevalIsNull() {
            addCriterion("n_discus_useval is null");
            return (Criteria) this;
        }

        public Criteria andNDiscusUsevalIsNotNull() {
            addCriterion("n_discus_useval is not null");
            return (Criteria) this;
        }

        public Criteria andNDiscusUsevalEqualTo(String value) {
            addCriterion("n_discus_useval =", value, "nDiscusUseval");
            return (Criteria) this;
        }

        public Criteria andNDiscusUsevalNotEqualTo(String value) {
            addCriterion("n_discus_useval <>", value, "nDiscusUseval");
            return (Criteria) this;
        }

        public Criteria andNDiscusUsevalGreaterThan(String value) {
            addCriterion("n_discus_useval >", value, "nDiscusUseval");
            return (Criteria) this;
        }

        public Criteria andNDiscusUsevalGreaterThanOrEqualTo(String value) {
            addCriterion("n_discus_useval >=", value, "nDiscusUseval");
            return (Criteria) this;
        }

        public Criteria andNDiscusUsevalLessThan(String value) {
            addCriterion("n_discus_useval <", value, "nDiscusUseval");
            return (Criteria) this;
        }

        public Criteria andNDiscusUsevalLessThanOrEqualTo(String value) {
            addCriterion("n_discus_useval <=", value, "nDiscusUseval");
            return (Criteria) this;
        }

        public Criteria andNDiscusUsevalLike(String value) {
            addCriterion("n_discus_useval like", value, "nDiscusUseval");
            return (Criteria) this;
        }

        public Criteria andNDiscusUsevalNotLike(String value) {
            addCriterion("n_discus_useval not like", value, "nDiscusUseval");
            return (Criteria) this;
        }

        public Criteria andNDiscusUsevalIn(List<String> values) {
            addCriterion("n_discus_useval in", values, "nDiscusUseval");
            return (Criteria) this;
        }

        public Criteria andNDiscusUsevalNotIn(List<String> values) {
            addCriterion("n_discus_useval not in", values, "nDiscusUseval");
            return (Criteria) this;
        }

        public Criteria andNDiscusUsevalBetween(String value1, String value2) {
            addCriterion("n_discus_useval between", value1, value2, "nDiscusUseval");
            return (Criteria) this;
        }

        public Criteria andNDiscusUsevalNotBetween(String value1, String value2) {
            addCriterion("n_discus_useval not between", value1, value2, "nDiscusUseval");
            return (Criteria) this;
        }

        public Criteria andCChooseTypeCodeIsNull() {
            addCriterion("c_choose_type_code is null");
            return (Criteria) this;
        }

        public Criteria andCChooseTypeCodeIsNotNull() {
            addCriterion("c_choose_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andCChooseTypeCodeEqualTo(String value) {
            addCriterion("c_choose_type_code =", value, "cChooseTypeCode");
            return (Criteria) this;
        }

        public Criteria andCChooseTypeCodeNotEqualTo(String value) {
            addCriterion("c_choose_type_code <>", value, "cChooseTypeCode");
            return (Criteria) this;
        }

        public Criteria andCChooseTypeCodeGreaterThan(String value) {
            addCriterion("c_choose_type_code >", value, "cChooseTypeCode");
            return (Criteria) this;
        }

        public Criteria andCChooseTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("c_choose_type_code >=", value, "cChooseTypeCode");
            return (Criteria) this;
        }

        public Criteria andCChooseTypeCodeLessThan(String value) {
            addCriterion("c_choose_type_code <", value, "cChooseTypeCode");
            return (Criteria) this;
        }

        public Criteria andCChooseTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("c_choose_type_code <=", value, "cChooseTypeCode");
            return (Criteria) this;
        }

        public Criteria andCChooseTypeCodeLike(String value) {
            addCriterion("c_choose_type_code like", value, "cChooseTypeCode");
            return (Criteria) this;
        }

        public Criteria andCChooseTypeCodeNotLike(String value) {
            addCriterion("c_choose_type_code not like", value, "cChooseTypeCode");
            return (Criteria) this;
        }

        public Criteria andCChooseTypeCodeIn(List<String> values) {
            addCriterion("c_choose_type_code in", values, "cChooseTypeCode");
            return (Criteria) this;
        }

        public Criteria andCChooseTypeCodeNotIn(List<String> values) {
            addCriterion("c_choose_type_code not in", values, "cChooseTypeCode");
            return (Criteria) this;
        }

        public Criteria andCChooseTypeCodeBetween(String value1, String value2) {
            addCriterion("c_choose_type_code between", value1, value2, "cChooseTypeCode");
            return (Criteria) this;
        }

        public Criteria andCChooseTypeCodeNotBetween(String value1, String value2) {
            addCriterion("c_choose_type_code not between", value1, value2, "cChooseTypeCode");
            return (Criteria) this;
        }

        public Criteria andCChooseTypeIsNull() {
            addCriterion("c_choose_type is null");
            return (Criteria) this;
        }

        public Criteria andCChooseTypeIsNotNull() {
            addCriterion("c_choose_type is not null");
            return (Criteria) this;
        }

        public Criteria andCChooseTypeEqualTo(String value) {
            addCriterion("c_choose_type =", value, "cChooseType");
            return (Criteria) this;
        }

        public Criteria andCChooseTypeNotEqualTo(String value) {
            addCriterion("c_choose_type <>", value, "cChooseType");
            return (Criteria) this;
        }

        public Criteria andCChooseTypeGreaterThan(String value) {
            addCriterion("c_choose_type >", value, "cChooseType");
            return (Criteria) this;
        }

        public Criteria andCChooseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("c_choose_type >=", value, "cChooseType");
            return (Criteria) this;
        }

        public Criteria andCChooseTypeLessThan(String value) {
            addCriterion("c_choose_type <", value, "cChooseType");
            return (Criteria) this;
        }

        public Criteria andCChooseTypeLessThanOrEqualTo(String value) {
            addCriterion("c_choose_type <=", value, "cChooseType");
            return (Criteria) this;
        }

        public Criteria andCChooseTypeLike(String value) {
            addCriterion("c_choose_type like", value, "cChooseType");
            return (Criteria) this;
        }

        public Criteria andCChooseTypeNotLike(String value) {
            addCriterion("c_choose_type not like", value, "cChooseType");
            return (Criteria) this;
        }

        public Criteria andCChooseTypeIn(List<String> values) {
            addCriterion("c_choose_type in", values, "cChooseType");
            return (Criteria) this;
        }

        public Criteria andCChooseTypeNotIn(List<String> values) {
            addCriterion("c_choose_type not in", values, "cChooseType");
            return (Criteria) this;
        }

        public Criteria andCChooseTypeBetween(String value1, String value2) {
            addCriterion("c_choose_type between", value1, value2, "cChooseType");
            return (Criteria) this;
        }

        public Criteria andCChooseTypeNotBetween(String value1, String value2) {
            addCriterion("c_choose_type not between", value1, value2, "cChooseType");
            return (Criteria) this;
        }

        public Criteria andCFuelTypeCodeIsNull() {
            addCriterion("c_fuel_type_code is null");
            return (Criteria) this;
        }

        public Criteria andCFuelTypeCodeIsNotNull() {
            addCriterion("c_fuel_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andCFuelTypeCodeEqualTo(String value) {
            addCriterion("c_fuel_type_code =", value, "cFuelTypeCode");
            return (Criteria) this;
        }

        public Criteria andCFuelTypeCodeNotEqualTo(String value) {
            addCriterion("c_fuel_type_code <>", value, "cFuelTypeCode");
            return (Criteria) this;
        }

        public Criteria andCFuelTypeCodeGreaterThan(String value) {
            addCriterion("c_fuel_type_code >", value, "cFuelTypeCode");
            return (Criteria) this;
        }

        public Criteria andCFuelTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("c_fuel_type_code >=", value, "cFuelTypeCode");
            return (Criteria) this;
        }

        public Criteria andCFuelTypeCodeLessThan(String value) {
            addCriterion("c_fuel_type_code <", value, "cFuelTypeCode");
            return (Criteria) this;
        }

        public Criteria andCFuelTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("c_fuel_type_code <=", value, "cFuelTypeCode");
            return (Criteria) this;
        }

        public Criteria andCFuelTypeCodeLike(String value) {
            addCriterion("c_fuel_type_code like", value, "cFuelTypeCode");
            return (Criteria) this;
        }

        public Criteria andCFuelTypeCodeNotLike(String value) {
            addCriterion("c_fuel_type_code not like", value, "cFuelTypeCode");
            return (Criteria) this;
        }

        public Criteria andCFuelTypeCodeIn(List<String> values) {
            addCriterion("c_fuel_type_code in", values, "cFuelTypeCode");
            return (Criteria) this;
        }

        public Criteria andCFuelTypeCodeNotIn(List<String> values) {
            addCriterion("c_fuel_type_code not in", values, "cFuelTypeCode");
            return (Criteria) this;
        }

        public Criteria andCFuelTypeCodeBetween(String value1, String value2) {
            addCriterion("c_fuel_type_code between", value1, value2, "cFuelTypeCode");
            return (Criteria) this;
        }

        public Criteria andCFuelTypeCodeNotBetween(String value1, String value2) {
            addCriterion("c_fuel_type_code not between", value1, value2, "cFuelTypeCode");
            return (Criteria) this;
        }

        public Criteria andCFuelTypeIsNull() {
            addCriterion("c_fuel_type is null");
            return (Criteria) this;
        }

        public Criteria andCFuelTypeIsNotNull() {
            addCriterion("c_fuel_type is not null");
            return (Criteria) this;
        }

        public Criteria andCFuelTypeEqualTo(String value) {
            addCriterion("c_fuel_type =", value, "cFuelType");
            return (Criteria) this;
        }

        public Criteria andCFuelTypeNotEqualTo(String value) {
            addCriterion("c_fuel_type <>", value, "cFuelType");
            return (Criteria) this;
        }

        public Criteria andCFuelTypeGreaterThan(String value) {
            addCriterion("c_fuel_type >", value, "cFuelType");
            return (Criteria) this;
        }

        public Criteria andCFuelTypeGreaterThanOrEqualTo(String value) {
            addCriterion("c_fuel_type >=", value, "cFuelType");
            return (Criteria) this;
        }

        public Criteria andCFuelTypeLessThan(String value) {
            addCriterion("c_fuel_type <", value, "cFuelType");
            return (Criteria) this;
        }

        public Criteria andCFuelTypeLessThanOrEqualTo(String value) {
            addCriterion("c_fuel_type <=", value, "cFuelType");
            return (Criteria) this;
        }

        public Criteria andCFuelTypeLike(String value) {
            addCriterion("c_fuel_type like", value, "cFuelType");
            return (Criteria) this;
        }

        public Criteria andCFuelTypeNotLike(String value) {
            addCriterion("c_fuel_type not like", value, "cFuelType");
            return (Criteria) this;
        }

        public Criteria andCFuelTypeIn(List<String> values) {
            addCriterion("c_fuel_type in", values, "cFuelType");
            return (Criteria) this;
        }

        public Criteria andCFuelTypeNotIn(List<String> values) {
            addCriterion("c_fuel_type not in", values, "cFuelType");
            return (Criteria) this;
        }

        public Criteria andCFuelTypeBetween(String value1, String value2) {
            addCriterion("c_fuel_type between", value1, value2, "cFuelType");
            return (Criteria) this;
        }

        public Criteria andCFuelTypeNotBetween(String value1, String value2) {
            addCriterion("c_fuel_type not between", value1, value2, "cFuelType");
            return (Criteria) this;
        }

        public Criteria andCProdPlaceIsNull() {
            addCriterion("c_prod_place is null");
            return (Criteria) this;
        }

        public Criteria andCProdPlaceIsNotNull() {
            addCriterion("c_prod_place is not null");
            return (Criteria) this;
        }

        public Criteria andCProdPlaceEqualTo(Integer value) {
            addCriterion("c_prod_place =", value, "cProdPlace");
            return (Criteria) this;
        }

        public Criteria andCProdPlaceNotEqualTo(Integer value) {
            addCriterion("c_prod_place <>", value, "cProdPlace");
            return (Criteria) this;
        }

        public Criteria andCProdPlaceGreaterThan(Integer value) {
            addCriterion("c_prod_place >", value, "cProdPlace");
            return (Criteria) this;
        }

        public Criteria andCProdPlaceGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_prod_place >=", value, "cProdPlace");
            return (Criteria) this;
        }

        public Criteria andCProdPlaceLessThan(Integer value) {
            addCriterion("c_prod_place <", value, "cProdPlace");
            return (Criteria) this;
        }

        public Criteria andCProdPlaceLessThanOrEqualTo(Integer value) {
            addCriterion("c_prod_place <=", value, "cProdPlace");
            return (Criteria) this;
        }

        public Criteria andCProdPlaceIn(List<Integer> values) {
            addCriterion("c_prod_place in", values, "cProdPlace");
            return (Criteria) this;
        }

        public Criteria andCProdPlaceNotIn(List<Integer> values) {
            addCriterion("c_prod_place not in", values, "cProdPlace");
            return (Criteria) this;
        }

        public Criteria andCProdPlaceBetween(Integer value1, Integer value2) {
            addCriterion("c_prod_place between", value1, value2, "cProdPlace");
            return (Criteria) this;
        }

        public Criteria andCProdPlaceNotBetween(Integer value1, Integer value2) {
            addCriterion("c_prod_place not between", value1, value2, "cProdPlace");
            return (Criteria) this;
        }

        public Criteria andCRepayIsNull() {
            addCriterion("c_repay is null");
            return (Criteria) this;
        }

        public Criteria andCRepayIsNotNull() {
            addCriterion("c_repay is not null");
            return (Criteria) this;
        }

        public Criteria andCRepayEqualTo(Integer value) {
            addCriterion("c_repay =", value, "cRepay");
            return (Criteria) this;
        }

        public Criteria andCRepayNotEqualTo(Integer value) {
            addCriterion("c_repay <>", value, "cRepay");
            return (Criteria) this;
        }

        public Criteria andCRepayGreaterThan(Integer value) {
            addCriterion("c_repay >", value, "cRepay");
            return (Criteria) this;
        }

        public Criteria andCRepayGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_repay >=", value, "cRepay");
            return (Criteria) this;
        }

        public Criteria andCRepayLessThan(Integer value) {
            addCriterion("c_repay <", value, "cRepay");
            return (Criteria) this;
        }

        public Criteria andCRepayLessThanOrEqualTo(Integer value) {
            addCriterion("c_repay <=", value, "cRepay");
            return (Criteria) this;
        }

        public Criteria andCRepayIn(List<Integer> values) {
            addCriterion("c_repay in", values, "cRepay");
            return (Criteria) this;
        }

        public Criteria andCRepayNotIn(List<Integer> values) {
            addCriterion("c_repay not in", values, "cRepay");
            return (Criteria) this;
        }

        public Criteria andCRepayBetween(Integer value1, Integer value2) {
            addCriterion("c_repay between", value1, value2, "cRepay");
            return (Criteria) this;
        }

        public Criteria andCRepayNotBetween(Integer value1, Integer value2) {
            addCriterion("c_repay not between", value1, value2, "cRepay");
            return (Criteria) this;
        }

        public Criteria andCPayYearsIsNull() {
            addCriterion("c_pay_years is null");
            return (Criteria) this;
        }

        public Criteria andCPayYearsIsNotNull() {
            addCriterion("c_pay_years is not null");
            return (Criteria) this;
        }

        public Criteria andCPayYearsEqualTo(String value) {
            addCriterion("c_pay_years =", value, "cPayYears");
            return (Criteria) this;
        }

        public Criteria andCPayYearsNotEqualTo(String value) {
            addCriterion("c_pay_years <>", value, "cPayYears");
            return (Criteria) this;
        }

        public Criteria andCPayYearsGreaterThan(String value) {
            addCriterion("c_pay_years >", value, "cPayYears");
            return (Criteria) this;
        }

        public Criteria andCPayYearsGreaterThanOrEqualTo(String value) {
            addCriterion("c_pay_years >=", value, "cPayYears");
            return (Criteria) this;
        }

        public Criteria andCPayYearsLessThan(String value) {
            addCriterion("c_pay_years <", value, "cPayYears");
            return (Criteria) this;
        }

        public Criteria andCPayYearsLessThanOrEqualTo(String value) {
            addCriterion("c_pay_years <=", value, "cPayYears");
            return (Criteria) this;
        }

        public Criteria andCPayYearsLike(String value) {
            addCriterion("c_pay_years like", value, "cPayYears");
            return (Criteria) this;
        }

        public Criteria andCPayYearsNotLike(String value) {
            addCriterion("c_pay_years not like", value, "cPayYears");
            return (Criteria) this;
        }

        public Criteria andCPayYearsIn(List<String> values) {
            addCriterion("c_pay_years in", values, "cPayYears");
            return (Criteria) this;
        }

        public Criteria andCPayYearsNotIn(List<String> values) {
            addCriterion("c_pay_years not in", values, "cPayYears");
            return (Criteria) this;
        }

        public Criteria andCPayYearsBetween(String value1, String value2) {
            addCriterion("c_pay_years between", value1, value2, "cPayYears");
            return (Criteria) this;
        }

        public Criteria andCPayYearsNotBetween(String value1, String value2) {
            addCriterion("c_pay_years not between", value1, value2, "cPayYears");
            return (Criteria) this;
        }

        public Criteria andCTransferMrkIsNull() {
            addCriterion("c_transfer_mrk is null");
            return (Criteria) this;
        }

        public Criteria andCTransferMrkIsNotNull() {
            addCriterion("c_transfer_mrk is not null");
            return (Criteria) this;
        }

        public Criteria andCTransferMrkEqualTo(String value) {
            addCriterion("c_transfer_mrk =", value, "cTransferMrk");
            return (Criteria) this;
        }

        public Criteria andCTransferMrkNotEqualTo(String value) {
            addCriterion("c_transfer_mrk <>", value, "cTransferMrk");
            return (Criteria) this;
        }

        public Criteria andCTransferMrkGreaterThan(String value) {
            addCriterion("c_transfer_mrk >", value, "cTransferMrk");
            return (Criteria) this;
        }

        public Criteria andCTransferMrkGreaterThanOrEqualTo(String value) {
            addCriterion("c_transfer_mrk >=", value, "cTransferMrk");
            return (Criteria) this;
        }

        public Criteria andCTransferMrkLessThan(String value) {
            addCriterion("c_transfer_mrk <", value, "cTransferMrk");
            return (Criteria) this;
        }

        public Criteria andCTransferMrkLessThanOrEqualTo(String value) {
            addCriterion("c_transfer_mrk <=", value, "cTransferMrk");
            return (Criteria) this;
        }

        public Criteria andCTransferMrkLike(String value) {
            addCriterion("c_transfer_mrk like", value, "cTransferMrk");
            return (Criteria) this;
        }

        public Criteria andCTransferMrkNotLike(String value) {
            addCriterion("c_transfer_mrk not like", value, "cTransferMrk");
            return (Criteria) this;
        }

        public Criteria andCTransferMrkIn(List<String> values) {
            addCriterion("c_transfer_mrk in", values, "cTransferMrk");
            return (Criteria) this;
        }

        public Criteria andCTransferMrkNotIn(List<String> values) {
            addCriterion("c_transfer_mrk not in", values, "cTransferMrk");
            return (Criteria) this;
        }

        public Criteria andCTransferMrkBetween(String value1, String value2) {
            addCriterion("c_transfer_mrk between", value1, value2, "cTransferMrk");
            return (Criteria) this;
        }

        public Criteria andCTransferMrkNotBetween(String value1, String value2) {
            addCriterion("c_transfer_mrk not between", value1, value2, "cTransferMrk");
            return (Criteria) this;
        }

        public Criteria andIsCheckedIsNull() {
            addCriterion("is_checked is null");
            return (Criteria) this;
        }

        public Criteria andIsCheckedIsNotNull() {
            addCriterion("is_checked is not null");
            return (Criteria) this;
        }

        public Criteria andIsCheckedEqualTo(Integer value) {
            addCriterion("is_checked =", value, "isChecked");
            return (Criteria) this;
        }

        public Criteria andIsCheckedNotEqualTo(Integer value) {
            addCriterion("is_checked <>", value, "isChecked");
            return (Criteria) this;
        }

        public Criteria andIsCheckedGreaterThan(Integer value) {
            addCriterion("is_checked >", value, "isChecked");
            return (Criteria) this;
        }

        public Criteria andIsCheckedGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_checked >=", value, "isChecked");
            return (Criteria) this;
        }

        public Criteria andIsCheckedLessThan(Integer value) {
            addCriterion("is_checked <", value, "isChecked");
            return (Criteria) this;
        }

        public Criteria andIsCheckedLessThanOrEqualTo(Integer value) {
            addCriterion("is_checked <=", value, "isChecked");
            return (Criteria) this;
        }

        public Criteria andIsCheckedIn(List<Integer> values) {
            addCriterion("is_checked in", values, "isChecked");
            return (Criteria) this;
        }

        public Criteria andIsCheckedNotIn(List<Integer> values) {
            addCriterion("is_checked not in", values, "isChecked");
            return (Criteria) this;
        }

        public Criteria andIsCheckedBetween(Integer value1, Integer value2) {
            addCriterion("is_checked between", value1, value2, "isChecked");
            return (Criteria) this;
        }

        public Criteria andIsCheckedNotBetween(Integer value1, Integer value2) {
            addCriterion("is_checked not between", value1, value2, "isChecked");
            return (Criteria) this;
        }

        public Criteria andCheckerIsNull() {
            addCriterion("checker is null");
            return (Criteria) this;
        }

        public Criteria andCheckerIsNotNull() {
            addCriterion("checker is not null");
            return (Criteria) this;
        }

        public Criteria andCheckerEqualTo(String value) {
            addCriterion("checker =", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotEqualTo(String value) {
            addCriterion("checker <>", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerGreaterThan(String value) {
            addCriterion("checker >", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerGreaterThanOrEqualTo(String value) {
            addCriterion("checker >=", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerLessThan(String value) {
            addCriterion("checker <", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerLessThanOrEqualTo(String value) {
            addCriterion("checker <=", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerLike(String value) {
            addCriterion("checker like", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotLike(String value) {
            addCriterion("checker not like", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerIn(List<String> values) {
            addCriterion("checker in", values, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotIn(List<String> values) {
            addCriterion("checker not in", values, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerBetween(String value1, String value2) {
            addCriterion("checker between", value1, value2, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotBetween(String value1, String value2) {
            addCriterion("checker not between", value1, value2, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNull() {
            addCriterion("check_time is null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNotNull() {
            addCriterion("check_time is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeEqualTo(Date value) {
            addCriterion("check_time =", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotEqualTo(Date value) {
            addCriterion("check_time <>", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThan(Date value) {
            addCriterion("check_time >", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("check_time >=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThan(Date value) {
            addCriterion("check_time <", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThanOrEqualTo(Date value) {
            addCriterion("check_time <=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIn(List<Date> values) {
            addCriterion("check_time in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotIn(List<Date> values) {
            addCriterion("check_time not in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeBetween(Date value1, Date value2) {
            addCriterion("check_time between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotBetween(Date value1, Date value2) {
            addCriterion("check_time not between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andTransferTimeIsNull() {
            addCriterion("transfer_time is null");
            return (Criteria) this;
        }

        public Criteria andTransferTimeIsNotNull() {
            addCriterion("transfer_time is not null");
            return (Criteria) this;
        }

        public Criteria andTransferTimeEqualTo(Date value) {
            addCriterion("transfer_time =", value, "transferTime");
            return (Criteria) this;
        }

        public Criteria andTransferTimeNotEqualTo(Date value) {
            addCriterion("transfer_time <>", value, "transferTime");
            return (Criteria) this;
        }

        public Criteria andTransferTimeGreaterThan(Date value) {
            addCriterion("transfer_time >", value, "transferTime");
            return (Criteria) this;
        }

        public Criteria andTransferTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("transfer_time >=", value, "transferTime");
            return (Criteria) this;
        }

        public Criteria andTransferTimeLessThan(Date value) {
            addCriterion("transfer_time <", value, "transferTime");
            return (Criteria) this;
        }

        public Criteria andTransferTimeLessThanOrEqualTo(Date value) {
            addCriterion("transfer_time <=", value, "transferTime");
            return (Criteria) this;
        }

        public Criteria andTransferTimeIn(List<Date> values) {
            addCriterion("transfer_time in", values, "transferTime");
            return (Criteria) this;
        }

        public Criteria andTransferTimeNotIn(List<Date> values) {
            addCriterion("transfer_time not in", values, "transferTime");
            return (Criteria) this;
        }

        public Criteria andTransferTimeBetween(Date value1, Date value2) {
            addCriterion("transfer_time between", value1, value2, "transferTime");
            return (Criteria) this;
        }

        public Criteria andTransferTimeNotBetween(Date value1, Date value2) {
            addCriterion("transfer_time not between", value1, value2, "transferTime");
            return (Criteria) this;
        }

        public Criteria andCArgumentDealIsNull() {
            addCriterion("c_argument_deal is null");
            return (Criteria) this;
        }

        public Criteria andCArgumentDealIsNotNull() {
            addCriterion("c_argument_deal is not null");
            return (Criteria) this;
        }

        public Criteria andCArgumentDealEqualTo(String value) {
            addCriterion("c_argument_deal =", value, "cArgumentDeal");
            return (Criteria) this;
        }

        public Criteria andCArgumentDealNotEqualTo(String value) {
            addCriterion("c_argument_deal <>", value, "cArgumentDeal");
            return (Criteria) this;
        }

        public Criteria andCArgumentDealGreaterThan(String value) {
            addCriterion("c_argument_deal >", value, "cArgumentDeal");
            return (Criteria) this;
        }

        public Criteria andCArgumentDealGreaterThanOrEqualTo(String value) {
            addCriterion("c_argument_deal >=", value, "cArgumentDeal");
            return (Criteria) this;
        }

        public Criteria andCArgumentDealLessThan(String value) {
            addCriterion("c_argument_deal <", value, "cArgumentDeal");
            return (Criteria) this;
        }

        public Criteria andCArgumentDealLessThanOrEqualTo(String value) {
            addCriterion("c_argument_deal <=", value, "cArgumentDeal");
            return (Criteria) this;
        }

        public Criteria andCArgumentDealLike(String value) {
            addCriterion("c_argument_deal like", value, "cArgumentDeal");
            return (Criteria) this;
        }

        public Criteria andCArgumentDealNotLike(String value) {
            addCriterion("c_argument_deal not like", value, "cArgumentDeal");
            return (Criteria) this;
        }

        public Criteria andCArgumentDealIn(List<String> values) {
            addCriterion("c_argument_deal in", values, "cArgumentDeal");
            return (Criteria) this;
        }

        public Criteria andCArgumentDealNotIn(List<String> values) {
            addCriterion("c_argument_deal not in", values, "cArgumentDeal");
            return (Criteria) this;
        }

        public Criteria andCArgumentDealBetween(String value1, String value2) {
            addCriterion("c_argument_deal between", value1, value2, "cArgumentDeal");
            return (Criteria) this;
        }

        public Criteria andCArgumentDealNotBetween(String value1, String value2) {
            addCriterion("c_argument_deal not between", value1, value2, "cArgumentDeal");
            return (Criteria) this;
        }

        public Criteria andIsNeedCheckIsNull() {
            addCriterion("is_need_check is null");
            return (Criteria) this;
        }

        public Criteria andIsNeedCheckIsNotNull() {
            addCriterion("is_need_check is not null");
            return (Criteria) this;
        }

        public Criteria andIsNeedCheckEqualTo(Integer value) {
            addCriterion("is_need_check =", value, "isNeedCheck");
            return (Criteria) this;
        }

        public Criteria andIsNeedCheckNotEqualTo(Integer value) {
            addCriterion("is_need_check <>", value, "isNeedCheck");
            return (Criteria) this;
        }

        public Criteria andIsNeedCheckGreaterThan(Integer value) {
            addCriterion("is_need_check >", value, "isNeedCheck");
            return (Criteria) this;
        }

        public Criteria andIsNeedCheckGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_need_check >=", value, "isNeedCheck");
            return (Criteria) this;
        }

        public Criteria andIsNeedCheckLessThan(Integer value) {
            addCriterion("is_need_check <", value, "isNeedCheck");
            return (Criteria) this;
        }

        public Criteria andIsNeedCheckLessThanOrEqualTo(Integer value) {
            addCriterion("is_need_check <=", value, "isNeedCheck");
            return (Criteria) this;
        }

        public Criteria andIsNeedCheckIn(List<Integer> values) {
            addCriterion("is_need_check in", values, "isNeedCheck");
            return (Criteria) this;
        }

        public Criteria andIsNeedCheckNotIn(List<Integer> values) {
            addCriterion("is_need_check not in", values, "isNeedCheck");
            return (Criteria) this;
        }

        public Criteria andIsNeedCheckBetween(Integer value1, Integer value2) {
            addCriterion("is_need_check between", value1, value2, "isNeedCheck");
            return (Criteria) this;
        }

        public Criteria andIsNeedCheckNotBetween(Integer value1, Integer value2) {
            addCriterion("is_need_check not between", value1, value2, "isNeedCheck");
            return (Criteria) this;
        }

        public Criteria andCourtNameIsNull() {
            addCriterion("court_name is null");
            return (Criteria) this;
        }

        public Criteria andCourtNameIsNotNull() {
            addCriterion("court_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourtNameEqualTo(String value) {
            addCriterion("court_name =", value, "courtName");
            return (Criteria) this;
        }

        public Criteria andCourtNameNotEqualTo(String value) {
            addCriterion("court_name <>", value, "courtName");
            return (Criteria) this;
        }

        public Criteria andCourtNameGreaterThan(String value) {
            addCriterion("court_name >", value, "courtName");
            return (Criteria) this;
        }

        public Criteria andCourtNameGreaterThanOrEqualTo(String value) {
            addCriterion("court_name >=", value, "courtName");
            return (Criteria) this;
        }

        public Criteria andCourtNameLessThan(String value) {
            addCriterion("court_name <", value, "courtName");
            return (Criteria) this;
        }

        public Criteria andCourtNameLessThanOrEqualTo(String value) {
            addCriterion("court_name <=", value, "courtName");
            return (Criteria) this;
        }

        public Criteria andCourtNameLike(String value) {
            addCriterion("court_name like", value, "courtName");
            return (Criteria) this;
        }

        public Criteria andCourtNameNotLike(String value) {
            addCriterion("court_name not like", value, "courtName");
            return (Criteria) this;
        }

        public Criteria andCourtNameIn(List<String> values) {
            addCriterion("court_name in", values, "courtName");
            return (Criteria) this;
        }

        public Criteria andCourtNameNotIn(List<String> values) {
            addCriterion("court_name not in", values, "courtName");
            return (Criteria) this;
        }

        public Criteria andCourtNameBetween(String value1, String value2) {
            addCriterion("court_name between", value1, value2, "courtName");
            return (Criteria) this;
        }

        public Criteria andCourtNameNotBetween(String value1, String value2) {
            addCriterion("court_name not between", value1, value2, "courtName");
            return (Criteria) this;
        }

        public Criteria andCPersonalMarkIsNull() {
            addCriterion("c_personal_mark is null");
            return (Criteria) this;
        }

        public Criteria andCPersonalMarkIsNotNull() {
            addCriterion("c_personal_mark is not null");
            return (Criteria) this;
        }

        public Criteria andCPersonalMarkEqualTo(String value) {
            addCriterion("c_personal_mark =", value, "cPersonalMark");
            return (Criteria) this;
        }

        public Criteria andCPersonalMarkNotEqualTo(String value) {
            addCriterion("c_personal_mark <>", value, "cPersonalMark");
            return (Criteria) this;
        }

        public Criteria andCPersonalMarkGreaterThan(String value) {
            addCriterion("c_personal_mark >", value, "cPersonalMark");
            return (Criteria) this;
        }

        public Criteria andCPersonalMarkGreaterThanOrEqualTo(String value) {
            addCriterion("c_personal_mark >=", value, "cPersonalMark");
            return (Criteria) this;
        }

        public Criteria andCPersonalMarkLessThan(String value) {
            addCriterion("c_personal_mark <", value, "cPersonalMark");
            return (Criteria) this;
        }

        public Criteria andCPersonalMarkLessThanOrEqualTo(String value) {
            addCriterion("c_personal_mark <=", value, "cPersonalMark");
            return (Criteria) this;
        }

        public Criteria andCPersonalMarkLike(String value) {
            addCriterion("c_personal_mark like", value, "cPersonalMark");
            return (Criteria) this;
        }

        public Criteria andCPersonalMarkNotLike(String value) {
            addCriterion("c_personal_mark not like", value, "cPersonalMark");
            return (Criteria) this;
        }

        public Criteria andCPersonalMarkIn(List<String> values) {
            addCriterion("c_personal_mark in", values, "cPersonalMark");
            return (Criteria) this;
        }

        public Criteria andCPersonalMarkNotIn(List<String> values) {
            addCriterion("c_personal_mark not in", values, "cPersonalMark");
            return (Criteria) this;
        }

        public Criteria andCPersonalMarkBetween(String value1, String value2) {
            addCriterion("c_personal_mark between", value1, value2, "cPersonalMark");
            return (Criteria) this;
        }

        public Criteria andCPersonalMarkNotBetween(String value1, String value2) {
            addCriterion("c_personal_mark not between", value1, value2, "cPersonalMark");
            return (Criteria) this;
        }

        public Criteria andCFleetMrkIsNull() {
            addCriterion("c_fleet_mrk is null");
            return (Criteria) this;
        }

        public Criteria andCFleetMrkIsNotNull() {
            addCriterion("c_fleet_mrk is not null");
            return (Criteria) this;
        }

        public Criteria andCFleetMrkEqualTo(String value) {
            addCriterion("c_fleet_mrk =", value, "cFleetMrk");
            return (Criteria) this;
        }

        public Criteria andCFleetMrkNotEqualTo(String value) {
            addCriterion("c_fleet_mrk <>", value, "cFleetMrk");
            return (Criteria) this;
        }

        public Criteria andCFleetMrkGreaterThan(String value) {
            addCriterion("c_fleet_mrk >", value, "cFleetMrk");
            return (Criteria) this;
        }

        public Criteria andCFleetMrkGreaterThanOrEqualTo(String value) {
            addCriterion("c_fleet_mrk >=", value, "cFleetMrk");
            return (Criteria) this;
        }

        public Criteria andCFleetMrkLessThan(String value) {
            addCriterion("c_fleet_mrk <", value, "cFleetMrk");
            return (Criteria) this;
        }

        public Criteria andCFleetMrkLessThanOrEqualTo(String value) {
            addCriterion("c_fleet_mrk <=", value, "cFleetMrk");
            return (Criteria) this;
        }

        public Criteria andCFleetMrkLike(String value) {
            addCriterion("c_fleet_mrk like", value, "cFleetMrk");
            return (Criteria) this;
        }

        public Criteria andCFleetMrkNotLike(String value) {
            addCriterion("c_fleet_mrk not like", value, "cFleetMrk");
            return (Criteria) this;
        }

        public Criteria andCFleetMrkIn(List<String> values) {
            addCriterion("c_fleet_mrk in", values, "cFleetMrk");
            return (Criteria) this;
        }

        public Criteria andCFleetMrkNotIn(List<String> values) {
            addCriterion("c_fleet_mrk not in", values, "cFleetMrk");
            return (Criteria) this;
        }

        public Criteria andCFleetMrkBetween(String value1, String value2) {
            addCriterion("c_fleet_mrk between", value1, value2, "cFleetMrk");
            return (Criteria) this;
        }

        public Criteria andCFleetMrkNotBetween(String value1, String value2) {
            addCriterion("c_fleet_mrk not between", value1, value2, "cFleetMrk");
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