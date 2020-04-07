package com.datasource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 2020/4/6.
 */
@RestController
public class MyDataSourceController {

    @Autowired
    JdbcTemplate db1JdbcTemplate;

    @Autowired
    JdbcTemplate db2JdbcTemplate;

    @GetMapping("/myspringboot/db1Insert")
    public void db1Insert(){
        String sql = "insert into user_info (name, age) values ('zy1', '18')";
        db1JdbcTemplate.execute(sql);
    }

    @GetMapping("/myspringboot/db2Insert")
    public void db2Insert(){
        String sql = "insert into user_info (name, age) values ('zy2', '18')";
        db2JdbcTemplate.execute(sql);
    }
}
