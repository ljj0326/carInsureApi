package com.songzhi.carInsure.web.po;

import java.util.ArrayList;
import java.util.List;

public class TRiskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TRiskExample() {
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

        public Criteria andRiskCodeIsNull() {
            addCriterion("risk_code is null");
            return (Criteria) this;
        }

        public Criteria andRiskCodeIsNotNull() {
            addCriterion("risk_code is not null");
            return (Criteria) this;
        }

        public Criteria andRiskCodeEqualTo(String value) {
            addCriterion("risk_code =", value, "riskCode");
            return (Criteria) this;
        }

        public Criteria andRiskCodeNotEqualTo(String value) {
            addCriterion("risk_code <>", value, "riskCode");
            return (Criteria) this;
        }

        public Criteria andRiskCodeGreaterThan(String value) {
            addCriterion("risk_code >", value, "riskCode");
            return (Criteria) this;
        }

        public Criteria andRiskCodeGreaterThanOrEqualTo(String value) {
            addCriterion("risk_code >=", value, "riskCode");
            return (Criteria) this;
        }

        public Criteria andRiskCodeLessThan(String value) {
            addCriterion("risk_code <", value, "riskCode");
            return (Criteria) this;
        }

        public Criteria andRiskCodeLessThanOrEqualTo(String value) {
            addCriterion("risk_code <=", value, "riskCode");
            return (Criteria) this;
        }

        public Criteria andRiskCodeLike(String value) {
            addCriterion("risk_code like", value, "riskCode");
            return (Criteria) this;
        }

        public Criteria andRiskCodeNotLike(String value) {
            addCriterion("risk_code not like", value, "riskCode");
            return (Criteria) this;
        }

        public Criteria andRiskCodeIn(List<String> values) {
            addCriterion("risk_code in", values, "riskCode");
            return (Criteria) this;
        }

        public Criteria andRiskCodeNotIn(List<String> values) {
            addCriterion("risk_code not in", values, "riskCode");
            return (Criteria) this;
        }

        public Criteria andRiskCodeBetween(String value1, String value2) {
            addCriterion("risk_code between", value1, value2, "riskCode");
            return (Criteria) this;
        }

        public Criteria andRiskCodeNotBetween(String value1, String value2) {
            addCriterion("risk_code not between", value1, value2, "riskCode");
            return (Criteria) this;
        }

        public Criteria andRiskNameIsNull() {
            addCriterion("risk_name is null");
            return (Criteria) this;
        }

        public Criteria andRiskNameIsNotNull() {
            addCriterion("risk_name is not null");
            return (Criteria) this;
        }

        public Criteria andRiskNameEqualTo(String value) {
            addCriterion("risk_name =", value, "riskName");
            return (Criteria) this;
        }

        public Criteria andRiskNameNotEqualTo(String value) {
            addCriterion("risk_name <>", value, "riskName");
            return (Criteria) this;
        }

        public Criteria andRiskNameGreaterThan(String value) {
            addCriterion("risk_name >", value, "riskName");
            return (Criteria) this;
        }

        public Criteria andRiskNameGreaterThanOrEqualTo(String value) {
            addCriterion("risk_name >=", value, "riskName");
            return (Criteria) this;
        }

        public Criteria andRiskNameLessThan(String value) {
            addCriterion("risk_name <", value, "riskName");
            return (Criteria) this;
        }

        public Criteria andRiskNameLessThanOrEqualTo(String value) {
            addCriterion("risk_name <=", value, "riskName");
            return (Criteria) this;
        }

        public Criteria andRiskNameLike(String value) {
            addCriterion("risk_name like", value, "riskName");
            return (Criteria) this;
        }

        public Criteria andRiskNameNotLike(String value) {
            addCriterion("risk_name not like", value, "riskName");
            return (Criteria) this;
        }

        public Criteria andRiskNameIn(List<String> values) {
            addCriterion("risk_name in", values, "riskName");
            return (Criteria) this;
        }

        public Criteria andRiskNameNotIn(List<String> values) {
            addCriterion("risk_name not in", values, "riskName");
            return (Criteria) this;
        }

