package com.kunlun.erp.core.mapper.test;

import com.kunlun.erp.core.entity.test.User;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Sun Nov 10 23:29:29 CST 2019
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Sun Nov 10 23:29:29 CST 2019
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Sun Nov 10 23:29:29 CST 2019
     */
    User selectByPrimaryKey(Integer id);
}