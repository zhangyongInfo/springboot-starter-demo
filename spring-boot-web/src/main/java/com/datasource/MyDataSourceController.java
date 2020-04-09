package com.datasource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 2020/4/6.
 */
@RestController
public class MyDataSourceController {

    @Autowired
    JdbcTemplate db1JdbcTemplate;

    @Autowired
    JdbcTemplate db2JdbcTemplate;

    //事务管理器
    @Autowired
    PlatformTransactionManager platformTransactionManager;

    @GetMapping("/myspringboot/db1Insert")
    public void db1Insert(){
        String sql = "insert into user_info (name, age) values ('zy1', '18')";
        db1JdbcTemplate.execute(sql);
    }

    //增加事务
    @GetMapping("/myspringboot/db2Insert")
    public void db2Insert(){
        //事务的定义, 事务的一些基础信息，如超时时间、隔离级别、传播属性等
        TransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
        //事务的一些状态信息，如是否一个新的事务、是否已被标记为回滚
        TransactionStatus transactionStatus = platformTransactionManager.getTransaction(transactionDefinition);
        String sql = "insert into user_info (name, age) values (?, ?)";
        db2JdbcTemplate.execute(sql, new PreparedStatementCallback<Boolean>() {
            @Override
            public Boolean doInPreparedStatement(PreparedStatement preparedStatement) throws SQLException, DataAccessException {
                preparedStatement.setString(1, "ZY2");
                preparedStatement.setInt(2, 19);
                return preparedStatement.executeUpdate() > 0;
            }
        });
        //提交事务
//        platformTransactionManager.commit(transactionStatus);
        //TODO 回滚事务 没起作用
        platformTransactionManager.rollback(transactionStatus);

    }
}
