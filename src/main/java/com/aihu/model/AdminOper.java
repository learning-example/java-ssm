package com.aihu.model;

import java.util.Date;

public class AdminOper {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_admin_oper.id
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_admin_oper.oper_name
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    private String oper_name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_admin_oper.comment
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    private String comment;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_admin_oper.create_time
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    private Date create_time;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_admin_oper.update_time
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    private Date update_time;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_admin_oper.modifier
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    private Integer modifier;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_admin_oper.del_flag
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    private Byte del_flag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_admin_oper.id
     *
     * @return the value of b_admin_oper.id
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_admin_oper.id
     *
     * @param id the value for b_admin_oper.id
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_admin_oper.oper_name
     *
     * @return the value of b_admin_oper.oper_name
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    public String getOper_name() {
        return oper_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_admin_oper.oper_name
     *
     * @param oper_name the value for b_admin_oper.oper_name
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    public void setOper_name(String oper_name) {
        this.oper_name = oper_name == null ? null : oper_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_admin_oper.comment
     *
     * @return the value of b_admin_oper.comment
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_admin_oper.comment
     *
     * @param comment the value for b_admin_oper.comment
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_admin_oper.create_time
     *
     * @return the value of b_admin_oper.create_time
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    public Date getCreate_time() {
        return create_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_admin_oper.create_time
     *
     * @param create_time the value for b_admin_oper.create_time
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_admin_oper.update_time
     *
     * @return the value of b_admin_oper.update_time
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    public Date getUpdate_time() {
        return update_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_admin_oper.update_time
     *
     * @param update_time the value for b_admin_oper.update_time
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_admin_oper.modifier
     *
     * @return the value of b_admin_oper.modifier
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    public Integer getModifier() {
        return modifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_admin_oper.modifier
     *
     * @param modifier the value for b_admin_oper.modifier
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    public void setModifier(Integer modifier) {
        this.modifier = modifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_admin_oper.del_flag
     *
     * @return the value of b_admin_oper.del_flag
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    public Byte getDel_flag() {
        return del_flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_admin_oper.del_flag
     *
     * @param del_flag the value for b_admin_oper.del_flag
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    public void setDel_flag(Byte del_flag) {
        this.del_flag = del_flag;
    }
}