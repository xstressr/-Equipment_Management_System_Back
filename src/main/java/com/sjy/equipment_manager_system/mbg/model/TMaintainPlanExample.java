package com.sjy.equipment_manager_system.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TMaintainPlanExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_maintain_plan
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_maintain_plan
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_maintain_plan
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_maintain_plan
     *
     * @mbg.generated
     */
    public TMaintainPlanExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_maintain_plan
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_maintain_plan
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_maintain_plan
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_maintain_plan
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_maintain_plan
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_maintain_plan
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_maintain_plan
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_maintain_plan
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_maintain_plan
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_maintain_plan
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_maintain_plan
     *
     * @mbg.generated
     */
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

        public Criteria andMidIsNull() {
            addCriterion("mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(Integer value) {
            addCriterion("mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(Integer value) {
            addCriterion("mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(Integer value) {
            addCriterion("mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(Integer value) {
            addCriterion("mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(Integer value) {
            addCriterion("mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<Integer> values) {
            addCriterion("mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<Integer> values) {
            addCriterion("mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(Integer value1, Integer value2) {
            addCriterion("mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(Integer value1, Integer value2) {
            addCriterion("mid not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMtypeIsNull() {
            addCriterion("mtype is null");
            return (Criteria) this;
        }

        public Criteria andMtypeIsNotNull() {
            addCriterion("mtype is not null");
            return (Criteria) this;
        }

        public Criteria andMtypeEqualTo(String value) {
            addCriterion("mtype =", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeNotEqualTo(String value) {
            addCriterion("mtype <>", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeGreaterThan(String value) {
            addCriterion("mtype >", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeGreaterThanOrEqualTo(String value) {
            addCriterion("mtype >=", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeLessThan(String value) {
            addCriterion("mtype <", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeLessThanOrEqualTo(String value) {
            addCriterion("mtype <=", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeLike(String value) {
            addCriterion("mtype like", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeNotLike(String value) {
            addCriterion("mtype not like", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeIn(List<String> values) {
            addCriterion("mtype in", values, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeNotIn(List<String> values) {
            addCriterion("mtype not in", values, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeBetween(String value1, String value2) {
            addCriterion("mtype between", value1, value2, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeNotBetween(String value1, String value2) {
            addCriterion("mtype not between", value1, value2, "mtype");
            return (Criteria) this;
        }

        public Criteria andMaintainStartimeIsNull() {
            addCriterion("maintain_startime is null");
            return (Criteria) this;
        }

        public Criteria andMaintainStartimeIsNotNull() {
            addCriterion("maintain_startime is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainStartimeEqualTo(Date value) {
            addCriterion("maintain_startime =", value, "maintainStartime");
            return (Criteria) this;
        }

        public Criteria andMaintainStartimeNotEqualTo(Date value) {
            addCriterion("maintain_startime <>", value, "maintainStartime");
            return (Criteria) this;
        }

        public Criteria andMaintainStartimeGreaterThan(Date value) {
            addCriterion("maintain_startime >", value, "maintainStartime");
            return (Criteria) this;
        }

        public Criteria andMaintainStartimeGreaterThanOrEqualTo(Date value) {
            addCriterion("maintain_startime >=", value, "maintainStartime");
            return (Criteria) this;
        }

        public Criteria andMaintainStartimeLessThan(Date value) {
            addCriterion("maintain_startime <", value, "maintainStartime");
            return (Criteria) this;
        }

        public Criteria andMaintainStartimeLessThanOrEqualTo(Date value) {
            addCriterion("maintain_startime <=", value, "maintainStartime");
            return (Criteria) this;
        }

        public Criteria andMaintainStartimeIn(List<Date> values) {
            addCriterion("maintain_startime in", values, "maintainStartime");
            return (Criteria) this;
        }

        public Criteria andMaintainStartimeNotIn(List<Date> values) {
            addCriterion("maintain_startime not in", values, "maintainStartime");
            return (Criteria) this;
        }

        public Criteria andMaintainStartimeBetween(Date value1, Date value2) {
            addCriterion("maintain_startime between", value1, value2, "maintainStartime");
            return (Criteria) this;
        }

        public Criteria andMaintainStartimeNotBetween(Date value1, Date value2) {
            addCriterion("maintain_startime not between", value1, value2, "maintainStartime");
            return (Criteria) this;
        }

        public Criteria andMaintainEquipIsNull() {
            addCriterion("maintain_equip is null");
            return (Criteria) this;
        }

        public Criteria andMaintainEquipIsNotNull() {
            addCriterion("maintain_equip is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainEquipEqualTo(String value) {
            addCriterion("maintain_equip =", value, "maintainEquip");
            return (Criteria) this;
        }

        public Criteria andMaintainEquipNotEqualTo(String value) {
            addCriterion("maintain_equip <>", value, "maintainEquip");
            return (Criteria) this;
        }

        public Criteria andMaintainEquipGreaterThan(String value) {
            addCriterion("maintain_equip >", value, "maintainEquip");
            return (Criteria) this;
        }

        public Criteria andMaintainEquipGreaterThanOrEqualTo(String value) {
            addCriterion("maintain_equip >=", value, "maintainEquip");
            return (Criteria) this;
        }

        public Criteria andMaintainEquipLessThan(String value) {
            addCriterion("maintain_equip <", value, "maintainEquip");
            return (Criteria) this;
        }

        public Criteria andMaintainEquipLessThanOrEqualTo(String value) {
            addCriterion("maintain_equip <=", value, "maintainEquip");
            return (Criteria) this;
        }

        public Criteria andMaintainEquipLike(String value) {
            addCriterion("maintain_equip like", value, "maintainEquip");
            return (Criteria) this;
        }

        public Criteria andMaintainEquipNotLike(String value) {
            addCriterion("maintain_equip not like", value, "maintainEquip");
            return (Criteria) this;
        }

        public Criteria andMaintainEquipIn(List<String> values) {
            addCriterion("maintain_equip in", values, "maintainEquip");
            return (Criteria) this;
        }

        public Criteria andMaintainEquipNotIn(List<String> values) {
            addCriterion("maintain_equip not in", values, "maintainEquip");
            return (Criteria) this;
        }

        public Criteria andMaintainEquipBetween(String value1, String value2) {
            addCriterion("maintain_equip between", value1, value2, "maintainEquip");
            return (Criteria) this;
        }

        public Criteria andMaintainEquipNotBetween(String value1, String value2) {
            addCriterion("maintain_equip not between", value1, value2, "maintainEquip");
            return (Criteria) this;
        }

        public Criteria andMaintainContentIsNull() {
            addCriterion("maintain_content is null");
            return (Criteria) this;
        }

        public Criteria andMaintainContentIsNotNull() {
            addCriterion("maintain_content is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainContentEqualTo(String value) {
            addCriterion("maintain_content =", value, "maintainContent");
            return (Criteria) this;
        }

        public Criteria andMaintainContentNotEqualTo(String value) {
            addCriterion("maintain_content <>", value, "maintainContent");
            return (Criteria) this;
        }

        public Criteria andMaintainContentGreaterThan(String value) {
            addCriterion("maintain_content >", value, "maintainContent");
            return (Criteria) this;
        }

        public Criteria andMaintainContentGreaterThanOrEqualTo(String value) {
            addCriterion("maintain_content >=", value, "maintainContent");
            return (Criteria) this;
        }

        public Criteria andMaintainContentLessThan(String value) {
            addCriterion("maintain_content <", value, "maintainContent");
            return (Criteria) this;
        }

        public Criteria andMaintainContentLessThanOrEqualTo(String value) {
            addCriterion("maintain_content <=", value, "maintainContent");
            return (Criteria) this;
        }

        public Criteria andMaintainContentLike(String value) {
            addCriterion("maintain_content like", value, "maintainContent");
            return (Criteria) this;
        }

        public Criteria andMaintainContentNotLike(String value) {
            addCriterion("maintain_content not like", value, "maintainContent");
            return (Criteria) this;
        }

        public Criteria andMaintainContentIn(List<String> values) {
            addCriterion("maintain_content in", values, "maintainContent");
            return (Criteria) this;
        }

        public Criteria andMaintainContentNotIn(List<String> values) {
            addCriterion("maintain_content not in", values, "maintainContent");
            return (Criteria) this;
        }

        public Criteria andMaintainContentBetween(String value1, String value2) {
            addCriterion("maintain_content between", value1, value2, "maintainContent");
            return (Criteria) this;
        }

        public Criteria andMaintainContentNotBetween(String value1, String value2) {
            addCriterion("maintain_content not between", value1, value2, "maintainContent");
            return (Criteria) this;
        }

        public Criteria andMainPeopleIsNull() {
            addCriterion("main_people is null");
            return (Criteria) this;
        }

        public Criteria andMainPeopleIsNotNull() {
            addCriterion("main_people is not null");
            return (Criteria) this;
        }

        public Criteria andMainPeopleEqualTo(String value) {
            addCriterion("main_people =", value, "mainPeople");
            return (Criteria) this;
        }

        public Criteria andMainPeopleNotEqualTo(String value) {
            addCriterion("main_people <>", value, "mainPeople");
            return (Criteria) this;
        }

        public Criteria andMainPeopleGreaterThan(String value) {
            addCriterion("main_people >", value, "mainPeople");
            return (Criteria) this;
        }

        public Criteria andMainPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("main_people >=", value, "mainPeople");
            return (Criteria) this;
        }

        public Criteria andMainPeopleLessThan(String value) {
            addCriterion("main_people <", value, "mainPeople");
            return (Criteria) this;
        }

        public Criteria andMainPeopleLessThanOrEqualTo(String value) {
            addCriterion("main_people <=", value, "mainPeople");
            return (Criteria) this;
        }

        public Criteria andMainPeopleLike(String value) {
            addCriterion("main_people like", value, "mainPeople");
            return (Criteria) this;
        }

        public Criteria andMainPeopleNotLike(String value) {
            addCriterion("main_people not like", value, "mainPeople");
            return (Criteria) this;
        }

        public Criteria andMainPeopleIn(List<String> values) {
            addCriterion("main_people in", values, "mainPeople");
            return (Criteria) this;
        }

        public Criteria andMainPeopleNotIn(List<String> values) {
            addCriterion("main_people not in", values, "mainPeople");
            return (Criteria) this;
        }

        public Criteria andMainPeopleBetween(String value1, String value2) {
            addCriterion("main_people between", value1, value2, "mainPeople");
            return (Criteria) this;
        }

        public Criteria andMainPeopleNotBetween(String value1, String value2) {
            addCriterion("main_people not between", value1, value2, "mainPeople");
            return (Criteria) this;
        }

        public Criteria andMainDescrIsNull() {
            addCriterion("main_descr is null");
            return (Criteria) this;
        }

        public Criteria andMainDescrIsNotNull() {
            addCriterion("main_descr is not null");
            return (Criteria) this;
        }

        public Criteria andMainDescrEqualTo(String value) {
            addCriterion("main_descr =", value, "mainDescr");
            return (Criteria) this;
        }

        public Criteria andMainDescrNotEqualTo(String value) {
            addCriterion("main_descr <>", value, "mainDescr");
            return (Criteria) this;
        }

        public Criteria andMainDescrGreaterThan(String value) {
            addCriterion("main_descr >", value, "mainDescr");
            return (Criteria) this;
        }

        public Criteria andMainDescrGreaterThanOrEqualTo(String value) {
            addCriterion("main_descr >=", value, "mainDescr");
            return (Criteria) this;
        }

        public Criteria andMainDescrLessThan(String value) {
            addCriterion("main_descr <", value, "mainDescr");
            return (Criteria) this;
        }

        public Criteria andMainDescrLessThanOrEqualTo(String value) {
            addCriterion("main_descr <=", value, "mainDescr");
            return (Criteria) this;
        }

        public Criteria andMainDescrLike(String value) {
            addCriterion("main_descr like", value, "mainDescr");
            return (Criteria) this;
        }

        public Criteria andMainDescrNotLike(String value) {
            addCriterion("main_descr not like", value, "mainDescr");
            return (Criteria) this;
        }

        public Criteria andMainDescrIn(List<String> values) {
            addCriterion("main_descr in", values, "mainDescr");
            return (Criteria) this;
        }

        public Criteria andMainDescrNotIn(List<String> values) {
            addCriterion("main_descr not in", values, "mainDescr");
            return (Criteria) this;
        }

        public Criteria andMainDescrBetween(String value1, String value2) {
            addCriterion("main_descr between", value1, value2, "mainDescr");
            return (Criteria) this;
        }

        public Criteria andMainDescrNotBetween(String value1, String value2) {
            addCriterion("main_descr not between", value1, value2, "mainDescr");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_maintain_plan
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_maintain_plan
     *
     * @mbg.generated
     */
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