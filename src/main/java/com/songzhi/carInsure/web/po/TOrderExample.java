package com.songzhi.carInsure.web.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TOrderExample() {
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

        public Criteria andIncludIdIsNull() {
            addCriterion("includ_id is null");
            return (Criteria) this;
        }

        public Criteria andIncludIdIsNotNull() {
            addCriterion("includ_id is not null");
            return (Criteria) this;
        }

        public Criteria andIncludIdEqualTo(String value) {
            addCriterion("includ_id =", value, "includId");
            return (Criteria) this;
        }

        public Criteria andIncludIdNotEqualTo(String value) {
            addCriterion("includ_id <>", value, "includId");
            return (Criteria) this;
        }

        public Criteria andIncludIdGreaterThan(String value) {
            addCriterion("includ_id >", value, "includId");
            return (Criteria) this;
        }

        public Criteria andIncludIdGreaterThanOrEqualTo(String value) {
            addCriterion("includ_id >=", value, "includId");
            return (Criteria) this;
        }

        public Criteria andIncludIdLessThan(String value) {
            addCriterion("includ_id <", value, "includId");
            return (Criteria) this;
        }

        public Criteria andIncludIdLessThanOrEqualTo(String value) {
            addCriterion("includ_id <=", value, "includId");
            return (Criteria) this;
        }

        public Criteria andIncludIdLike(String value) {
            addCriterion("includ_id like", value, "includId");
            return (Criteria) this;
        }

        public Criteria andIncludIdNotLike(String value) {
            addCriterion("includ_id not like", value, "includId");
            return (Criteria) this;
        }

        public Criteria andIncludIdIn(List<String> values) {
            addCriterion("includ_id in", values, "includId");
            return (Criteria) this;
        }

        public Criteria andIncludIdNotIn(List<String> values) {
            addCriterion("includ_id not in", values, "includId");
            return (Criteria) this;
        }

        public Criteria andIncludIdBetween(String value1, String value2) {
            addCriterion("includ_id between", value1, value2, "includId");
            return (Criteria) this;
        }

        public Criteria andIncludIdNotBetween(String value1, String value2) {
            addCriterion("includ_id not between", value1, value2, "includId");
            return (Criteria) this;
        }

        public Criteria andIssueCodeIsNull() {
            addCriterion("issue_code is null");
            return (Criteria) this;
        }

        public Criteria andIssueCodeIsNotNull() {
            addCriterion("issue_code is not null");
            return (Criteria) this;
        }

        public Criteria andIssueCodeEqualTo(String value) {
            addCriterion("issue_code =", value, "issueCode");
            return (Criteria) this;
        }

        public Criteria andIssueCodeNotEqualTo(String value) {
            addCriterion("issue_code <>", value, "issueCode");
            return (Criteria) this;
        }

        public Criteria andIssueCodeGreaterThan(String value) {
            addCriterion("issue_code >", value, "issueCode");
            return (Criteria) this;
        }

        public Criteria andIssueCodeGreaterThanOrEqualTo(String value) {
            addCriterion("issue_code >=", value, "issueCode");
            return (Criteria) this;
        }

        public Criteria andIssueCodeLessThan(String value) {
            addCriterion("issue_code <", value, "issueCode");
            return (Criteria) this;
        }

        public Criteria andIssueCodeLessThanOrEqualTo(String value) {
            addCriterion("issue_code <=", value, "issueCode");
            return (Criteria) this;
        }

        public Criteria andIssueCodeLike(String value) {
            addCriterion("issue_code like", value, "issueCode");
            return (Criteria) this;
        }

        public Criteria andIssueCodeNotLike(String value) {
            addCriterion("issue_code not like", value, "issueCode");
            return (Criteria) this;
        }

        public Criteria andIssueCodeIn(List<String> values) {
            addCriterion("issue_code in", values, "issueCode");
            return (Criteria) this;
        }

        public Criteria andIssueCodeNotIn(List<String> values) {
            addCriterion("issue_code not in", values, "issueCode");
            return (Criteria) this;
        }

        public Criteria andIssueCodeBetween(String value1, String value2) {
            addCriterion("issue_code between", value1, value2, "issueCode");
            return (Criteria) this;
        }

        public Criteria andIssueCodeNotBetween(String value1, String value2) {
            addCriterion("issue_code not between", value1, value2, "issueCode");
            return (Criteria) this;
        }

        public Criteria andIssueIsNull() {
            addCriterion("Issue is null");
            return (Criteria) this;
        }

        public Criteria andIssueIsNotNull() {
            addCriterion("Issue is not null");
            return (Criteria) this;
        }

        public Criteria andIssueEqualTo(String value) {
            addCriterion("Issue =", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueNotEqualTo(String value) {
            addCriterion("Issue <>", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueGreaterThan(String value) {
            addCriterion("Issue >", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueGreaterThanOrEqualTo(String value) {
            addCriterion("Issue >=", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueLessThan(String value) {
            addCriterion("Issue <", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueLessThanOrEqualTo(String value) {
            addCriterion("Issue <=", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueLike(String value) {
            addCriterion("Issue like", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueNotLike(String value) {
            addCriterion("Issue not like", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueIn(List<String> values) {
            addCriterion("Issue in", values, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueNotIn(List<String> values) {
            addCriterion("Issue not in", values, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueBetween(String value1, String value2) {
            addCriterion("Issue between", value1, value2, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueNotBetween(String value1, String value2) {
            addCriterion("Issue not between", value1, value2, "issue");
            return (Criteria) this;
        }

        public Criteria andTrenchCodeIsNull() {
            addCriterion("trench_code is null");
            return (Criteria) this;
        }

        public Criteria andTrenchCodeIsNotNull() {
            addCriterion("trench_code is not null");
            return (Criteria) this;
        }

        public Criteria andTrenchCodeEqualTo(String value) {
            addCriterion("trench_code =", value, "trenchCode");
            return (Criteria) this;
        }

        public Criteria andTrenchCodeNotEqualTo(String value) {
            addCriterion("trench_code <>", value, "trenchCode");
            return (Criteria) this;
        }

        public Criteria andTrenchCodeGreaterThan(String value) {
            addCriterion("trench_code >", value, "trenchCode");
            return (Criteria) this;
        }

        public Criteria andTrenchCodeGreaterThanOrEqualTo(String value) {
            addCriterion("trench_code >=", value, "trenchCode");
            return (Criteria) this;
        }

        public Criteria andTrenchCodeLessThan(String value) {
            addCriterion("trench_code <", value, "trenchCode");
            return (Criteria) this;
        }

        public Criteria andTrenchCodeLessThanOrEqualTo(String value) {
            addCriterion("trench_code <=", value, "trenchCode");
            return (Criteria) this;
        }

        public Criteria andTrenchCodeLike(String value) {
            addCriterion("trench_code like", value, "trenchCode");
            return (Criteria) this;
        }

        public Criteria andTrenchCodeNotLike(String value) {
            addCriterion("trench_code not like", value, "trenchCode");
            return (Criteria) this;
        }

        public Criteria andTrenchCodeIn(List<String> values) {
            addCriterion("trench_code in", values, "trenchCode");
            return (Criteria) this;
        }

        public Criteria andTrenchCodeNotIn(List<String> values) {
            addCriterion("trench_code not in", values, "trenchCode");
            return (Criteria) this;
        }

        public Criteria andTrenchCodeBetween(String value1, String value2) {
            addCriterion("trench_code between", value1, value2, "trenchCode");
            return (Criteria) this;
        }

        public Criteria andTrenchCodeNotBetween(String value1, String value2) {
            addCriterion("trench_code not between", value1, value2, "trenchCode");
            return (Criteria) this;
        }

        public Criteria andTrenchIsNull() {
            addCriterion("trench is null");
            return (Criteria) this;
        }

        public Criteria andTrenchIsNotNull() {
            addCriterion("trench is not null");
            return (Criteria) this;
        }

        public Criteria andTrenchEqualTo(String value) {
            addCriterion("trench =", value, "trench");
            return (Criteria) this;
        }

        public Criteria andTrenchNotEqualTo(String value) {
            addCriterion("trench <>", value, "trench");
            return (Criteria) this;
        }

        public Criteria andTrenchGreaterThan(String value) {
            addCriterion("trench >", value, "trench");
            return (Criteria) this;
        }

        public Criteria andTrenchGreaterThanOrEqualTo(String value) {
            addCriterion("trench >=", value, "trench");
            return (Criteria) this;
        }

        public Criteria andTrenchLessThan(String value) {
            addCriterion("trench <", value, "trench");
            return (Criteria) this;
        }

        public Criteria andTrenchLessThanOrEqualTo(String value) {
            addCriterion("trench <=", value, "trench");
            return (Criteria) this;
        }

        public Criteria andTrenchLike(String value) {
            addCriterion("trench like", value, "trench");
            return (Criteria) this;
        }

        public Criteria andTrenchNotLike(String value) {
            addCriterion("trench not like", value, "trench");
            return (Criteria) this;
        }

        public Criteria andTrenchIn(List<String> values) {
            addCriterion("trench in", values, "trench");
            return (Criteria) this;
        }

        public Criteria andTrenchNotIn(List<String> values) {
            addCriterion("trench not in", values, "trench");
            return (Criteria) this;
        }

        public Criteria andTrenchBetween(String value1, String value2) {
            addCriterion("trench between", value1, value2, "trench");
            return (Criteria) this;
        }

        public Criteria andTrenchNotBetween(String value1, String value2) {
            addCriterion("trench not between", value1, value2, "trench");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeIsNull() {
            addCriterion("business_code is null");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeIsNotNull() {
            addCriterion("business_code is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeEqualTo(String value) {
            addCriterion("business_code =", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeNotEqualTo(String value) {
            addCriterion("business_code <>", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeGreaterThan(String value) {
            addCriterion("business_code >", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeGreaterThanOrEqualTo(String value) {
            addCriterion("business_code >=", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeLessThan(String value) {
            addCriterion("business_code <", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeLessThanOrEqualTo(String value) {
            addCriterion("business_code <=", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeLike(String value) {
            addCriterion("business_code like", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeNotLike(String value) {
            addCriterion("business_code not like", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeIn(List<String> values) {
            addCriterion("business_code in", values, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeNotIn(List<String> values) {
            addCriterion("business_code not in", values, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeBetween(String value1, String value2) {
            addCriterion("business_code between", value1, value2, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeNotBetween(String value1, String value2) {
            addCriterion("business_code not between", value1, value2, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessIsNull() {
            addCriterion("business is null");
            return (Criteria) this;
        }

        public Criteria andBusinessIsNotNull() {
            addCriterion("business is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessEqualTo(String value) {
            addCriterion("business =", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessNotEqualTo(String value) {
            addCriterion("business <>", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessGreaterThan(String value) {
            addCriterion("business >", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessGreaterThanOrEqualTo(String value) {
            addCriterion("business >=", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessLessThan(String value) {
            addCriterion("business <", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessLessThanOrEqualTo(String value) {
            addCriterion("business <=", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessLike(String value) {
            addCriterion("business like", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessNotLike(String value) {
            addCriterion("business not like", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessIn(List<String> values) {
            addCriterion("business in", values, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessNotIn(List<String> values) {
            addCriterion("business not in", values, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessBetween(String value1, String value2) {
            addCriterion("business between", value1, value2, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessNotBetween(String value1, String value2) {
            addCriterion("business not between", value1, value2, "business");
            return (Criteria) this;
        }

        public Criteria andServiceCodeIsNull() {
            addCriterion("service_code is null");
            return (Criteria) this;
        }

        public Criteria andServiceCodeIsNotNull() {
            addCriterion("service_code is not null");
            return (Criteria) this;
        }

        public Criteria andServiceCodeEqualTo(String value) {
            addCriterion("service_code =", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeNotEqualTo(String value) {
            addCriterion("service_code <>", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeGreaterThan(String value) {
            addCriterion("service_code >", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("service_code >=", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeLessThan(String value) {
            addCriterion("service_code <", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeLessThanOrEqualTo(String value) {
            addCriterion("service_code <=", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeLike(String value) {
            addCriterion("service_code like", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeNotLike(String value) {
            addCriterion("service_code not like", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeIn(List<String> values) {
            addCriterion("service_code in", values, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeNotIn(List<String> values) {
            addCriterion("service_code not in", values, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeBetween(String value1, String value2) {
            addCriterion("service_code between", value1, value2, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeNotBetween(String value1, String value2) {
            addCriterion("service_code not between", value1, value2, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceIsNull() {
            addCriterion("service is null");
            return (Criteria) this;
        }

        public Criteria andServiceIsNotNull() {
            addCriterion("service is not null");
            return (Criteria) this;
        }

        public Criteria andServiceEqualTo(String value) {
            addCriterion("service =", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotEqualTo(String value) {
            addCriterion("service <>", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceGreaterThan(String value) {
            addCriterion("service >", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceGreaterThanOrEqualTo(String value) {
            addCriterion("service >=", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceLessThan(String value) {
            addCriterion("service <", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceLessThanOrEqualTo(String value) {
            addCriterion("service <=", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceLike(String value) {
            addCriterion("service like", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotLike(String value) {
            addCriterion("service not like", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceIn(List<String> values) {
            addCriterion("service in", values, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotIn(List<String> values) {
            addCriterion("service not in", values, "service");
            return (Criteria) this;
        }

        public Criteria andServiceBetween(String value1, String value2) {
            addCriterion("service between", value1, value2, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotBetween(String value1, String value2) {
            addCriterion("service not between", value1, value2, "service");
            return (Criteria) this;
        }

        public Criteria andSalesmanCodeIsNull() {
            addCriterion("salesman_code is null");
            return (Criteria) this;
        }

        public Criteria andSalesmanCodeIsNotNull() {
            addCriterion("salesman_code is not null");
            return (Criteria) this;
        }

        public Criteria andSalesmanCodeEqualTo(String value) {
            addCriterion("salesman_code =", value, "salesmanCode");
            return (Criteria) this;
        }

        public Criteria andSalesmanCodeNotEqualTo(String value) {
            addCriterion("salesman_code <>", value, "salesmanCode");
            return (Criteria) this;
        }

        public Criteria andSalesmanCodeGreaterThan(String value) {
            addCriterion("salesman_code >", value, "salesmanCode");
            return (Criteria) this;
        }

        public Criteria andSalesmanCodeGreaterThanOrEqualTo(String value) {
            addCriterion("salesman_code >=", value, "salesmanCode");
            return (Criteria) this;
        }

        public Criteria andSalesmanCodeLessThan(String value) {
            addCriterion("salesman_code <", value, "salesmanCode");
            return (Criteria) this;
        }

        public Criteria andSalesmanCodeLessThanOrEqualTo(String value) {
            addCriterion("salesman_code <=", value, "salesmanCode");
            return (Criteria) this;
        }

        public Criteria andSalesmanCodeLike(String value) {
            addCriterion("salesman_code like", value, "salesmanCode");
            return (Criteria) this;
        }

        public Criteria andSalesmanCodeNotLike(String value) {
            addCriterion("salesman_code not like", value, "salesmanCode");
            return (Criteria) this;
        }

        public Criteria andSalesmanCodeIn(List<String> values) {
            addCriterion("salesman_code in", values, "salesmanCode");
            return (Criteria) this;
        }

        public Criteria andSalesmanCodeNotIn(List<String> values) {
            addCriterion("salesman_code not in", values, "salesmanCode");
            return (Criteria) this;
        }

        public Criteria andSalesmanCodeBetween(String value1, String value2) {
            addCriterion("salesman_code between", value1, value2, "salesmanCode");
            return (Criteria) this;
        }

        public Criteria andSalesmanCodeNotBetween(String value1, String value2) {
            addCriterion("salesman_code not between", value1, value2, "salesmanCode");
            return (Criteria) this;
        }

        public Criteria andSalesmanIsNull() {
            addCriterion("salesman is null");
            return (Criteria) this;
        }

        public Criteria andSalesmanIsNotNull() {
            addCriterion("salesman is not null");
            return (Criteria) this;
        }

        public Criteria andSalesmanEqualTo(String value) {
            addCriterion("salesman =", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanNotEqualTo(String value) {
            addCriterion("salesman <>", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanGreaterThan(String value) {
            addCriterion("salesman >", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanGreaterThanOrEqualTo(String value) {
            addCriterion("salesman >=", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanLessThan(String value) {
            addCriterion("salesman <", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanLessThanOrEqualTo(String value) {
            addCriterion("salesman <=", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanLike(String value) {
            addCriterion("salesman like", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanNotLike(String value) {
            addCriterion("salesman not like", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanIn(List<String> values) {
            addCriterion("salesman in", values, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanNotIn(List<String> values) {
            addCriterion("salesman not in", values, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanBetween(String value1, String value2) {
            addCriterion("salesman between", value1, value2, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanNotBetween(String value1, String value2) {
            addCriterion("salesman not between", value1, value2, "salesman");
            return (Criteria) this;
        }

        public Criteria andCatalogueCodeIsNull() {
            addCriterion("catalogue_code is null");
            return (Criteria) this;
        }

        public Criteria andCatalogueCodeIsNotNull() {
            addCriterion("catalogue_code is not null");
            return (Criteria) this;
        }

        public Criteria andCatalogueCodeEqualTo(String value) {
            addCriterion("catalogue_code =", value, "catalogueCode");
            return (Criteria) this;
        }

        public Criteria andCatalogueCodeNotEqualTo(String value) {
            addCriterion("catalogue_code <>", value, "catalogueCode");
            return (Criteria) this;
        }

        public Criteria andCatalogueCodeGreaterThan(String value) {
            addCriterion("catalogue_code >", value, "catalogueCode");
            return (Criteria) this;
        }

        public Criteria andCatalogueCodeGreaterThanOrEqualTo(String value) {
            addCriterion("catalogue_code >=", value, "catalogueCode");
            return (Criteria) this;
        }

        public Criteria andCatalogueCodeLessThan(String value) {
            addCriterion("catalogue_code <", value, "catalogueCode");
            return (Criteria) this;
        }

        public Criteria andCatalogueCodeLessThanOrEqualTo(String value) {
            addCriterion("catalogue_code <=", value, "catalogueCode");
            return (Criteria) this;
        }

        public Criteria andCatalogueCodeLike(String value) {
            addCriterion("catalogue_code like", value, "catalogueCode");
            return (Criteria) this;
        }

        public Criteria andCatalogueCodeNotLike(String value) {
            addCriterion("catalogue_code not like", value, "catalogueCode");
            return (Criteria) this;
        }

        public Criteria andCatalogueCodeIn(List<String> values) {
            addCriterion("catalogue_code in", values, "catalogueCode");
            return (Criteria) this;
        }

        public Criteria andCatalogueCodeNotIn(List<String> values) {
            addCriterion("catalogue_code not in", values, "catalogueCode");
            return (Criteria) this;
        }

        public Criteria andCatalogueCodeBetween(String value1, String value2) {
            addCriterion("catalogue_code between", value1, value2, "catalogueCode");
            return (Criteria) this;
        }

        public Criteria andCatalogueCodeNotBetween(String value1, String value2) {
            addCriterion("catalogue_code not between", value1, value2, "catalogueCode");
            return (Criteria) this;
        }

        public Criteria andCatalogueIsNull() {
            addCriterion("catalogue is null");
            return (Criteria) this;
        }

        public Criteria andCatalogueIsNotNull() {
            addCriterion("catalogue is not null");
            return (Criteria) this;
        }

        public Criteria andCatalogueEqualTo(String value) {
            addCriterion("catalogue =", value, "catalogue");
            return (Criteria) this;
        }

        public Criteria andCatalogueNotEqualTo(String value) {
            addCriterion("catalogue <>", value, "catalogue");
            return (Criteria) this;
        }

        public Criteria andCatalogueGreaterThan(String value) {
            addCriterion("catalogue >", value, "catalogue");
            return (Criteria) this;
        }

        public Criteria andCatalogueGreaterThanOrEqualTo(String value) {
            addCriterion("catalogue >=", value, "catalogue");
            return (Criteria) this;
        }

        public Criteria andCatalogueLessThan(String value) {
            addCriterion("catalogue <", value, "catalogue");
            return (Criteria) this;
        }

        public Criteria andCatalogueLessThanOrEqualTo(String value) {
            addCriterion("catalogue <=", value, "catalogue");
            return (Criteria) this;
        }

        public Criteria andCatalogueLike(String value) {
            addCriterion("catalogue like", value, "catalogue");
            return (Criteria) this;
        }

        public Criteria andCatalogueNotLike(String value) {
            addCriterion("catalogue not like", value, "catalogue");
            return (Criteria) this;
        }

        public Criteria andCatalogueIn(List<String> values) {
            addCriterion("catalogue in", values, "catalogue");
            return (Criteria) this;
        }

        public Criteria andCatalogueNotIn(List<String> values) {
            addCriterion("catalogue not in", values, "catalogue");
            return (Criteria) this;
        }

        public Criteria andCatalogueBetween(String value1, String value2) {
            addCriterion("catalogue between", value1, value2, "catalogue");
            return (Criteria) this;
        }

        public Criteria andCatalogueNotBetween(String value1, String value2) {
            addCriterion("catalogue not between", value1, value2, "catalogue");
            return (Criteria) this;
        }

        public Criteria andAgencyCodeIsNull() {
            addCriterion("agency_code is null");
            return (Criteria) this;
        }

        public Criteria andAgencyCodeIsNotNull() {
            addCriterion("agency_code is not null");
            return (Criteria) this;
        }

        public Criteria andAgencyCodeEqualTo(String value) {
            addCriterion("agency_code =", value, "agencyCode");
            return (Criteria) this;
        }

        public Criteria andAgencyCodeNotEqualTo(String value) {
            addCriterion("agency_code <>", value, "agencyCode");
            return (Criteria) this;
        }

        public Criteria andAgencyCodeGreaterThan(String value) {
            addCriterion("agency_code >", value, "agencyCode");
            return (Criteria) this;
        }

        public Criteria andAgencyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("agency_code >=", value, "agencyCode");
            return (Criteria) this;
        }

        public Criteria andAgencyCodeLessThan(String value) {
            addCriterion("agency_code <", value, "agencyCode");
            return (Criteria) this;
        }

        public Criteria andAgencyCodeLessThanOrEqualTo(String value) {
            addCriterion("agency_code <=", value, "agencyCode");
            return (Criteria) this;
        }

        public Criteria andAgencyCodeLike(String value) {
            addCriterion("agency_code like", value, "agencyCode");
            return (Criteria) this;
        }

        public Criteria andAgencyCodeNotLike(String value) {
            addCriterion("agency_code not like", value, "agencyCode");
            return (Criteria) this;
        }

        public Criteria andAgencyCodeIn(List<String> values) {
            addCriterion("agency_code in", values, "agencyCode");
            return (Criteria) this;
        }

        public Criteria andAgencyCodeNotIn(List<String> values) {
            addCriterion("agency_code not in", values, "agencyCode");
            return (Criteria) this;
        }

        public Criteria andAgencyCodeBetween(String value1, String value2) {
            addCriterion("agency_code between", value1, value2, "agencyCode");
            return (Criteria) this;
        }

        public Criteria andAgencyCodeNotBetween(String value1, String value2) {
            addCriterion("agency_code not between", value1, value2, "agencyCode");
            return (Criteria) this;
        }

        public Criteria andAgencyIsNull() {
            addCriterion("agency is null");
            return (Criteria) this;
        }

        public Criteria andAgencyIsNotNull() {
            addCriterion("agency is not null");
            return (Criteria) this;
        }

        public Criteria andAgencyEqualTo(String value) {
            addCriterion("agency =", value, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyNotEqualTo(String value) {
            addCriterion("agency <>", value, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyGreaterThan(String value) {
            addCriterion("agency >", value, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyGreaterThanOrEqualTo(String value) {
            addCriterion("agency >=", value, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyLessThan(String value) {
            addCriterion("agency <", value, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyLessThanOrEqualTo(String value) {
            addCriterion("agency <=", value, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyLike(String value) {
            addCriterion("agency like", value, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyNotLike(String value) {
            addCriterion("agency not like", value, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyIn(List<String> values) {
            addCriterion("agency in", values, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyNotIn(List<String> values) {
            addCriterion("agency not in", values, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyBetween(String value1, String value2) {
            addCriterion("agency between", value1, value2, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyNotBetween(String value1, String value2) {
            addCriterion("agency not between", value1, value2, "agency");
            return (Criteria) this;
        }

        public Criteria andChezhuNameIsNull() {
            addCriterion("chezhu_name is null");
            return (Criteria) this;
        }

        public Criteria andChezhuNameIsNotNull() {
            addCriterion("chezhu_name is not null");
            return (Criteria) this;
        }

        public Criteria andChezhuNameEqualTo(String value) {
            addCriterion("chezhu_name =", value, "chezhuName");
            return (Criteria) this;
        }

        public Criteria andChezhuNameNotEqualTo(String value) {
            addCriterion("chezhu_name <>", value, "chezhuName");
            return (Criteria) this;
        }

        public Criteria andChezhuNameGreaterThan(String value) {
            addCriterion("chezhu_name >", value, "chezhuName");
            return (Criteria) this;
        }

        public Criteria andChezhuNameGreaterThanOrEqualTo(String value) {
            addCriterion("chezhu_name >=", value, "chezhuName");
            return (Criteria) this;
        }

        public Criteria andChezhuNameLessThan(String value) {
            addCriterion("chezhu_name <", value, "chezhuName");
            return (Criteria) this;
        }

        public Criteria andChezhuNameLessThanOrEqualTo(String value) {
            addCriterion("chezhu_name <=", value, "chezhuName");
            return (Criteria) this;
        }

        public Criteria andChezhuNameLike(String value) {
            addCriterion("chezhu_name like", value, "chezhuName");
            return (Criteria) this;
        }

        public Criteria andChezhuNameNotLike(String value) {
            addCriterion("chezhu_name not like", value, "chezhuName");
            return (Criteria) this;
        }

        public Criteria andChezhuNameIn(List<String> values) {
            addCriterion("chezhu_name in", values, "chezhuName");
            return (Criteria) this;
        }

        public Criteria andChezhuNameNotIn(List<String> values) {
            addCriterion("chezhu_name not in", values, "chezhuName");
            return (Criteria) this;
        }

        public Criteria andChezhuNameBetween(String value1, String value2) {
            addCriterion("chezhu_name between", value1, value2, "chezhuName");
            return (Criteria) this;
        }

        public Criteria andChezhuNameNotBetween(String value1, String value2) {
            addCriterion("chezhu_name not between", value1, value2, "chezhuName");
            return (Criteria) this;
        }

        public Criteria andChenzhuCardCodeIsNull() {
            addCriterion("chenzhu_card_code is null");
            return (Criteria) this;
        }

        public Criteria andChenzhuCardCodeIsNotNull() {
            addCriterion("chenzhu_card_code is not null");
            return (Criteria) this;
        }

        public Criteria andChenzhuCardCodeEqualTo(String value) {
            addCriterion("chenzhu_card_code =", value, "chenzhuCardCode");
            return (Criteria) this;
        }

        public Criteria andChenzhuCardCodeNotEqualTo(String value) {
            addCriterion("chenzhu_card_code <>", value, "chenzhuCardCode");
            return (Criteria) this;
        }

        public Criteria andChenzhuCardCodeGreaterThan(String value) {
            addCriterion("chenzhu_card_code >", value, "chenzhuCardCode");
            return (Criteria) this;
        }

        public Criteria andChenzhuCardCodeGreaterThanOrEqualTo(String value) {
            addCriterion("chenzhu_card_code >=", value, "chenzhuCardCode");
            return (Criteria) this;
        }

        public Criteria andChenzhuCardCodeLessThan(String value) {
            addCriterion("chenzhu_card_code <", value, "chenzhuCardCode");
            return (Criteria) this;
        }

        public Criteria andChenzhuCardCodeLessThanOrEqualTo(String value) {
            addCriterion("chenzhu_card_code <=", value, "chenzhuCardCode");
            return (Criteria) this;
        }

        public Criteria andChenzhuCardCodeLike(String value) {
            addCriterion("chenzhu_card_code like", value, "chenzhuCardCode");
            return (Criteria) this;
        }

        public Criteria andChenzhuCardCodeNotLike(String value) {
            addCriterion("chenzhu_card_code not like", value, "chenzhuCardCode");
            return (Criteria) this;
        }

        public Criteria andChenzhuCardCodeIn(List<String> values) {
            addCriterion("chenzhu_card_code in", values, "chenzhuCardCode");
            return (Criteria) this;
        }

        public Criteria andChenzhuCardCodeNotIn(List<String> values) {
            addCriterion("chenzhu_card_code not in", values, "chenzhuCardCode");
            return (Criteria) this;
        }

        public Criteria andChenzhuCardCodeBetween(String value1, String value2) {
            addCriterion("chenzhu_card_code between", value1, value2, "chenzhuCardCode");
            return (Criteria) this;
        }

        public Criteria andChenzhuCardCodeNotBetween(String value1, String value2) {
            addCriterion("chenzhu_card_code not between", value1, value2, "chenzhuCardCode");
            return (Criteria) this;
        }

        public Criteria andCredentialsTypeIsNull() {
            addCriterion("credentials_Type is null");
            return (Criteria) this;
        }

        public Criteria andCredentialsTypeIsNotNull() {
            addCriterion("credentials_Type is not null");
            return (Criteria) this;
        }

        public Criteria andCredentialsTypeEqualTo(String value) {
            addCriterion("credentials_Type =", value, "credentialsType");
            return (Criteria) this;
        }

        public Criteria andCredentialsTypeNotEqualTo(String value) {
            addCriterion("credentials_Type <>", value, "credentialsType");
            return (Criteria) this;
        }

        public Criteria andCredentialsTypeGreaterThan(String value) {
            addCriterion("credentials_Type >", value, "credentialsType");
            return (Criteria) this;
        }

        public Criteria andCredentialsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("credentials_Type >=", value, "credentialsType");
            return (Criteria) this;
        }

        public Criteria andCredentialsTypeLessThan(String value) {
            addCriterion("credentials_Type <", value, "credentialsType");
            return (Criteria) this;
        }

        public Criteria andCredentialsTypeLessThanOrEqualTo(String value) {
            addCriterion("credentials_Type <=", value, "credentialsType");
            return (Criteria) this;
        }

        public Criteria andCredentialsTypeLike(String value) {
            addCriterion("credentials_Type like", value, "credentialsType");
            return (Criteria) this;
        }

        public Criteria andCredentialsTypeNotLike(String value) {
            addCriterion("credentials_Type not like", value, "credentialsType");
            return (Criteria) this;
        }

        public Criteria andCredentialsTypeIn(List<String> values) {
            addCriterion("credentials_Type in", values, "credentialsType");
            return (Criteria) this;
        }

        public Criteria andCredentialsTypeNotIn(List<String> values) {
            addCriterion("credentials_Type not in", values, "credentialsType");
            return (Criteria) this;
        }

        public Criteria andCredentialsTypeBetween(String value1, String value2) {
            addCriterion("credentials_Type between", value1, value2, "credentialsType");
            return (Criteria) this;
        }

        public Criteria andCredentialsTypeNotBetween(String value1, String value2) {
            addCriterion("credentials_Type not between", value1, value2, "credentialsType");
            return (Criteria) this;
        }

        public Criteria andCredentialsIsNull() {
            addCriterion("credentials is null");
            return (Criteria) this;
        }

        public Criteria andCredentialsIsNotNull() {
            addCriterion("credentials is not null");
            return (Criteria) this;
        }

        public Criteria andCredentialsEqualTo(String value) {
            addCriterion("credentials =", value, "credentials");
            return (Criteria) this;
        }

        public Criteria andCredentialsNotEqualTo(String value) {
            addCriterion("credentials <>", value, "credentials");
            return (Criteria) this;
        }

        public Criteria andCredentialsGreaterThan(String value) {
            addCriterion("credentials >", value, "credentials");
            return (Criteria) this;
        }

        public Criteria andCredentialsGreaterThanOrEqualTo(String value) {
            addCriterion("credentials >=", value, "credentials");
            return (Criteria) this;
        }

        public Criteria andCredentialsLessThan(String value) {
            addCriterion("credentials <", value, "credentials");
            return (Criteria) this;
        }

        public Criteria andCredentialsLessThanOrEqualTo(String value) {
            addCriterion("credentials <=", value, "credentials");
            return (Criteria) this;
        }

        public Criteria andCredentialsLike(String value) {
            addCriterion("credentials like", value, "credentials");
            return (Criteria) this;
        }

        public Criteria andCredentialsNotLike(String value) {
            addCriterion("credentials not like", value, "credentials");
            return (Criteria) this;
        }

        public Criteria andCredentialsIn(List<String> values) {
            addCriterion("credentials in", values, "credentials");
            return (Criteria) this;
        }

        public Criteria andCredentialsNotIn(List<String> values) {
            addCriterion("credentials not in", values, "credentials");
            return (Criteria) this;
        }

        public Criteria andCredentialsBetween(String value1, String value2) {
            addCriterion("credentials between", value1, value2, "credentials");
            return (Criteria) this;
        }

        public Criteria andCredentialsNotBetween(String value1, String value2) {
            addCriterion("credentials not between", value1, value2, "credentials");
            return (Criteria) this;
        }

        public Criteria andChezhuPhoneIsNull() {
            addCriterion("chezhu_phone is null");
            return (Criteria) this;
        }

        public Criteria andChezhuPhoneIsNotNull() {
            addCriterion("chezhu_phone is not null");
            return (Criteria) this;
        }

        public Criteria andChezhuPhoneEqualTo(String value) {
            addCriterion("chezhu_phone =", value, "chezhuPhone");
            return (Criteria) this;
        }

        public Criteria andChezhuPhoneNotEqualTo(String value) {
            addCriterion("chezhu_phone <>", value, "chezhuPhone");
            return (Criteria) this;
        }

        public Criteria andChezhuPhoneGreaterThan(String value) {
            addCriterion("chezhu_phone >", value, "chezhuPhone");
            return (Criteria) this;
        }

        public Criteria andChezhuPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("chezhu_phone >=", value, "chezhuPhone");
            return (Criteria) this;
        }

        public Criteria andChezhuPhoneLessThan(String value) {
            addCriterion("chezhu_phone <", value, "chezhuPhone");
            return (Criteria) this;
        }

        public Criteria andChezhuPhoneLessThanOrEqualTo(String value) {
            addCriterion("chezhu_phone <=", value, "chezhuPhone");
            return (Criteria) this;
        }

        public Criteria andChezhuPhoneLike(String value) {
            addCriterion("chezhu_phone like", value, "chezhuPhone");
            return (Criteria) this;
        }

        public Criteria andChezhuPhoneNotLike(String value) {
            addCriterion("chezhu_phone not like", value, "chezhuPhone");
            return (Criteria) this;
        }

        public Criteria andChezhuPhoneIn(List<String> values) {
            addCriterion("chezhu_phone in", values, "chezhuPhone");
            return (Criteria) this;
        }

        public Criteria andChezhuPhoneNotIn(List<String> values) {
            addCriterion("chezhu_phone not in", values, "chezhuPhone");
            return (Criteria) this;
        }

        public Criteria andChezhuPhoneBetween(String value1, String value2) {
            addCriterion("chezhu_phone between", value1, value2, "chezhuPhone");
            return (Criteria) this;
        }

        public Criteria andChezhuPhoneNotBetween(String value1, String value2) {
            addCriterion("chezhu_phone not between", value1, value2, "chezhuPhone");
            return (Criteria) this;
        }

        public Criteria andChezhuCodeIsNull() {
            addCriterion("chezhu_code is null");
            return (Criteria) this;
        }

        public Criteria andChezhuCodeIsNotNull() {
            addCriterion("chezhu_code is not null");
            return (Criteria) this;
        }

        public Criteria andChezhuCodeEqualTo(String value) {
            addCriterion("chezhu_code =", value, "chezhuCode");
            return (Criteria) this;
        }

        public Criteria andChezhuCodeNotEqualTo(String value) {
            addCriterion("chezhu_code <>", value, "chezhuCode");
            return (Criteria) this;
        }

        public Criteria andChezhuCodeGreaterThan(String value) {
            addCriterion("chezhu_code >", value, "chezhuCode");
            return (Criteria) this;
        }

        public Criteria andChezhuCodeGreaterThanOrEqualTo(String value) {
            addCriterion("chezhu_code >=", value, "chezhuCode");
            return (Criteria) this;
        }

        public Criteria andChezhuCodeLessThan(String value) {
            addCriterion("chezhu_code <", value, "chezhuCode");
            return (Criteria) this;
        }

        public Criteria andChezhuCodeLessThanOrEqualTo(String value) {
            addCriterion("chezhu_code <=", value, "chezhuCode");
            return (Criteria) this;
        }

        public Criteria andChezhuCodeLike(String value) {
            addCriterion("chezhu_code like", value, "chezhuCode");
            return (Criteria) this;
        }

        public Criteria andChezhuCodeNotLike(String value) {
            addCriterion("chezhu_code not like", value, "chezhuCode");
            return (Criteria) this;
        }

        public Criteria andChezhuCodeIn(List<String> values) {
            addCriterion("chezhu_code in", values, "chezhuCode");
            return (Criteria) this;
        }

        public Criteria andChezhuCodeNotIn(List<String> values) {
            addCriterion("chezhu_code not in", values, "chezhuCode");
            return (Criteria) this;
        }

        public Criteria andChezhuCodeBetween(String value1, String value2) {
            addCriterion("chezhu_code between", value1, value2, "chezhuCode");
            return (Criteria) this;
        }

        public Criteria andChezhuCodeNotBetween(String value1, String value2) {
            addCriterion("chezhu_code not between", value1, value2, "chezhuCode");
            return (Criteria) this;
        }

        public Criteria andChezhuCarIsNull() {
            addCriterion("chezhu_car is null");
            return (Criteria) this;
        }

        public Criteria andChezhuCarIsNotNull() {
            addCriterion("chezhu_car is not null");
            return (Criteria) this;
        }

        public Criteria andChezhuCarEqualTo(String value) {
            addCriterion("chezhu_car =", value, "chezhuCar");
            return (Criteria) this;
        }

        public Criteria andChezhuCarNotEqualTo(String value) {
            addCriterion("chezhu_car <>", value, "chezhuCar");
            return (Criteria) this;
        }

        public Criteria andChezhuCarGreaterThan(String value) {
            addCriterion("chezhu_car >", value, "chezhuCar");
            return (Criteria) this;
        }

        public Criteria andChezhuCarGreaterThanOrEqualTo(String value) {
            addCriterion("chezhu_car >=", value, "chezhuCar");
            return (Criteria) this;
        }

        public Criteria andChezhuCarLessThan(String value) {
            addCriterion("chezhu_car <", value, "chezhuCar");
            return (Criteria) this;
        }

        public Criteria andChezhuCarLessThanOrEqualTo(String value) {
            addCriterion("chezhu_car <=", value, "chezhuCar");
            return (Criteria) this;
        }

        public Criteria andChezhuCarLike(String value) {
            addCriterion("chezhu_car like", value, "chezhuCar");
            return (Criteria) this;
        }

        public Criteria andChezhuCarNotLike(String value) {
            addCriterion("chezhu_car not like", value, "chezhuCar");
            return (Criteria) this;
        }

        public Criteria andChezhuCarIn(List<String> values) {
            addCriterion("chezhu_car in", values, "chezhuCar");
            return (Criteria) this;
        }

        public Criteria andChezhuCarNotIn(List<String> values) {
            addCriterion("chezhu_car not in", values, "chezhuCar");
            return (Criteria) this;
        }

        public Criteria andChezhuCarBetween(String value1, String value2) {
            addCriterion("chezhu_car between", value1, value2, "chezhuCar");
            return (Criteria) this;
        }

        public Criteria andChezhuCarNotBetween(String value1, String value2) {
            addCriterion("chezhu_car not between", value1, value2, "chezhuCar");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeIsNull() {
            addCriterion("customer_code is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeIsNotNull() {
            addCriterion("customer_code is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeEqualTo(String value) {
            addCriterion("customer_code =", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeNotEqualTo(String value) {
            addCriterion("customer_code <>", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeGreaterThan(String value) {
            addCriterion("customer_code >", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("customer_code >=", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeLessThan(String value) {
            addCriterion("customer_code <", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeLessThanOrEqualTo(String value) {
            addCriterion("customer_code <=", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeLike(String value) {
            addCriterion("customer_code like", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeNotLike(String value) {
            addCriterion("customer_code not like", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeIn(List<String> values) {
            addCriterion("customer_code in", values, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeNotIn(List<String> values) {
            addCriterion("customer_code not in", values, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeBetween(String value1, String value2) {
            addCriterion("customer_code between", value1, value2, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeNotBetween(String value1, String value2) {
            addCriterion("customer_code not between", value1, value2, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerIsNull() {
            addCriterion("customer is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIsNotNull() {
            addCriterion("customer is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerEqualTo(String value) {
            addCriterion("customer =", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotEqualTo(String value) {
            addCriterion("customer <>", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerGreaterThan(String value) {
            addCriterion("customer >", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("customer >=", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLessThan(String value) {
            addCriterion("customer <", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLessThanOrEqualTo(String value) {
            addCriterion("customer <=", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLike(String value) {
            addCriterion("customer like", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotLike(String value) {
            addCriterion("customer not like", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerIn(List<String> values) {
            addCriterion("customer in", values, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotIn(List<String> values) {
            addCriterion("customer not in", values, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerBetween(String value1, String value2) {
            addCriterion("customer between", value1, value2, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotBetween(String value1, String value2) {
            addCriterion("customer not between", value1, value2, "customer");
            return (Criteria) this;
        }

        public Criteria andChezhuAgeCodeIsNull() {
            addCriterion("chezhu_age_code is null");
            return (Criteria) this;
        }

        public Criteria andChezhuAgeCodeIsNotNull() {
            addCriterion("chezhu_age_code is not null");
            return (Criteria) this;
        }

        public Criteria andChezhuAgeCodeEqualTo(String value) {
            addCriterion("chezhu_age_code =", value, "chezhuAgeCode");
            return (Criteria) this;
        }

        public Criteria andChezhuAgeCodeNotEqualTo(String value) {
            addCriterion("chezhu_age_code <>", value, "chezhuAgeCode");
            return (Criteria) this;
        }

        public Criteria andChezhuAgeCodeGreaterThan(String value) {
            addCriterion("chezhu_age_code >", value, "chezhuAgeCode");
            return (Criteria) this;
        }

        public Criteria andChezhuAgeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("chezhu_age_code >=", value, "chezhuAgeCode");
            return (Criteria) this;
        }

        public Criteria andChezhuAgeCodeLessThan(String value) {
            addCriterion("chezhu_age_code <", value, "chezhuAgeCode");
            return (Criteria) this;
        }

        public Criteria andChezhuAgeCodeLessThanOrEqualTo(String value) {
            addCriterion("chezhu_age_code <=", value, "chezhuAgeCode");
            return (Criteria) this;
        }

        public Criteria andChezhuAgeCodeLike(String value) {
            addCriterion("chezhu_age_code like", value, "chezhuAgeCode");
            return (Criteria) this;
        }

        public Criteria andChezhuAgeCodeNotLike(String value) {
            addCriterion("chezhu_age_code not like", value, "chezhuAgeCode");
            return (Criteria) this;
        }

        public Criteria andChezhuAgeCodeIn(List<String> values) {
            addCriterion("chezhu_age_code in", values, "chezhuAgeCode");
            return (Criteria) this;
        }

        public Criteria andChezhuAgeCodeNotIn(List<String> values) {
            addCriterion("chezhu_age_code not in", values, "chezhuAgeCode");
            return (Criteria) this;
        }

        public Criteria andChezhuAgeCodeBetween(String value1, String value2) {
            addCriterion("chezhu_age_code between", value1, value2, "chezhuAgeCode");
            return (Criteria) this;
        }

        public Criteria andChezhuAgeCodeNotBetween(String value1, String value2) {
            addCriterion("chezhu_age_code not between", value1, value2, "chezhuAgeCode");
            return (Criteria) this;
        }

        public Criteria andChezhuAgeIsNull() {
            addCriterion("chezhu_age is null");
            return (Criteria) this;
        }

        public Criteria andChezhuAgeIsNotNull() {
            addCriterion("chezhu_age is not null");
            return (Criteria) this;
        }

        public Criteria andChezhuAgeEqualTo(String value) {
            addCriterion("chezhu_age =", value, "chezhuAge");
            return (Criteria) this;
        }

        public Criteria andChezhuAgeNotEqualTo(String value) {
            addCriterion("chezhu_age <>", value, "chezhuAge");
            return (Criteria) this;
        }

        public Criteria andChezhuAgeGreaterThan(String value) {
            addCriterion("chezhu_age >", value, "chezhuAge");
            return (Criteria) this;
        }

        public Criteria andChezhuAgeGreaterThanOrEqualTo(String value) {
            addCriterion("chezhu_age >=", value, "chezhuAge");
            return (Criteria) this;
        }

        public Criteria andChezhuAgeLessThan(String value) {
            addCriterion("chezhu_age <", value, "chezhuAge");
            return (Criteria) this;
        }

        public Criteria andChezhuAgeLessThanOrEqualTo(String value) {
            addCriterion("chezhu_age <=", value, "chezhuAge");
            return (Criteria) this;
        }

        public Criteria andChezhuAgeLike(String value) {
            addCriterion("chezhu_age like", value, "chezhuAge");
            return (Criteria) this;
        }

        public Criteria andChezhuAgeNotLike(String value) {
            addCriterion("chezhu_age not like", value, "chezhuAge");
            return (Criteria) this;
        }

        public Criteria andChezhuAgeIn(List<String> values) {
            addCriterion("chezhu_age in", values, "chezhuAge");
            return (Criteria) this;
        }

        public Criteria andChezhuAgeNotIn(List<String> values) {
            addCriterion("chezhu_age not in", values, "chezhuAge");
            return (Criteria) this;
        }

        public Criteria andChezhuAgeBetween(String value1, String value2) {
            addCriterion("chezhu_age between", value1, value2, "chezhuAge");
            return (Criteria) this;
        }

        public Criteria andChezhuAgeNotBetween(String value1, String value2) {
            addCriterion("chezhu_age not between", value1, value2, "chezhuAge");
            return (Criteria) this;
        }

        public Criteria andChezhuSexCodeIsNull() {
            addCriterion("chezhu_sex_code is null");
            return (Criteria) this;
        }

        public Criteria andChezhuSexCodeIsNotNull() {
            addCriterion("chezhu_sex_code is not null");
            return (Criteria) this;
        }

        public Criteria andChezhuSexCodeEqualTo(String value) {
            addCriterion("chezhu_sex_code =", value, "chezhuSexCode");
            return (Criteria) this;
        }

        public Criteria andChezhuSexCodeNotEqualTo(String value) {
            addCriterion("chezhu_sex_code <>", value, "chezhuSexCode");
            return (Criteria) this;
        }

        public Criteria andChezhuSexCodeGreaterThan(String value) {
            addCriterion("chezhu_sex_code >", value, "chezhuSexCode");
            return (Criteria) this;
        }

        public Criteria andChezhuSexCodeGreaterThanOrEqualTo(String value) {
            addCriterion("chezhu_sex_code >=", value, "chezhuSexCode");
            return (Criteria) this;
        }

        public Criteria andChezhuSexCodeLessThan(String value) {
            addCriterion("chezhu_sex_code <", value, "chezhuSexCode");
            return (Criteria) this;
        }

        public Criteria andChezhuSexCodeLessThanOrEqualTo(String value) {
            addCriterion("chezhu_sex_code <=", value, "chezhuSexCode");
            return (Criteria) this;
        }

        public Criteria andChezhuSexCodeLike(String value) {
            addCriterion("chezhu_sex_code like", value, "chezhuSexCode");
            return (Criteria) this;
        }

        public Criteria andChezhuSexCodeNotLike(String value) {
            addCriterion("chezhu_sex_code not like", value, "chezhuSexCode");
            return (Criteria) this;
        }

        public Criteria andChezhuSexCodeIn(List<String> values) {
            addCriterion("chezhu_sex_code in", values, "chezhuSexCode");
            return (Criteria) this;
        }

        public Criteria andChezhuSexCodeNotIn(List<String> values) {
            addCriterion("chezhu_sex_code not in", values, "chezhuSexCode");
            return (Criteria) this;
        }

        public Criteria andChezhuSexCodeBetween(String value1, String value2) {
            addCriterion("chezhu_sex_code between", value1, value2, "chezhuSexCode");
            return (Criteria) this;
        }

        public Criteria andChezhuSexCodeNotBetween(String value1, String value2) {
            addCriterion("chezhu_sex_code not between", value1, value2, "chezhuSexCode");
            return (Criteria) this;
        }

        public Criteria andChezhuSexIsNull() {
            addCriterion("chezhu_sex is null");
            return (Criteria) this;
        }

        public Criteria andChezhuSexIsNotNull() {
            addCriterion("chezhu_sex is not null");
            return (Criteria) this;
        }

        public Criteria andChezhuSexEqualTo(String value) {
            addCriterion("chezhu_sex =", value, "chezhuSex");
            return (Criteria) this;
        }

        public Criteria andChezhuSexNotEqualTo(String value) {
            addCriterion("chezhu_sex <>", value, "chezhuSex");
            return (Criteria) this;
        }

        public Criteria andChezhuSexGreaterThan(String value) {
            addCriterion("chezhu_sex >", value, "chezhuSex");
            return (Criteria) this;
        }

        public Criteria andChezhuSexGreaterThanOrEqualTo(String value) {
            addCriterion("chezhu_sex >=", value, "chezhuSex");
            return (Criteria) this;
        }

        public Criteria andChezhuSexLessThan(String value) {
            addCriterion("chezhu_sex <", value, "chezhuSex");
            return (Criteria) this;
        }

        public Criteria andChezhuSexLessThanOrEqualTo(String value) {
            addCriterion("chezhu_sex <=", value, "chezhuSex");
            return (Criteria) this;
        }

        public Criteria andChezhuSexLike(String value) {
            addCriterion("chezhu_sex like", value, "chezhuSex");
            return (Criteria) this;
        }

        public Criteria andChezhuSexNotLike(String value) {
            addCriterion("chezhu_sex not like", value, "chezhuSex");
            return (Criteria) this;
        }

        public Criteria andChezhuSexIn(List<String> values) {
            addCriterion("chezhu_sex in", values, "chezhuSex");
            return (Criteria) this;
        }

        public Criteria andChezhuSexNotIn(List<String> values) {
            addCriterion("chezhu_sex not in", values, "chezhuSex");
            return (Criteria) this;
        }

        public Criteria andChezhuSexBetween(String value1, String value2) {
            addCriterion("chezhu_sex between", value1, value2, "chezhuSex");
            return (Criteria) this;
        }

        public Criteria andChezhuSexNotBetween(String value1, String value2) {
            addCriterion("chezhu_sex not between", value1, value2, "chezhuSex");
            return (Criteria) this;
        }

        public Criteria andChezhuPostcodeIsNull() {
            addCriterion("chezhu_postcode is null");
            return (Criteria) this;
        }

        public Criteria andChezhuPostcodeIsNotNull() {
            addCriterion("chezhu_postcode is not null");
            return (Criteria) this;
        }

        public Criteria andChezhuPostcodeEqualTo(String value) {
            addCriterion("chezhu_postcode =", value, "chezhuPostcode");
            return (Criteria) this;
        }

        public Criteria andChezhuPostcodeNotEqualTo(String value) {
            addCriterion("chezhu_postcode <>", value, "chezhuPostcode");
            return (Criteria) this;
        }

        public Criteria andChezhuPostcodeGreaterThan(String value) {
            addCriterion("chezhu_postcode >", value, "chezhuPostcode");
            return (Criteria) this;
        }

        public Criteria andChezhuPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("chezhu_postcode >=", value, "chezhuPostcode");
            return (Criteria) this;
        }

        public Criteria andChezhuPostcodeLessThan(String value) {
            addCriterion("chezhu_postcode <", value, "chezhuPostcode");
            return (Criteria) this;
        }

        public Criteria andChezhuPostcodeLessThanOrEqualTo(String value) {
            addCriterion("chezhu_postcode <=", value, "chezhuPostcode");
            return (Criteria) this;
        }

        public Criteria andChezhuPostcodeLike(String value) {
            addCriterion("chezhu_postcode like", value, "chezhuPostcode");
            return (Criteria) this;
        }

        public Criteria andChezhuPostcodeNotLike(String value) {
            addCriterion("chezhu_postcode not like", value, "chezhuPostcode");
            return (Criteria) this;
        }

        public Criteria andChezhuPostcodeIn(List<String> values) {
            addCriterion("chezhu_postcode in", values, "chezhuPostcode");
            return (Criteria) this;
        }

        public Criteria andChezhuPostcodeNotIn(List<String> values) {
            addCriterion("chezhu_postcode not in", values, "chezhuPostcode");
            return (Criteria) this;
        }

        public Criteria andChezhuPostcodeBetween(String value1, String value2) {
            addCriterion("chezhu_postcode between", value1, value2, "chezhuPostcode");
            return (Criteria) this;
        }

        public Criteria andChezhuPostcodeNotBetween(String value1, String value2) {
            addCriterion("chezhu_postcode not between", value1, value2, "chezhuPostcode");
            return (Criteria) this;
        }

        public Criteria andChezhuLocationIsNull() {
            addCriterion("chezhu_location is null");
            return (Criteria) this;
        }

        public Criteria andChezhuLocationIsNotNull() {
            addCriterion("chezhu_location is not null");
            return (Criteria) this;
        }

        public Criteria andChezhuLocationEqualTo(String value) {
            addCriterion("chezhu_location =", value, "chezhuLocation");
            return (Criteria) this;
        }

        public Criteria andChezhuLocationNotEqualTo(String value) {
            addCriterion("chezhu_location <>", value, "chezhuLocation");
            return (Criteria) this;
        }

        public Criteria andChezhuLocationGreaterThan(String value) {
            addCriterion("chezhu_location >", value, "chezhuLocation");
            return (Criteria) this;
        }

        public Criteria andChezhuLocationGreaterThanOrEqualTo(String value) {
            addCriterion("chezhu_location >=", value, "chezhuLocation");
            return (Criteria) this;
        }

        public Criteria andChezhuLocationLessThan(String value) {
            addCriterion("chezhu_location <", value, "chezhuLocation");
            return (Criteria) this;
        }

        public Criteria andChezhuLocationLessThanOrEqualTo(String value) {
            addCriterion("chezhu_location <=", value, "chezhuLocation");
            return (Criteria) this;
        }

        public Criteria andChezhuLocationLike(String value) {
            addCriterion("chezhu_location like", value, "chezhuLocation");
            return (Criteria) this;
        }

        public Criteria andChezhuLocationNotLike(String value) {
            addCriterion("chezhu_location not like", value, "chezhuLocation");
            return (Criteria) this;
        }

        public Criteria andChezhuLocationIn(List<String> values) {
            addCriterion("chezhu_location in", values, "chezhuLocation");
            return (Criteria) this;
        }

        public Criteria andChezhuLocationNotIn(List<String> values) {
            addCriterion("chezhu_location not in", values, "chezhuLocation");
            return (Criteria) this;
        }

        public Criteria andChezhuLocationBetween(String value1, String value2) {
            addCriterion("chezhu_location between", value1, value2, "chezhuLocation");
            return (Criteria) this;
        }

        public Criteria andChezhuLocationNotBetween(String value1, String value2) {
            addCriterion("chezhu_location not between", value1, value2, "chezhuLocation");
            return (Criteria) this;
        }

        public Criteria andChezhuEmaliIsNull() {
            addCriterion("chezhu_emali is null");
            return (Criteria) this;
        }

        public Criteria andChezhuEmaliIsNotNull() {
            addCriterion("chezhu_emali is not null");
            return (Criteria) this;
        }

        public Criteria andChezhuEmaliEqualTo(String value) {
            addCriterion("chezhu_emali =", value, "chezhuEmali");
            return (Criteria) this;
        }

        public Criteria andChezhuEmaliNotEqualTo(String value) {
            addCriterion("chezhu_emali <>", value, "chezhuEmali");
            return (Criteria) this;
        }

        public Criteria andChezhuEmaliGreaterThan(String value) {
            addCriterion("chezhu_emali >", value, "chezhuEmali");
            return (Criteria) this;
        }

        public Criteria andChezhuEmaliGreaterThanOrEqualTo(String value) {
            addCriterion("chezhu_emali >=", value, "chezhuEmali");
            return (Criteria) this;
        }

        public Criteria andChezhuEmaliLessThan(String value) {
            addCriterion("chezhu_emali <", value, "chezhuEmali");
            return (Criteria) this;
        }

        public Criteria andChezhuEmaliLessThanOrEqualTo(String value) {
            addCriterion("chezhu_emali <=", value, "chezhuEmali");
            return (Criteria) this;
        }

        public Criteria andChezhuEmaliLike(String value) {
            addCriterion("chezhu_emali like", value, "chezhuEmali");
            return (Criteria) this;
        }

        public Criteria andChezhuEmaliNotLike(String value) {
            addCriterion("chezhu_emali not like", value, "chezhuEmali");
            return (Criteria) this;
        }

        public Criteria andChezhuEmaliIn(List<String> values) {
            addCriterion("chezhu_emali in", values, "chezhuEmali");
            return (Criteria) this;
        }

        public Criteria andChezhuEmaliNotIn(List<String> values) {
            addCriterion("chezhu_emali not in", values, "chezhuEmali");
            return (Criteria) this;
        }

        public Criteria andChezhuEmaliBetween(String value1, String value2) {
            addCriterion("chezhu_emali between", value1, value2, "chezhuEmali");
            return (Criteria) this;
        }

        public Criteria andChezhuEmaliNotBetween(String value1, String value2) {
            addCriterion("chezhu_emali not between", value1, value2, "chezhuEmali");
            return (Criteria) this;
        }

        public Criteria andInsureNameIsNull() {
            addCriterion("insure_name is null");
            return (Criteria) this;
        }

        public Criteria andInsureNameIsNotNull() {
            addCriterion("insure_name is not null");
            return (Criteria) this;
        }

        public Criteria andInsureNameEqualTo(String value) {
            addCriterion("insure_name =", value, "insureName");
            return (Criteria) this;
        }

        public Criteria andInsureNameNotEqualTo(String value) {
            addCriterion("insure_name <>", value, "insureName");
            return (Criteria) this;
        }

        public Criteria andInsureNameGreaterThan(String value) {
            addCriterion("insure_name >", value, "insureName");
            return (Criteria) this;
        }

        public Criteria andInsureNameGreaterThanOrEqualTo(String value) {
            addCriterion("insure_name >=", value, "insureName");
            return (Criteria) this;
        }

        public Criteria andInsureNameLessThan(String value) {
            addCriterion("insure_name <", value, "insureName");
            return (Criteria) this;
        }

        public Criteria andInsureNameLessThanOrEqualTo(String value) {
            addCriterion("insure_name <=", value, "insureName");
            return (Criteria) this;
        }

        public Criteria andInsureNameLike(String value) {
            addCriterion("insure_name like", value, "insureName");
            return (Criteria) this;
        }

        public Criteria andInsureNameNotLike(String value) {
            addCriterion("insure_name not like", value, "insureName");
            return (Criteria) this;
        }

        public Criteria andInsureNameIn(List<String> values) {
            addCriterion("insure_name in", values, "insureName");
            return (Criteria) this;
        }

        public Criteria andInsureNameNotIn(List<String> values) {
            addCriterion("insure_name not in", values, "insureName");
            return (Criteria) this;
        }

        public Criteria andInsureNameBetween(String value1, String value2) {
            addCriterion("insure_name between", value1, value2, "insureName");
            return (Criteria) this;
        }

        public Criteria andInsureNameNotBetween(String value1, String value2) {
            addCriterion("insure_name not between", value1, value2, "insureName");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeIsNull() {
            addCriterion("voucher_code is null");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeIsNotNull() {
            addCriterion("voucher_code is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeEqualTo(String value) {
            addCriterion("voucher_code =", value, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeNotEqualTo(String value) {
            addCriterion("voucher_code <>", value, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeGreaterThan(String value) {
            addCriterion("voucher_code >", value, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeGreaterThanOrEqualTo(String value) {
            addCriterion("voucher_code >=", value, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeLessThan(String value) {
            addCriterion("voucher_code <", value, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeLessThanOrEqualTo(String value) {
            addCriterion("voucher_code <=", value, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeLike(String value) {
            addCriterion("voucher_code like", value, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeNotLike(String value) {
            addCriterion("voucher_code not like", value, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeIn(List<String> values) {
            addCriterion("voucher_code in", values, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeNotIn(List<String> values) {
            addCriterion("voucher_code not in", values, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeBetween(String value1, String value2) {
            addCriterion("voucher_code between", value1, value2, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeNotBetween(String value1, String value2) {
            addCriterion("voucher_code not between", value1, value2, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andCredentialsClassIsNull() {
            addCriterion("credentials_class is null");
            return (Criteria) this;
        }

        public Criteria andCredentialsClassIsNotNull() {
            addCriterion("credentials_class is not null");
            return (Criteria) this;
        }

        public Criteria andCredentialsClassEqualTo(String value) {
            addCriterion("credentials_class =", value, "credentialsClass");
            return (Criteria) this;
        }

        public Criteria andCredentialsClassNotEqualTo(String value) {
            addCriterion("credentials_class <>", value, "credentialsClass");
            return (Criteria) this;
        }

        public Criteria andCredentialsClassGreaterThan(String value) {
            addCriterion("credentials_class >", value, "credentialsClass");
            return (Criteria) this;
        }

        public Criteria andCredentialsClassGreaterThanOrEqualTo(String value) {
            addCriterion("credentials_class >=", value, "credentialsClass");
            return (Criteria) this;
        }

        public Criteria andCredentialsClassLessThan(String value) {
            addCriterion("credentials_class <", value, "credentialsClass");
            return (Criteria) this;
        }

        public Criteria andCredentialsClassLessThanOrEqualTo(String value) {
            addCriterion("credentials_class <=", value, "credentialsClass");
            return (Criteria) this;
        }

        public Criteria andCredentialsClassLike(String value) {
            addCriterion("credentials_class like", value, "credentialsClass");
            return (Criteria) this;
        }

        public Criteria andCredentialsClassNotLike(String value) {
            addCriterion("credentials_class not like", value, "credentialsClass");
            return (Criteria) this;
        }

        public Criteria andCredentialsClassIn(List<String> values) {
            addCriterion("credentials_class in", values, "credentialsClass");
            return (Criteria) this;
        }

        public Criteria andCredentialsClassNotIn(List<String> values) {
            addCriterion("credentials_class not in", values, "credentialsClass");
            return (Criteria) this;
        }

        public Criteria andCredentialsClassBetween(String value1, String value2) {
            addCriterion("credentials_class between", value1, value2, "credentialsClass");
            return (Criteria) this;
        }

        public Criteria andCredentialsClassNotBetween(String value1, String value2) {
            addCriterion("credentials_class not between", value1, value2, "credentialsClass");
            return (Criteria) this;
        }

        public Criteria andCredentialsPhoneIsNull() {
            addCriterion("credentials_phone is null");
            return (Criteria) this;
        }

        public Criteria andCredentialsPhoneIsNotNull() {
            addCriterion("credentials_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCredentialsPhoneEqualTo(String value) {
            addCriterion("credentials_phone =", value, "credentialsPhone");
            return (Criteria) this;
        }

        public Criteria andCredentialsPhoneNotEqualTo(String value) {
            addCriterion("credentials_phone <>", value, "credentialsPhone");
            return (Criteria) this;
        }

        public Criteria andCredentialsPhoneGreaterThan(String value) {
            addCriterion("credentials_phone >", value, "credentialsPhone");
            return (Criteria) this;
        }

        public Criteria andCredentialsPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("credentials_phone >=", value, "credentialsPhone");
            return (Criteria) this;
        }

        public Criteria andCredentialsPhoneLessThan(String value) {
            addCriterion("credentials_phone <", value, "credentialsPhone");
            return (Criteria) this;
        }

        public Criteria andCredentialsPhoneLessThanOrEqualTo(String value) {
            addCriterion("credentials_phone <=", value, "credentialsPhone");
            return (Criteria) this;
        }

        public Criteria andCredentialsPhoneLike(String value) {
            addCriterion("credentials_phone like", value, "credentialsPhone");
            return (Criteria) this;
        }

        public Criteria andCredentialsPhoneNotLike(String value) {
            addCriterion("credentials_phone not like", value, "credentialsPhone");
            return (Criteria) this;
        }

        public Criteria andCredentialsPhoneIn(List<String> values) {
            addCriterion("credentials_phone in", values, "credentialsPhone");
            return (Criteria) this;
        }

        public Criteria andCredentialsPhoneNotIn(List<String> values) {
            addCriterion("credentials_phone not in", values, "credentialsPhone");
            return (Criteria) this;
        }

        public Criteria andCredentialsPhoneBetween(String value1, String value2) {
            addCriterion("credentials_phone between", value1, value2, "credentialsPhone");
            return (Criteria) this;
        }

        public Criteria andCredentialsPhoneNotBetween(String value1, String value2) {
            addCriterion("credentials_phone not between", value1, value2, "credentialsPhone");
            return (Criteria) this;
        }

        public Criteria andRelationPhoneIsNull() {
            addCriterion("relation_phone is null");
            return (Criteria) this;
        }

        public Criteria andRelationPhoneIsNotNull() {
            addCriterion("relation_phone is not null");
            return (Criteria) this;
        }

        public Criteria andRelationPhoneEqualTo(String value) {
            addCriterion("relation_phone =", value, "relationPhone");
            return (Criteria) this;
        }

        public Criteria andRelationPhoneNotEqualTo(String value) {
            addCriterion("relation_phone <>", value, "relationPhone");
            return (Criteria) this;
        }

        public Criteria andRelationPhoneGreaterThan(String value) {
            addCriterion("relation_phone >", value, "relationPhone");
            return (Criteria) this;
        }

        public Criteria andRelationPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("relation_phone >=", value, "relationPhone");
            return (Criteria) this;
        }

        public Criteria andRelationPhoneLessThan(String value) {
            addCriterion("relation_phone <", value, "relationPhone");
            return (Criteria) this;
        }

        public Criteria andRelationPhoneLessThanOrEqualTo(String value) {
            addCriterion("relation_phone <=", value, "relationPhone");
            return (Criteria) this;
        }

        public Criteria andRelationPhoneLike(String value) {
            addCriterion("relation_phone like", value, "relationPhone");
            return (Criteria) this;
        }

        public Criteria andRelationPhoneNotLike(String value) {
            addCriterion("relation_phone not like", value, "relationPhone");
            return (Criteria) this;
        }

        public Criteria andRelationPhoneIn(List<String> values) {
            addCriterion("relation_phone in", values, "relationPhone");
            return (Criteria) this;
        }

        public Criteria andRelationPhoneNotIn(List<String> values) {
            addCriterion("relation_phone not in", values, "relationPhone");
            return (Criteria) this;
        }

        public Criteria andRelationPhoneBetween(String value1, String value2) {
            addCriterion("relation_phone between", value1, value2, "relationPhone");
            return (Criteria) this;
        }

        public Criteria andRelationPhoneNotBetween(String value1, String value2) {
            addCriterion("relation_phone not between", value1, value2, "relationPhone");
            return (Criteria) this;
        }

        public Criteria andFillingApplicationCodeIsNull() {
            addCriterion("filling_Application_code is null");
            return (Criteria) this;
        }

        public Criteria andFillingApplicationCodeIsNotNull() {
            addCriterion("filling_Application_code is not null");
            return (Criteria) this;
        }

        public Criteria andFillingApplicationCodeEqualTo(String value) {
            addCriterion("filling_Application_code =", value, "fillingApplicationCode");
            return (Criteria) this;
        }

        public Criteria andFillingApplicationCodeNotEqualTo(String value) {
            addCriterion("filling_Application_code <>", value, "fillingApplicationCode");
            return (Criteria) this;
        }

        public Criteria andFillingApplicationCodeGreaterThan(String value) {
            addCriterion("filling_Application_code >", value, "fillingApplicationCode");
            return (Criteria) this;
        }

        public Criteria andFillingApplicationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("filling_Application_code >=", value, "fillingApplicationCode");
            return (Criteria) this;
        }

        public Criteria andFillingApplicationCodeLessThan(String value) {
            addCriterion("filling_Application_code <", value, "fillingApplicationCode");
            return (Criteria) this;
        }

        public Criteria andFillingApplicationCodeLessThanOrEqualTo(String value) {
            addCriterion("filling_Application_code <=", value, "fillingApplicationCode");
            return (Criteria) this;
        }

        public Criteria andFillingApplicationCodeLike(String value) {
            addCriterion("filling_Application_code like", value, "fillingApplicationCode");
            return (Criteria) this;
        }

        public Criteria andFillingApplicationCodeNotLike(String value) {
            addCriterion("filling_Application_code not like", value, "fillingApplicationCode");
            return (Criteria) this;
        }

        public Criteria andFillingApplicationCodeIn(List<String> values) {
            addCriterion("filling_Application_code in", values, "fillingApplicationCode");
            return (Criteria) this;
        }

        public Criteria andFillingApplicationCodeNotIn(List<String> values) {
            addCriterion("filling_Application_code not in", values, "fillingApplicationCode");
            return (Criteria) this;
        }

        public Criteria andFillingApplicationCodeBetween(String value1, String value2) {
            addCriterion("filling_Application_code between", value1, value2, "fillingApplicationCode");
            return (Criteria) this;
        }

        public Criteria andFillingApplicationCodeNotBetween(String value1, String value2) {
            addCriterion("filling_Application_code not between", value1, value2, "fillingApplicationCode");
            return (Criteria) this;
        }

        public Criteria andInsureNatureIsNull() {
            addCriterion("insure_nature is null");
            return (Criteria) this;
        }

        public Criteria andInsureNatureIsNotNull() {
            addCriterion("insure_nature is not null");
            return (Criteria) this;
        }

        public Criteria andInsureNatureEqualTo(String value) {
            addCriterion("insure_nature =", value, "insureNature");
            return (Criteria) this;
        }

        public Criteria andInsureNatureNotEqualTo(String value) {
            addCriterion("insure_nature <>", value, "insureNature");
            return (Criteria) this;
        }

        public Criteria andInsureNatureGreaterThan(String value) {
            addCriterion("insure_nature >", value, "insureNature");
            return (Criteria) this;
        }

        public Criteria andInsureNatureGreaterThanOrEqualTo(String value) {
            addCriterion("insure_nature >=", value, "insureNature");
            return (Criteria) this;
        }

        public Criteria andInsureNatureLessThan(String value) {
            addCriterion("insure_nature <", value, "insureNature");
            return (Criteria) this;
        }

        public Criteria andInsureNatureLessThanOrEqualTo(String value) {
            addCriterion("insure_nature <=", value, "insureNature");
            return (Criteria) this;
        }

        public Criteria andInsureNatureLike(String value) {
            addCriterion("insure_nature like", value, "insureNature");
            return (Criteria) this;
        }

        public Criteria andInsureNatureNotLike(String value) {
            addCriterion("insure_nature not like", value, "insureNature");
            return (Criteria) this;
        }

        public Criteria andInsureNatureIn(List<String> values) {
            addCriterion("insure_nature in", values, "insureNature");
            return (Criteria) this;
        }

        public Criteria andInsureNatureNotIn(List<String> values) {
            addCriterion("insure_nature not in", values, "insureNature");
            return (Criteria) this;
        }

        public Criteria andInsureNatureBetween(String value1, String value2) {
            addCriterion("insure_nature between", value1, value2, "insureNature");
            return (Criteria) this;
        }

        public Criteria andInsureNatureNotBetween(String value1, String value2) {
            addCriterion("insure_nature not between", value1, value2, "insureNature");
            return (Criteria) this;
        }

        public Criteria andInsureAgeCodeIsNull() {
            addCriterion("insure_age_code is null");
            return (Criteria) this;
        }

        public Criteria andInsureAgeCodeIsNotNull() {
            addCriterion("insure_age_code is not null");
            return (Criteria) this;
        }

        public Criteria andInsureAgeCodeEqualTo(String value) {
            addCriterion("insure_age_code =", value, "insureAgeCode");
            return (Criteria) this;
        }

        public Criteria andInsureAgeCodeNotEqualTo(String value) {
            addCriterion("insure_age_code <>", value, "insureAgeCode");
            return (Criteria) this;
        }

        public Criteria andInsureAgeCodeGreaterThan(String value) {
            addCriterion("insure_age_code >", value, "insureAgeCode");
            return (Criteria) this;
        }

        public Criteria andInsureAgeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("insure_age_code >=", value, "insureAgeCode");
            return (Criteria) this;
        }

        public Criteria andInsureAgeCodeLessThan(String value) {
            addCriterion("insure_age_code <", value, "insureAgeCode");
            return (Criteria) this;
        }

        public Criteria andInsureAgeCodeLessThanOrEqualTo(String value) {
            addCriterion("insure_age_code <=", value, "insureAgeCode");
            return (Criteria) this;
        }

        public Criteria andInsureAgeCodeLike(String value) {
            addCriterion("insure_age_code like", value, "insureAgeCode");
            return (Criteria) this;
        }

        public Criteria andInsureAgeCodeNotLike(String value) {
            addCriterion("insure_age_code not like", value, "insureAgeCode");
            return (Criteria) this;
        }

        public Criteria andInsureAgeCodeIn(List<String> values) {
            addCriterion("insure_age_code in", values, "insureAgeCode");
            return (Criteria) this;
        }

        public Criteria andInsureAgeCodeNotIn(List<String> values) {
            addCriterion("insure_age_code not in", values, "insureAgeCode");
            return (Criteria) this;
        }

        public Criteria andInsureAgeCodeBetween(String value1, String value2) {
            addCriterion("insure_age_code between", value1, value2, "insureAgeCode");
            return (Criteria) this;
        }

        public Criteria andInsureAgeCodeNotBetween(String value1, String value2) {
            addCriterion("insure_age_code not between", value1, value2, "insureAgeCode");
            return (Criteria) this;
        }

        public Criteria andInsureAgeIsNull() {
            addCriterion("insure_age is null");
            return (Criteria) this;
        }

        public Criteria andInsureAgeIsNotNull() {
            addCriterion("insure_age is not null");
            return (Criteria) this;
        }

        public Criteria andInsureAgeEqualTo(String value) {
            addCriterion("insure_age =", value, "insureAge");
            return (Criteria) this;
        }

        public Criteria andInsureAgeNotEqualTo(String value) {
            addCriterion("insure_age <>", value, "insureAge");
            return (Criteria) this;
        }

        public Criteria andInsureAgeGreaterThan(String value) {
            addCriterion("insure_age >", value, "insureAge");
            return (Criteria) this;
        }

        public Criteria andInsureAgeGreaterThanOrEqualTo(String value) {
            addCriterion("insure_age >=", value, "insureAge");
            return (Criteria) this;
        }

        public Criteria andInsureAgeLessThan(String value) {
            addCriterion("insure_age <", value, "insureAge");
            return (Criteria) this;
        }

        public Criteria andInsureAgeLessThanOrEqualTo(String value) {
            addCriterion("insure_age <=", value, "insureAge");
            return (Criteria) this;
        }

        public Criteria andInsureAgeLike(String value) {
            addCriterion("insure_age like", value, "insureAge");
            return (Criteria) this;
        }

        public Criteria andInsureAgeNotLike(String value) {
            addCriterion("insure_age not like", value, "insureAge");
            return (Criteria) this;
        }

        public Criteria andInsureAgeIn(List<String> values) {
            addCriterion("insure_age in", values, "insureAge");
            return (Criteria) this;
        }

        public Criteria andInsureAgeNotIn(List<String> values) {
            addCriterion("insure_age not in", values, "insureAge");
            return (Criteria) this;
        }

        public Criteria andInsureAgeBetween(String value1, String value2) {
            addCriterion("insure_age between", value1, value2, "insureAge");
            return (Criteria) this;
        }

        public Criteria andInsureAgeNotBetween(String value1, String value2) {
            addCriterion("insure_age not between", value1, value2, "insureAge");
            return (Criteria) this;
        }

        public Criteria andInsureSexCodeIsNull() {
            addCriterion("insure_sex_code is null");
            return (Criteria) this;
        }

        public Criteria andInsureSexCodeIsNotNull() {
            addCriterion("insure_sex_code is not null");
            return (Criteria) this;
        }

        public Criteria andInsureSexCodeEqualTo(String value) {
            addCriterion("insure_sex_code =", value, "insureSexCode");
            return (Criteria) this;
        }

        public Criteria andInsureSexCodeNotEqualTo(String value) {
            addCriterion("insure_sex_code <>", value, "insureSexCode");
            return (Criteria) this;
        }

        public Criteria andInsureSexCodeGreaterThan(String value) {
            addCriterion("insure_sex_code >", value, "insureSexCode");
            return (Criteria) this;
        }

        public Criteria andInsureSexCodeGreaterThanOrEqualTo(String value) {
            addCriterion("insure_sex_code >=", value, "insureSexCode");
            return (Criteria) this;
        }

        public Criteria andInsureSexCodeLessThan(String value) {
            addCriterion("insure_sex_code <", value, "insureSexCode");
            return (Criteria) this;
        }

        public Criteria andInsureSexCodeLessThanOrEqualTo(String value) {
            addCriterion("insure_sex_code <=", value, "insureSexCode");
            return (Criteria) this;
        }

        public Criteria andInsureSexCodeLike(String value) {
            addCriterion("insure_sex_code like", value, "insureSexCode");
            return (Criteria) this;
        }

        public Criteria andInsureSexCodeNotLike(String value) {
            addCriterion("insure_sex_code not like", value, "insureSexCode");
            return (Criteria) this;
        }

        public Criteria andInsureSexCodeIn(List<String> values) {
            addCriterion("insure_sex_code in", values, "insureSexCode");
            return (Criteria) this;
        }

        public Criteria andInsureSexCodeNotIn(List<String> values) {
            addCriterion("insure_sex_code not in", values, "insureSexCode");
            return (Criteria) this;
        }

        public Criteria andInsureSexCodeBetween(String value1, String value2) {
            addCriterion("insure_sex_code between", value1, value2, "insureSexCode");
            return (Criteria) this;
        }

        public Criteria andInsureSexCodeNotBetween(String value1, String value2) {
            addCriterion("insure_sex_code not between", value1, value2, "insureSexCode");
            return (Criteria) this;
        }

        public Criteria andInsureSexIsNull() {
            addCriterion("insure_sex is null");
            return (Criteria) this;
        }

        public Criteria andInsureSexIsNotNull() {
            addCriterion("insure_sex is not null");
            return (Criteria) this;
        }

        public Criteria andInsureSexEqualTo(String value) {
            addCriterion("insure_sex =", value, "insureSex");
            return (Criteria) this;
        }

        public Criteria andInsureSexNotEqualTo(String value) {
            addCriterion("insure_sex <>", value, "insureSex");
            return (Criteria) this;
        }

        public Criteria andInsureSexGreaterThan(String value) {
            addCriterion("insure_sex >", value, "insureSex");
            return (Criteria) this;
        }

        public Criteria andInsureSexGreaterThanOrEqualTo(String value) {
            addCriterion("insure_sex >=", value, "insureSex");
            return (Criteria) this;
        }

        public Criteria andInsureSexLessThan(String value) {
            addCriterion("insure_sex <", value, "insureSex");
            return (Criteria) this;
        }

        public Criteria andInsureSexLessThanOrEqualTo(String value) {
            addCriterion("insure_sex <=", value, "insureSex");
            return (Criteria) this;
        }

        public Criteria andInsureSexLike(String value) {
            addCriterion("insure_sex like", value, "insureSex");
            return (Criteria) this;
        }

        public Criteria andInsureSexNotLike(String value) {
            addCriterion("insure_sex not like", value, "insureSex");
            return (Criteria) this;
        }

        public Criteria andInsureSexIn(List<String> values) {
            addCriterion("insure_sex in", values, "insureSex");
            return (Criteria) this;
        }

        public Criteria andInsureSexNotIn(List<String> values) {
            addCriterion("insure_sex not in", values, "insureSex");
            return (Criteria) this;
        }

        public Criteria andInsureSexBetween(String value1, String value2) {
            addCriterion("insure_sex between", value1, value2, "insureSex");
            return (Criteria) this;
        }

        public Criteria andInsureSexNotBetween(String value1, String value2) {
            addCriterion("insure_sex not between", value1, value2, "insureSex");
            return (Criteria) this;
        }

        public Criteria andInsurePostcodeIsNull() {
            addCriterion("insure_postcode is null");
            return (Criteria) this;
        }

        public Criteria andInsurePostcodeIsNotNull() {
            addCriterion("insure_postcode is not null");
            return (Criteria) this;
        }

        public Criteria andInsurePostcodeEqualTo(String value) {
            addCriterion("insure_postcode =", value, "insurePostcode");
            return (Criteria) this;
        }

        public Criteria andInsurePostcodeNotEqualTo(String value) {
            addCriterion("insure_postcode <>", value, "insurePostcode");
            return (Criteria) this;
        }

        public Criteria andInsurePostcodeGreaterThan(String value) {
            addCriterion("insure_postcode >", value, "insurePostcode");
            return (Criteria) this;
        }

        public Criteria andInsurePostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("insure_postcode >=", value, "insurePostcode");
            return (Criteria) this;
        }

        public Criteria andInsurePostcodeLessThan(String value) {
            addCriterion("insure_postcode <", value, "insurePostcode");
            return (Criteria) this;
        }

        public Criteria andInsurePostcodeLessThanOrEqualTo(String value) {
            addCriterion("insure_postcode <=", value, "insurePostcode");
            return (Criteria) this;
        }

        public Criteria andInsurePostcodeLike(String value) {
            addCriterion("insure_postcode like", value, "insurePostcode");
            return (Criteria) this;
        }

        public Criteria andInsurePostcodeNotLike(String value) {
            addCriterion("insure_postcode not like", value, "insurePostcode");
            return (Criteria) this;
        }

        public Criteria andInsurePostcodeIn(List<String> values) {
            addCriterion("insure_postcode in", values, "insurePostcode");
            return (Criteria) this;
        }

        public Criteria andInsurePostcodeNotIn(List<String> values) {
            addCriterion("insure_postcode not in", values, "insurePostcode");
            return (Criteria) this;
        }

        public Criteria andInsurePostcodeBetween(String value1, String value2) {
            addCriterion("insure_postcode between", value1, value2, "insurePostcode");
            return (Criteria) this;
        }

        public Criteria andInsurePostcodeNotBetween(String value1, String value2) {
            addCriterion("insure_postcode not between", value1, value2, "insurePostcode");
            return (Criteria) this;
        }

        public Criteria andInsureLocationIsNull() {
            addCriterion("insure_location is null");
            return (Criteria) this;
        }

        public Criteria andInsureLocationIsNotNull() {
            addCriterion("insure_location is not null");
            return (Criteria) this;
        }

        public Criteria andInsureLocationEqualTo(String value) {
            addCriterion("insure_location =", value, "insureLocation");
            return (Criteria) this;
        }

        public Criteria andInsureLocationNotEqualTo(String value) {
            addCriterion("insure_location <>", value, "insureLocation");
            return (Criteria) this;
        }

        public Criteria andInsureLocationGreaterThan(String value) {
            addCriterion("insure_location >", value, "insureLocation");
            return (Criteria) this;
        }

        public Criteria andInsureLocationGreaterThanOrEqualTo(String value) {
            addCriterion("insure_location >=", value, "insureLocation");
            return (Criteria) this;
        }

        public Criteria andInsureLocationLessThan(String value) {
            addCriterion("insure_location <", value, "insureLocation");
            return (Criteria) this;
        }

        public Criteria andInsureLocationLessThanOrEqualTo(String value) {
            addCriterion("insure_location <=", value, "insureLocation");
            return (Criteria) this;
        }

        public Criteria andInsureLocationLike(String value) {
            addCriterion("insure_location like", value, "insureLocation");
            return (Criteria) this;
        }

        public Criteria andInsureLocationNotLike(String value) {
            addCriterion("insure_location not like", value, "insureLocation");
            return (Criteria) this;
        }

        public Criteria andInsureLocationIn(List<String> values) {
            addCriterion("insure_location in", values, "insureLocation");
            return (Criteria) this;
        }

        public Criteria andInsureLocationNotIn(List<String> values) {
            addCriterion("insure_location not in", values, "insureLocation");
            return (Criteria) this;
        }

        public Criteria andInsureLocationBetween(String value1, String value2) {
            addCriterion("insure_location between", value1, value2, "insureLocation");
            return (Criteria) this;
        }

        public Criteria andInsureLocationNotBetween(String value1, String value2) {
            addCriterion("insure_location not between", value1, value2, "insureLocation");
            return (Criteria) this;
        }

        public Criteria andInsureEmaliIsNull() {
            addCriterion("insure_emali is null");
            return (Criteria) this;
        }

        public Criteria andInsureEmaliIsNotNull() {
            addCriterion("insure_emali is not null");
            return (Criteria) this;
        }

        public Criteria andInsureEmaliEqualTo(String value) {
            addCriterion("insure_emali =", value, "insureEmali");
            return (Criteria) this;
        }

        public Criteria andInsureEmaliNotEqualTo(String value) {
            addCriterion("insure_emali <>", value, "insureEmali");
            return (Criteria) this;
        }

        public Criteria andInsureEmaliGreaterThan(String value) {
            addCriterion("insure_emali >", value, "insureEmali");
            return (Criteria) this;
        }

        public Criteria andInsureEmaliGreaterThanOrEqualTo(String value) {
            addCriterion("insure_emali >=", value, "insureEmali");
            return (Criteria) this;
        }

        public Criteria andInsureEmaliLessThan(String value) {
            addCriterion("insure_emali <", value, "insureEmali");
            return (Criteria) this;
        }

        public Criteria andInsureEmaliLessThanOrEqualTo(String value) {
            addCriterion("insure_emali <=", value, "insureEmali");
            return (Criteria) this;
        }

        public Criteria andInsureEmaliLike(String value) {
            addCriterion("insure_emali like", value, "insureEmali");
            return (Criteria) this;
        }

        public Criteria andInsureEmaliNotLike(String value) {
            addCriterion("insure_emali not like", value, "insureEmali");
            return (Criteria) this;
        }

        public Criteria andInsureEmaliIn(List<String> values) {
            addCriterion("insure_emali in", values, "insureEmali");
            return (Criteria) this;
        }

        public Criteria andInsureEmaliNotIn(List<String> values) {
            addCriterion("insure_emali not in", values, "insureEmali");
            return (Criteria) this;
        }

        public Criteria andInsureEmaliBetween(String value1, String value2) {
            addCriterion("insure_emali between", value1, value2, "insureEmali");
            return (Criteria) this;
        }

        public Criteria andInsureEmaliNotBetween(String value1, String value2) {
            addCriterion("insure_emali not between", value1, value2, "insureEmali");
            return (Criteria) this;
        }

        public Criteria andOwnerNameIsNull() {
            addCriterion("owner_name is null");
            return (Criteria) this;
        }

        public Criteria andOwnerNameIsNotNull() {
            addCriterion("owner_name is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerNameEqualTo(String value) {
            addCriterion("owner_name =", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameNotEqualTo(String value) {
            addCriterion("owner_name <>", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameGreaterThan(String value) {
            addCriterion("owner_name >", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameGreaterThanOrEqualTo(String value) {
            addCriterion("owner_name >=", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameLessThan(String value) {
            addCriterion("owner_name <", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameLessThanOrEqualTo(String value) {
            addCriterion("owner_name <=", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameLike(String value) {
            addCriterion("owner_name like", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameNotLike(String value) {
            addCriterion("owner_name not like", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameIn(List<String> values) {
            addCriterion("owner_name in", values, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameNotIn(List<String> values) {
            addCriterion("owner_name not in", values, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameBetween(String value1, String value2) {
            addCriterion("owner_name between", value1, value2, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameNotBetween(String value1, String value2) {
            addCriterion("owner_name not between", value1, value2, "ownerName");
            return (Criteria) this;
        }

        public Criteria andCredentialsCodeIsNull() {
            addCriterion("credentials_code is null");
            return (Criteria) this;
        }

        public Criteria andCredentialsCodeIsNotNull() {
            addCriterion("credentials_code is not null");
            return (Criteria) this;
        }

        public Criteria andCredentialsCodeEqualTo(String value) {
            addCriterion("credentials_code =", value, "credentialsCode");
            return (Criteria) this;
        }

        public Criteria andCredentialsCodeNotEqualTo(String value) {
            addCriterion("credentials_code <>", value, "credentialsCode");
            return (Criteria) this;
        }

        public Criteria andCredentialsCodeGreaterThan(String value) {
            addCriterion("credentials_code >", value, "credentialsCode");
            return (Criteria) this;
        }

        public Criteria andCredentialsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("credentials_code >=", value, "credentialsCode");
            return (Criteria) this;
        }

        public Criteria andCredentialsCodeLessThan(String value) {
            addCriterion("credentials_code <", value, "credentialsCode");
            return (Criteria) this;
        }

        public Criteria andCredentialsCodeLessThanOrEqualTo(String value) {
            addCriterion("credentials_code <=", value, "credentialsCode");
            return (Criteria) this;
        }

        public Criteria andCredentialsCodeLike(String value) {
            addCriterion("credentials_code like", value, "credentialsCode");
            return (Criteria) this;
        }

        public Criteria andCredentialsCodeNotLike(String value) {
            addCriterion("credentials_code not like", value, "credentialsCode");
            return (Criteria) this;
        }

        public Criteria andCredentialsCodeIn(List<String> values) {
            addCriterion("credentials_code in", values, "credentialsCode");
            return (Criteria) this;
        }

        public Criteria andCredentialsCodeNotIn(List<String> values) {
            addCriterion("credentials_code not in", values, "credentialsCode");
            return (Criteria) this;
        }

        public Criteria andCredentialsCodeBetween(String value1, String value2) {
            addCriterion("credentials_code between", value1, value2, "credentialsCode");
            return (Criteria) this;
        }

        public Criteria andCredentialsCodeNotBetween(String value1, String value2) {
            addCriterion("credentials_code not between", value1, value2, "credentialsCode");
            return (Criteria) this;
        }

        public Criteria andCardClassIsNull() {
            addCriterion("card_class is null");
            return (Criteria) this;
        }

        public Criteria andCardClassIsNotNull() {
            addCriterion("card_class is not null");
            return (Criteria) this;
        }

        public Criteria andCardClassEqualTo(String value) {
            addCriterion("card_class =", value, "cardClass");
            return (Criteria) this;
        }

        public Criteria andCardClassNotEqualTo(String value) {
            addCriterion("card_class <>", value, "cardClass");
            return (Criteria) this;
        }

        public Criteria andCardClassGreaterThan(String value) {
            addCriterion("card_class >", value, "cardClass");
            return (Criteria) this;
        }

        public Criteria andCardClassGreaterThanOrEqualTo(String value) {
            addCriterion("card_class >=", value, "cardClass");
            return (Criteria) this;
        }

        public Criteria andCardClassLessThan(String value) {
            addCriterion("card_class <", value, "cardClass");
            return (Criteria) this;
        }

        public Criteria andCardClassLessThanOrEqualTo(String value) {
            addCriterion("card_class <=", value, "cardClass");
            return (Criteria) this;
        }

        public Criteria andCardClassLike(String value) {
            addCriterion("card_class like", value, "cardClass");
            return (Criteria) this;
        }

        public Criteria andCardClassNotLike(String value) {
            addCriterion("card_class not like", value, "cardClass");
            return (Criteria) this;
        }

        public Criteria andCardClassIn(List<String> values) {
            addCriterion("card_class in", values, "cardClass");
            return (Criteria) this;
        }

        public Criteria andCardClassNotIn(List<String> values) {
            addCriterion("card_class not in", values, "cardClass");
            return (Criteria) this;
        }

        public Criteria andCardClassBetween(String value1, String value2) {
            addCriterion("card_class between", value1, value2, "cardClass");
            return (Criteria) this;
        }

        public Criteria andCardClassNotBetween(String value1, String value2) {
            addCriterion("card_class not between", value1, value2, "cardClass");
            return (Criteria) this;
        }

        public Criteria andCardPhoneIsNull() {
            addCriterion("card_phone is null");
            return (Criteria) this;
        }

        public Criteria andCardPhoneIsNotNull() {
            addCriterion("card_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCardPhoneEqualTo(String value) {
            addCriterion("card_phone =", value, "cardPhone");
            return (Criteria) this;
        }

        public Criteria andCardPhoneNotEqualTo(String value) {
            addCriterion("card_phone <>", value, "cardPhone");
            return (Criteria) this;
        }

        public Criteria andCardPhoneGreaterThan(String value) {
            addCriterion("card_phone >", value, "cardPhone");
            return (Criteria) this;
        }

        public Criteria andCardPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("card_phone >=", value, "cardPhone");
            return (Criteria) this;
        }

        public Criteria andCardPhoneLessThan(String value) {
            addCriterion("card_phone <", value, "cardPhone");
            return (Criteria) this;
        }

        public Criteria andCardPhoneLessThanOrEqualTo(String value) {
            addCriterion("card_phone <=", value, "cardPhone");
            return (Criteria) this;
        }

        public Criteria andCardPhoneLike(String value) {
            addCriterion("card_phone like", value, "cardPhone");
            return (Criteria) this;
        }

        public Criteria andCardPhoneNotLike(String value) {
            addCriterion("card_phone not like", value, "cardPhone");
            return (Criteria) this;
        }

        public Criteria andCardPhoneIn(List<String> values) {
            addCriterion("card_phone in", values, "cardPhone");
            return (Criteria) this;
        }

        public Criteria andCardPhoneNotIn(List<String> values) {
            addCriterion("card_phone not in", values, "cardPhone");
            return (Criteria) this;
        }

        public Criteria andCardPhoneBetween(String value1, String value2) {
            addCriterion("card_phone between", value1, value2, "cardPhone");
            return (Criteria) this;
        }

        public Criteria andCardPhoneNotBetween(String value1, String value2) {
            addCriterion("card_phone not between", value1, value2, "cardPhone");
            return (Criteria) this;
        }

        public Criteria andOwnerPhoneIsNull() {
            addCriterion("owner_phone is null");
            return (Criteria) this;
        }

        public Criteria andOwnerPhoneIsNotNull() {
            addCriterion("owner_phone is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerPhoneEqualTo(String value) {
            addCriterion("owner_phone =", value, "ownerPhone");
            return (Criteria) this;
        }

        public Criteria andOwnerPhoneNotEqualTo(String value) {
            addCriterion("owner_phone <>", value, "ownerPhone");
            return (Criteria) this;
        }

        public Criteria andOwnerPhoneGreaterThan(String value) {
            addCriterion("owner_phone >", value, "ownerPhone");
            return (Criteria) this;
        }

        public Criteria andOwnerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("owner_phone >=", value, "ownerPhone");
            return (Criteria) this;
        }

        public Criteria andOwnerPhoneLessThan(String value) {
            addCriterion("owner_phone <", value, "ownerPhone");
            return (Criteria) this;
        }

        public Criteria andOwnerPhoneLessThanOrEqualTo(String value) {
            addCriterion("owner_phone <=", value, "ownerPhone");
            return (Criteria) this;
        }

        public Criteria andOwnerPhoneLike(String value) {
            addCriterion("owner_phone like", value, "ownerPhone");
            return (Criteria) this;
        }

        public Criteria andOwnerPhoneNotLike(String value) {
            addCriterion("owner_phone not like", value, "ownerPhone");
            return (Criteria) this;
        }

        public Criteria andOwnerPhoneIn(List<String> values) {
            addCriterion("owner_phone in", values, "ownerPhone");
            return (Criteria) this;
        }

        public Criteria andOwnerPhoneNotIn(List<String> values) {
            addCriterion("owner_phone not in", values, "ownerPhone");
            return (Criteria) this;
        }

        public Criteria andOwnerPhoneBetween(String value1, String value2) {
            addCriterion("owner_phone between", value1, value2, "ownerPhone");
            return (Criteria) this;
        }

        public Criteria andOwnerPhoneNotBetween(String value1, String value2) {
            addCriterion("owner_phone not between", value1, value2, "ownerPhone");
            return (Criteria) this;
        }

        public Criteria andNameNatureCodeIsNull() {
            addCriterion("name_nature_code is null");
            return (Criteria) this;
        }

        public Criteria andNameNatureCodeIsNotNull() {
            addCriterion("name_nature_code is not null");
            return (Criteria) this;
        }

        public Criteria andNameNatureCodeEqualTo(String value) {
            addCriterion("name_nature_code =", value, "nameNatureCode");
            return (Criteria) this;
        }

        public Criteria andNameNatureCodeNotEqualTo(String value) {
            addCriterion("name_nature_code <>", value, "nameNatureCode");
            return (Criteria) this;
        }

        public Criteria andNameNatureCodeGreaterThan(String value) {
            addCriterion("name_nature_code >", value, "nameNatureCode");
            return (Criteria) this;
        }

        public Criteria andNameNatureCodeGreaterThanOrEqualTo(String value) {
            addCriterion("name_nature_code >=", value, "nameNatureCode");
            return (Criteria) this;
        }

        public Criteria andNameNatureCodeLessThan(String value) {
            addCriterion("name_nature_code <", value, "nameNatureCode");
            return (Criteria) this;
        }

        public Criteria andNameNatureCodeLessThanOrEqualTo(String value) {
            addCriterion("name_nature_code <=", value, "nameNatureCode");
            return (Criteria) this;
        }

        public Criteria andNameNatureCodeLike(String value) {
            addCriterion("name_nature_code like", value, "nameNatureCode");
            return (Criteria) this;
        }

        public Criteria andNameNatureCodeNotLike(String value) {
            addCriterion("name_nature_code not like", value, "nameNatureCode");
            return (Criteria) this;
        }

        public Criteria andNameNatureCodeIn(List<String> values) {
            addCriterion("name_nature_code in", values, "nameNatureCode");
            return (Criteria) this;
        }

        public Criteria andNameNatureCodeNotIn(List<String> values) {
            addCriterion("name_nature_code not in", values, "nameNatureCode");
            return (Criteria) this;
        }

        public Criteria andNameNatureCodeBetween(String value1, String value2) {
            addCriterion("name_nature_code between", value1, value2, "nameNatureCode");
            return (Criteria) this;
        }

        public Criteria andNameNatureCodeNotBetween(String value1, String value2) {
            addCriterion("name_nature_code not between", value1, value2, "nameNatureCode");
            return (Criteria) this;
        }

        public Criteria andPersonNatureIsNull() {
            addCriterion("person_nature is null");
            return (Criteria) this;
        }

        public Criteria andPersonNatureIsNotNull() {
            addCriterion("person_nature is not null");
            return (Criteria) this;
        }

        public Criteria andPersonNatureEqualTo(String value) {
            addCriterion("person_nature =", value, "personNature");
            return (Criteria) this;
        }

        public Criteria andPersonNatureNotEqualTo(String value) {
            addCriterion("person_nature <>", value, "personNature");
            return (Criteria) this;
        }

        public Criteria andPersonNatureGreaterThan(String value) {
            addCriterion("person_nature >", value, "personNature");
            return (Criteria) this;
        }

        public Criteria andPersonNatureGreaterThanOrEqualTo(String value) {
            addCriterion("person_nature >=", value, "personNature");
            return (Criteria) this;
        }

        public Criteria andPersonNatureLessThan(String value) {
            addCriterion("person_nature <", value, "personNature");
            return (Criteria) this;
        }

        public Criteria andPersonNatureLessThanOrEqualTo(String value) {
            addCriterion("person_nature <=", value, "personNature");
            return (Criteria) this;
        }

        public Criteria andPersonNatureLike(String value) {
            addCriterion("person_nature like", value, "personNature");
            return (Criteria) this;
        }

        public Criteria andPersonNatureNotLike(String value) {
            addCriterion("person_nature not like", value, "personNature");
            return (Criteria) this;
        }

        public Criteria andPersonNatureIn(List<String> values) {
            addCriterion("person_nature in", values, "personNature");
            return (Criteria) this;
        }

        public Criteria andPersonNatureNotIn(List<String> values) {
            addCriterion("person_nature not in", values, "personNature");
            return (Criteria) this;
        }

        public Criteria andPersonNatureBetween(String value1, String value2) {
            addCriterion("person_nature between", value1, value2, "personNature");
            return (Criteria) this;
        }

        public Criteria andPersonNatureNotBetween(String value1, String value2) {
            addCriterion("person_nature not between", value1, value2, "personNature");
            return (Criteria) this;
        }

        public Criteria andOwnerAgeCodeIsNull() {
            addCriterion("owner_age_code is null");
            return (Criteria) this;
        }

        public Criteria andOwnerAgeCodeIsNotNull() {
            addCriterion("owner_age_code is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerAgeCodeEqualTo(String value) {
            addCriterion("owner_age_code =", value, "ownerAgeCode");
            return (Criteria) this;
        }

        public Criteria andOwnerAgeCodeNotEqualTo(String value) {
            addCriterion("owner_age_code <>", value, "ownerAgeCode");
            return (Criteria) this;
        }

        public Criteria andOwnerAgeCodeGreaterThan(String value) {
            addCriterion("owner_age_code >", value, "ownerAgeCode");
            return (Criteria) this;
        }

        public Criteria andOwnerAgeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("owner_age_code >=", value, "ownerAgeCode");
            return (Criteria) this;
        }

        public Criteria andOwnerAgeCodeLessThan(String value) {
            addCriterion("owner_age_code <", value, "ownerAgeCode");
            return (Criteria) this;
        }

        public Criteria andOwnerAgeCodeLessThanOrEqualTo(String value) {
            addCriterion("owner_age_code <=", value, "ownerAgeCode");
            return (Criteria) this;
        }

        public Criteria andOwnerAgeCodeLike(String value) {
            addCriterion("owner_age_code like", value, "ownerAgeCode");
            return (Criteria) this;
        }

        public Criteria andOwnerAgeCodeNotLike(String value) {
            addCriterion("owner_age_code not like", value, "ownerAgeCode");
            return (Criteria) this;
        }

        public Criteria andOwnerAgeCodeIn(List<String> values) {
            addCriterion("owner_age_code in", values, "ownerAgeCode");
            return (Criteria) this;
        }

        public Criteria andOwnerAgeCodeNotIn(List<String> values) {
            addCriterion("owner_age_code not in", values, "ownerAgeCode");
            return (Criteria) this;
        }

        public Criteria andOwnerAgeCodeBetween(String value1, String value2) {
            addCriterion("owner_age_code between", value1, value2, "ownerAgeCode");
            return (Criteria) this;
        }

        public Criteria andOwnerAgeCodeNotBetween(String value1, String value2) {
            addCriterion("owner_age_code not between", value1, value2, "ownerAgeCode");
            return (Criteria) this;
        }

        public Criteria andOwnerAgeIsNull() {
            addCriterion("owner_age is null");
            return (Criteria) this;
        }

        public Criteria andOwnerAgeIsNotNull() {
            addCriterion("owner_age is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerAgeEqualTo(String value) {
            addCriterion("owner_age =", value, "ownerAge");
            return (Criteria) this;
        }

        public Criteria andOwnerAgeNotEqualTo(String value) {
            addCriterion("owner_age <>", value, "ownerAge");
            return (Criteria) this;
        }

        public Criteria andOwnerAgeGreaterThan(String value) {
            addCriterion("owner_age >", value, "ownerAge");
            return (Criteria) this;
        }

        public Criteria andOwnerAgeGreaterThanOrEqualTo(String value) {
            addCriterion("owner_age >=", value, "ownerAge");
            return (Criteria) this;
        }

        public Criteria andOwnerAgeLessThan(String value) {
            addCriterion("owner_age <", value, "ownerAge");
            return (Criteria) this;
        }

        public Criteria andOwnerAgeLessThanOrEqualTo(String value) {
            addCriterion("owner_age <=", value, "ownerAge");
            return (Criteria) this;
        }

        public Criteria andOwnerAgeLike(String value) {
            addCriterion("owner_age like", value, "ownerAge");
            return (Criteria) this;
        }

        public Criteria andOwnerAgeNotLike(String value) {
            addCriterion("owner_age not like", value, "ownerAge");
            return (Criteria) this;
        }

        public Criteria andOwnerAgeIn(List<String> values) {
            addCriterion("owner_age in", values, "ownerAge");
            return (Criteria) this;
        }

        public Criteria andOwnerAgeNotIn(List<String> values) {
            addCriterion("owner_age not in", values, "ownerAge");
            return (Criteria) this;
        }

        public Criteria andOwnerAgeBetween(String value1, String value2) {
            addCriterion("owner_age between", value1, value2, "ownerAge");
            return (Criteria) this;
        }

        public Criteria andOwnerAgeNotBetween(String value1, String value2) {
            addCriterion("owner_age not between", value1, value2, "ownerAge");
            return (Criteria) this;
        }

        public Criteria andOwnerSexCodeIsNull() {
            addCriterion("owner_sex_code is null");
            return (Criteria) this;
        }

        public Criteria andOwnerSexCodeIsNotNull() {
            addCriterion("owner_sex_code is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerSexCodeEqualTo(String value) {
            addCriterion("owner_sex_code =", value, "ownerSexCode");
            return (Criteria) this;
        }

        public Criteria andOwnerSexCodeNotEqualTo(String value) {
            addCriterion("owner_sex_code <>", value, "ownerSexCode");
            return (Criteria) this;
        }

        public Criteria andOwnerSexCodeGreaterThan(String value) {
            addCriterion("owner_sex_code >", value, "ownerSexCode");
            return (Criteria) this;
        }

        public Criteria andOwnerSexCodeGreaterThanOrEqualTo(String value) {
            addCriterion("owner_sex_code >=", value, "ownerSexCode");
            return (Criteria) this;
        }

        public Criteria andOwnerSexCodeLessThan(String value) {
            addCriterion("owner_sex_code <", value, "ownerSexCode");
            return (Criteria) this;
        }

        public Criteria andOwnerSexCodeLessThanOrEqualTo(String value) {
            addCriterion("owner_sex_code <=", value, "ownerSexCode");
            return (Criteria) this;
        }

        public Criteria andOwnerSexCodeLike(String value) {
            addCriterion("owner_sex_code like", value, "ownerSexCode");
            return (Criteria) this;
        }

        public Criteria andOwnerSexCodeNotLike(String value) {
            addCriterion("owner_sex_code not like", value, "ownerSexCode");
            return (Criteria) this;
        }

        public Criteria andOwnerSexCodeIn(List<String> values) {
            addCriterion("owner_sex_code in", values, "ownerSexCode");
            return (Criteria) this;
        }

        public Criteria andOwnerSexCodeNotIn(List<String> values) {
            addCriterion("owner_sex_code not in", values, "ownerSexCode");
            return (Criteria) this;
        }

        public Criteria andOwnerSexCodeBetween(String value1, String value2) {
            addCriterion("owner_sex_code between", value1, value2, "ownerSexCode");
            return (Criteria) this;
        }

        public Criteria andOwnerSexCodeNotBetween(String value1, String value2) {
            addCriterion("owner_sex_code not between", value1, value2, "ownerSexCode");
            return (Criteria) this;
        }

        public Criteria andOwnerSexIsNull() {
            addCriterion("owner_sex is null");
            return (Criteria) this;
        }

        public Criteria andOwnerSexIsNotNull() {
            addCriterion("owner_sex is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerSexEqualTo(String value) {
            addCriterion("owner_sex =", value, "ownerSex");
            return (Criteria) this;
        }

        public Criteria andOwnerSexNotEqualTo(String value) {
            addCriterion("owner_sex <>", value, "ownerSex");
            return (Criteria) this;
        }

        public Criteria andOwnerSexGreaterThan(String value) {
            addCriterion("owner_sex >", value, "ownerSex");
            return (Criteria) this;
        }

        public Criteria andOwnerSexGreaterThanOrEqualTo(String value) {
            addCriterion("owner_sex >=", value, "ownerSex");
            return (Criteria) this;
        }

        public Criteria andOwnerSexLessThan(String value) {
            addCriterion("owner_sex <", value, "ownerSex");
            return (Criteria) this;
        }

        public Criteria andOwnerSexLessThanOrEqualTo(String value) {
            addCriterion("owner_sex <=", value, "ownerSex");
            return (Criteria) this;
        }

        public Criteria andOwnerSexLike(String value) {
            addCriterion("owner_sex like", value, "ownerSex");
            return (Criteria) this;
        }

        public Criteria andOwnerSexNotLike(String value) {
            addCriterion("owner_sex not like", value, "ownerSex");
            return (Criteria) this;
        }

        public Criteria andOwnerSexIn(List<String> values) {
            addCriterion("owner_sex in", values, "ownerSex");
            return (Criteria) this;
        }

        public Criteria andOwnerSexNotIn(List<String> values) {
            addCriterion("owner_sex not in", values, "ownerSex");
            return (Criteria) this;
        }

        public Criteria andOwnerSexBetween(String value1, String value2) {
            addCriterion("owner_sex between", value1, value2, "ownerSex");
            return (Criteria) this;
        }

        public Criteria andOwnerSexNotBetween(String value1, String value2) {
            addCriterion("owner_sex not between", value1, value2, "ownerSex");
            return (Criteria) this;
        }

        public Criteria andOwnerPostcodeIsNull() {
            addCriterion("owner_postcode is null");
            return (Criteria) this;
        }

        public Criteria andOwnerPostcodeIsNotNull() {
            addCriterion("owner_postcode is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerPostcodeEqualTo(String value) {
            addCriterion("owner_postcode =", value, "ownerPostcode");
            return (Criteria) this;
        }

        public Criteria andOwnerPostcodeNotEqualTo(String value) {
            addCriterion("owner_postcode <>", value, "ownerPostcode");
            return (Criteria) this;
        }

        public Criteria andOwnerPostcodeGreaterThan(String value) {
            addCriterion("owner_postcode >", value, "ownerPostcode");
            return (Criteria) this;
        }

        public Criteria andOwnerPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("owner_postcode >=", value, "ownerPostcode");
            return (Criteria) this;
        }

        public Criteria andOwnerPostcodeLessThan(String value) {
            addCriterion("owner_postcode <", value, "ownerPostcode");
            return (Criteria) this;
        }

        public Criteria andOwnerPostcodeLessThanOrEqualTo(String value) {
            addCriterion("owner_postcode <=", value, "ownerPostcode");
            return (Criteria) this;
        }

        public Criteria andOwnerPostcodeLike(String value) {
            addCriterion("owner_postcode like", value, "ownerPostcode");
            return (Criteria) this;
        }

        public Criteria andOwnerPostcodeNotLike(String value) {
            addCriterion("owner_postcode not like", value, "ownerPostcode");
            return (Criteria) this;
        }

        public Criteria andOwnerPostcodeIn(List<String> values) {
            addCriterion("owner_postcode in", values, "ownerPostcode");
            return (Criteria) this;
        }

        public Criteria andOwnerPostcodeNotIn(List<String> values) {
            addCriterion("owner_postcode not in", values, "ownerPostcode");
            return (Criteria) this;
        }

        public Criteria andOwnerPostcodeBetween(String value1, String value2) {
            addCriterion("owner_postcode between", value1, value2, "ownerPostcode");
            return (Criteria) this;
        }

        public Criteria andOwnerPostcodeNotBetween(String value1, String value2) {
            addCriterion("owner_postcode not between", value1, value2, "ownerPostcode");
            return (Criteria) this;
        }

        public Criteria andOwnerLocationIsNull() {
            addCriterion("owner_location is null");
            return (Criteria) this;
        }

        public Criteria andOwnerLocationIsNotNull() {
            addCriterion("owner_location is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerLocationEqualTo(String value) {
            addCriterion("owner_location =", value, "ownerLocation");
            return (Criteria) this;
        }

        public Criteria andOwnerLocationNotEqualTo(String value) {
            addCriterion("owner_location <>", value, "ownerLocation");
            return (Criteria) this;
        }

        public Criteria andOwnerLocationGreaterThan(String value) {
            addCriterion("owner_location >", value, "ownerLocation");
            return (Criteria) this;
        }

        public Criteria andOwnerLocationGreaterThanOrEqualTo(String value) {
            addCriterion("owner_location >=", value, "ownerLocation");
            return (Criteria) this;
        }

        public Criteria andOwnerLocationLessThan(String value) {
            addCriterion("owner_location <", value, "ownerLocation");
            return (Criteria) this;
        }

        public Criteria andOwnerLocationLessThanOrEqualTo(String value) {
            addCriterion("owner_location <=", value, "ownerLocation");
            return (Criteria) this;
        }

        public Criteria andOwnerLocationLike(String value) {
            addCriterion("owner_location like", value, "ownerLocation");
            return (Criteria) this;
        }

        public Criteria andOwnerLocationNotLike(String value) {
            addCriterion("owner_location not like", value, "ownerLocation");
            return (Criteria) this;
        }

        public Criteria andOwnerLocationIn(List<String> values) {
            addCriterion("owner_location in", values, "ownerLocation");
            return (Criteria) this;
        }

        public Criteria andOwnerLocationNotIn(List<String> values) {
            addCriterion("owner_location not in", values, "ownerLocation");
            return (Criteria) this;
        }

        public Criteria andOwnerLocationBetween(String value1, String value2) {
            addCriterion("owner_location between", value1, value2, "ownerLocation");
            return (Criteria) this;
        }

        public Criteria andOwnerLocationNotBetween(String value1, String value2) {
            addCriterion("owner_location not between", value1, value2, "ownerLocation");
            return (Criteria) this;
        }

        public Criteria andOwnerEmaliIsNull() {
            addCriterion("owner_emali is null");
            return (Criteria) this;
        }

        public Criteria andOwnerEmaliIsNotNull() {
            addCriterion("owner_emali is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerEmaliEqualTo(String value) {
            addCriterion("owner_emali =", value, "ownerEmali");
            return (Criteria) this;
        }

        public Criteria andOwnerEmaliNotEqualTo(String value) {
            addCriterion("owner_emali <>", value, "ownerEmali");
            return (Criteria) this;
        }

        public Criteria andOwnerEmaliGreaterThan(String value) {
            addCriterion("owner_emali >", value, "ownerEmali");
            return (Criteria) this;
        }

        public Criteria andOwnerEmaliGreaterThanOrEqualTo(String value) {
            addCriterion("owner_emali >=", value, "ownerEmali");
            return (Criteria) this;
        }

        public Criteria andOwnerEmaliLessThan(String value) {
            addCriterion("owner_emali <", value, "ownerEmali");
            return (Criteria) this;
        }

        public Criteria andOwnerEmaliLessThanOrEqualTo(String value) {
            addCriterion("owner_emali <=", value, "ownerEmali");
            return (Criteria) this;
        }

        public Criteria andOwnerEmaliLike(String value) {
            addCriterion("owner_emali like", value, "ownerEmali");
            return (Criteria) this;
        }

        public Criteria andOwnerEmaliNotLike(String value) {
            addCriterion("owner_emali not like", value, "ownerEmali");
            return (Criteria) this;
        }

        public Criteria andOwnerEmaliIn(List<String> values) {
            addCriterion("owner_emali in", values, "ownerEmali");
            return (Criteria) this;
        }

        public Criteria andOwnerEmaliNotIn(List<String> values) {
            addCriterion("owner_emali not in", values, "ownerEmali");
            return (Criteria) this;
        }

        public Criteria andOwnerEmaliBetween(String value1, String value2) {
            addCriterion("owner_emali between", value1, value2, "ownerEmali");
            return (Criteria) this;
        }

        public Criteria andOwnerEmaliNotBetween(String value1, String value2) {
            addCriterion("owner_emali not between", value1, value2, "ownerEmali");
            return (Criteria) this;
        }

        public Criteria andBusinessInsureIsNull() {
            addCriterion("business_insure is null");
            return (Criteria) this;
        }

        public Criteria andBusinessInsureIsNotNull() {
            addCriterion("business_insure is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessInsureEqualTo(String value) {
            addCriterion("business_insure =", value, "businessInsure");
            return (Criteria) this;
        }

        public Criteria andBusinessInsureNotEqualTo(String value) {
            addCriterion("business_insure <>", value, "businessInsure");
            return (Criteria) this;
        }

        public Criteria andBusinessInsureGreaterThan(String value) {
            addCriterion("business_insure >", value, "businessInsure");
            return (Criteria) this;
        }

        public Criteria andBusinessInsureGreaterThanOrEqualTo(String value) {
            addCriterion("business_insure >=", value, "businessInsure");
            return (Criteria) this;
        }

        public Criteria andBusinessInsureLessThan(String value) {
            addCriterion("business_insure <", value, "businessInsure");
            return (Criteria) this;
        }

        public Criteria andBusinessInsureLessThanOrEqualTo(String value) {
            addCriterion("business_insure <=", value, "businessInsure");
            return (Criteria) this;
        }

        public Criteria andBusinessInsureLike(String value) {
            addCriterion("business_insure like", value, "businessInsure");
            return (Criteria) this;
        }

        public Criteria andBusinessInsureNotLike(String value) {
            addCriterion("business_insure not like", value, "businessInsure");
            return (Criteria) this;
        }

        public Criteria andBusinessInsureIn(List<String> values) {
            addCriterion("business_insure in", values, "businessInsure");
            return (Criteria) this;
        }

        public Criteria andBusinessInsureNotIn(List<String> values) {
            addCriterion("business_insure not in", values, "businessInsure");
            return (Criteria) this;
        }

        public Criteria andBusinessInsureBetween(String value1, String value2) {
            addCriterion("business_insure between", value1, value2, "businessInsure");
            return (Criteria) this;
        }

        public Criteria andBusinessInsureNotBetween(String value1, String value2) {
            addCriterion("business_insure not between", value1, value2, "businessInsure");
            return (Criteria) this;
        }

        public Criteria andBusinessSlipIsNull() {
            addCriterion("business_slip is null");
            return (Criteria) this;
        }

        public Criteria andBusinessSlipIsNotNull() {
            addCriterion("business_slip is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessSlipEqualTo(String value) {
            addCriterion("business_slip =", value, "businessSlip");
            return (Criteria) this;
        }

        public Criteria andBusinessSlipNotEqualTo(String value) {
            addCriterion("business_slip <>", value, "businessSlip");
            return (Criteria) this;
        }

        public Criteria andBusinessSlipGreaterThan(String value) {
            addCriterion("business_slip >", value, "businessSlip");
            return (Criteria) this;
        }

        public Criteria andBusinessSlipGreaterThanOrEqualTo(String value) {
            addCriterion("business_slip >=", value, "businessSlip");
            return (Criteria) this;
        }

        public Criteria andBusinessSlipLessThan(String value) {
            addCriterion("business_slip <", value, "businessSlip");
            return (Criteria) this;
        }

        public Criteria andBusinessSlipLessThanOrEqualTo(String value) {
            addCriterion("business_slip <=", value, "businessSlip");
            return (Criteria) this;
        }

        public Criteria andBusinessSlipLike(String value) {
            addCriterion("business_slip like", value, "businessSlip");
            return (Criteria) this;
        }

        public Criteria andBusinessSlipNotLike(String value) {
            addCriterion("business_slip not like", value, "businessSlip");
            return (Criteria) this;
        }

        public Criteria andBusinessSlipIn(List<String> values) {
            addCriterion("business_slip in", values, "businessSlip");
            return (Criteria) this;
        }

        public Criteria andBusinessSlipNotIn(List<String> values) {
            addCriterion("business_slip not in", values, "businessSlip");
            return (Criteria) this;
        }

        public Criteria andBusinessSlipBetween(String value1, String value2) {
            addCriterion("business_slip between", value1, value2, "businessSlip");
            return (Criteria) this;
        }

        public Criteria andBusinessSlipNotBetween(String value1, String value2) {
            addCriterion("business_slip not between", value1, value2, "businessSlip");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeIsNull() {
            addCriterion("business_time is null");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeIsNotNull() {
            addCriterion("business_time is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeEqualTo(Date value) {
            addCriterion("business_time =", value, "businessTime");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeNotEqualTo(Date value) {
            addCriterion("business_time <>", value, "businessTime");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeGreaterThan(Date value) {
            addCriterion("business_time >", value, "businessTime");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("business_time >=", value, "businessTime");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeLessThan(Date value) {
            addCriterion("business_time <", value, "businessTime");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeLessThanOrEqualTo(Date value) {
            addCriterion("business_time <=", value, "businessTime");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeIn(List<Date> values) {
            addCriterion("business_time in", values, "businessTime");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeNotIn(List<Date> values) {
            addCriterion("business_time not in", values, "businessTime");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeBetween(Date value1, Date value2) {
            addCriterion("business_time between", value1, value2, "businessTime");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeNotBetween(Date value1, Date value2) {
            addCriterion("business_time not between", value1, value2, "businessTime");
            return (Criteria) this;
        }

        public Criteria andBusinessJieTimeIsNull() {
            addCriterion("business_jie_time is null");
            return (Criteria) this;
        }

        public Criteria andBusinessJieTimeIsNotNull() {
            addCriterion("business_jie_time is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessJieTimeEqualTo(Date value) {
            addCriterion("business_jie_time =", value, "businessJieTime");
            return (Criteria) this;
        }

        public Criteria andBusinessJieTimeNotEqualTo(Date value) {
            addCriterion("business_jie_time <>", value, "businessJieTime");
            return (Criteria) this;
        }

        public Criteria andBusinessJieTimeGreaterThan(Date value) {
            addCriterion("business_jie_time >", value, "businessJieTime");
            return (Criteria) this;
        }

        public Criteria andBusinessJieTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("business_jie_time >=", value, "businessJieTime");
            return (Criteria) this;
        }

        public Criteria andBusinessJieTimeLessThan(Date value) {
            addCriterion("business_jie_time <", value, "businessJieTime");
            return (Criteria) this;
        }

        public Criteria andBusinessJieTimeLessThanOrEqualTo(Date value) {
            addCriterion("business_jie_time <=", value, "businessJieTime");
            return (Criteria) this;
        }

        public Criteria andBusinessJieTimeIn(List<Date> values) {
            addCriterion("business_jie_time in", values, "businessJieTime");
            return (Criteria) this;
        }

        public Criteria andBusinessJieTimeNotIn(List<Date> values) {
            addCriterion("business_jie_time not in", values, "businessJieTime");
            return (Criteria) this;
        }

        public Criteria andBusinessJieTimeBetween(Date value1, Date value2) {
            addCriterion("business_jie_time between", value1, value2, "businessJieTime");
            return (Criteria) this;
        }

        public Criteria andBusinessJieTimeNotBetween(Date value1, Date value2) {
            addCriterion("business_jie_time not between", value1, value2, "businessJieTime");
            return (Criteria) this;
        }

        public Criteria andBusinessMoneyIsNull() {
            addCriterion("business_money is null");
            return (Criteria) this;
        }

        public Criteria andBusinessMoneyIsNotNull() {
            addCriterion("business_money is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessMoneyEqualTo(Double value) {
            addCriterion("business_money =", value, "businessMoney");
            return (Criteria) this;
        }

        public Criteria andBusinessMoneyNotEqualTo(Double value) {
            addCriterion("business_money <>", value, "businessMoney");
            return (Criteria) this;
        }

        public Criteria andBusinessMoneyGreaterThan(Double value) {
            addCriterion("business_money >", value, "businessMoney");
            return (Criteria) this;
        }

        public Criteria andBusinessMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("business_money >=", value, "businessMoney");
            return (Criteria) this;
        }

        public Criteria andBusinessMoneyLessThan(Double value) {
            addCriterion("business_money <", value, "businessMoney");
            return (Criteria) this;
        }

        public Criteria andBusinessMoneyLessThanOrEqualTo(Double value) {
            addCriterion("business_money <=", value, "businessMoney");
            return (Criteria) this;
        }

        public Criteria andBusinessMoneyIn(List<Double> values) {
            addCriterion("business_money in", values, "businessMoney");
            return (Criteria) this;
        }

        public Criteria andBusinessMoneyNotIn(List<Double> values) {
            addCriterion("business_money not in", values, "businessMoney");
            return (Criteria) this;
        }

        public Criteria andBusinessMoneyBetween(Double value1, Double value2) {
            addCriterion("business_money between", value1, value2, "businessMoney");
            return (Criteria) this;
        }

        public Criteria andBusinessMoneyNotBetween(Double value1, Double value2) {
            addCriterion("business_money not between", value1, value2, "businessMoney");
            return (Criteria) this;
        }

        public Criteria andStrongBaoIsNull() {
            addCriterion("strong_bao is null");
            return (Criteria) this;
        }

        public Criteria andStrongBaoIsNotNull() {
            addCriterion("strong_bao is not null");
            return (Criteria) this;
        }

        public Criteria andStrongBaoEqualTo(String value) {
            addCriterion("strong_bao =", value, "strongBao");
            return (Criteria) this;
        }

        public Criteria andStrongBaoNotEqualTo(String value) {
            addCriterion("strong_bao <>", value, "strongBao");
            return (Criteria) this;
        }

        public Criteria andStrongBaoGreaterThan(String value) {
            addCriterion("strong_bao >", value, "strongBao");
            return (Criteria) this;
        }

        public Criteria andStrongBaoGreaterThanOrEqualTo(String value) {
            addCriterion("strong_bao >=", value, "strongBao");
            return (Criteria) this;
        }

        public Criteria andStrongBaoLessThan(String value) {
            addCriterion("strong_bao <", value, "strongBao");
            return (Criteria) this;
        }

        public Criteria andStrongBaoLessThanOrEqualTo(String value) {
            addCriterion("strong_bao <=", value, "strongBao");
            return (Criteria) this;
        }

        public Criteria andStrongBaoLike(String value) {
            addCriterion("strong_bao like", value, "strongBao");
            return (Criteria) this;
        }

        public Criteria andStrongBaoNotLike(String value) {
            addCriterion("strong_bao not like", value, "strongBao");
            return (Criteria) this;
        }

        public Criteria andStrongBaoIn(List<String> values) {
            addCriterion("strong_bao in", values, "strongBao");
            return (Criteria) this;
        }

        public Criteria andStrongBaoNotIn(List<String> values) {
            addCriterion("strong_bao not in", values, "strongBao");
            return (Criteria) this;
        }

        public Criteria andStrongBaoBetween(String value1, String value2) {
            addCriterion("strong_bao between", value1, value2, "strongBao");
            return (Criteria) this;
        }

        public Criteria andStrongBaoNotBetween(String value1, String value2) {
            addCriterion("strong_bao not between", value1, value2, "strongBao");
            return (Criteria) this;
        }

        public Criteria andStrongDanIsNull() {
            addCriterion("strong_dan is null");
            return (Criteria) this;
        }

        public Criteria andStrongDanIsNotNull() {
            addCriterion("strong_dan is not null");
            return (Criteria) this;
        }

        public Criteria andStrongDanEqualTo(String value) {
            addCriterion("strong_dan =", value, "strongDan");
            return (Criteria) this;
        }

        public Criteria andStrongDanNotEqualTo(String value) {
            addCriterion("strong_dan <>", value, "strongDan");
            return (Criteria) this;
        }

        public Criteria andStrongDanGreaterThan(String value) {
            addCriterion("strong_dan >", value, "strongDan");
            return (Criteria) this;
        }

        public Criteria andStrongDanGreaterThanOrEqualTo(String value) {
            addCriterion("strong_dan >=", value, "strongDan");
            return (Criteria) this;
        }

        public Criteria andStrongDanLessThan(String value) {
            addCriterion("strong_dan <", value, "strongDan");
            return (Criteria) this;
        }

        public Criteria andStrongDanLessThanOrEqualTo(String value) {
            addCriterion("strong_dan <=", value, "strongDan");
            return (Criteria) this;
        }

        public Criteria andStrongDanLike(String value) {
            addCriterion("strong_dan like", value, "strongDan");
            return (Criteria) this;
        }

        public Criteria andStrongDanNotLike(String value) {
            addCriterion("strong_dan not like", value, "strongDan");
            return (Criteria) this;
        }

        public Criteria andStrongDanIn(List<String> values) {
            addCriterion("strong_dan in", values, "strongDan");
            return (Criteria) this;
        }

        public Criteria andStrongDanNotIn(List<String> values) {
            addCriterion("strong_dan not in", values, "strongDan");
            return (Criteria) this;
        }

        public Criteria andStrongDanBetween(String value1, String value2) {
            addCriterion("strong_dan between", value1, value2, "strongDan");
            return (Criteria) this;
        }

        public Criteria andStrongDanNotBetween(String value1, String value2) {
            addCriterion("strong_dan not between", value1, value2, "strongDan");
            return (Criteria) this;
        }

        public Criteria andStrongTimeIsNull() {
            addCriterion("strong_time is null");
            return (Criteria) this;
        }

        public Criteria andStrongTimeIsNotNull() {
            addCriterion("strong_time is not null");
            return (Criteria) this;
        }

        public Criteria andStrongTimeEqualTo(Date value) {
            addCriterion("strong_time =", value, "strongTime");
            return (Criteria) this;
        }

        public Criteria andStrongTimeNotEqualTo(Date value) {
            addCriterion("strong_time <>", value, "strongTime");
            return (Criteria) this;
        }

        public Criteria andStrongTimeGreaterThan(Date value) {
            addCriterion("strong_time >", value, "strongTime");
            return (Criteria) this;
        }

        public Criteria andStrongTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("strong_time >=", value, "strongTime");
            return (Criteria) this;
        }

        public Criteria andStrongTimeLessThan(Date value) {
            addCriterion("strong_time <", value, "strongTime");
            return (Criteria) this;
        }

        public Criteria andStrongTimeLessThanOrEqualTo(Date value) {
            addCriterion("strong_time <=", value, "strongTime");
            return (Criteria) this;
        }

        public Criteria andStrongTimeIn(List<Date> values) {
            addCriterion("strong_time in", values, "strongTime");
            return (Criteria) this;
        }

        public Criteria andStrongTimeNotIn(List<Date> values) {
            addCriterion("strong_time not in", values, "strongTime");
            return (Criteria) this;
        }

        public Criteria andStrongTimeBetween(Date value1, Date value2) {
            addCriterion("strong_time between", value1, value2, "strongTime");
            return (Criteria) this;
        }

        public Criteria andStrongTimeNotBetween(Date value1, Date value2) {
            addCriterion("strong_time not between", value1, value2, "strongTime");
            return (Criteria) this;
        }

        public Criteria andMoneyJiaoqiangTimeIsNull() {
            addCriterion("money_jiaoqiang_time is null");
            return (Criteria) this;
        }

        public Criteria andMoneyJiaoqiangTimeIsNotNull() {
            addCriterion("money_jiaoqiang_time is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyJiaoqiangTimeEqualTo(Date value) {
            addCriterion("money_jiaoqiang_time =", value, "moneyJiaoqiangTime");
            return (Criteria) this;
        }

        public Criteria andMoneyJiaoqiangTimeNotEqualTo(Date value) {
            addCriterion("money_jiaoqiang_time <>", value, "moneyJiaoqiangTime");
            return (Criteria) this;
        }

        public Criteria andMoneyJiaoqiangTimeGreaterThan(Date value) {
            addCriterion("money_jiaoqiang_time >", value, "moneyJiaoqiangTime");
            return (Criteria) this;
        }

        public Criteria andMoneyJiaoqiangTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("money_jiaoqiang_time >=", value, "moneyJiaoqiangTime");
            return (Criteria) this;
        }

        public Criteria andMoneyJiaoqiangTimeLessThan(Date value) {
            addCriterion("money_jiaoqiang_time <", value, "moneyJiaoqiangTime");
            return (Criteria) this;
        }

        public Criteria andMoneyJiaoqiangTimeLessThanOrEqualTo(Date value) {
            addCriterion("money_jiaoqiang_time <=", value, "moneyJiaoqiangTime");
            return (Criteria) this;
        }

        public Criteria andMoneyJiaoqiangTimeIn(List<Date> values) {
            addCriterion("money_jiaoqiang_time in", values, "moneyJiaoqiangTime");
            return (Criteria) this;
        }

        public Criteria andMoneyJiaoqiangTimeNotIn(List<Date> values) {
            addCriterion("money_jiaoqiang_time not in", values, "moneyJiaoqiangTime");
            return (Criteria) this;
        }

        public Criteria andMoneyJiaoqiangTimeBetween(Date value1, Date value2) {
            addCriterion("money_jiaoqiang_time between", value1, value2, "moneyJiaoqiangTime");
            return (Criteria) this;
        }

        public Criteria andMoneyJiaoqiangTimeNotBetween(Date value1, Date value2) {
            addCriterion("money_jiaoqiang_time not between", value1, value2, "moneyJiaoqiangTime");
            return (Criteria) this;
        }

        public Criteria andMoneyJiaoqiangIsNull() {
            addCriterion("money_jiaoqiang is null");
            return (Criteria) this;
        }

        public Criteria andMoneyJiaoqiangIsNotNull() {
            addCriterion("money_jiaoqiang is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyJiaoqiangEqualTo(Double value) {
            addCriterion("money_jiaoqiang =", value, "moneyJiaoqiang");
            return (Criteria) this;
        }

        public Criteria andMoneyJiaoqiangNotEqualTo(Double value) {
            addCriterion("money_jiaoqiang <>", value, "moneyJiaoqiang");
            return (Criteria) this;
        }

        public Criteria andMoneyJiaoqiangGreaterThan(Double value) {
            addCriterion("money_jiaoqiang >", value, "moneyJiaoqiang");
            return (Criteria) this;
        }

        public Criteria andMoneyJiaoqiangGreaterThanOrEqualTo(Double value) {
            addCriterion("money_jiaoqiang >=", value, "moneyJiaoqiang");
            return (Criteria) this;
        }

        public Criteria andMoneyJiaoqiangLessThan(Double value) {
            addCriterion("money_jiaoqiang <", value, "moneyJiaoqiang");
            return (Criteria) this;
        }

        public Criteria andMoneyJiaoqiangLessThanOrEqualTo(Double value) {
            addCriterion("money_jiaoqiang <=", value, "moneyJiaoqiang");
            return (Criteria) this;
        }

        public Criteria andMoneyJiaoqiangIn(List<Double> values) {
            addCriterion("money_jiaoqiang in", values, "moneyJiaoqiang");
            return (Criteria) this;
        }

        public Criteria andMoneyJiaoqiangNotIn(List<Double> values) {
            addCriterion("money_jiaoqiang not in", values, "moneyJiaoqiang");
            return (Criteria) this;
        }

        public Criteria andMoneyJiaoqiangBetween(Double value1, Double value2) {
            addCriterion("money_jiaoqiang between", value1, value2, "moneyJiaoqiang");
            return (Criteria) this;
        }

        public Criteria andMoneyJiaoqiangNotBetween(Double value1, Double value2) {
            addCriterion("money_jiaoqiang not between", value1, value2, "moneyJiaoqiang");
            return (Criteria) this;
        }

        public Criteria andBoatsTallageIsNull() {
            addCriterion("boats_tallage is null");
            return (Criteria) this;
        }

        public Criteria andBoatsTallageIsNotNull() {
            addCriterion("boats_tallage is not null");
            return (Criteria) this;
        }

        public Criteria andBoatsTallageEqualTo(Double value) {
            addCriterion("boats_tallage =", value, "boatsTallage");
            return (Criteria) this;
        }

        public Criteria andBoatsTallageNotEqualTo(Double value) {
            addCriterion("boats_tallage <>", value, "boatsTallage");
            return (Criteria) this;
        }

        public Criteria andBoatsTallageGreaterThan(Double value) {
            addCriterion("boats_tallage >", value, "boatsTallage");
            return (Criteria) this;
        }

        public Criteria andBoatsTallageGreaterThanOrEqualTo(Double value) {
            addCriterion("boats_tallage >=", value, "boatsTallage");
            return (Criteria) this;
        }

        public Criteria andBoatsTallageLessThan(Double value) {
            addCriterion("boats_tallage <", value, "boatsTallage");
            return (Criteria) this;
        }

        public Criteria andBoatsTallageLessThanOrEqualTo(Double value) {
            addCriterion("boats_tallage <=", value, "boatsTallage");
            return (Criteria) this;
        }

        public Criteria andBoatsTallageIn(List<Double> values) {
            addCriterion("boats_tallage in", values, "boatsTallage");
            return (Criteria) this;
        }

        public Criteria andBoatsTallageNotIn(List<Double> values) {
            addCriterion("boats_tallage not in", values, "boatsTallage");
            return (Criteria) this;
        }

        public Criteria andBoatsTallageBetween(Double value1, Double value2) {
            addCriterion("boats_tallage between", value1, value2, "boatsTallage");
            return (Criteria) this;
        }

        public Criteria andBoatsTallageNotBetween(Double value1, Double value2) {
            addCriterion("boats_tallage not between", value1, value2, "boatsTallage");
            return (Criteria) this;
        }

        public Criteria andRateIsNull() {
            addCriterion("rate is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("rate is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(Double value) {
            addCriterion("rate =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(Double value) {
            addCriterion("rate <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(Double value) {
            addCriterion("rate >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(Double value) {
            addCriterion("rate >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(Double value) {
            addCriterion("rate <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(Double value) {
            addCriterion("rate <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<Double> values) {
            addCriterion("rate in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<Double> values) {
            addCriterion("rate not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(Double value1, Double value2) {
            addCriterion("rate between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(Double value1, Double value2) {
            addCriterion("rate not between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andSumCoefficientIsNull() {
            addCriterion("sum_coefficient is null");
            return (Criteria) this;
        }

        public Criteria andSumCoefficientIsNotNull() {
            addCriterion("sum_coefficient is not null");
            return (Criteria) this;
        }

        public Criteria andSumCoefficientEqualTo(Double value) {
            addCriterion("sum_coefficient =", value, "sumCoefficient");
            return (Criteria) this;
        }

        public Criteria andSumCoefficientNotEqualTo(Double value) {
            addCriterion("sum_coefficient <>", value, "sumCoefficient");
            return (Criteria) this;
        }

        public Criteria andSumCoefficientGreaterThan(Double value) {
            addCriterion("sum_coefficient >", value, "sumCoefficient");
            return (Criteria) this;
        }

        public Criteria andSumCoefficientGreaterThanOrEqualTo(Double value) {
            addCriterion("sum_coefficient >=", value, "sumCoefficient");
            return (Criteria) this;
        }

        public Criteria andSumCoefficientLessThan(Double value) {
            addCriterion("sum_coefficient <", value, "sumCoefficient");
            return (Criteria) this;
        }

        public Criteria andSumCoefficientLessThanOrEqualTo(Double value) {
            addCriterion("sum_coefficient <=", value, "sumCoefficient");
            return (Criteria) this;
        }

        public Criteria andSumCoefficientIn(List<Double> values) {
            addCriterion("sum_coefficient in", values, "sumCoefficient");
            return (Criteria) this;
        }

        public Criteria andSumCoefficientNotIn(List<Double> values) {
            addCriterion("sum_coefficient not in", values, "sumCoefficient");
            return (Criteria) this;
        }

        public Criteria andSumCoefficientBetween(Double value1, Double value2) {
            addCriterion("sum_coefficient between", value1, value2, "sumCoefficient");
            return (Criteria) this;
        }

        public Criteria andSumCoefficientNotBetween(Double value1, Double value2) {
            addCriterion("sum_coefficient not between", value1, value2, "sumCoefficient");
            return (Criteria) this;
        }

        public Criteria andCommunicationTreatmentIsNull() {
            addCriterion("communication_treatment is null");
            return (Criteria) this;
        }

        public Criteria andCommunicationTreatmentIsNotNull() {
            addCriterion("communication_treatment is not null");
            return (Criteria) this;
        }

        public Criteria andCommunicationTreatmentEqualTo(Double value) {
            addCriterion("communication_treatment =", value, "communicationTreatment");
            return (Criteria) this;
        }

        public Criteria andCommunicationTreatmentNotEqualTo(Double value) {
            addCriterion("communication_treatment <>", value, "communicationTreatment");
            return (Criteria) this;
        }

        public Criteria andCommunicationTreatmentGreaterThan(Double value) {
            addCriterion("communication_treatment >", value, "communicationTreatment");
            return (Criteria) this;
        }

        public Criteria andCommunicationTreatmentGreaterThanOrEqualTo(Double value) {
            addCriterion("communication_treatment >=", value, "communicationTreatment");
            return (Criteria) this;
        }

        public Criteria andCommunicationTreatmentLessThan(Double value) {
            addCriterion("communication_treatment <", value, "communicationTreatment");
            return (Criteria) this;
        }

        public Criteria andCommunicationTreatmentLessThanOrEqualTo(Double value) {
            addCriterion("communication_treatment <=", value, "communicationTreatment");
            return (Criteria) this;
        }

        public Criteria andCommunicationTreatmentIn(List<Double> values) {
            addCriterion("communication_treatment in", values, "communicationTreatment");
            return (Criteria) this;
        }

        public Criteria andCommunicationTreatmentNotIn(List<Double> values) {
            addCriterion("communication_treatment not in", values, "communicationTreatment");
            return (Criteria) this;
        }

        public Criteria andCommunicationTreatmentBetween(Double value1, Double value2) {
            addCriterion("communication_treatment between", value1, value2, "communicationTreatment");
            return (Criteria) this;
        }

        public Criteria andCommunicationTreatmentNotBetween(Double value1, Double value2) {
            addCriterion("communication_treatment not between", value1, value2, "communicationTreatment");
            return (Criteria) this;
        }

        public Criteria andTransportationCoefficientIsNull() {
            addCriterion("transportation_coefficient is null");
            return (Criteria) this;
        }

        public Criteria andTransportationCoefficientIsNotNull() {
            addCriterion("transportation_coefficient is not null");
            return (Criteria) this;
        }

        public Criteria andTransportationCoefficientEqualTo(Double value) {
            addCriterion("transportation_coefficient =", value, "transportationCoefficient");
            return (Criteria) this;
        }

        public Criteria andTransportationCoefficientNotEqualTo(Double value) {
            addCriterion("transportation_coefficient <>", value, "transportationCoefficient");
            return (Criteria) this;
        }

        public Criteria andTransportationCoefficientGreaterThan(Double value) {
            addCriterion("transportation_coefficient >", value, "transportationCoefficient");
            return (Criteria) this;
        }

        public Criteria andTransportationCoefficientGreaterThanOrEqualTo(Double value) {
            addCriterion("transportation_coefficient >=", value, "transportationCoefficient");
            return (Criteria) this;
        }

        public Criteria andTransportationCoefficientLessThan(Double value) {
            addCriterion("transportation_coefficient <", value, "transportationCoefficient");
            return (Criteria) this;
        }

        public Criteria andTransportationCoefficientLessThanOrEqualTo(Double value) {
            addCriterion("transportation_coefficient <=", value, "transportationCoefficient");
            return (Criteria) this;
        }

        public Criteria andTransportationCoefficientIn(List<Double> values) {
            addCriterion("transportation_coefficient in", values, "transportationCoefficient");
            return (Criteria) this;
        }

        public Criteria andTransportationCoefficientNotIn(List<Double> values) {
            addCriterion("transportation_coefficient not in", values, "transportationCoefficient");
            return (Criteria) this;
        }

        public Criteria andTransportationCoefficientBetween(Double value1, Double value2) {
            addCriterion("transportation_coefficient between", value1, value2, "transportationCoefficient");
            return (Criteria) this;
        }

        public Criteria andTransportationCoefficientNotBetween(Double value1, Double value2) {
            addCriterion("transportation_coefficient not between", value1, value2, "transportationCoefficient");
            return (Criteria) this;
        }

        public Criteria andUnderwritingProductIsNull() {
            addCriterion("underwriting_product is null");
            return (Criteria) this;
        }

        public Criteria andUnderwritingProductIsNotNull() {
            addCriterion("underwriting_product is not null");
            return (Criteria) this;
        }

        public Criteria andUnderwritingProductEqualTo(Double value) {
            addCriterion("underwriting_product =", value, "underwritingProduct");
            return (Criteria) this;
        }

        public Criteria andUnderwritingProductNotEqualTo(Double value) {
            addCriterion("underwriting_product <>", value, "underwritingProduct");
            return (Criteria) this;
        }

        public Criteria andUnderwritingProductGreaterThan(Double value) {
            addCriterion("underwriting_product >", value, "underwritingProduct");
            return (Criteria) this;
        }

        public Criteria andUnderwritingProductGreaterThanOrEqualTo(Double value) {
            addCriterion("underwriting_product >=", value, "underwritingProduct");
            return (Criteria) this;
        }

        public Criteria andUnderwritingProductLessThan(Double value) {
            addCriterion("underwriting_product <", value, "underwritingProduct");
            return (Criteria) this;
        }

        public Criteria andUnderwritingProductLessThanOrEqualTo(Double value) {
            addCriterion("underwriting_product <=", value, "underwritingProduct");
            return (Criteria) this;
        }

        public Criteria andUnderwritingProductIn(List<Double> values) {
            addCriterion("underwriting_product in", values, "underwritingProduct");
            return (Criteria) this;
        }

        public Criteria andUnderwritingProductNotIn(List<Double> values) {
            addCriterion("underwriting_product not in", values, "underwritingProduct");
            return (Criteria) this;
        }

        public Criteria andUnderwritingProductBetween(Double value1, Double value2) {
            addCriterion("underwriting_product between", value1, value2, "underwritingProduct");
            return (Criteria) this;
        }

        public Criteria andUnderwritingProductNotBetween(Double value1, Double value2) {
            addCriterion("underwriting_product not between", value1, value2, "underwritingProduct");
            return (Criteria) this;
        }

        public Criteria andUnderwritingCoefficientIsNull() {
            addCriterion("underwriting_coefficient is null");
            return (Criteria) this;
        }

        public Criteria andUnderwritingCoefficientIsNotNull() {
            addCriterion("underwriting_coefficient is not null");
            return (Criteria) this;
        }

        public Criteria andUnderwritingCoefficientEqualTo(Double value) {
            addCriterion("underwriting_coefficient =", value, "underwritingCoefficient");
            return (Criteria) this;
        }

        public Criteria andUnderwritingCoefficientNotEqualTo(Double value) {
            addCriterion("underwriting_coefficient <>", value, "underwritingCoefficient");
            return (Criteria) this;
        }

        public Criteria andUnderwritingCoefficientGreaterThan(Double value) {
            addCriterion("underwriting_coefficient >", value, "underwritingCoefficient");
            return (Criteria) this;
        }

        public Criteria andUnderwritingCoefficientGreaterThanOrEqualTo(Double value) {
            addCriterion("underwriting_coefficient >=", value, "underwritingCoefficient");
            return (Criteria) this;
        }

        public Criteria andUnderwritingCoefficientLessThan(Double value) {
            addCriterion("underwriting_coefficient <", value, "underwritingCoefficient");
            return (Criteria) this;
        }

        public Criteria andUnderwritingCoefficientLessThanOrEqualTo(Double value) {
            addCriterion("underwriting_coefficient <=", value, "underwritingCoefficient");
            return (Criteria) this;
        }

        public Criteria andUnderwritingCoefficientIn(List<Double> values) {
            addCriterion("underwriting_coefficient in", values, "underwritingCoefficient");
            return (Criteria) this;
        }

        public Criteria andUnderwritingCoefficientNotIn(List<Double> values) {
            addCriterion("underwriting_coefficient not in", values, "underwritingCoefficient");
            return (Criteria) this;
        }

        public Criteria andUnderwritingCoefficientBetween(Double value1, Double value2) {
            addCriterion("underwriting_coefficient between", value1, value2, "underwritingCoefficient");
            return (Criteria) this;
        }

        public Criteria andUnderwritingCoefficientNotBetween(Double value1, Double value2) {
            addCriterion("underwriting_coefficient not between", value1, value2, "underwritingCoefficient");
            return (Criteria) this;
        }

        public Criteria andDitchCoefficientIsNull() {
            addCriterion("ditch_coefficient is null");
            return (Criteria) this;
        }

        public Criteria andDitchCoefficientIsNotNull() {
            addCriterion("ditch_coefficient is not null");
            return (Criteria) this;
        }

        public Criteria andDitchCoefficientEqualTo(Double value) {
            addCriterion("ditch_coefficient =", value, "ditchCoefficient");
            return (Criteria) this;
        }

        public Criteria andDitchCoefficientNotEqualTo(Double value) {
            addCriterion("ditch_coefficient <>", value, "ditchCoefficient");
            return (Criteria) this;
        }

        public Criteria andDitchCoefficientGreaterThan(Double value) {
            addCriterion("ditch_coefficient >", value, "ditchCoefficient");
            return (Criteria) this;
        }

        public Criteria andDitchCoefficientGreaterThanOrEqualTo(Double value) {
            addCriterion("ditch_coefficient >=", value, "ditchCoefficient");
            return (Criteria) this;
        }

        public Criteria andDitchCoefficientLessThan(Double value) {
            addCriterion("ditch_coefficient <", value, "ditchCoefficient");
            return (Criteria) this;
        }

        public Criteria andDitchCoefficientLessThanOrEqualTo(Double value) {
            addCriterion("ditch_coefficient <=", value, "ditchCoefficient");
            return (Criteria) this;
        }

        public Criteria andDitchCoefficientIn(List<Double> values) {
            addCriterion("ditch_coefficient in", values, "ditchCoefficient");
            return (Criteria) this;
        }

        public Criteria andDitchCoefficientNotIn(List<Double> values) {
            addCriterion("ditch_coefficient not in", values, "ditchCoefficient");
            return (Criteria) this;
        }

        public Criteria andDitchCoefficientBetween(Double value1, Double value2) {
            addCriterion("ditch_coefficient between", value1, value2, "ditchCoefficient");
            return (Criteria) this;
        }

        public Criteria andDitchCoefficientNotBetween(Double value1, Double value2) {
            addCriterion("ditch_coefficient not between", value1, value2, "ditchCoefficient");
            return (Criteria) this;
        }

        public Criteria andFPriceShangIsNull() {
            addCriterion("f_price_shang is null");
            return (Criteria) this;
        }

        public Criteria andFPriceShangIsNotNull() {
            addCriterion("f_price_shang is not null");
            return (Criteria) this;
        }

        public Criteria andFPriceShangEqualTo(Double value) {
            addCriterion("f_price_shang =", value, "fPriceShang");
            return (Criteria) this;
        }

        public Criteria andFPriceShangNotEqualTo(Double value) {
            addCriterion("f_price_shang <>", value, "fPriceShang");
            return (Criteria) this;
        }

        public Criteria andFPriceShangGreaterThan(Double value) {
            addCriterion("f_price_shang >", value, "fPriceShang");
            return (Criteria) this;
        }

        public Criteria andFPriceShangGreaterThanOrEqualTo(Double value) {
            addCriterion("f_price_shang >=", value, "fPriceShang");
            return (Criteria) this;
        }

        public Criteria andFPriceShangLessThan(Double value) {
            addCriterion("f_price_shang <", value, "fPriceShang");
            return (Criteria) this;
        }

        public Criteria andFPriceShangLessThanOrEqualTo(Double value) {
            addCriterion("f_price_shang <=", value, "fPriceShang");
            return (Criteria) this;
        }

        public Criteria andFPriceShangIn(List<Double> values) {
            addCriterion("f_price_shang in", values, "fPriceShang");
            return (Criteria) this;
        }

        public Criteria andFPriceShangNotIn(List<Double> values) {
            addCriterion("f_price_shang not in", values, "fPriceShang");
            return (Criteria) this;
        }

        public Criteria andFPriceShangBetween(Double value1, Double value2) {
            addCriterion("f_price_shang between", value1, value2, "fPriceShang");
            return (Criteria) this;
        }

        public Criteria andFPriceShangNotBetween(Double value1, Double value2) {
            addCriterion("f_price_shang not between", value1, value2, "fPriceShang");
            return (Criteria) this;
        }

        public Criteria andFPriceJiaoIsNull() {
            addCriterion("f_price_jiao is null");
            return (Criteria) this;
        }

        public Criteria andFPriceJiaoIsNotNull() {
            addCriterion("f_price_jiao is not null");
            return (Criteria) this;
        }

        public Criteria andFPriceJiaoEqualTo(Double value) {
            addCriterion("f_price_jiao =", value, "fPriceJiao");
            return (Criteria) this;
        }

        public Criteria andFPriceJiaoNotEqualTo(Double value) {
            addCriterion("f_price_jiao <>", value, "fPriceJiao");
            return (Criteria) this;
        }

        public Criteria andFPriceJiaoGreaterThan(Double value) {
            addCriterion("f_price_jiao >", value, "fPriceJiao");
            return (Criteria) this;
        }

        public Criteria andFPriceJiaoGreaterThanOrEqualTo(Double value) {
            addCriterion("f_price_jiao >=", value, "fPriceJiao");
            return (Criteria) this;
        }

        public Criteria andFPriceJiaoLessThan(Double value) {
            addCriterion("f_price_jiao <", value, "fPriceJiao");
            return (Criteria) this;
        }

        public Criteria andFPriceJiaoLessThanOrEqualTo(Double value) {
            addCriterion("f_price_jiao <=", value, "fPriceJiao");
            return (Criteria) this;
        }

        public Criteria andFPriceJiaoIn(List<Double> values) {
            addCriterion("f_price_jiao in", values, "fPriceJiao");
            return (Criteria) this;
        }

        public Criteria andFPriceJiaoNotIn(List<Double> values) {
            addCriterion("f_price_jiao not in", values, "fPriceJiao");
            return (Criteria) this;
        }

        public Criteria andFPriceJiaoBetween(Double value1, Double value2) {
            addCriterion("f_price_jiao between", value1, value2, "fPriceJiao");
            return (Criteria) this;
        }

        public Criteria andFPriceJiaoNotBetween(Double value1, Double value2) {
            addCriterion("f_price_jiao not between", value1, value2, "fPriceJiao");
            return (Criteria) this;
        }

        public Criteria andMoneyHeIsNull() {
            addCriterion("money_he is null");
            return (Criteria) this;
        }

        public Criteria andMoneyHeIsNotNull() {
            addCriterion("money_he is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyHeEqualTo(Double value) {
            addCriterion("money_he =", value, "moneyHe");
            return (Criteria) this;
        }

        public Criteria andMoneyHeNotEqualTo(Double value) {
            addCriterion("money_he <>", value, "moneyHe");
            return (Criteria) this;
        }

        public Criteria andMoneyHeGreaterThan(Double value) {
            addCriterion("money_he >", value, "moneyHe");
            return (Criteria) this;
        }

        public Criteria andMoneyHeGreaterThanOrEqualTo(Double value) {
            addCriterion("money_he >=", value, "moneyHe");
            return (Criteria) this;
        }

        public Criteria andMoneyHeLessThan(Double value) {
            addCriterion("money_he <", value, "moneyHe");
            return (Criteria) this;
        }

        public Criteria andMoneyHeLessThanOrEqualTo(Double value) {
            addCriterion("money_he <=", value, "moneyHe");
            return (Criteria) this;
        }

        public Criteria andMoneyHeIn(List<Double> values) {
            addCriterion("money_he in", values, "moneyHe");
            return (Criteria) this;
        }

        public Criteria andMoneyHeNotIn(List<Double> values) {
            addCriterion("money_he not in", values, "moneyHe");
            return (Criteria) this;
        }

        public Criteria andMoneyHeBetween(Double value1, Double value2) {
            addCriterion("money_he between", value1, value2, "moneyHe");
            return (Criteria) this;
        }

        public Criteria andMoneyHeNotBetween(Double value1, Double value2) {
            addCriterion("money_he not between", value1, value2, "moneyHe");
            return (Criteria) this;
        }

        public Criteria andDianSlipIsNull() {
            addCriterion("dian_slip is null");
            return (Criteria) this;
        }

        public Criteria andDianSlipIsNotNull() {
            addCriterion("dian_slip is not null");
            return (Criteria) this;
        }

        public Criteria andDianSlipEqualTo(Integer value) {
            addCriterion("dian_slip =", value, "dianSlip");
            return (Criteria) this;
        }

        public Criteria andDianSlipNotEqualTo(Integer value) {
            addCriterion("dian_slip <>", value, "dianSlip");
            return (Criteria) this;
        }

        public Criteria andDianSlipGreaterThan(Integer value) {
            addCriterion("dian_slip >", value, "dianSlip");
            return (Criteria) this;
        }

        public Criteria andDianSlipGreaterThanOrEqualTo(Integer value) {
            addCriterion("dian_slip >=", value, "dianSlip");
            return (Criteria) this;
        }

        public Criteria andDianSlipLessThan(Integer value) {
            addCriterion("dian_slip <", value, "dianSlip");
            return (Criteria) this;
        }

        public Criteria andDianSlipLessThanOrEqualTo(Integer value) {
            addCriterion("dian_slip <=", value, "dianSlip");
            return (Criteria) this;
        }

        public Criteria andDianSlipIn(List<Integer> values) {
            addCriterion("dian_slip in", values, "dianSlip");
            return (Criteria) this;
        }

        public Criteria andDianSlipNotIn(List<Integer> values) {
            addCriterion("dian_slip not in", values, "dianSlip");
            return (Criteria) this;
        }

        public Criteria andDianSlipBetween(Integer value1, Integer value2) {
            addCriterion("dian_slip between", value1, value2, "dianSlip");
            return (Criteria) this;
        }

        public Criteria andDianSlipNotBetween(Integer value1, Integer value2) {
            addCriterion("dian_slip not between", value1, value2, "dianSlip");
            return (Criteria) this;
        }

        public Criteria andDianTicketIsNull() {
            addCriterion("dian_ticket is null");
            return (Criteria) this;
        }

        public Criteria andDianTicketIsNotNull() {
            addCriterion("dian_ticket is not null");
            return (Criteria) this;
        }

        public Criteria andDianTicketEqualTo(Integer value) {
            addCriterion("dian_ticket =", value, "dianTicket");
            return (Criteria) this;
        }

        public Criteria andDianTicketNotEqualTo(Integer value) {
            addCriterion("dian_ticket <>", value, "dianTicket");
            return (Criteria) this;
        }

        public Criteria andDianTicketGreaterThan(Integer value) {
            addCriterion("dian_ticket >", value, "dianTicket");
            return (Criteria) this;
        }

        public Criteria andDianTicketGreaterThanOrEqualTo(Integer value) {
            addCriterion("dian_ticket >=", value, "dianTicket");
            return (Criteria) this;
        }

        public Criteria andDianTicketLessThan(Integer value) {
            addCriterion("dian_ticket <", value, "dianTicket");
            return (Criteria) this;
        }

        public Criteria andDianTicketLessThanOrEqualTo(Integer value) {
            addCriterion("dian_ticket <=", value, "dianTicket");
            return (Criteria) this;
        }

        public Criteria andDianTicketIn(List<Integer> values) {
            addCriterion("dian_ticket in", values, "dianTicket");
            return (Criteria) this;
        }

        public Criteria andDianTicketNotIn(List<Integer> values) {
            addCriterion("dian_ticket not in", values, "dianTicket");
            return (Criteria) this;
        }

        public Criteria andDianTicketBetween(Integer value1, Integer value2) {
            addCriterion("dian_ticket between", value1, value2, "dianTicket");
            return (Criteria) this;
        }

        public Criteria andDianTicketNotBetween(Integer value1, Integer value2) {
            addCriterion("dian_ticket not between", value1, value2, "dianTicket");
            return (Criteria) this;
        }

        public Criteria andDianEmaliIsNull() {
            addCriterion("dian_emali is null");
            return (Criteria) this;
        }

        public Criteria andDianEmaliIsNotNull() {
            addCriterion("dian_emali is not null");
            return (Criteria) this;
        }

        public Criteria andDianEmaliEqualTo(String value) {
            addCriterion("dian_emali =", value, "dianEmali");
            return (Criteria) this;
        }

        public Criteria andDianEmaliNotEqualTo(String value) {
            addCriterion("dian_emali <>", value, "dianEmali");
            return (Criteria) this;
        }

        public Criteria andDianEmaliGreaterThan(String value) {
            addCriterion("dian_emali >", value, "dianEmali");
            return (Criteria) this;
        }

        public Criteria andDianEmaliGreaterThanOrEqualTo(String value) {
            addCriterion("dian_emali >=", value, "dianEmali");
            return (Criteria) this;
        }

        public Criteria andDianEmaliLessThan(String value) {
            addCriterion("dian_emali <", value, "dianEmali");
            return (Criteria) this;
        }

        public Criteria andDianEmaliLessThanOrEqualTo(String value) {
            addCriterion("dian_emali <=", value, "dianEmali");
            return (Criteria) this;
        }

        public Criteria andDianEmaliLike(String value) {
            addCriterion("dian_emali like", value, "dianEmali");
            return (Criteria) this;
        }

        public Criteria andDianEmaliNotLike(String value) {
            addCriterion("dian_emali not like", value, "dianEmali");
            return (Criteria) this;
        }

        public Criteria andDianEmaliIn(List<String> values) {
            addCriterion("dian_emali in", values, "dianEmali");
            return (Criteria) this;
        }

        public Criteria andDianEmaliNotIn(List<String> values) {
            addCriterion("dian_emali not in", values, "dianEmali");
            return (Criteria) this;
        }

        public Criteria andDianEmaliBetween(String value1, String value2) {
            addCriterion("dian_emali between", value1, value2, "dianEmali");
            return (Criteria) this;
        }

        public Criteria andDianEmaliNotBetween(String value1, String value2) {
            addCriterion("dian_emali not between", value1, value2, "dianEmali");
            return (Criteria) this;
        }

        public Criteria andSignBaoIsNull() {
            addCriterion("sign_bao is null");
            return (Criteria) this;
        }

        public Criteria andSignBaoIsNotNull() {
            addCriterion("sign_bao is not null");
            return (Criteria) this;
        }

        public Criteria andSignBaoEqualTo(Integer value) {
            addCriterion("sign_bao =", value, "signBao");
            return (Criteria) this;
        }

        public Criteria andSignBaoNotEqualTo(Integer value) {
            addCriterion("sign_bao <>", value, "signBao");
            return (Criteria) this;
        }

        public Criteria andSignBaoGreaterThan(Integer value) {
            addCriterion("sign_bao >", value, "signBao");
            return (Criteria) this;
        }

        public Criteria andSignBaoGreaterThanOrEqualTo(Integer value) {
            addCriterion("sign_bao >=", value, "signBao");
            return (Criteria) this;
        }

        public Criteria andSignBaoLessThan(Integer value) {
            addCriterion("sign_bao <", value, "signBao");
            return (Criteria) this;
        }

        public Criteria andSignBaoLessThanOrEqualTo(Integer value) {
            addCriterion("sign_bao <=", value, "signBao");
            return (Criteria) this;
        }

        public Criteria andSignBaoIn(List<Integer> values) {
            addCriterion("sign_bao in", values, "signBao");
            return (Criteria) this;
        }

        public Criteria andSignBaoNotIn(List<Integer> values) {
            addCriterion("sign_bao not in", values, "signBao");
            return (Criteria) this;
        }

        public Criteria andSignBaoBetween(Integer value1, Integer value2) {
            addCriterion("sign_bao between", value1, value2, "signBao");
            return (Criteria) this;
        }

        public Criteria andSignBaoNotBetween(Integer value1, Integer value2) {
            addCriterion("sign_bao not between", value1, value2, "signBao");
            return (Criteria) this;
        }

        public Criteria andSwNumberIsNull() {
            addCriterion("sw_number is null");
            return (Criteria) this;
        }

        public Criteria andSwNumberIsNotNull() {
            addCriterion("sw_number is not null");
            return (Criteria) this;
        }

        public Criteria andSwNumberEqualTo(String value) {
            addCriterion("sw_number =", value, "swNumber");
            return (Criteria) this;
        }

        public Criteria andSwNumberNotEqualTo(String value) {
            addCriterion("sw_number <>", value, "swNumber");
            return (Criteria) this;
        }

        public Criteria andSwNumberGreaterThan(String value) {
            addCriterion("sw_number >", value, "swNumber");
            return (Criteria) this;
        }

        public Criteria andSwNumberGreaterThanOrEqualTo(String value) {
            addCriterion("sw_number >=", value, "swNumber");
            return (Criteria) this;
        }

        public Criteria andSwNumberLessThan(String value) {
            addCriterion("sw_number <", value, "swNumber");
            return (Criteria) this;
        }

        public Criteria andSwNumberLessThanOrEqualTo(String value) {
            addCriterion("sw_number <=", value, "swNumber");
            return (Criteria) this;
        }

        public Criteria andSwNumberLike(String value) {
            addCriterion("sw_number like", value, "swNumber");
            return (Criteria) this;
        }

        public Criteria andSwNumberNotLike(String value) {
            addCriterion("sw_number not like", value, "swNumber");
            return (Criteria) this;
        }

        public Criteria andSwNumberIn(List<String> values) {
            addCriterion("sw_number in", values, "swNumber");
            return (Criteria) this;
        }

        public Criteria andSwNumberNotIn(List<String> values) {
            addCriterion("sw_number not in", values, "swNumber");
            return (Criteria) this;
        }

        public Criteria andSwNumberBetween(String value1, String value2) {
            addCriterion("sw_number between", value1, value2, "swNumber");
            return (Criteria) this;
        }

        public Criteria andSwNumberNotBetween(String value1, String value2) {
            addCriterion("sw_number not between", value1, value2, "swNumber");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Integer value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Integer value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Integer value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Integer value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Integer value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Integer> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Integer> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Integer value1, Integer value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNull() {
            addCriterion("payment is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNotNull() {
            addCriterion("payment is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentEqualTo(Integer value) {
            addCriterion("payment =", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotEqualTo(Integer value) {
            addCriterion("payment <>", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThan(Integer value) {
            addCriterion("payment >", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThanOrEqualTo(Integer value) {
            addCriterion("payment >=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThan(Integer value) {
            addCriterion("payment <", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThanOrEqualTo(Integer value) {
            addCriterion("payment <=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentIn(List<Integer> values) {
            addCriterion("payment in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotIn(List<Integer> values) {
            addCriterion("payment not in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentBetween(Integer value1, Integer value2) {
            addCriterion("payment between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotBetween(Integer value1, Integer value2) {
            addCriterion("payment not between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andPfoNumberIsNull() {
            addCriterion("pfo_number is null");
            return (Criteria) this;
        }

        public Criteria andPfoNumberIsNotNull() {
            addCriterion("pfo_number is not null");
            return (Criteria) this;
        }

        public Criteria andPfoNumberEqualTo(String value) {
            addCriterion("pfo_number =", value, "pfoNumber");
            return (Criteria) this;
        }

        public Criteria andPfoNumberNotEqualTo(String value) {
            addCriterion("pfo_number <>", value, "pfoNumber");
            return (Criteria) this;
        }

        public Criteria andPfoNumberGreaterThan(String value) {
            addCriterion("pfo_number >", value, "pfoNumber");
            return (Criteria) this;
        }

        public Criteria andPfoNumberGreaterThanOrEqualTo(String value) {
            addCriterion("pfo_number >=", value, "pfoNumber");
            return (Criteria) this;
        }

        public Criteria andPfoNumberLessThan(String value) {
            addCriterion("pfo_number <", value, "pfoNumber");
            return (Criteria) this;
        }

        public Criteria andPfoNumberLessThanOrEqualTo(String value) {
            addCriterion("pfo_number <=", value, "pfoNumber");
            return (Criteria) this;
        }

        public Criteria andPfoNumberLike(String value) {
            addCriterion("pfo_number like", value, "pfoNumber");
            return (Criteria) this;
        }

        public Criteria andPfoNumberNotLike(String value) {
            addCriterion("pfo_number not like", value, "pfoNumber");
            return (Criteria) this;
        }

        public Criteria andPfoNumberIn(List<String> values) {
            addCriterion("pfo_number in", values, "pfoNumber");
            return (Criteria) this;
        }

        public Criteria andPfoNumberNotIn(List<String> values) {
            addCriterion("pfo_number not in", values, "pfoNumber");
            return (Criteria) this;
        }

        public Criteria andPfoNumberBetween(String value1, String value2) {
            addCriterion("pfo_number between", value1, value2, "pfoNumber");
            return (Criteria) this;
        }

        public Criteria andPfoNumberNotBetween(String value1, String value2) {
            addCriterion("pfo_number not between", value1, value2, "pfoNumber");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusIsNull() {
            addCriterion("payment_status is null");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusIsNotNull() {
            addCriterion("payment_status is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusEqualTo(Integer value) {
            addCriterion("payment_status =", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusNotEqualTo(Integer value) {
            addCriterion("payment_status <>", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusGreaterThan(Integer value) {
            addCriterion("payment_status >", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("payment_status >=", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusLessThan(Integer value) {
            addCriterion("payment_status <", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusLessThanOrEqualTo(Integer value) {
            addCriterion("payment_status <=", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusIn(List<Integer> values) {
            addCriterion("payment_status in", values, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusNotIn(List<Integer> values) {
            addCriterion("payment_status not in", values, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusBetween(Integer value1, Integer value2) {
            addCriterion("payment_status between", value1, value2, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("payment_status not between", value1, value2, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andRefundableStatusIsNull() {
            addCriterion("refundable_status is null");
            return (Criteria) this;
        }

        public Criteria andRefundableStatusIsNotNull() {
            addCriterion("refundable_status is not null");
            return (Criteria) this;
        }

        public Criteria andRefundableStatusEqualTo(Integer value) {
            addCriterion("refundable_status =", value, "refundableStatus");
            return (Criteria) this;
        }

        public Criteria andRefundableStatusNotEqualTo(Integer value) {
            addCriterion("refundable_status <>", value, "refundableStatus");
            return (Criteria) this;
        }

        public Criteria andRefundableStatusGreaterThan(Integer value) {
            addCriterion("refundable_status >", value, "refundableStatus");
            return (Criteria) this;
        }

        public Criteria andRefundableStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("refundable_status >=", value, "refundableStatus");
            return (Criteria) this;
        }

        public Criteria andRefundableStatusLessThan(Integer value) {
            addCriterion("refundable_status <", value, "refundableStatus");
            return (Criteria) this;
        }

        public Criteria andRefundableStatusLessThanOrEqualTo(Integer value) {
            addCriterion("refundable_status <=", value, "refundableStatus");
            return (Criteria) this;
        }

        public Criteria andRefundableStatusIn(List<Integer> values) {
            addCriterion("refundable_status in", values, "refundableStatus");
            return (Criteria) this;
        }

        public Criteria andRefundableStatusNotIn(List<Integer> values) {
            addCriterion("refundable_status not in", values, "refundableStatus");
            return (Criteria) this;
        }

        public Criteria andRefundableStatusBetween(Integer value1, Integer value2) {
            addCriterion("refundable_status between", value1, value2, "refundableStatus");
            return (Criteria) this;
        }

        public Criteria andRefundableStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("refundable_status not between", value1, value2, "refundableStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIsNull() {
            addCriterion("payment_time is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIsNotNull() {
            addCriterion("payment_time is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeEqualTo(Date value) {
            addCriterion("payment_time =", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotEqualTo(Date value) {
            addCriterion("payment_time <>", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThan(Date value) {
            addCriterion("payment_time >", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("payment_time >=", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThan(Date value) {
            addCriterion("payment_time <", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThanOrEqualTo(Date value) {
            addCriterion("payment_time <=", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIn(List<Date> values) {
            addCriterion("payment_time in", values, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotIn(List<Date> values) {
            addCriterion("payment_time not in", values, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeBetween(Date value1, Date value2) {
            addCriterion("payment_time between", value1, value2, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotBetween(Date value1, Date value2) {
            addCriterion("payment_time not between", value1, value2, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andRefundableTimeIsNull() {
            addCriterion("refundable_time is null");
            return (Criteria) this;
        }

        public Criteria andRefundableTimeIsNotNull() {
            addCriterion("refundable_time is not null");
            return (Criteria) this;
        }

        public Criteria andRefundableTimeEqualTo(Date value) {
            addCriterion("refundable_time =", value, "refundableTime");
            return (Criteria) this;
        }

        public Criteria andRefundableTimeNotEqualTo(Date value) {
            addCriterion("refundable_time <>", value, "refundableTime");
            return (Criteria) this;
        }

        public Criteria andRefundableTimeGreaterThan(Date value) {
            addCriterion("refundable_time >", value, "refundableTime");
            return (Criteria) this;
        }

        public Criteria andRefundableTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("refundable_time >=", value, "refundableTime");
            return (Criteria) this;
        }

        public Criteria andRefundableTimeLessThan(Date value) {
            addCriterion("refundable_time <", value, "refundableTime");
            return (Criteria) this;
        }

        public Criteria andRefundableTimeLessThanOrEqualTo(Date value) {
            addCriterion("refundable_time <=", value, "refundableTime");
            return (Criteria) this;
        }

        public Criteria andRefundableTimeIn(List<Date> values) {
            addCriterion("refundable_time in", values, "refundableTime");
            return (Criteria) this;
        }

        public Criteria andRefundableTimeNotIn(List<Date> values) {
            addCriterion("refundable_time not in", values, "refundableTime");
            return (Criteria) this;
        }

        public Criteria andRefundableTimeBetween(Date value1, Date value2) {
            addCriterion("refundable_time between", value1, value2, "refundableTime");
            return (Criteria) this;
        }

        public Criteria andRefundableTimeNotBetween(Date value1, Date value2) {
            addCriterion("refundable_time not between", value1, value2, "refundableTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModifiedUserIsNull() {
            addCriterion("modified_user is null");
            return (Criteria) this;
        }

        public Criteria andModifiedUserIsNotNull() {
            addCriterion("modified_user is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedUserEqualTo(String value) {
            addCriterion("modified_user =", value, "modifiedUser");
            return (Criteria) this;
        }

        public Criteria andModifiedUserNotEqualTo(String value) {
            addCriterion("modified_user <>", value, "modifiedUser");
            return (Criteria) this;
        }

        public Criteria andModifiedUserGreaterThan(String value) {
            addCriterion("modified_user >", value, "modifiedUser");
            return (Criteria) this;
        }

        public Criteria andModifiedUserGreaterThanOrEqualTo(String value) {
            addCriterion("modified_user >=", value, "modifiedUser");
            return (Criteria) this;
        }

        public Criteria andModifiedUserLessThan(String value) {
            addCriterion("modified_user <", value, "modifiedUser");
            return (Criteria) this;
        }

        public Criteria andModifiedUserLessThanOrEqualTo(String value) {
            addCriterion("modified_user <=", value, "modifiedUser");
            return (Criteria) this;
        }

        public Criteria andModifiedUserLike(String value) {
            addCriterion("modified_user like", value, "modifiedUser");
            return (Criteria) this;
        }

        public Criteria andModifiedUserNotLike(String value) {
            addCriterion("modified_user not like", value, "modifiedUser");
            return (Criteria) this;
        }

        public Criteria andModifiedUserIn(List<String> values) {
            addCriterion("modified_user in", values, "modifiedUser");
            return (Criteria) this;
        }

        public Criteria andModifiedUserNotIn(List<String> values) {
            addCriterion("modified_user not in", values, "modifiedUser");
            return (Criteria) this;
        }

        public Criteria andModifiedUserBetween(String value1, String value2) {
            addCriterion("modified_user between", value1, value2, "modifiedUser");
            return (Criteria) this;
        }

        public Criteria andModifiedUserNotBetween(String value1, String value2) {
            addCriterion("modified_user not between", value1, value2, "modifiedUser");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIsNull() {
            addCriterion("modified_time is null");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIsNotNull() {
            addCriterion("modified_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeEqualTo(Date value) {
            addCriterion("modified_time =", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotEqualTo(Date value) {
            addCriterion("modified_time <>", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeGreaterThan(Date value) {
            addCriterion("modified_time >", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modified_time >=", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeLessThan(Date value) {
            addCriterion("modified_time <", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeLessThanOrEqualTo(Date value) {
            addCriterion("modified_time <=", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIn(List<Date> values) {
            addCriterion("modified_time in", values, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotIn(List<Date> values) {
            addCriterion("modified_time not in", values, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeBetween(Date value1, Date value2) {
            addCriterion("modified_time between", value1, value2, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotBetween(Date value1, Date value2) {
            addCriterion("modified_time not between", value1, value2, "modifiedTime");
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