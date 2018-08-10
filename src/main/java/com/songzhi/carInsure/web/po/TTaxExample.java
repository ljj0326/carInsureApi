package com.songzhi.carInsure.web.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TTaxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TTaxExample() {
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

        public Criteria andTaxVsTaxMrkCodeIsNull() {
            addCriterion("tax_vs_tax_mrk_code is null");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxMrkCodeIsNotNull() {
            addCriterion("tax_vs_tax_mrk_code is not null");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxMrkCodeEqualTo(String value) {
            addCriterion("tax_vs_tax_mrk_code =", value, "taxVsTaxMrkCode");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxMrkCodeNotEqualTo(String value) {
            addCriterion("tax_vs_tax_mrk_code <>", value, "taxVsTaxMrkCode");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxMrkCodeGreaterThan(String value) {
            addCriterion("tax_vs_tax_mrk_code >", value, "taxVsTaxMrkCode");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxMrkCodeGreaterThanOrEqualTo(String value) {
            addCriterion("tax_vs_tax_mrk_code >=", value, "taxVsTaxMrkCode");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxMrkCodeLessThan(String value) {
            addCriterion("tax_vs_tax_mrk_code <", value, "taxVsTaxMrkCode");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxMrkCodeLessThanOrEqualTo(String value) {
            addCriterion("tax_vs_tax_mrk_code <=", value, "taxVsTaxMrkCode");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxMrkCodeLike(String value) {
            addCriterion("tax_vs_tax_mrk_code like", value, "taxVsTaxMrkCode");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxMrkCodeNotLike(String value) {
            addCriterion("tax_vs_tax_mrk_code not like", value, "taxVsTaxMrkCode");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxMrkCodeIn(List<String> values) {
            addCriterion("tax_vs_tax_mrk_code in", values, "taxVsTaxMrkCode");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxMrkCodeNotIn(List<String> values) {
            addCriterion("tax_vs_tax_mrk_code not in", values, "taxVsTaxMrkCode");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxMrkCodeBetween(String value1, String value2) {
            addCriterion("tax_vs_tax_mrk_code between", value1, value2, "taxVsTaxMrkCode");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxMrkCodeNotBetween(String value1, String value2) {
            addCriterion("tax_vs_tax_mrk_code not between", value1, value2, "taxVsTaxMrkCode");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxMrkIsNull() {
            addCriterion("tax_vs_tax_mrk is null");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxMrkIsNotNull() {
            addCriterion("tax_vs_tax_mrk is not null");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxMrkEqualTo(String value) {
            addCriterion("tax_vs_tax_mrk =", value, "taxVsTaxMrk");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxMrkNotEqualTo(String value) {
            addCriterion("tax_vs_tax_mrk <>", value, "taxVsTaxMrk");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxMrkGreaterThan(String value) {
            addCriterion("tax_vs_tax_mrk >", value, "taxVsTaxMrk");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxMrkGreaterThanOrEqualTo(String value) {
            addCriterion("tax_vs_tax_mrk >=", value, "taxVsTaxMrk");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxMrkLessThan(String value) {
            addCriterion("tax_vs_tax_mrk <", value, "taxVsTaxMrk");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxMrkLessThanOrEqualTo(String value) {
            addCriterion("tax_vs_tax_mrk <=", value, "taxVsTaxMrk");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxMrkLike(String value) {
            addCriterion("tax_vs_tax_mrk like", value, "taxVsTaxMrk");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxMrkNotLike(String value) {
            addCriterion("tax_vs_tax_mrk not like", value, "taxVsTaxMrk");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxMrkIn(List<String> values) {
            addCriterion("tax_vs_tax_mrk in", values, "taxVsTaxMrk");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxMrkNotIn(List<String> values) {
            addCriterion("tax_vs_tax_mrk not in", values, "taxVsTaxMrk");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxMrkBetween(String value1, String value2) {
            addCriterion("tax_vs_tax_mrk between", value1, value2, "taxVsTaxMrk");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxMrkNotBetween(String value1, String value2) {
            addCriterion("tax_vs_tax_mrk not between", value1, value2, "taxVsTaxMrk");
            return (Criteria) this;
        }

        public Criteria andTaxPaytaxTypCodeIsNull() {
            addCriterion("tax_paytax_typ_code is null");
            return (Criteria) this;
        }

        public Criteria andTaxPaytaxTypCodeIsNotNull() {
            addCriterion("tax_paytax_typ_code is not null");
            return (Criteria) this;
        }

        public Criteria andTaxPaytaxTypCodeEqualTo(String value) {
            addCriterion("tax_paytax_typ_code =", value, "taxPaytaxTypCode");
            return (Criteria) this;
        }

        public Criteria andTaxPaytaxTypCodeNotEqualTo(String value) {
            addCriterion("tax_paytax_typ_code <>", value, "taxPaytaxTypCode");
            return (Criteria) this;
        }

        public Criteria andTaxPaytaxTypCodeGreaterThan(String value) {
            addCriterion("tax_paytax_typ_code >", value, "taxPaytaxTypCode");
            return (Criteria) this;
        }

        public Criteria andTaxPaytaxTypCodeGreaterThanOrEqualTo(String value) {
            addCriterion("tax_paytax_typ_code >=", value, "taxPaytaxTypCode");
            return (Criteria) this;
        }

        public Criteria andTaxPaytaxTypCodeLessThan(String value) {
            addCriterion("tax_paytax_typ_code <", value, "taxPaytaxTypCode");
            return (Criteria) this;
        }

        public Criteria andTaxPaytaxTypCodeLessThanOrEqualTo(String value) {
            addCriterion("tax_paytax_typ_code <=", value, "taxPaytaxTypCode");
            return (Criteria) this;
        }

        public Criteria andTaxPaytaxTypCodeLike(String value) {
            addCriterion("tax_paytax_typ_code like", value, "taxPaytaxTypCode");
            return (Criteria) this;
        }

        public Criteria andTaxPaytaxTypCodeNotLike(String value) {
            addCriterion("tax_paytax_typ_code not like", value, "taxPaytaxTypCode");
            return (Criteria) this;
        }

        public Criteria andTaxPaytaxTypCodeIn(List<String> values) {
            addCriterion("tax_paytax_typ_code in", values, "taxPaytaxTypCode");
            return (Criteria) this;
        }

        public Criteria andTaxPaytaxTypCodeNotIn(List<String> values) {
            addCriterion("tax_paytax_typ_code not in", values, "taxPaytaxTypCode");
            return (Criteria) this;
        }

        public Criteria andTaxPaytaxTypCodeBetween(String value1, String value2) {
            addCriterion("tax_paytax_typ_code between", value1, value2, "taxPaytaxTypCode");
            return (Criteria) this;
        }

        public Criteria andTaxPaytaxTypCodeNotBetween(String value1, String value2) {
            addCriterion("tax_paytax_typ_code not between", value1, value2, "taxPaytaxTypCode");
            return (Criteria) this;
        }

        public Criteria andTaxPaytaxTypIsNull() {
            addCriterion("tax_paytax_typ is null");
            return (Criteria) this;
        }

        public Criteria andTaxPaytaxTypIsNotNull() {
            addCriterion("tax_paytax_typ is not null");
            return (Criteria) this;
        }

        public Criteria andTaxPaytaxTypEqualTo(String value) {
            addCriterion("tax_paytax_typ =", value, "taxPaytaxTyp");
            return (Criteria) this;
        }

        public Criteria andTaxPaytaxTypNotEqualTo(String value) {
            addCriterion("tax_paytax_typ <>", value, "taxPaytaxTyp");
            return (Criteria) this;
        }

        public Criteria andTaxPaytaxTypGreaterThan(String value) {
            addCriterion("tax_paytax_typ >", value, "taxPaytaxTyp");
            return (Criteria) this;
        }

        public Criteria andTaxPaytaxTypGreaterThanOrEqualTo(String value) {
            addCriterion("tax_paytax_typ >=", value, "taxPaytaxTyp");
            return (Criteria) this;
        }

        public Criteria andTaxPaytaxTypLessThan(String value) {
            addCriterion("tax_paytax_typ <", value, "taxPaytaxTyp");
            return (Criteria) this;
        }

        public Criteria andTaxPaytaxTypLessThanOrEqualTo(String value) {
            addCriterion("tax_paytax_typ <=", value, "taxPaytaxTyp");
            return (Criteria) this;
        }

        public Criteria andTaxPaytaxTypLike(String value) {
            addCriterion("tax_paytax_typ like", value, "taxPaytaxTyp");
            return (Criteria) this;
        }

        public Criteria andTaxPaytaxTypNotLike(String value) {
            addCriterion("tax_paytax_typ not like", value, "taxPaytaxTyp");
            return (Criteria) this;
        }

        public Criteria andTaxPaytaxTypIn(List<String> values) {
            addCriterion("tax_paytax_typ in", values, "taxPaytaxTyp");
            return (Criteria) this;
        }

        public Criteria andTaxPaytaxTypNotIn(List<String> values) {
            addCriterion("tax_paytax_typ not in", values, "taxPaytaxTyp");
            return (Criteria) this;
        }

        public Criteria andTaxPaytaxTypBetween(String value1, String value2) {
            addCriterion("tax_paytax_typ between", value1, value2, "taxPaytaxTyp");
            return (Criteria) this;
        }

        public Criteria andTaxPaytaxTypNotBetween(String value1, String value2) {
            addCriterion("tax_paytax_typ not between", value1, value2, "taxPaytaxTyp");
            return (Criteria) this;
        }

        public Criteria andIsCutTaxIsNull() {
            addCriterion("is_cut_tax is null");
            return (Criteria) this;
        }

        public Criteria andIsCutTaxIsNotNull() {
            addCriterion("is_cut_tax is not null");
            return (Criteria) this;
        }

        public Criteria andIsCutTaxEqualTo(Integer value) {
            addCriterion("is_cut_tax =", value, "isCutTax");
            return (Criteria) this;
        }

        public Criteria andIsCutTaxNotEqualTo(Integer value) {
            addCriterion("is_cut_tax <>", value, "isCutTax");
            return (Criteria) this;
        }

        public Criteria andIsCutTaxGreaterThan(Integer value) {
            addCriterion("is_cut_tax >", value, "isCutTax");
            return (Criteria) this;
        }

        public Criteria andIsCutTaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_cut_tax >=", value, "isCutTax");
            return (Criteria) this;
        }

        public Criteria andIsCutTaxLessThan(Integer value) {
            addCriterion("is_cut_tax <", value, "isCutTax");
            return (Criteria) this;
        }

        public Criteria andIsCutTaxLessThanOrEqualTo(Integer value) {
            addCriterion("is_cut_tax <=", value, "isCutTax");
            return (Criteria) this;
        }

        public Criteria andIsCutTaxIn(List<Integer> values) {
            addCriterion("is_cut_tax in", values, "isCutTax");
            return (Criteria) this;
        }

        public Criteria andIsCutTaxNotIn(List<Integer> values) {
            addCriterion("is_cut_tax not in", values, "isCutTax");
            return (Criteria) this;
        }

        public Criteria andIsCutTaxBetween(Integer value1, Integer value2) {
            addCriterion("is_cut_tax between", value1, value2, "isCutTax");
            return (Criteria) this;
        }

        public Criteria andIsCutTaxNotBetween(Integer value1, Integer value2) {
            addCriterion("is_cut_tax not between", value1, value2, "isCutTax");
            return (Criteria) this;
        }

        public Criteria andTaxNTaxableMonthsIsNull() {
            addCriterion("tax_n_taxable_months is null");
            return (Criteria) this;
        }

        public Criteria andTaxNTaxableMonthsIsNotNull() {
            addCriterion("tax_n_taxable_months is not null");
            return (Criteria) this;
        }

        public Criteria andTaxNTaxableMonthsEqualTo(String value) {
            addCriterion("tax_n_taxable_months =", value, "taxNTaxableMonths");
            return (Criteria) this;
        }

        public Criteria andTaxNTaxableMonthsNotEqualTo(String value) {
            addCriterion("tax_n_taxable_months <>", value, "taxNTaxableMonths");
            return (Criteria) this;
        }

        public Criteria andTaxNTaxableMonthsGreaterThan(String value) {
            addCriterion("tax_n_taxable_months >", value, "taxNTaxableMonths");
            return (Criteria) this;
        }

        public Criteria andTaxNTaxableMonthsGreaterThanOrEqualTo(String value) {
            addCriterion("tax_n_taxable_months >=", value, "taxNTaxableMonths");
            return (Criteria) this;
        }

        public Criteria andTaxNTaxableMonthsLessThan(String value) {
            addCriterion("tax_n_taxable_months <", value, "taxNTaxableMonths");
            return (Criteria) this;
        }

        public Criteria andTaxNTaxableMonthsLessThanOrEqualTo(String value) {
            addCriterion("tax_n_taxable_months <=", value, "taxNTaxableMonths");
            return (Criteria) this;
        }

        public Criteria andTaxNTaxableMonthsLike(String value) {
            addCriterion("tax_n_taxable_months like", value, "taxNTaxableMonths");
            return (Criteria) this;
        }

        public Criteria andTaxNTaxableMonthsNotLike(String value) {
            addCriterion("tax_n_taxable_months not like", value, "taxNTaxableMonths");
            return (Criteria) this;
        }

        public Criteria andTaxNTaxableMonthsIn(List<String> values) {
            addCriterion("tax_n_taxable_months in", values, "taxNTaxableMonths");
            return (Criteria) this;
        }

        public Criteria andTaxNTaxableMonthsNotIn(List<String> values) {
            addCriterion("tax_n_taxable_months not in", values, "taxNTaxableMonths");
            return (Criteria) this;
        }

        public Criteria andTaxNTaxableMonthsBetween(String value1, String value2) {
            addCriterion("tax_n_taxable_months between", value1, value2, "taxNTaxableMonths");
            return (Criteria) this;
        }

        public Criteria andTaxNTaxableMonthsNotBetween(String value1, String value2) {
            addCriterion("tax_n_taxable_months not between", value1, value2, "taxNTaxableMonths");
            return (Criteria) this;
        }

        public Criteria andTaxCTaxable1AmtIsNull() {
            addCriterion("tax_c_taxable1_amt is null");
            return (Criteria) this;
        }

        public Criteria andTaxCTaxable1AmtIsNotNull() {
            addCriterion("tax_c_taxable1_amt is not null");
            return (Criteria) this;
        }

        public Criteria andTaxCTaxable1AmtEqualTo(String value) {
            addCriterion("tax_c_taxable1_amt =", value, "taxCTaxable1Amt");
            return (Criteria) this;
        }

        public Criteria andTaxCTaxable1AmtNotEqualTo(String value) {
            addCriterion("tax_c_taxable1_amt <>", value, "taxCTaxable1Amt");
            return (Criteria) this;
        }

        public Criteria andTaxCTaxable1AmtGreaterThan(String value) {
            addCriterion("tax_c_taxable1_amt >", value, "taxCTaxable1Amt");
            return (Criteria) this;
        }

        public Criteria andTaxCTaxable1AmtGreaterThanOrEqualTo(String value) {
            addCriterion("tax_c_taxable1_amt >=", value, "taxCTaxable1Amt");
            return (Criteria) this;
        }

        public Criteria andTaxCTaxable1AmtLessThan(String value) {
            addCriterion("tax_c_taxable1_amt <", value, "taxCTaxable1Amt");
            return (Criteria) this;
        }

        public Criteria andTaxCTaxable1AmtLessThanOrEqualTo(String value) {
            addCriterion("tax_c_taxable1_amt <=", value, "taxCTaxable1Amt");
            return (Criteria) this;
        }

        public Criteria andTaxCTaxable1AmtLike(String value) {
            addCriterion("tax_c_taxable1_amt like", value, "taxCTaxable1Amt");
            return (Criteria) this;
        }

        public Criteria andTaxCTaxable1AmtNotLike(String value) {
            addCriterion("tax_c_taxable1_amt not like", value, "taxCTaxable1Amt");
            return (Criteria) this;
        }

        public Criteria andTaxCTaxable1AmtIn(List<String> values) {
            addCriterion("tax_c_taxable1_amt in", values, "taxCTaxable1Amt");
            return (Criteria) this;
        }

        public Criteria andTaxCTaxable1AmtNotIn(List<String> values) {
            addCriterion("tax_c_taxable1_amt not in", values, "taxCTaxable1Amt");
            return (Criteria) this;
        }

        public Criteria andTaxCTaxable1AmtBetween(String value1, String value2) {
            addCriterion("tax_c_taxable1_amt between", value1, value2, "taxCTaxable1Amt");
            return (Criteria) this;
        }

        public Criteria andTaxCTaxable1AmtNotBetween(String value1, String value2) {
            addCriterion("tax_c_taxable1_amt not between", value1, value2, "taxCTaxable1Amt");
            return (Criteria) this;
        }

        public Criteria andTaxPreviousTaxYearIsNull() {
            addCriterion("tax_previous_tax_year is null");
            return (Criteria) this;
        }

        public Criteria andTaxPreviousTaxYearIsNotNull() {
            addCriterion("tax_previous_tax_year is not null");
            return (Criteria) this;
        }

        public Criteria andTaxPreviousTaxYearEqualTo(String value) {
            addCriterion("tax_previous_tax_year =", value, "taxPreviousTaxYear");
            return (Criteria) this;
        }

        public Criteria andTaxPreviousTaxYearNotEqualTo(String value) {
            addCriterion("tax_previous_tax_year <>", value, "taxPreviousTaxYear");
            return (Criteria) this;
        }

        public Criteria andTaxPreviousTaxYearGreaterThan(String value) {
            addCriterion("tax_previous_tax_year >", value, "taxPreviousTaxYear");
            return (Criteria) this;
        }

        public Criteria andTaxPreviousTaxYearGreaterThanOrEqualTo(String value) {
            addCriterion("tax_previous_tax_year >=", value, "taxPreviousTaxYear");
            return (Criteria) this;
        }

        public Criteria andTaxPreviousTaxYearLessThan(String value) {
            addCriterion("tax_previous_tax_year <", value, "taxPreviousTaxYear");
            return (Criteria) this;
        }

        public Criteria andTaxPreviousTaxYearLessThanOrEqualTo(String value) {
            addCriterion("tax_previous_tax_year <=", value, "taxPreviousTaxYear");
            return (Criteria) this;
        }

        public Criteria andTaxPreviousTaxYearLike(String value) {
            addCriterion("tax_previous_tax_year like", value, "taxPreviousTaxYear");
            return (Criteria) this;
        }

        public Criteria andTaxPreviousTaxYearNotLike(String value) {
            addCriterion("tax_previous_tax_year not like", value, "taxPreviousTaxYear");
            return (Criteria) this;
        }

        public Criteria andTaxPreviousTaxYearIn(List<String> values) {
            addCriterion("tax_previous_tax_year in", values, "taxPreviousTaxYear");
            return (Criteria) this;
        }

        public Criteria andTaxPreviousTaxYearNotIn(List<String> values) {
            addCriterion("tax_previous_tax_year not in", values, "taxPreviousTaxYear");
            return (Criteria) this;
        }

        public Criteria andTaxPreviousTaxYearBetween(String value1, String value2) {
            addCriterion("tax_previous_tax_year between", value1, value2, "taxPreviousTaxYear");
            return (Criteria) this;
        }

        public Criteria andTaxPreviousTaxYearNotBetween(String value1, String value2) {
            addCriterion("tax_previous_tax_year not between", value1, value2, "taxPreviousTaxYear");
            return (Criteria) this;
        }

        public Criteria andTaxNExhaustCapacityIsNull() {
            addCriterion("tax_n_exhaust_capacity is null");
            return (Criteria) this;
        }

        public Criteria andTaxNExhaustCapacityIsNotNull() {
            addCriterion("tax_n_exhaust_capacity is not null");
            return (Criteria) this;
        }

        public Criteria andTaxNExhaustCapacityEqualTo(String value) {
            addCriterion("tax_n_exhaust_capacity =", value, "taxNExhaustCapacity");
            return (Criteria) this;
        }

        public Criteria andTaxNExhaustCapacityNotEqualTo(String value) {
            addCriterion("tax_n_exhaust_capacity <>", value, "taxNExhaustCapacity");
            return (Criteria) this;
        }

        public Criteria andTaxNExhaustCapacityGreaterThan(String value) {
            addCriterion("tax_n_exhaust_capacity >", value, "taxNExhaustCapacity");
            return (Criteria) this;
        }

        public Criteria andTaxNExhaustCapacityGreaterThanOrEqualTo(String value) {
            addCriterion("tax_n_exhaust_capacity >=", value, "taxNExhaustCapacity");
            return (Criteria) this;
        }

        public Criteria andTaxNExhaustCapacityLessThan(String value) {
            addCriterion("tax_n_exhaust_capacity <", value, "taxNExhaustCapacity");
            return (Criteria) this;
        }

        public Criteria andTaxNExhaustCapacityLessThanOrEqualTo(String value) {
            addCriterion("tax_n_exhaust_capacity <=", value, "taxNExhaustCapacity");
            return (Criteria) this;
        }

        public Criteria andTaxNExhaustCapacityLike(String value) {
            addCriterion("tax_n_exhaust_capacity like", value, "taxNExhaustCapacity");
            return (Criteria) this;
        }

        public Criteria andTaxNExhaustCapacityNotLike(String value) {
            addCriterion("tax_n_exhaust_capacity not like", value, "taxNExhaustCapacity");
            return (Criteria) this;
        }

        public Criteria andTaxNExhaustCapacityIn(List<String> values) {
            addCriterion("tax_n_exhaust_capacity in", values, "taxNExhaustCapacity");
            return (Criteria) this;
        }

        public Criteria andTaxNExhaustCapacityNotIn(List<String> values) {
            addCriterion("tax_n_exhaust_capacity not in", values, "taxNExhaustCapacity");
            return (Criteria) this;
        }

        public Criteria andTaxNExhaustCapacityBetween(String value1, String value2) {
            addCriterion("tax_n_exhaust_capacity between", value1, value2, "taxNExhaustCapacity");
            return (Criteria) this;
        }

        public Criteria andTaxNExhaustCapacityNotBetween(String value1, String value2) {
            addCriterion("tax_n_exhaust_capacity not between", value1, value2, "taxNExhaustCapacity");
            return (Criteria) this;
        }

        public Criteria andTaxCCurbWtIsNull() {
            addCriterion("tax_c_curb_wt is null");
            return (Criteria) this;
        }

        public Criteria andTaxCCurbWtIsNotNull() {
            addCriterion("tax_c_curb_wt is not null");
            return (Criteria) this;
        }

        public Criteria andTaxCCurbWtEqualTo(String value) {
            addCriterion("tax_c_curb_wt =", value, "taxCCurbWt");
            return (Criteria) this;
        }

        public Criteria andTaxCCurbWtNotEqualTo(String value) {
            addCriterion("tax_c_curb_wt <>", value, "taxCCurbWt");
            return (Criteria) this;
        }

        public Criteria andTaxCCurbWtGreaterThan(String value) {
            addCriterion("tax_c_curb_wt >", value, "taxCCurbWt");
            return (Criteria) this;
        }

        public Criteria andTaxCCurbWtGreaterThanOrEqualTo(String value) {
            addCriterion("tax_c_curb_wt >=", value, "taxCCurbWt");
            return (Criteria) this;
        }

        public Criteria andTaxCCurbWtLessThan(String value) {
            addCriterion("tax_c_curb_wt <", value, "taxCCurbWt");
            return (Criteria) this;
        }

        public Criteria andTaxCCurbWtLessThanOrEqualTo(String value) {
            addCriterion("tax_c_curb_wt <=", value, "taxCCurbWt");
            return (Criteria) this;
        }

        public Criteria andTaxCCurbWtLike(String value) {
            addCriterion("tax_c_curb_wt like", value, "taxCCurbWt");
            return (Criteria) this;
        }

        public Criteria andTaxCCurbWtNotLike(String value) {
            addCriterion("tax_c_curb_wt not like", value, "taxCCurbWt");
            return (Criteria) this;
        }

        public Criteria andTaxCCurbWtIn(List<String> values) {
            addCriterion("tax_c_curb_wt in", values, "taxCCurbWt");
            return (Criteria) this;
        }

        public Criteria andTaxCCurbWtNotIn(List<String> values) {
            addCriterion("tax_c_curb_wt not in", values, "taxCCurbWt");
            return (Criteria) this;
        }

        public Criteria andTaxCCurbWtBetween(String value1, String value2) {
            addCriterion("tax_c_curb_wt between", value1, value2, "taxCCurbWt");
            return (Criteria) this;
        }

        public Criteria andTaxCCurbWtNotBetween(String value1, String value2) {
            addCriterion("tax_c_curb_wt not between", value1, value2, "taxCCurbWt");
            return (Criteria) this;
        }

        public Criteria andTaxCutReasonCodeIsNull() {
            addCriterion("tax_cut_reason_code is null");
            return (Criteria) this;
        }

        public Criteria andTaxCutReasonCodeIsNotNull() {
            addCriterion("tax_cut_reason_code is not null");
            return (Criteria) this;
        }

        public Criteria andTaxCutReasonCodeEqualTo(String value) {
            addCriterion("tax_cut_reason_code =", value, "taxCutReasonCode");
            return (Criteria) this;
        }

        public Criteria andTaxCutReasonCodeNotEqualTo(String value) {
            addCriterion("tax_cut_reason_code <>", value, "taxCutReasonCode");
            return (Criteria) this;
        }

        public Criteria andTaxCutReasonCodeGreaterThan(String value) {
            addCriterion("tax_cut_reason_code >", value, "taxCutReasonCode");
            return (Criteria) this;
        }

        public Criteria andTaxCutReasonCodeGreaterThanOrEqualTo(String value) {
            addCriterion("tax_cut_reason_code >=", value, "taxCutReasonCode");
            return (Criteria) this;
        }

        public Criteria andTaxCutReasonCodeLessThan(String value) {
            addCriterion("tax_cut_reason_code <", value, "taxCutReasonCode");
            return (Criteria) this;
        }

        public Criteria andTaxCutReasonCodeLessThanOrEqualTo(String value) {
            addCriterion("tax_cut_reason_code <=", value, "taxCutReasonCode");
            return (Criteria) this;
        }

        public Criteria andTaxCutReasonCodeLike(String value) {
            addCriterion("tax_cut_reason_code like", value, "taxCutReasonCode");
            return (Criteria) this;
        }

        public Criteria andTaxCutReasonCodeNotLike(String value) {
            addCriterion("tax_cut_reason_code not like", value, "taxCutReasonCode");
            return (Criteria) this;
        }

        public Criteria andTaxCutReasonCodeIn(List<String> values) {
            addCriterion("tax_cut_reason_code in", values, "taxCutReasonCode");
            return (Criteria) this;
        }

        public Criteria andTaxCutReasonCodeNotIn(List<String> values) {
            addCriterion("tax_cut_reason_code not in", values, "taxCutReasonCode");
            return (Criteria) this;
        }

        public Criteria andTaxCutReasonCodeBetween(String value1, String value2) {
            addCriterion("tax_cut_reason_code between", value1, value2, "taxCutReasonCode");
            return (Criteria) this;
        }

        public Criteria andTaxCutReasonCodeNotBetween(String value1, String value2) {
            addCriterion("tax_cut_reason_code not between", value1, value2, "taxCutReasonCode");
            return (Criteria) this;
        }

        public Criteria andTaxCutReasonIsNull() {
            addCriterion("tax_cut_reason is null");
            return (Criteria) this;
        }

        public Criteria andTaxCutReasonIsNotNull() {
            addCriterion("tax_cut_reason is not null");
            return (Criteria) this;
        }

        public Criteria andTaxCutReasonEqualTo(String value) {
            addCriterion("tax_cut_reason =", value, "taxCutReason");
            return (Criteria) this;
        }

        public Criteria andTaxCutReasonNotEqualTo(String value) {
            addCriterion("tax_cut_reason <>", value, "taxCutReason");
            return (Criteria) this;
        }

        public Criteria andTaxCutReasonGreaterThan(String value) {
            addCriterion("tax_cut_reason >", value, "taxCutReason");
            return (Criteria) this;
        }

        public Criteria andTaxCutReasonGreaterThanOrEqualTo(String value) {
            addCriterion("tax_cut_reason >=", value, "taxCutReason");
            return (Criteria) this;
        }

        public Criteria andTaxCutReasonLessThan(String value) {
            addCriterion("tax_cut_reason <", value, "taxCutReason");
            return (Criteria) this;
        }

        public Criteria andTaxCutReasonLessThanOrEqualTo(String value) {
            addCriterion("tax_cut_reason <=", value, "taxCutReason");
            return (Criteria) this;
        }

        public Criteria andTaxCutReasonLike(String value) {
            addCriterion("tax_cut_reason like", value, "taxCutReason");
            return (Criteria) this;
        }

        public Criteria andTaxCutReasonNotLike(String value) {
            addCriterion("tax_cut_reason not like", value, "taxCutReason");
            return (Criteria) this;
        }

        public Criteria andTaxCutReasonIn(List<String> values) {
            addCriterion("tax_cut_reason in", values, "taxCutReason");
            return (Criteria) this;
        }

        public Criteria andTaxCutReasonNotIn(List<String> values) {
            addCriterion("tax_cut_reason not in", values, "taxCutReason");
            return (Criteria) this;
        }

        public Criteria andTaxCutReasonBetween(String value1, String value2) {
            addCriterion("tax_cut_reason between", value1, value2, "taxCutReason");
            return (Criteria) this;
        }

        public Criteria andTaxCutReasonNotBetween(String value1, String value2) {
            addCriterion("tax_cut_reason not between", value1, value2, "taxCutReason");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxToolCodeIsNull() {
            addCriterion("tax_vs_tax_tool_code is null");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxToolCodeIsNotNull() {
            addCriterion("tax_vs_tax_tool_code is not null");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxToolCodeEqualTo(String value) {
            addCriterion("tax_vs_tax_tool_code =", value, "taxVsTaxToolCode");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxToolCodeNotEqualTo(String value) {
            addCriterion("tax_vs_tax_tool_code <>", value, "taxVsTaxToolCode");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxToolCodeGreaterThan(String value) {
            addCriterion("tax_vs_tax_tool_code >", value, "taxVsTaxToolCode");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxToolCodeGreaterThanOrEqualTo(String value) {
            addCriterion("tax_vs_tax_tool_code >=", value, "taxVsTaxToolCode");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxToolCodeLessThan(String value) {
            addCriterion("tax_vs_tax_tool_code <", value, "taxVsTaxToolCode");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxToolCodeLessThanOrEqualTo(String value) {
            addCriterion("tax_vs_tax_tool_code <=", value, "taxVsTaxToolCode");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxToolCodeLike(String value) {
            addCriterion("tax_vs_tax_tool_code like", value, "taxVsTaxToolCode");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxToolCodeNotLike(String value) {
            addCriterion("tax_vs_tax_tool_code not like", value, "taxVsTaxToolCode");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxToolCodeIn(List<String> values) {
            addCriterion("tax_vs_tax_tool_code in", values, "taxVsTaxToolCode");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxToolCodeNotIn(List<String> values) {
            addCriterion("tax_vs_tax_tool_code not in", values, "taxVsTaxToolCode");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxToolCodeBetween(String value1, String value2) {
            addCriterion("tax_vs_tax_tool_code between", value1, value2, "taxVsTaxToolCode");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxToolCodeNotBetween(String value1, String value2) {
            addCriterion("tax_vs_tax_tool_code not between", value1, value2, "taxVsTaxToolCode");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxToolIsNull() {
            addCriterion("tax_vs_tax_tool is null");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxToolIsNotNull() {
            addCriterion("tax_vs_tax_tool is not null");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxToolEqualTo(String value) {
            addCriterion("tax_vs_tax_tool =", value, "taxVsTaxTool");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxToolNotEqualTo(String value) {
            addCriterion("tax_vs_tax_tool <>", value, "taxVsTaxTool");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxToolGreaterThan(String value) {
            addCriterion("tax_vs_tax_tool >", value, "taxVsTaxTool");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxToolGreaterThanOrEqualTo(String value) {
            addCriterion("tax_vs_tax_tool >=", value, "taxVsTaxTool");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxToolLessThan(String value) {
            addCriterion("tax_vs_tax_tool <", value, "taxVsTaxTool");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxToolLessThanOrEqualTo(String value) {
            addCriterion("tax_vs_tax_tool <=", value, "taxVsTaxTool");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxToolLike(String value) {
            addCriterion("tax_vs_tax_tool like", value, "taxVsTaxTool");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxToolNotLike(String value) {
            addCriterion("tax_vs_tax_tool not like", value, "taxVsTaxTool");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxToolIn(List<String> values) {
            addCriterion("tax_vs_tax_tool in", values, "taxVsTaxTool");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxToolNotIn(List<String> values) {
            addCriterion("tax_vs_tax_tool not in", values, "taxVsTaxTool");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxToolBetween(String value1, String value2) {
            addCriterion("tax_vs_tax_tool between", value1, value2, "taxVsTaxTool");
            return (Criteria) this;
        }

        public Criteria andTaxVsTaxToolNotBetween(String value1, String value2) {
            addCriterion("tax_vs_tax_tool not between", value1, value2, "taxVsTaxTool");
            return (Criteria) this;
        }

        public Criteria andAbatePropIsNull() {
            addCriterion("abate_prop is null");
            return (Criteria) this;
        }

        public Criteria andAbatePropIsNotNull() {
            addCriterion("abate_prop is not null");
            return (Criteria) this;
        }

        public Criteria andAbatePropEqualTo(String value) {
            addCriterion("abate_prop =", value, "abateProp");
            return (Criteria) this;
        }

        public Criteria andAbatePropNotEqualTo(String value) {
            addCriterion("abate_prop <>", value, "abateProp");
            return (Criteria) this;
        }

        public Criteria andAbatePropGreaterThan(String value) {
            addCriterion("abate_prop >", value, "abateProp");
            return (Criteria) this;
        }

        public Criteria andAbatePropGreaterThanOrEqualTo(String value) {
            addCriterion("abate_prop >=", value, "abateProp");
            return (Criteria) this;
        }

        public Criteria andAbatePropLessThan(String value) {
            addCriterion("abate_prop <", value, "abateProp");
            return (Criteria) this;
        }

        public Criteria andAbatePropLessThanOrEqualTo(String value) {
            addCriterion("abate_prop <=", value, "abateProp");
            return (Criteria) this;
        }

        public Criteria andAbatePropLike(String value) {
            addCriterion("abate_prop like", value, "abateProp");
            return (Criteria) this;
        }

        public Criteria andAbatePropNotLike(String value) {
            addCriterion("abate_prop not like", value, "abateProp");
            return (Criteria) this;
        }

        public Criteria andAbatePropIn(List<String> values) {
            addCriterion("abate_prop in", values, "abateProp");
            return (Criteria) this;
        }

        public Criteria andAbatePropNotIn(List<String> values) {
            addCriterion("abate_prop not in", values, "abateProp");
            return (Criteria) this;
        }

        public Criteria andAbatePropBetween(String value1, String value2) {
            addCriterion("abate_prop between", value1, value2, "abateProp");
            return (Criteria) this;
        }

        public Criteria andAbatePropNotBetween(String value1, String value2) {
            addCriterion("abate_prop not between", value1, value2, "abateProp");
            return (Criteria) this;
        }

        public Criteria andTaxTaxfreeIsNull() {
            addCriterion("tax_taxFree is null");
            return (Criteria) this;
        }

        public Criteria andTaxTaxfreeIsNotNull() {
            addCriterion("tax_taxFree is not null");
            return (Criteria) this;
        }

        public Criteria andTaxTaxfreeEqualTo(String value) {
            addCriterion("tax_taxFree =", value, "taxTaxfree");
            return (Criteria) this;
        }

        public Criteria andTaxTaxfreeNotEqualTo(String value) {
            addCriterion("tax_taxFree <>", value, "taxTaxfree");
            return (Criteria) this;
        }

        public Criteria andTaxTaxfreeGreaterThan(String value) {
            addCriterion("tax_taxFree >", value, "taxTaxfree");
            return (Criteria) this;
        }

        public Criteria andTaxTaxfreeGreaterThanOrEqualTo(String value) {
            addCriterion("tax_taxFree >=", value, "taxTaxfree");
            return (Criteria) this;
        }

        public Criteria andTaxTaxfreeLessThan(String value) {
            addCriterion("tax_taxFree <", value, "taxTaxfree");
            return (Criteria) this;
        }

        public Criteria andTaxTaxfreeLessThanOrEqualTo(String value) {
            addCriterion("tax_taxFree <=", value, "taxTaxfree");
            return (Criteria) this;
        }

        public Criteria andTaxTaxfreeLike(String value) {
            addCriterion("tax_taxFree like", value, "taxTaxfree");
            return (Criteria) this;
        }

        public Criteria andTaxTaxfreeNotLike(String value) {
            addCriterion("tax_taxFree not like", value, "taxTaxfree");
            return (Criteria) this;
        }

        public Criteria andTaxTaxfreeIn(List<String> values) {
            addCriterion("tax_taxFree in", values, "taxTaxfree");
            return (Criteria) this;
        }

        public Criteria andTaxTaxfreeNotIn(List<String> values) {
            addCriterion("tax_taxFree not in", values, "taxTaxfree");
            return (Criteria) this;
        }

        public Criteria andTaxTaxfreeBetween(String value1, String value2) {
            addCriterion("tax_taxFree between", value1, value2, "taxTaxfree");
            return (Criteria) this;
        }

        public Criteria andTaxTaxfreeNotBetween(String value1, String value2) {
            addCriterion("tax_taxFree not between", value1, value2, "taxTaxfree");
            return (Criteria) this;
        }

        public Criteria andTaxTaxcertno2IsNull() {
            addCriterion("tax_taxCertNo2 is null");
            return (Criteria) this;
        }

        public Criteria andTaxTaxcertno2IsNotNull() {
            addCriterion("tax_taxCertNo2 is not null");
            return (Criteria) this;
        }

        public Criteria andTaxTaxcertno2EqualTo(String value) {
            addCriterion("tax_taxCertNo2 =", value, "taxTaxcertno2");
            return (Criteria) this;
        }

        public Criteria andTaxTaxcertno2NotEqualTo(String value) {
            addCriterion("tax_taxCertNo2 <>", value, "taxTaxcertno2");
            return (Criteria) this;
        }

        public Criteria andTaxTaxcertno2GreaterThan(String value) {
            addCriterion("tax_taxCertNo2 >", value, "taxTaxcertno2");
            return (Criteria) this;
        }

        public Criteria andTaxTaxcertno2GreaterThanOrEqualTo(String value) {
            addCriterion("tax_taxCertNo2 >=", value, "taxTaxcertno2");
            return (Criteria) this;
        }

        public Criteria andTaxTaxcertno2LessThan(String value) {
            addCriterion("tax_taxCertNo2 <", value, "taxTaxcertno2");
            return (Criteria) this;
        }

        public Criteria andTaxTaxcertno2LessThanOrEqualTo(String value) {
            addCriterion("tax_taxCertNo2 <=", value, "taxTaxcertno2");
            return (Criteria) this;
        }

        public Criteria andTaxTaxcertno2Like(String value) {
            addCriterion("tax_taxCertNo2 like", value, "taxTaxcertno2");
            return (Criteria) this;
        }

        public Criteria andTaxTaxcertno2NotLike(String value) {
            addCriterion("tax_taxCertNo2 not like", value, "taxTaxcertno2");
            return (Criteria) this;
        }

        public Criteria andTaxTaxcertno2In(List<String> values) {
            addCriterion("tax_taxCertNo2 in", values, "taxTaxcertno2");
            return (Criteria) this;
        }

        public Criteria andTaxTaxcertno2NotIn(List<String> values) {
            addCriterion("tax_taxCertNo2 not in", values, "taxTaxcertno2");
            return (Criteria) this;
        }

        public Criteria andTaxTaxcertno2Between(String value1, String value2) {
            addCriterion("tax_taxCertNo2 between", value1, value2, "taxTaxcertno2");
            return (Criteria) this;
        }

        public Criteria andTaxTaxcertno2NotBetween(String value1, String value2) {
            addCriterion("tax_taxCertNo2 not between", value1, value2, "taxTaxcertno2");
            return (Criteria) this;
        }

        public Criteria andTaxItemCodeIsNull() {
            addCriterion("tax_item_code is null");
            return (Criteria) this;
        }

        public Criteria andTaxItemCodeIsNotNull() {
            addCriterion("tax_item_code is not null");
            return (Criteria) this;
        }

        public Criteria andTaxItemCodeEqualTo(String value) {
            addCriterion("tax_item_code =", value, "taxItemCode");
            return (Criteria) this;
        }

        public Criteria andTaxItemCodeNotEqualTo(String value) {
            addCriterion("tax_item_code <>", value, "taxItemCode");
            return (Criteria) this;
        }

        public Criteria andTaxItemCodeGreaterThan(String value) {
            addCriterion("tax_item_code >", value, "taxItemCode");
            return (Criteria) this;
        }

        public Criteria andTaxItemCodeGreaterThanOrEqualTo(String value) {
            addCriterion("tax_item_code >=", value, "taxItemCode");
            return (Criteria) this;
        }

        public Criteria andTaxItemCodeLessThan(String value) {
            addCriterion("tax_item_code <", value, "taxItemCode");
            return (Criteria) this;
        }

        public Criteria andTaxItemCodeLessThanOrEqualTo(String value) {
            addCriterion("tax_item_code <=", value, "taxItemCode");
            return (Criteria) this;
        }

        public Criteria andTaxItemCodeLike(String value) {
            addCriterion("tax_item_code like", value, "taxItemCode");
            return (Criteria) this;
        }

        public Criteria andTaxItemCodeNotLike(String value) {
            addCriterion("tax_item_code not like", value, "taxItemCode");
            return (Criteria) this;
        }

        public Criteria andTaxItemCodeIn(List<String> values) {
            addCriterion("tax_item_code in", values, "taxItemCode");
            return (Criteria) this;
        }

        public Criteria andTaxItemCodeNotIn(List<String> values) {
            addCriterion("tax_item_code not in", values, "taxItemCode");
            return (Criteria) this;
        }

        public Criteria andTaxItemCodeBetween(String value1, String value2) {
            addCriterion("tax_item_code between", value1, value2, "taxItemCode");
            return (Criteria) this;
        }

        public Criteria andTaxItemCodeNotBetween(String value1, String value2) {
            addCriterion("tax_item_code not between", value1, value2, "taxItemCode");
            return (Criteria) this;
        }

        public Criteria andTaxItemIsNull() {
            addCriterion("tax_item is null");
            return (Criteria) this;
        }

        public Criteria andTaxItemIsNotNull() {
            addCriterion("tax_item is not null");
            return (Criteria) this;
        }

        public Criteria andTaxItemEqualTo(String value) {
            addCriterion("tax_item =", value, "taxItem");
            return (Criteria) this;
        }

        public Criteria andTaxItemNotEqualTo(String value) {
            addCriterion("tax_item <>", value, "taxItem");
            return (Criteria) this;
        }

        public Criteria andTaxItemGreaterThan(String value) {
            addCriterion("tax_item >", value, "taxItem");
            return (Criteria) this;
        }

        public Criteria andTaxItemGreaterThanOrEqualTo(String value) {
            addCriterion("tax_item >=", value, "taxItem");
            return (Criteria) this;
        }

        public Criteria andTaxItemLessThan(String value) {
            addCriterion("tax_item <", value, "taxItem");
            return (Criteria) this;
        }

        public Criteria andTaxItemLessThanOrEqualTo(String value) {
            addCriterion("tax_item <=", value, "taxItem");
            return (Criteria) this;
        }

        public Criteria andTaxItemLike(String value) {
            addCriterion("tax_item like", value, "taxItem");
            return (Criteria) this;
        }

        public Criteria andTaxItemNotLike(String value) {
            addCriterion("tax_item not like", value, "taxItem");
            return (Criteria) this;
        }

        public Criteria andTaxItemIn(List<String> values) {
            addCriterion("tax_item in", values, "taxItem");
            return (Criteria) this;
        }

        public Criteria andTaxItemNotIn(List<String> values) {
            addCriterion("tax_item not in", values, "taxItem");
            return (Criteria) this;
        }

        public Criteria andTaxItemBetween(String value1, String value2) {
            addCriterion("tax_item between", value1, value2, "taxItem");
            return (Criteria) this;
        }

        public Criteria andTaxItemNotBetween(String value1, String value2) {
            addCriterion("tax_item not between", value1, value2, "taxItem");
            return (Criteria) this;
        }

        public Criteria andTaxTBillDateIsNull() {
            addCriterion("tax_t_bill_date is null");
            return (Criteria) this;
        }

        public Criteria andTaxTBillDateIsNotNull() {
            addCriterion("tax_t_bill_date is not null");
            return (Criteria) this;
        }

        public Criteria andTaxTBillDateEqualTo(Date value) {
            addCriterion("tax_t_bill_date =", value, "taxTBillDate");
            return (Criteria) this;
        }

        public Criteria andTaxTBillDateNotEqualTo(Date value) {
            addCriterion("tax_t_bill_date <>", value, "taxTBillDate");
            return (Criteria) this;
        }

        public Criteria andTaxTBillDateGreaterThan(Date value) {
            addCriterion("tax_t_bill_date >", value, "taxTBillDate");
            return (Criteria) this;
        }

        public Criteria andTaxTBillDateGreaterThanOrEqualTo(Date value) {
            addCriterion("tax_t_bill_date >=", value, "taxTBillDate");
            return (Criteria) this;
        }

        public Criteria andTaxTBillDateLessThan(Date value) {
            addCriterion("tax_t_bill_date <", value, "taxTBillDate");
            return (Criteria) this;
        }

        public Criteria andTaxTBillDateLessThanOrEqualTo(Date value) {
            addCriterion("tax_t_bill_date <=", value, "taxTBillDate");
            return (Criteria) this;
        }

        public Criteria andTaxTBillDateIn(List<Date> values) {
            addCriterion("tax_t_bill_date in", values, "taxTBillDate");
            return (Criteria) this;
        }

        public Criteria andTaxTBillDateNotIn(List<Date> values) {
            addCriterion("tax_t_bill_date not in", values, "taxTBillDate");
            return (Criteria) this;
        }

        public Criteria andTaxTBillDateBetween(Date value1, Date value2) {
            addCriterion("tax_t_bill_date between", value1, value2, "taxTBillDate");
            return (Criteria) this;
        }

        public Criteria andTaxTBillDateNotBetween(Date value1, Date value2) {
            addCriterion("tax_t_bill_date not between", value1, value2, "taxTBillDate");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerIdIsNull() {
            addCriterion("tax_taxpayer_id is null");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerIdIsNotNull() {
            addCriterion("tax_taxpayer_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerIdEqualTo(Integer value) {
            addCriterion("tax_taxpayer_id =", value, "taxTaxpayerId");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerIdNotEqualTo(Integer value) {
            addCriterion("tax_taxpayer_id <>", value, "taxTaxpayerId");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerIdGreaterThan(Integer value) {
            addCriterion("tax_taxpayer_id >", value, "taxTaxpayerId");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tax_taxpayer_id >=", value, "taxTaxpayerId");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerIdLessThan(Integer value) {
            addCriterion("tax_taxpayer_id <", value, "taxTaxpayerId");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerIdLessThanOrEqualTo(Integer value) {
            addCriterion("tax_taxpayer_id <=", value, "taxTaxpayerId");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerIdIn(List<Integer> values) {
            addCriterion("tax_taxpayer_id in", values, "taxTaxpayerId");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerIdNotIn(List<Integer> values) {
            addCriterion("tax_taxpayer_id not in", values, "taxTaxpayerId");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerIdBetween(Integer value1, Integer value2) {
            addCriterion("tax_taxpayer_id between", value1, value2, "taxTaxpayerId");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tax_taxpayer_id not between", value1, value2, "taxTaxpayerId");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerCertTypCodeIsNull() {
            addCriterion("tax_taxpayer_cert_typ_code is null");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerCertTypCodeIsNotNull() {
            addCriterion("tax_taxpayer_cert_typ_code is not null");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerCertTypCodeEqualTo(String value) {
            addCriterion("tax_taxpayer_cert_typ_code =", value, "taxTaxpayerCertTypCode");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerCertTypCodeNotEqualTo(String value) {
            addCriterion("tax_taxpayer_cert_typ_code <>", value, "taxTaxpayerCertTypCode");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerCertTypCodeGreaterThan(String value) {
            addCriterion("tax_taxpayer_cert_typ_code >", value, "taxTaxpayerCertTypCode");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerCertTypCodeGreaterThanOrEqualTo(String value) {
            addCriterion("tax_taxpayer_cert_typ_code >=", value, "taxTaxpayerCertTypCode");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerCertTypCodeLessThan(String value) {
            addCriterion("tax_taxpayer_cert_typ_code <", value, "taxTaxpayerCertTypCode");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerCertTypCodeLessThanOrEqualTo(String value) {
            addCriterion("tax_taxpayer_cert_typ_code <=", value, "taxTaxpayerCertTypCode");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerCertTypCodeLike(String value) {
            addCriterion("tax_taxpayer_cert_typ_code like", value, "taxTaxpayerCertTypCode");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerCertTypCodeNotLike(String value) {
            addCriterion("tax_taxpayer_cert_typ_code not like", value, "taxTaxpayerCertTypCode");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerCertTypCodeIn(List<String> values) {
            addCriterion("tax_taxpayer_cert_typ_code in", values, "taxTaxpayerCertTypCode");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerCertTypCodeNotIn(List<String> values) {
            addCriterion("tax_taxpayer_cert_typ_code not in", values, "taxTaxpayerCertTypCode");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerCertTypCodeBetween(String value1, String value2) {
            addCriterion("tax_taxpayer_cert_typ_code between", value1, value2, "taxTaxpayerCertTypCode");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerCertTypCodeNotBetween(String value1, String value2) {
            addCriterion("tax_taxpayer_cert_typ_code not between", value1, value2, "taxTaxpayerCertTypCode");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerCertTypIsNull() {
            addCriterion("tax_taxpayer_cert_typ is null");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerCertTypIsNotNull() {
            addCriterion("tax_taxpayer_cert_typ is not null");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerCertTypEqualTo(String value) {
            addCriterion("tax_taxpayer_cert_typ =", value, "taxTaxpayerCertTyp");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerCertTypNotEqualTo(String value) {
            addCriterion("tax_taxpayer_cert_typ <>", value, "taxTaxpayerCertTyp");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerCertTypGreaterThan(String value) {
            addCriterion("tax_taxpayer_cert_typ >", value, "taxTaxpayerCertTyp");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerCertTypGreaterThanOrEqualTo(String value) {
            addCriterion("tax_taxpayer_cert_typ >=", value, "taxTaxpayerCertTyp");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerCertTypLessThan(String value) {
            addCriterion("tax_taxpayer_cert_typ <", value, "taxTaxpayerCertTyp");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerCertTypLessThanOrEqualTo(String value) {
            addCriterion("tax_taxpayer_cert_typ <=", value, "taxTaxpayerCertTyp");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerCertTypLike(String value) {
            addCriterion("tax_taxpayer_cert_typ like", value, "taxTaxpayerCertTyp");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerCertTypNotLike(String value) {
            addCriterion("tax_taxpayer_cert_typ not like", value, "taxTaxpayerCertTyp");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerCertTypIn(List<String> values) {
            addCriterion("tax_taxpayer_cert_typ in", values, "taxTaxpayerCertTyp");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerCertTypNotIn(List<String> values) {
            addCriterion("tax_taxpayer_cert_typ not in", values, "taxTaxpayerCertTyp");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerCertTypBetween(String value1, String value2) {
            addCriterion("tax_taxpayer_cert_typ between", value1, value2, "taxTaxpayerCertTyp");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerCertTypNotBetween(String value1, String value2) {
            addCriterion("tax_taxpayer_cert_typ not between", value1, value2, "taxTaxpayerCertTyp");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerCertNumIsNull() {
            addCriterion("tax_taxpayer_cert_num is null");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerCertNumIsNotNull() {
            addCriterion("tax_taxpayer_cert_num is not null");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerCertNumEqualTo(Integer value) {
            addCriterion("tax_taxpayer_cert_num =", value, "taxTaxpayerCertNum");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerCertNumNotEqualTo(Integer value) {
            addCriterion("tax_taxpayer_cert_num <>", value, "taxTaxpayerCertNum");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerCertNumGreaterThan(Integer value) {
            addCriterion("tax_taxpayer_cert_num >", value, "taxTaxpayerCertNum");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerCertNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("tax_taxpayer_cert_num >=", value, "taxTaxpayerCertNum");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerCertNumLessThan(Integer value) {
            addCriterion("tax_taxpayer_cert_num <", value, "taxTaxpayerCertNum");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerCertNumLessThanOrEqualTo(Integer value) {
            addCriterion("tax_taxpayer_cert_num <=", value, "taxTaxpayerCertNum");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerCertNumIn(List<Integer> values) {
            addCriterion("tax_taxpayer_cert_num in", values, "taxTaxpayerCertNum");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerCertNumNotIn(List<Integer> values) {
            addCriterion("tax_taxpayer_cert_num not in", values, "taxTaxpayerCertNum");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerCertNumBetween(Integer value1, Integer value2) {
            addCriterion("tax_taxpayer_cert_num between", value1, value2, "taxTaxpayerCertNum");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerCertNumNotBetween(Integer value1, Integer value2) {
            addCriterion("tax_taxpayer_cert_num not between", value1, value2, "taxTaxpayerCertNum");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerNameIsNull() {
            addCriterion("tax_taxpayer_name is null");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerNameIsNotNull() {
            addCriterion("tax_taxpayer_name is not null");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerNameEqualTo(String value) {
            addCriterion("tax_taxpayer_name =", value, "taxTaxpayerName");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerNameNotEqualTo(String value) {
            addCriterion("tax_taxpayer_name <>", value, "taxTaxpayerName");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerNameGreaterThan(String value) {
            addCriterion("tax_taxpayer_name >", value, "taxTaxpayerName");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerNameGreaterThanOrEqualTo(String value) {
            addCriterion("tax_taxpayer_name >=", value, "taxTaxpayerName");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerNameLessThan(String value) {
            addCriterion("tax_taxpayer_name <", value, "taxTaxpayerName");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerNameLessThanOrEqualTo(String value) {
            addCriterion("tax_taxpayer_name <=", value, "taxTaxpayerName");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerNameLike(String value) {
            addCriterion("tax_taxpayer_name like", value, "taxTaxpayerName");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerNameNotLike(String value) {
            addCriterion("tax_taxpayer_name not like", value, "taxTaxpayerName");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerNameIn(List<String> values) {
            addCriterion("tax_taxpayer_name in", values, "taxTaxpayerName");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerNameNotIn(List<String> values) {
            addCriterion("tax_taxpayer_name not in", values, "taxTaxpayerName");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerNameBetween(String value1, String value2) {
            addCriterion("tax_taxpayer_name between", value1, value2, "taxTaxpayerName");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerNameNotBetween(String value1, String value2) {
            addCriterion("tax_taxpayer_name not between", value1, value2, "taxTaxpayerName");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerAddrIsNull() {
            addCriterion("tax_taxpayer_addr is null");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerAddrIsNotNull() {
            addCriterion("tax_taxpayer_addr is not null");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerAddrEqualTo(String value) {
            addCriterion("tax_taxpayer_addr =", value, "taxTaxpayerAddr");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerAddrNotEqualTo(String value) {
            addCriterion("tax_taxpayer_addr <>", value, "taxTaxpayerAddr");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerAddrGreaterThan(String value) {
            addCriterion("tax_taxpayer_addr >", value, "taxTaxpayerAddr");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerAddrGreaterThanOrEqualTo(String value) {
            addCriterion("tax_taxpayer_addr >=", value, "taxTaxpayerAddr");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerAddrLessThan(String value) {
            addCriterion("tax_taxpayer_addr <", value, "taxTaxpayerAddr");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerAddrLessThanOrEqualTo(String value) {
            addCriterion("tax_taxpayer_addr <=", value, "taxTaxpayerAddr");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerAddrLike(String value) {
            addCriterion("tax_taxpayer_addr like", value, "taxTaxpayerAddr");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerAddrNotLike(String value) {
            addCriterion("tax_taxpayer_addr not like", value, "taxTaxpayerAddr");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerAddrIn(List<String> values) {
            addCriterion("tax_taxpayer_addr in", values, "taxTaxpayerAddr");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerAddrNotIn(List<String> values) {
            addCriterion("tax_taxpayer_addr not in", values, "taxTaxpayerAddr");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerAddrBetween(String value1, String value2) {
            addCriterion("tax_taxpayer_addr between", value1, value2, "taxTaxpayerAddr");
            return (Criteria) this;
        }

        public Criteria andTaxTaxpayerAddrNotBetween(String value1, String value2) {
            addCriterion("tax_taxpayer_addr not between", value1, value2, "taxTaxpayerAddr");
            return (Criteria) this;
        }

        public Criteria andTaxTaxPaymentRecptNumIsNull() {
            addCriterion("tax_tax_payment_recpt_num is null");
            return (Criteria) this;
        }

        public Criteria andTaxTaxPaymentRecptNumIsNotNull() {
            addCriterion("tax_tax_payment_recpt_num is not null");
            return (Criteria) this;
        }

        public Criteria andTaxTaxPaymentRecptNumEqualTo(Integer value) {
            addCriterion("tax_tax_payment_recpt_num =", value, "taxTaxPaymentRecptNum");
            return (Criteria) this;
        }

        public Criteria andTaxTaxPaymentRecptNumNotEqualTo(Integer value) {
            addCriterion("tax_tax_payment_recpt_num <>", value, "taxTaxPaymentRecptNum");
            return (Criteria) this;
        }

        public Criteria andTaxTaxPaymentRecptNumGreaterThan(Integer value) {
            addCriterion("tax_tax_payment_recpt_num >", value, "taxTaxPaymentRecptNum");
            return (Criteria) this;
        }

        public Criteria andTaxTaxPaymentRecptNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("tax_tax_payment_recpt_num >=", value, "taxTaxPaymentRecptNum");
            return (Criteria) this;
        }

        public Criteria andTaxTaxPaymentRecptNumLessThan(Integer value) {
            addCriterion("tax_tax_payment_recpt_num <", value, "taxTaxPaymentRecptNum");
            return (Criteria) this;
        }

        public Criteria andTaxTaxPaymentRecptNumLessThanOrEqualTo(Integer value) {
            addCriterion("tax_tax_payment_recpt_num <=", value, "taxTaxPaymentRecptNum");
            return (Criteria) this;
        }

        public Criteria andTaxTaxPaymentRecptNumIn(List<Integer> values) {
            addCriterion("tax_tax_payment_recpt_num in", values, "taxTaxPaymentRecptNum");
            return (Criteria) this;
        }

        public Criteria andTaxTaxPaymentRecptNumNotIn(List<Integer> values) {
            addCriterion("tax_tax_payment_recpt_num not in", values, "taxTaxPaymentRecptNum");
            return (Criteria) this;
        }

        public Criteria andTaxTaxPaymentRecptNumBetween(Integer value1, Integer value2) {
            addCriterion("tax_tax_payment_recpt_num between", value1, value2, "taxTaxPaymentRecptNum");
            return (Criteria) this;
        }

        public Criteria andTaxTaxPaymentRecptNumNotBetween(Integer value1, Integer value2) {
            addCriterion("tax_tax_payment_recpt_num not between", value1, value2, "taxTaxPaymentRecptNum");
            return (Criteria) this;
        }

        public Criteria andTaxNOverdueAmtIsNull() {
            addCriterion("tax_n_overdue_amt is null");
            return (Criteria) this;
        }

        public Criteria andTaxNOverdueAmtIsNotNull() {
            addCriterion("tax_n_overdue_amt is not null");
            return (Criteria) this;
        }

        public Criteria andTaxNOverdueAmtEqualTo(String value) {
            addCriterion("tax_n_overdue_amt =", value, "taxNOverdueAmt");
            return (Criteria) this;
        }

        public Criteria andTaxNOverdueAmtNotEqualTo(String value) {
            addCriterion("tax_n_overdue_amt <>", value, "taxNOverdueAmt");
            return (Criteria) this;
        }

        public Criteria andTaxNOverdueAmtGreaterThan(String value) {
            addCriterion("tax_n_overdue_amt >", value, "taxNOverdueAmt");
            return (Criteria) this;
        }

        public Criteria andTaxNOverdueAmtGreaterThanOrEqualTo(String value) {
            addCriterion("tax_n_overdue_amt >=", value, "taxNOverdueAmt");
            return (Criteria) this;
        }

        public Criteria andTaxNOverdueAmtLessThan(String value) {
            addCriterion("tax_n_overdue_amt <", value, "taxNOverdueAmt");
            return (Criteria) this;
        }

        public Criteria andTaxNOverdueAmtLessThanOrEqualTo(String value) {
            addCriterion("tax_n_overdue_amt <=", value, "taxNOverdueAmt");
            return (Criteria) this;
        }

        public Criteria andTaxNOverdueAmtLike(String value) {
            addCriterion("tax_n_overdue_amt like", value, "taxNOverdueAmt");
            return (Criteria) this;
        }

        public Criteria andTaxNOverdueAmtNotLike(String value) {
            addCriterion("tax_n_overdue_amt not like", value, "taxNOverdueAmt");
            return (Criteria) this;
        }

        public Criteria andTaxNOverdueAmtIn(List<String> values) {
            addCriterion("tax_n_overdue_amt in", values, "taxNOverdueAmt");
            return (Criteria) this;
        }

        public Criteria andTaxNOverdueAmtNotIn(List<String> values) {
            addCriterion("tax_n_overdue_amt not in", values, "taxNOverdueAmt");
            return (Criteria) this;
        }

        public Criteria andTaxNOverdueAmtBetween(String value1, String value2) {
            addCriterion("tax_n_overdue_amt between", value1, value2, "taxNOverdueAmt");
            return (Criteria) this;
        }

        public Criteria andTaxNOverdueAmtNotBetween(String value1, String value2) {
            addCriterion("tax_n_overdue_amt not between", value1, value2, "taxNOverdueAmt");
            return (Criteria) this;
        }

        public Criteria andTaxNLastyeartIsNull() {
            addCriterion("tax_n_lastyeart is null");
            return (Criteria) this;
        }

        public Criteria andTaxNLastyeartIsNotNull() {
            addCriterion("tax_n_lastyeart is not null");
            return (Criteria) this;
        }

        public Criteria andTaxNLastyeartEqualTo(String value) {
            addCriterion("tax_n_lastyeart =", value, "taxNLastyeart");
            return (Criteria) this;
        }

        public Criteria andTaxNLastyeartNotEqualTo(String value) {
            addCriterion("tax_n_lastyeart <>", value, "taxNLastyeart");
            return (Criteria) this;
        }

        public Criteria andTaxNLastyeartGreaterThan(String value) {
            addCriterion("tax_n_lastyeart >", value, "taxNLastyeart");
            return (Criteria) this;
        }

        public Criteria andTaxNLastyeartGreaterThanOrEqualTo(String value) {
            addCriterion("tax_n_lastyeart >=", value, "taxNLastyeart");
            return (Criteria) this;
        }

        public Criteria andTaxNLastyeartLessThan(String value) {
            addCriterion("tax_n_lastyeart <", value, "taxNLastyeart");
            return (Criteria) this;
        }

        public Criteria andTaxNLastyeartLessThanOrEqualTo(String value) {
            addCriterion("tax_n_lastyeart <=", value, "taxNLastyeart");
            return (Criteria) this;
        }

        public Criteria andTaxNLastyeartLike(String value) {
            addCriterion("tax_n_lastyeart like", value, "taxNLastyeart");
            return (Criteria) this;
        }

        public Criteria andTaxNLastyeartNotLike(String value) {
            addCriterion("tax_n_lastyeart not like", value, "taxNLastyeart");
            return (Criteria) this;
        }

        public Criteria andTaxNLastyeartIn(List<String> values) {
            addCriterion("tax_n_lastyeart in", values, "taxNLastyeart");
            return (Criteria) this;
        }

        public Criteria andTaxNLastyeartNotIn(List<String> values) {
            addCriterion("tax_n_lastyeart not in", values, "taxNLastyeart");
            return (Criteria) this;
        }

        public Criteria andTaxNLastyeartBetween(String value1, String value2) {
            addCriterion("tax_n_lastyeart between", value1, value2, "taxNLastyeart");
            return (Criteria) this;
        }

        public Criteria andTaxNLastyeartNotBetween(String value1, String value2) {
            addCriterion("tax_n_lastyeart not between", value1, value2, "taxNLastyeart");
            return (Criteria) this;
        }

        public Criteria andTaxNtaxableAntIsNull() {
            addCriterion("tax_ntaxable_ant is null");
            return (Criteria) this;
        }

        public Criteria andTaxNtaxableAntIsNotNull() {
            addCriterion("tax_ntaxable_ant is not null");
            return (Criteria) this;
        }

        public Criteria andTaxNtaxableAntEqualTo(String value) {
            addCriterion("tax_ntaxable_ant =", value, "taxNtaxableAnt");
            return (Criteria) this;
        }

        public Criteria andTaxNtaxableAntNotEqualTo(String value) {
            addCriterion("tax_ntaxable_ant <>", value, "taxNtaxableAnt");
            return (Criteria) this;
        }

        public Criteria andTaxNtaxableAntGreaterThan(String value) {
            addCriterion("tax_ntaxable_ant >", value, "taxNtaxableAnt");
            return (Criteria) this;
        }

        public Criteria andTaxNtaxableAntGreaterThanOrEqualTo(String value) {
            addCriterion("tax_ntaxable_ant >=", value, "taxNtaxableAnt");
            return (Criteria) this;
        }

        public Criteria andTaxNtaxableAntLessThan(String value) {
            addCriterion("tax_ntaxable_ant <", value, "taxNtaxableAnt");
            return (Criteria) this;
        }

        public Criteria andTaxNtaxableAntLessThanOrEqualTo(String value) {
            addCriterion("tax_ntaxable_ant <=", value, "taxNtaxableAnt");
            return (Criteria) this;
        }

        public Criteria andTaxNtaxableAntLike(String value) {
            addCriterion("tax_ntaxable_ant like", value, "taxNtaxableAnt");
            return (Criteria) this;
        }

        public Criteria andTaxNtaxableAntNotLike(String value) {
            addCriterion("tax_ntaxable_ant not like", value, "taxNtaxableAnt");
            return (Criteria) this;
        }

        public Criteria andTaxNtaxableAntIn(List<String> values) {
            addCriterion("tax_ntaxable_ant in", values, "taxNtaxableAnt");
            return (Criteria) this;
        }

        public Criteria andTaxNtaxableAntNotIn(List<String> values) {
            addCriterion("tax_ntaxable_ant not in", values, "taxNtaxableAnt");
            return (Criteria) this;
        }

        public Criteria andTaxNtaxableAntBetween(String value1, String value2) {
            addCriterion("tax_ntaxable_ant between", value1, value2, "taxNtaxableAnt");
            return (Criteria) this;
        }

        public Criteria andTaxNtaxableAntNotBetween(String value1, String value2) {
            addCriterion("tax_ntaxable_ant not between", value1, value2, "taxNtaxableAnt");
            return (Criteria) this;
        }

        public Criteria andCTaxOrgNolocalCodeIsNull() {
            addCriterion("c_tax_org_nolocal_code is null");
            return (Criteria) this;
        }

        public Criteria andCTaxOrgNolocalCodeIsNotNull() {
            addCriterion("c_tax_org_nolocal_code is not null");
            return (Criteria) this;
        }

        public Criteria andCTaxOrgNolocalCodeEqualTo(String value) {
            addCriterion("c_tax_org_nolocal_code =", value, "cTaxOrgNolocalCode");
            return (Criteria) this;
        }

        public Criteria andCTaxOrgNolocalCodeNotEqualTo(String value) {
            addCriterion("c_tax_org_nolocal_code <>", value, "cTaxOrgNolocalCode");
            return (Criteria) this;
        }

        public Criteria andCTaxOrgNolocalCodeGreaterThan(String value) {
            addCriterion("c_tax_org_nolocal_code >", value, "cTaxOrgNolocalCode");
            return (Criteria) this;
        }

        public Criteria andCTaxOrgNolocalCodeGreaterThanOrEqualTo(String value) {
            addCriterion("c_tax_org_nolocal_code >=", value, "cTaxOrgNolocalCode");
            return (Criteria) this;
        }

        public Criteria andCTaxOrgNolocalCodeLessThan(String value) {
            addCriterion("c_tax_org_nolocal_code <", value, "cTaxOrgNolocalCode");
            return (Criteria) this;
        }

        public Criteria andCTaxOrgNolocalCodeLessThanOrEqualTo(String value) {
            addCriterion("c_tax_org_nolocal_code <=", value, "cTaxOrgNolocalCode");
            return (Criteria) this;
        }

        public Criteria andCTaxOrgNolocalCodeLike(String value) {
            addCriterion("c_tax_org_nolocal_code like", value, "cTaxOrgNolocalCode");
            return (Criteria) this;
        }

        public Criteria andCTaxOrgNolocalCodeNotLike(String value) {
            addCriterion("c_tax_org_nolocal_code not like", value, "cTaxOrgNolocalCode");
            return (Criteria) this;
        }

        public Criteria andCTaxOrgNolocalCodeIn(List<String> values) {
            addCriterion("c_tax_org_nolocal_code in", values, "cTaxOrgNolocalCode");
            return (Criteria) this;
        }

        public Criteria andCTaxOrgNolocalCodeNotIn(List<String> values) {
            addCriterion("c_tax_org_nolocal_code not in", values, "cTaxOrgNolocalCode");
            return (Criteria) this;
        }

        public Criteria andCTaxOrgNolocalCodeBetween(String value1, String value2) {
            addCriterion("c_tax_org_nolocal_code between", value1, value2, "cTaxOrgNolocalCode");
            return (Criteria) this;
        }

        public Criteria andCTaxOrgNolocalCodeNotBetween(String value1, String value2) {
            addCriterion("c_tax_org_nolocal_code not between", value1, value2, "cTaxOrgNolocalCode");
            return (Criteria) this;
        }

        public Criteria andCTaxOrgNolocalIsNull() {
            addCriterion("c_tax_org_nolocal is null");
            return (Criteria) this;
        }

        public Criteria andCTaxOrgNolocalIsNotNull() {
            addCriterion("c_tax_org_nolocal is not null");
            return (Criteria) this;
        }

        public Criteria andCTaxOrgNolocalEqualTo(String value) {
            addCriterion("c_tax_org_nolocal =", value, "cTaxOrgNolocal");
            return (Criteria) this;
        }

        public Criteria andCTaxOrgNolocalNotEqualTo(String value) {
            addCriterion("c_tax_org_nolocal <>", value, "cTaxOrgNolocal");
            return (Criteria) this;
        }

        public Criteria andCTaxOrgNolocalGreaterThan(String value) {
            addCriterion("c_tax_org_nolocal >", value, "cTaxOrgNolocal");
            return (Criteria) this;
        }

        public Criteria andCTaxOrgNolocalGreaterThanOrEqualTo(String value) {
            addCriterion("c_tax_org_nolocal >=", value, "cTaxOrgNolocal");
            return (Criteria) this;
        }

        public Criteria andCTaxOrgNolocalLessThan(String value) {
            addCriterion("c_tax_org_nolocal <", value, "cTaxOrgNolocal");
            return (Criteria) this;
        }

        public Criteria andCTaxOrgNolocalLessThanOrEqualTo(String value) {
            addCriterion("c_tax_org_nolocal <=", value, "cTaxOrgNolocal");
            return (Criteria) this;
        }

        public Criteria andCTaxOrgNolocalLike(String value) {
            addCriterion("c_tax_org_nolocal like", value, "cTaxOrgNolocal");
            return (Criteria) this;
        }

        public Criteria andCTaxOrgNolocalNotLike(String value) {
            addCriterion("c_tax_org_nolocal not like", value, "cTaxOrgNolocal");
            return (Criteria) this;
        }

        public Criteria andCTaxOrgNolocalIn(List<String> values) {
            addCriterion("c_tax_org_nolocal in", values, "cTaxOrgNolocal");
            return (Criteria) this;
        }

        public Criteria andCTaxOrgNolocalNotIn(List<String> values) {
            addCriterion("c_tax_org_nolocal not in", values, "cTaxOrgNolocal");
            return (Criteria) this;
        }

        public Criteria andCTaxOrgNolocalBetween(String value1, String value2) {
            addCriterion("c_tax_org_nolocal between", value1, value2, "cTaxOrgNolocal");
            return (Criteria) this;
        }

        public Criteria andCTaxOrgNolocalNotBetween(String value1, String value2) {
            addCriterion("c_tax_org_nolocal not between", value1, value2, "cTaxOrgNolocal");
            return (Criteria) this;
        }

        public Criteria andTaxTaxAuthoritiesIsNull() {
            addCriterion("tax_tax_authorities is null");
            return (Criteria) this;
        }

        public Criteria andTaxTaxAuthoritiesIsNotNull() {
            addCriterion("tax_tax_authorities is not null");
            return (Criteria) this;
        }

        public Criteria andTaxTaxAuthoritiesEqualTo(String value) {
            addCriterion("tax_tax_authorities =", value, "taxTaxAuthorities");
            return (Criteria) this;
        }

        public Criteria andTaxTaxAuthoritiesNotEqualTo(String value) {
            addCriterion("tax_tax_authorities <>", value, "taxTaxAuthorities");
            return (Criteria) this;
        }

        public Criteria andTaxTaxAuthoritiesGreaterThan(String value) {
            addCriterion("tax_tax_authorities >", value, "taxTaxAuthorities");
            return (Criteria) this;
        }

        public Criteria andTaxTaxAuthoritiesGreaterThanOrEqualTo(String value) {
            addCriterion("tax_tax_authorities >=", value, "taxTaxAuthorities");
            return (Criteria) this;
        }

        public Criteria andTaxTaxAuthoritiesLessThan(String value) {
            addCriterion("tax_tax_authorities <", value, "taxTaxAuthorities");
            return (Criteria) this;
        }

        public Criteria andTaxTaxAuthoritiesLessThanOrEqualTo(String value) {
            addCriterion("tax_tax_authorities <=", value, "taxTaxAuthorities");
            return (Criteria) this;
        }

        public Criteria andTaxTaxAuthoritiesLike(String value) {
            addCriterion("tax_tax_authorities like", value, "taxTaxAuthorities");
            return (Criteria) this;
        }

        public Criteria andTaxTaxAuthoritiesNotLike(String value) {
            addCriterion("tax_tax_authorities not like", value, "taxTaxAuthorities");
            return (Criteria) this;
        }

        public Criteria andTaxTaxAuthoritiesIn(List<String> values) {
            addCriterion("tax_tax_authorities in", values, "taxTaxAuthorities");
            return (Criteria) this;
        }

        public Criteria andTaxTaxAuthoritiesNotIn(List<String> values) {
            addCriterion("tax_tax_authorities not in", values, "taxTaxAuthorities");
            return (Criteria) this;
        }

        public Criteria andTaxTaxAuthoritiesBetween(String value1, String value2) {
            addCriterion("tax_tax_authorities between", value1, value2, "taxTaxAuthorities");
            return (Criteria) this;
        }

        public Criteria andTaxTaxAuthoritiesNotBetween(String value1, String value2) {
            addCriterion("tax_tax_authorities not between", value1, value2, "taxTaxAuthorities");
            return (Criteria) this;
        }

        public Criteria andTaxTotalTaxesIsNull() {
            addCriterion("tax_total_taxes is null");
            return (Criteria) this;
        }

        public Criteria andTaxTotalTaxesIsNotNull() {
            addCriterion("tax_total_taxes is not null");
            return (Criteria) this;
        }

        public Criteria andTaxTotalTaxesEqualTo(Double value) {
            addCriterion("tax_total_taxes =", value, "taxTotalTaxes");
            return (Criteria) this;
        }

        public Criteria andTaxTotalTaxesNotEqualTo(Double value) {
            addCriterion("tax_total_taxes <>", value, "taxTotalTaxes");
            return (Criteria) this;
        }

        public Criteria andTaxTotalTaxesGreaterThan(Double value) {
            addCriterion("tax_total_taxes >", value, "taxTotalTaxes");
            return (Criteria) this;
        }

        public Criteria andTaxTotalTaxesGreaterThanOrEqualTo(Double value) {
            addCriterion("tax_total_taxes >=", value, "taxTotalTaxes");
            return (Criteria) this;
        }

        public Criteria andTaxTotalTaxesLessThan(Double value) {
            addCriterion("tax_total_taxes <", value, "taxTotalTaxes");
            return (Criteria) this;
        }

        public Criteria andTaxTotalTaxesLessThanOrEqualTo(Double value) {
            addCriterion("tax_total_taxes <=", value, "taxTotalTaxes");
            return (Criteria) this;
        }

        public Criteria andTaxTotalTaxesIn(List<Double> values) {
            addCriterion("tax_total_taxes in", values, "taxTotalTaxes");
            return (Criteria) this;
        }

        public Criteria andTaxTotalTaxesNotIn(List<Double> values) {
            addCriterion("tax_total_taxes not in", values, "taxTotalTaxes");
            return (Criteria) this;
        }

        public Criteria andTaxTotalTaxesBetween(Double value1, Double value2) {
            addCriterion("tax_total_taxes between", value1, value2, "taxTotalTaxes");
            return (Criteria) this;
        }

        public Criteria andTaxTotalTaxesNotBetween(Double value1, Double value2) {
            addCriterion("tax_total_taxes not between", value1, value2, "taxTotalTaxes");
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