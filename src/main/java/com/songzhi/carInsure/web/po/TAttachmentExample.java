package com.songzhi.carInsure.web.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TAttachmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TAttachmentExample() {
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

        public Criteria andSourceNumIsNull() {
            addCriterion("source_num is null");
            return (Criteria) this;
        }

        public Criteria andSourceNumIsNotNull() {
            addCriterion("source_num is not null");
            return (Criteria) this;
        }

        public Criteria andSourceNumEqualTo(Integer value) {
            addCriterion("source_num =", value, "sourceNum");
            return (Criteria) this;
        }

        public Criteria andSourceNumNotEqualTo(Integer value) {
            addCriterion("source_num <>", value, "sourceNum");
            return (Criteria) this;
        }

        public Criteria andSourceNumGreaterThan(Integer value) {
            addCriterion("source_num >", value, "sourceNum");
            return (Criteria) this;
        }

        public Criteria andSourceNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("source_num >=", value, "sourceNum");
            return (Criteria) this;
        }

        public Criteria andSourceNumLessThan(Integer value) {
            addCriterion("source_num <", value, "sourceNum");
            return (Criteria) this;
        }

        public Criteria andSourceNumLessThanOrEqualTo(Integer value) {
            addCriterion("source_num <=", value, "sourceNum");
            return (Criteria) this;
        }

        public Criteria andSourceNumIn(List<Integer> values) {
            addCriterion("source_num in", values, "sourceNum");
            return (Criteria) this;
        }

        public Criteria andSourceNumNotIn(List<Integer> values) {
            addCriterion("source_num not in", values, "sourceNum");
            return (Criteria) this;
        }

        public Criteria andSourceNumBetween(Integer value1, Integer value2) {
            addCriterion("source_num between", value1, value2, "sourceNum");
            return (Criteria) this;
        }

        public Criteria andSourceNumNotBetween(Integer value1, Integer value2) {
            addCriterion("source_num not between", value1, value2, "sourceNum");
            return (Criteria) this;
        }

        public Criteria andSourceIdIsNull() {
            addCriterion("source_id is null");
            return (Criteria) this;
        }

        public Criteria andSourceIdIsNotNull() {
            addCriterion("source_id is not null");
            return (Criteria) this;
        }

        public Criteria andSourceIdEqualTo(Integer value) {
            addCriterion("source_id =", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdNotEqualTo(Integer value) {
            addCriterion("source_id <>", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdGreaterThan(Integer value) {
            addCriterion("source_id >", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("source_id >=", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdLessThan(Integer value) {
            addCriterion("source_id <", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdLessThanOrEqualTo(Integer value) {
            addCriterion("source_id <=", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdIn(List<Integer> values) {
            addCriterion("source_id in", values, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdNotIn(List<Integer> values) {
            addCriterion("source_id not in", values, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdBetween(Integer value1, Integer value2) {
            addCriterion("source_id between", value1, value2, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("source_id not between", value1, value2, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceNameIsNull() {
            addCriterion("source_name is null");
            return (Criteria) this;
        }

        public Criteria andSourceNameIsNotNull() {
            addCriterion("source_name is not null");
            return (Criteria) this;
        }

        public Criteria andSourceNameEqualTo(String value) {
            addCriterion("source_name =", value, "sourceName");
            return (Criteria) this;
        }

        public Criteria andSourceNameNotEqualTo(String value) {
            addCriterion("source_name <>", value, "sourceName");
            return (Criteria) this;
        }

        public Criteria andSourceNameGreaterThan(String value) {
            addCriterion("source_name >", value, "sourceName");
            return (Criteria) this;
        }

        public Criteria andSourceNameGreaterThanOrEqualTo(String value) {
            addCriterion("source_name >=", value, "sourceName");
            return (Criteria) this;
        }

        public Criteria andSourceNameLessThan(String value) {
            addCriterion("source_name <", value, "sourceName");
            return (Criteria) this;
        }

        public Criteria andSourceNameLessThanOrEqualTo(String value) {
            addCriterion("source_name <=", value, "sourceName");
            return (Criteria) this;
        }

        public Criteria andSourceNameLike(String value) {
            addCriterion("source_name like", value, "sourceName");
            return (Criteria) this;
        }

        public Criteria andSourceNameNotLike(String value) {
            addCriterion("source_name not like", value, "sourceName");
            return (Criteria) this;
        }

        public Criteria andSourceNameIn(List<String> values) {
            addCriterion("source_name in", values, "sourceName");
            return (Criteria) this;
        }

        public Criteria andSourceNameNotIn(List<String> values) {
            addCriterion("source_name not in", values, "sourceName");
            return (Criteria) this;
        }

        public Criteria andSourceNameBetween(String value1, String value2) {
            addCriterion("source_name between", value1, value2, "sourceName");
            return (Criteria) this;
        }

        public Criteria andSourceNameNotBetween(String value1, String value2) {
            addCriterion("source_name not between", value1, value2, "sourceName");
            return (Criteria) this;
        }

        public Criteria andDestNameIsNull() {
            addCriterion("dest_name is null");
            return (Criteria) this;
        }

        public Criteria andDestNameIsNotNull() {
            addCriterion("dest_name is not null");
            return (Criteria) this;
        }

        public Criteria andDestNameEqualTo(String value) {
            addCriterion("dest_name =", value, "destName");
            return (Criteria) this;
        }

        public Criteria andDestNameNotEqualTo(String value) {
            addCriterion("dest_name <>", value, "destName");
            return (Criteria) this;
        }

        public Criteria andDestNameGreaterThan(String value) {
            addCriterion("dest_name >", value, "destName");
            return (Criteria) this;
        }

        public Criteria andDestNameGreaterThanOrEqualTo(String value) {
            addCriterion("dest_name >=", value, "destName");
            return (Criteria) this;
        }

        public Criteria andDestNameLessThan(String value) {
            addCriterion("dest_name <", value, "destName");
            return (Criteria) this;
        }

        public Criteria andDestNameLessThanOrEqualTo(String value) {
            addCriterion("dest_name <=", value, "destName");
            return (Criteria) this;
        }

        public Criteria andDestNameLike(String value) {
            addCriterion("dest_name like", value, "destName");
            return (Criteria) this;
        }

        public Criteria andDestNameNotLike(String value) {
            addCriterion("dest_name not like", value, "destName");
            return (Criteria) this;
        }

        public Criteria andDestNameIn(List<String> values) {
            addCriterion("dest_name in", values, "destName");
            return (Criteria) this;
        }

        public Criteria andDestNameNotIn(List<String> values) {
            addCriterion("dest_name not in", values, "destName");
            return (Criteria) this;
        }

        public Criteria andDestNameBetween(String value1, String value2) {
            addCriterion("dest_name between", value1, value2, "destName");
            return (Criteria) this;
        }

        public Criteria andDestNameNotBetween(String value1, String value2) {
            addCriterion("dest_name not between", value1, value2, "destName");
            return (Criteria) this;
        }

        public Criteria andDestUrlIsNull() {
            addCriterion("dest_url is null");
            return (Criteria) this;
        }

        public Criteria andDestUrlIsNotNull() {
            addCriterion("dest_url is not null");
            return (Criteria) this;
        }

        public Criteria andDestUrlEqualTo(String value) {
            addCriterion("dest_url =", value, "destUrl");
            return (Criteria) this;
        }

        public Criteria andDestUrlNotEqualTo(String value) {
            addCriterion("dest_url <>", value, "destUrl");
            return (Criteria) this;
        }

        public Criteria andDestUrlGreaterThan(String value) {
            addCriterion("dest_url >", value, "destUrl");
            return (Criteria) this;
        }

        public Criteria andDestUrlGreaterThanOrEqualTo(String value) {
            addCriterion("dest_url >=", value, "destUrl");
            return (Criteria) this;
        }

        public Criteria andDestUrlLessThan(String value) {
            addCriterion("dest_url <", value, "destUrl");
            return (Criteria) this;
        }

        public Criteria andDestUrlLessThanOrEqualTo(String value) {
            addCriterion("dest_url <=", value, "destUrl");
            return (Criteria) this;
        }

        public Criteria andDestUrlLike(String value) {
            addCriterion("dest_url like", value, "destUrl");
            return (Criteria) this;
        }

        public Criteria andDestUrlNotLike(String value) {
            addCriterion("dest_url not like", value, "destUrl");
            return (Criteria) this;
        }

        public Criteria andDestUrlIn(List<String> values) {
            addCriterion("dest_url in", values, "destUrl");
            return (Criteria) this;
        }

        public Criteria andDestUrlNotIn(List<String> values) {
            addCriterion("dest_url not in", values, "destUrl");
            return (Criteria) this;
        }

        public Criteria andDestUrlBetween(String value1, String value2) {
            addCriterion("dest_url between", value1, value2, "destUrl");
            return (Criteria) this;
        }

        public Criteria andDestUrlNotBetween(String value1, String value2) {
            addCriterion("dest_url not between", value1, value2, "destUrl");
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

        public Criteria andCreaterIsNull() {
            addCriterion("creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Integer value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Integer value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Integer value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Integer value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Integer> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Integer> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Integer value1, Integer value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andComeTypeIsNull() {
            addCriterion("come_type is null");
            return (Criteria) this;
        }

        public Criteria andComeTypeIsNotNull() {
            addCriterion("come_type is not null");
            return (Criteria) this;
        }

        public Criteria andComeTypeEqualTo(Integer value) {
            addCriterion("come_type =", value, "comeType");
            return (Criteria) this;
        }

        public Criteria andComeTypeNotEqualTo(Integer value) {
            addCriterion("come_type <>", value, "comeType");
            return (Criteria) this;
        }

        public Criteria andComeTypeGreaterThan(Integer value) {
            addCriterion("come_type >", value, "comeType");
            return (Criteria) this;
        }

        public Criteria andComeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("come_type >=", value, "comeType");
            return (Criteria) this;
        }

        public Criteria andComeTypeLessThan(Integer value) {
            addCriterion("come_type <", value, "comeType");
            return (Criteria) this;
        }

        public Criteria andComeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("come_type <=", value, "comeType");
            return (Criteria) this;
        }

        public Criteria andComeTypeIn(List<Integer> values) {
            addCriterion("come_type in", values, "comeType");
            return (Criteria) this;
        }

        public Criteria andComeTypeNotIn(List<Integer> values) {
            addCriterion("come_type not in", values, "comeType");
            return (Criteria) this;
        }

        public Criteria andComeTypeBetween(Integer value1, Integer value2) {
            addCriterion("come_type between", value1, value2, "comeType");
            return (Criteria) this;
        }

        public Criteria andComeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("come_type not between", value1, value2, "comeType");
            return (Criteria) this;
        }

        public Criteria andComeOrderIsNull() {
            addCriterion("come_order is null");
            return (Criteria) this;
        }

        public Criteria andComeOrderIsNotNull() {
            addCriterion("come_order is not null");
            return (Criteria) this;
        }

        public Criteria andComeOrderEqualTo(Integer value) {
            addCriterion("come_order =", value, "comeOrder");
            return (Criteria) this;
        }

        public Criteria andComeOrderNotEqualTo(Integer value) {
            addCriterion("come_order <>", value, "comeOrder");
            return (Criteria) this;
        }

        public Criteria andComeOrderGreaterThan(Integer value) {
            addCriterion("come_order >", value, "comeOrder");
            return (Criteria) this;
        }

        public Criteria andComeOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("come_order >=", value, "comeOrder");
            return (Criteria) this;
        }

        public Criteria andComeOrderLessThan(Integer value) {
            addCriterion("come_order <", value, "comeOrder");
            return (Criteria) this;
        }

        public Criteria andComeOrderLessThanOrEqualTo(Integer value) {
            addCriterion("come_order <=", value, "comeOrder");
            return (Criteria) this;
        }

        public Criteria andComeOrderIn(List<Integer> values) {
            addCriterion("come_order in", values, "comeOrder");
            return (Criteria) this;
        }

        public Criteria andComeOrderNotIn(List<Integer> values) {
            addCriterion("come_order not in", values, "comeOrder");
            return (Criteria) this;
        }

        public Criteria andComeOrderBetween(Integer value1, Integer value2) {
            addCriterion("come_order between", value1, value2, "comeOrder");
            return (Criteria) this;
        }

        public Criteria andComeOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("come_order not between", value1, value2, "comeOrder");
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