        public Criteria andRiskNameBetween(String value1, String value2) {
            addCriterion("risk_name between", value1, value2, "riskName");
            return (Criteria) this;
        }

        public Criteria andRiskNameNotBetween(String value1, String value2) {
            addCriterion("risk_name not between", value1, value2, "riskName");
            return (Criteria) this;
        }

        public Criteria andInsuranceAmountIsNull() {
            addCriterion("insurance_amount is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceAmountIsNotNull() {
            addCriterion("insurance_amount is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceAmountEqualTo(Double value) {
            addCriterion("insurance_amount =", value, "insuranceAmount");
            return (Criteria) this;
        }

        public Criteria andInsuranceAmountNotEqualTo(Double value) {
            addCriterion("insurance_amount <>", value, "insuranceAmount");
            return (Criteria) this;
        }

        public Criteria andInsuranceAmountGreaterThan(Double value) {
            addCriterion("insurance_amount >", value, "insuranceAmount");
            return (Criteria) this;
        }

        public Criteria andInsuranceAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("insurance_amount >=", value, "insuranceAmount");
            return (Criteria) this;
        }

        public Criteria andInsuranceAmountLessThan(Double value) {
            addCriterion("insurance_amount <", value, "insuranceAmount");
            return (Criteria) this;
        }

        public Criteria andInsuranceAmountLessThanOrEqualTo(Double value) {
            addCriterion("insurance_amount <=", value, "insuranceAmount");
            return (Criteria) this;
        }

        public Criteria andInsuranceAmountIn(List<Double> values) {
            addCriterion("insurance_amount in", values, "insuranceAmount");
            return (Criteria) this;
        }

        public Criteria andInsuranceAmountNotIn(List<Double> values) {
            addCriterion("insurance_amount not in", values, "insuranceAmount");
            return (Criteria) this;
        }

        public Criteria andInsuranceAmountBetween(Double value1, Double value2) {
            addCriterion("insurance_amount between", value1, value2, "insuranceAmount");
            return (Criteria) this;
        }

        public Criteria andInsuranceAmountNotBetween(Double value1, Double value2) {
            addCriterion("insurance_amount not between", value1, value2, "insuranceAmount");
            return (Criteria) this;
        }

        public Criteria andInsuranceMoneyIsNull() {
            addCriterion("insurance_money is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceMoneyIsNotNull() {
            addCriterion("insurance_money is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceMoneyEqualTo(Double value) {
            addCriterion("insurance_money =", value, "insuranceMoney");
            return (Criteria) this;
        }

        public Criteria andInsuranceMoneyNotEqualTo(Double value) {
            addCriterion("insurance_money <>", value, "insuranceMoney");
            return (Criteria) this;
        }

        public Criteria andInsuranceMoneyGreaterThan(Double value) {
            addCriterion("insurance_money >", value, "insuranceMoney");
            return (Criteria) this;
        }

        public Criteria andInsuranceMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("insurance_money >=", value, "insuranceMoney");
            return (Criteria) this;
        }

        public Criteria andInsuranceMoneyLessThan(Double value) {
            addCriterion("insurance_money <", value, "insuranceMoney");
            return (Criteria) this;
        }

        public Criteria andInsuranceMoneyLessThanOrEqualTo(Double value) {
            addCriterion("insurance_money <=", value, "insuranceMoney");
            return (Criteria) this;
        }

        public Criteria andInsuranceMoneyIn(List<Double> values) {
            addCriterion("insurance_money in", values, "insuranceMoney");
            return (Criteria) this;
        }

        public Criteria andInsuranceMoneyNotIn(List<Double> values) {
            addCriterion("insurance_money not in", values, "insuranceMoney");
            return (Criteria) this;
        }

        public Criteria andInsuranceMoneyBetween(Double value1, Double value2) {
            addCriterion("insurance_money between", value1, value2, "insuranceMoney");
            return (Criteria) this;
        }

        public Criteria andInsuranceMoneyNotBetween(Double value1, Double value2) {
            addCriterion("insurance_money not between", value1, value2, "insuranceMoney");
            return (Criteria) this;
        }

        public Criteria andGlassCodeIsNull() {
            addCriterion("glass_code is null");
            return (Criteria) this;
        }

        public Criteria andGlassCodeIsNotNull() {
            addCriterion("glass_code is not null");
            return (Criteria) this;
        }

        public Criteria andGlassCodeEqualTo(String value) {
            addCriterion("glass_code =", value, "glassCode");
            return (Criteria) this;
        }

        public Criteria andGlassCodeNotEqualTo(String value) {
            addCriterion("glass_code <>", value, "glassCode");
            return (Criteria) this;
        }

        public Criteria andGlassCodeGreaterThan(String value) {
            addCriterion("glass_code >", value, "glassCode");
            return (Criteria) this;
        }

        public Criteria andGlassCodeGreaterThanOrEqualTo(String value) {
            addCriterion("glass_code >=", value, "glassCode");
            return (Criteria) this;
        }

        public Criteria andGlassCodeLessThan(String value) {
            addCriterion("glass_code <", value, "glassCode");
            return (Criteria) this;
        }

        public Criteria andGlassCodeLessThanOrEqualTo(String value) {
            addCriterion("glass_code <=", value, "glassCode");
            return (Criteria) this;
        }

        public Criteria andGlassCodeLike(String value) {
            addCriterion("glass_code like", value, "glassCode");
            return (Criteria) this;
        }

        public Criteria andGlassCodeNotLike(String value) {
            addCriterion("glass_code not like", value, "glassCode");
            return (Criteria) this;
        }

        public Criteria andGlassCodeIn(List<String> values) {
            addCriterion("glass_code in", values, "glassCode");
            return (Criteria) this;
        }

        public Criteria andGlassCodeNotIn(List<String> values) {
            addCriterion("glass_code not in", values, "glassCode");
            return (Criteria) this;
        }

        public Criteria andGlassCodeBetween(String value1, String value2) {
            addCriterion("glass_code between", value1, value2, "glassCode");
            return (Criteria) this;
        }

        public Criteria andGlassCodeNotBetween(String value1, String value2) {
            addCriterion("glass_code not between", value1, value2, "glassCode");
            return (Criteria) this;
        }

        public Criteria andGlassCategoryIsNull() {
            addCriterion("glass_category is null");
            return (Criteria) this;
        }

        public Criteria andGlassCategoryIsNotNull() {
            addCriterion("glass_category is not null");
            return (Criteria) this;
        }

        public Criteria andGlassCategoryEqualTo(String value) {
            addCriterion("glass_category =", value, "glassCategory");
            return (Criteria) this;
        }

        public Criteria andGlassCategoryNotEqualTo(String value) {
            addCriterion("glass_category <>", value, "glassCategory");
            return (Criteria) this;
        }

        public Criteria andGlassCategoryGreaterThan(String value) {
            addCriterion("glass_category >", value, "glassCategory");
            return (Criteria) this;
        }

        public Criteria andGlassCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("glass_category >=", value, "glassCategory");
            return (Criteria) this;
        }

        public Criteria andGlassCategoryLessThan(String value) {
            addCriterion("glass_category <", value, "glassCategory");
            return (Criteria) this;
        }

        public Criteria andGlassCategoryLessThanOrEqualTo(String value) {
            addCriterion("glass_category <=", value, "glassCategory");
            return (Criteria) this;
        }

        public Criteria andGlassCategoryLike(String value) {
            addCriterion("glass_category like", value, "glassCategory");
            return (Criteria) this;
        }

        public Criteria andGlassCategoryNotLike(String value) {
            addCriterion("glass_category not like", value, "glassCategory");
            return (Criteria) this;
        }

        public Criteria andGlassCategoryIn(List<String> values) {
            addCriterion("glass_category in", values, "glassCategory");
            return (Criteria) this;
        }

        public Criteria andGlassCategoryNotIn(List<String> values) {
            addCriterion("glass_category not in", values, "glassCategory");
            return (Criteria) this;
        }

        public Criteria andGlassCategoryBetween(String value1, String value2) {
            addCriterion("glass_category between", value1, value2, "glassCategory");
            return (Criteria) this;
        }

        public Criteria andGlassCategoryNotBetween(String value1, String value2) {
            addCriterion("glass_category not between", value1, value2, "glassCategory");
            return (Criteria) this;
        }

        public Criteria andSeatNumIsNull() {
            addCriterion("seat_num is null");
            return (Criteria) this;
        }

        public Criteria andSeatNumIsNotNull() {
            addCriterion("seat_num is not null");
            return (Criteria) this;
        }

        public Criteria andSeatNumEqualTo(Integer value) {
            addCriterion("seat_num =", value, "seatNum");
            return (Criteria) this;
        }

        public Criteria andSeatNumNotEqualTo(Integer value) {
            addCriterion("seat_num <>", value, "seatNum");
            return (Criteria) this;
        }

        public Criteria andSeatNumGreaterThan(Integer value) {
            addCriterion("seat_num >", value, "seatNum");
            return (Criteria) this;
        }

        public Criteria andSeatNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("seat_num >=", value, "seatNum");
            return (Criteria) this;
        }

