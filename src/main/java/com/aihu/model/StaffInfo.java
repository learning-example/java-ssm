package com.aihu.model;

import java.util.Date;

public class StaffInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_staff_info.id
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_staff_info.fullname
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    private String fullname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_staff_info.gender
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    private Byte gender;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_staff_info.country
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    private String country;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_staff_info.province
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    private String province;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_staff_info.city
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    private String city;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_staff_info.phone
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_staff_info.create_time
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    private Date create_time;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_staff_info.update_time
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    private Date update_time;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_staff_info.modifier
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    private Integer modifier;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_staff_info.del_flag
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    private Byte del_flag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_staff_info.id
     *
     * @return the value of b_staff_info.id
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_staff_info.id
     *
     * @param id the value for b_staff_info.id
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_staff_info.fullname
     *
     * @return the value of b_staff_info.fullname
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    public String getFullname() {
        return fullname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_staff_info.fullname
     *
     * @param fullname the value for b_staff_info.fullname
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    public void setFullname(String fullname) {
        this.fullname = fullname == null ? null : fullname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_staff_info.gender
     *
     * @return the value of b_staff_info.gender
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    public Byte getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_staff_info.gender
     *
     * @param gender the value for b_staff_info.gender
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    public void setGender(Byte gender) {
        this.gender = gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_staff_info.country
     *
     * @return the value of b_staff_info.country
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    public String getCountry() {
        return country;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_staff_info.country
     *
     * @param country the value for b_staff_info.country
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_staff_info.province
     *
     * @return the value of b_staff_info.province
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_staff_info.province
     *
     * @param province the value for b_staff_info.province
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_staff_info.city
     *
     * @return the value of b_staff_info.city
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_staff_info.city
     *
     * @param city the value for b_staff_info.city
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_staff_info.phone
     *
     * @return the value of b_staff_info.phone
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_staff_info.phone
     *
     * @param phone the value for b_staff_info.phone
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_staff_info.create_time
     *
     * @return the value of b_staff_info.create_time
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    public Date getCreate_time() {
        return create_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_staff_info.create_time
     *
     * @param create_time the value for b_staff_info.create_time
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_staff_info.update_time
     *
     * @return the value of b_staff_info.update_time
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    public Date getUpdate_time() {
        return update_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_staff_info.update_time
     *
     * @param update_time the value for b_staff_info.update_time
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_staff_info.modifier
     *
     * @return the value of b_staff_info.modifier
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    public Integer getModifier() {
        return modifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_staff_info.modifier
     *
     * @param modifier the value for b_staff_info.modifier
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    public void setModifier(Integer modifier) {
        this.modifier = modifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_staff_info.del_flag
     *
     * @return the value of b_staff_info.del_flag
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    public Byte getDel_flag() {
        return del_flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_staff_info.del_flag
     *
     * @param del_flag the value for b_staff_info.del_flag
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    public void setDel_flag(Byte del_flag) {
        this.del_flag = del_flag;
    }
}