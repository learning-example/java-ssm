package com.aihu.dao;

import com.aihu.model.StaffInfo;

public interface StaffInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_staff_info
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_staff_info
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    int insert(StaffInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_staff_info
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    int insertSelective(StaffInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_staff_info
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    StaffInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_staff_info
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    int updateByPrimaryKeySelective(StaffInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_staff_info
     *
     * @mbggenerated Sun Jun 23 02:48:58 CST 2019
     */
    int updateByPrimaryKey(StaffInfo record);
}