        public Criteria andSeatNumLessThan(Integer value) {
            addCriterion("seat_num <", value, "seatNum");
            return (Criteria) this;
        }

        public Criteria andSeatNumLessThanOrEqualTo(Integer value) {
            addCriterion("seat_num <=", value, "seatNum");
            return (Criteria) this;
        }

        public Criteria andSeatNumIn(List<Integer> values) {
            addCriterion("seat_num in", values, "seatNum");
            return (Criteria) this;
        }

        public Criteria andSeatNumNotIn(List<Integer> values) {
            addCriterion("seat_num not in", values, "seatNum");
            return (Criteria) this;
        }

        public Criteria andSeatNumBetween(Integer value1, Integer value2) {
            addCriterion("seat_num between", value1, value2, "seatNum");
            return (Criteria) this;
        }

        public Criteria andSeatNumNotBetween(Integer value1, Integer value2) {
            addCriterion("seat_num not between", value1, value2, "seatNum");
            return (Criteria) this;
        }

        public Criteria andCompensateDayIsNull() {
            addCriterion("compensate_day is null");
            return (Criteria) this;
        }

        public Criteria andCompensateDayIsNotNull() {
            addCriterion("compensate_day is not null");
            return (Criteria) this;
        }

        public Criteria andCompensateDayEqualTo(Integer value) {
            addCriterion("compensate_day =", value, "compensateDay");
            return (Criteria) this;
        }

