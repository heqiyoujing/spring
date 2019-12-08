package com.example.demo.springJdbcTemplate;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author: yiqq
 * @date: 2018/8/15
 * @description:
 */
public class JDBC {
    public static void main(String[] args) {
        //1 创建数据源（连接池） dbcp
        BasicDataSource dataSource = new BasicDataSource();
        // * 基本4项
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        //2  创建模板
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        //3 通过api操作
        jdbcTemplate.update("insert into user(id,age,name) values(?,?,?);", "24","25","热巴");
    }
}