        public Criteria andCompensateDayNotEqualTo(Integer value) {
            addCriterion("compensate_day <>", value, "compensateDay");
            return (Criteria) this;
        }

        public Criteria andCompensateDayGreaterThan(Integer value) {
            addCriterion("compensate_day >", value, "compensateDay");
            return (Criteria) this;
        }

        public Criteria andCompensateDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("compensate_day >=", value, "compensateDay");
            return (Criteria) this;
        }

        public Criteria andCompensateDayLessThan(Integer value) {
            addCriterion("compensate_day <", value, "compensateDay");
            return (Criteria) this;
        }

        public Criteria andCompensateDayLessThanOrEqualTo(Integer value) {
            addCriterion("compensate_day <=", value, "compensateDay");
            return (Criteria) this;
        }

        public Criteria andCompensateDayIn(List<Integer> values) {
            addCriterion("compensate_day in", values, "compensateDay");
            return (Criteria) this;
        }

        public Criteria andCompensateDayNotIn(List<Integer> values) {
            addCriterion("compensate_day not in", values, "compensateDay");
            return (Criteria) this;
        }

        public Criteria andCompensateDayBetween(Integer value1, Integer value2) {
            addCriterion("compensate_day between", value1, value2, "compensateDay");
            return (Criteria) this;
        }

        public Criteria andCompensateDayNotBetween(Integer value1, Integer value2) {
            addCriterion("compensate_day not between", value1, value2, "compensateDay");
            return (Criteria) this;
        }

        public Criteria andCompensateMoenyIsNull() {
            addCriterion("compensate_moeny is null");
            return (Criteria) this;
        }

        public Criteria andCompensateMoenyIsNotNull() {
            addCriterion("compensate_moeny is not null");
            return (Criteria) this;
        }

        public Criteria andCompensateMoenyEqualTo(Double value) {
            addCriterion("compensate_moeny =", value, "compensateMoeny");
            return (Criteria) this;
        }

        public Criteria andCompensateMoenyNotEqualTo(Double value) {
            addCriterion("compensate_moeny <>", value, "compensateMoeny");
            return (Criteria) this;
        }

        public Criteria andCompensateMoenyGreaterThan(Double value) {
            addCriterion("compensate_moeny >", value, "compensateMoeny");
            return (Criteria) this;
        }

        public Criteria andCompensateMoenyGreaterThanOrEqualTo(Double value) {
            addCriterion("compensate_moeny >=", value, "compensateMoeny");
            return (Criteria) this;
        }

        public Criteria andCompensateMoenyLessThan(Double value) {
            addCriterion("compensate_moeny <", value, "compensateMoeny");
            return (Criteria) this;
        }

        public Criteria andCompensateMoenyLessThanOrEqualTo(Double value) {
            addCriterion("compensate_moeny <=", value, "compensateMoeny");
            return (Criteria) this;
        }

        public Criteria andCompensateMoenyIn(List<Double> values) {
            addCriterion("compensate_moeny in", values, "compensateMoeny");
            return (Criteria) this;
        }

        public Criteria andCompensateMoenyNotIn(List<Double> values) {
            addCriterion("compensate_moeny not in", values, "compensateMoeny");
            return (Criteria) this;
        }

        public Criteria andCompensateMoenyBetween(Double value1, Double value2) {
            addCriterion("compensate_moeny between", value1, value2, "compensateMoeny");
            return (Criteria) this;
        }

        public Criteria andCompensateMoenyNotBetween(Double value1, Double value2) {
            addCriterion("compensate_moeny not between", value1, value2, "compensateMoeny");
            return (Criteria) this;
        }

        public Criteria andChineseOtherIsNull() {
            addCriterion("chinese_other is null");
            return (Criteria) this;
        }

        public Criteria andChineseOtherIsNotNull() {
            addCriterion("chinese_other is not null");
            return (Criteria) this;
        }

        public Criteria andChineseOtherEqualTo(Integer value) {
            addCriterion("chinese_other =", value, "chineseOther");
            return (Criteria) this;
        }

        public Criteria andChineseOtherNotEqualTo(Integer value) {
            addCriterion("chinese_other <>", value, "chineseOther");
            return (Criteria) this;
        }

        public Criteria andChineseOtherGreaterThan(Integer value) {
            addCriterion("chinese_other >", value, "chineseOther");
            return (Criteria) this;
        }

        public Criteria andChineseOtherGreaterThanOrEqualTo(Integer value) {
            addCriterion("chinese_other >=", value, "chineseOther");
            return (Criteria) this;
        }

        public Criteria andChineseOtherLessThan(Integer value) {
            addCriterion("chinese_other <", value, "chineseOther");
            return (Criteria) this;
        }

        public Criteria andChineseOtherLessThanOrEqualTo(Integer value) {
            addCriterion("chinese_other <=", value, "chineseOther");
            return (Criteria) this;
        }

        public Criteria andChineseOtherIn(List<Integer> values) {
            addCriterion("chinese_other in", values, "chineseOther");
            return (Criteria) this;
        }

        public Criteria andChineseOtherNotIn(List<Integer> values) {
            addCriterion("chinese_other not in", values, "chineseOther");
            return (Criteria) this;
        }

        public Criteria andChineseOtherBetween(Integer value1, Integer value2) {
            addCriterion("chinese_other between", value1, value2, "chineseOther");
            return (Criteria) this;
        }

        public Criteria andChineseOtherNotBetween(Integer value1, Integer value2) {
            addCriterion("chinese_other not between", value1, value2, "chineseOther");
            return (Criteria) this;
        }

        public Criteria andRepairNumIsNull() {
            addCriterion("repair_num is null");
            return (Criteria) this;
        }

        public Criteria andRepairNumIsNotNull() {
            addCriterion("repair_num is not null");
            return (Criteria) this;
        }

        public Criteria andRepairNumEqualTo(Double value) {
            addCriterion("repair_num =", value, "repairNum");
            return (Criteria) this;
        }

        public Criteria andRepairNumNotEqualTo(Double value) {
            addCriterion("repair_num <>", value, "repairNum");
            return (Criteria) this;
        }

        public Criteria andRepairNumGreaterThan(Double value) {
            addCriterion("repair_num >", value, "repairNum");
            return (Criteria) this;
        }

        public Criteria andRepairNumGreaterThanOrEqualTo(Double value) {
            addCriterion("repair_num >=", value, "repairNum");
            return (Criteria) this;
        }

        public Criteria andRepairNumLessThan(Double value) {
            addCriterion("repair_num <", value, "repairNum");
            return (Criteria) this;
        }

        public Criteria andRepairNumLessThanOrEqualTo(Double value) {
            addCriterion("repair_num <=", value, "repairNum");
            return (Criteria) this;
        }

        public Criteria andRepairNumIn(List<Double> values) {
            addCriterion("repair_num in", values, "repairNum");
            return (Criteria) this;
        }

        public Criteria andRepairNumNotIn(List<Double> values) {
            addCriterion("repair_num not in", values, "repairNum");
            return (Criteria) this;
        }

        public Criteria andRepairNumBetween(Double value1, Double value2) {
            addCriterion("repair_num between", value1, value2, "repairNum");
            return (Criteria) this;
        }

        public Criteria andRepairNumNotBetween(Double value1, Double value2) {
            addCriterion("repair_num not between", value1, value2, "repairNum");
            return (Criteria) this;
        }

        public Criteria andNSeqNoIsNull() {
            addCriterion("n_seq_no is null");
            return (Criteria) this;
        }

        public Criteria andNSeqNoIsNotNull() {
            addCriterion("n_seq_no is not null");
            return (Criteria) this;
        }

        public Criteria andNSeqNoEqualTo(Integer value) {
            addCriterion("n_seq_no =", value, "nSeqNo");
            return (Criteria) this;
        }

        public Criteria andNSeqNoNotEqualTo(Integer value) {
            addCriterion("n_seq_no <>", value, "nSeqNo");
            return (Criteria) this;
        }

        public Criteria andNSeqNoGreaterThan(Integer value) {
            addCriterion("n_seq_no >", value, "nSeqNo");
            return (Criteria) this;
        }

        public Criteria andNSeqNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_seq_no >=", value, "nSeqNo");
            return (Criteria) this;
        }

        public Criteria andNSeqNoLessThan(Integer value) {
            addCriterion("n_seq_no <", value, "nSeqNo");
            return (Criteria) this;
        }

        public Criteria andNSeqNoLessThanOrEqualTo(Integer value) {
            addCriterion("n_seq_no <=", value, "nSeqNo");
            return (Criteria) this;
        }

        public Criteria andNSeqNoIn(List<Integer> values) {
            addCriterion("n_seq_no in", values, "nSeqNo");
            return (Criteria) this;
        }

        public Criteria andNSeqNoNotIn(List<Integer> values) {
            addCriterion("n_seq_no not in", values, "nSeqNo");
            return (Criteria) this;
        }

        public Criteria andNSeqNoBetween(Integer value1, Integer value2) {
            addCriterion("n_seq_no between", value1, value2, "nSeqNo");
            return (Criteria) this;
        }

        public Criteria andNSeqNoNotBetween(Integer value1, Integer value2) {
            addCriterion("n_seq_no not between", value1, value2, "nSeqNo");
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