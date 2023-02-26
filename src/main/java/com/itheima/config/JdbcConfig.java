package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.itheima.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class JdbcConfig {
    @Value("com.mysql.jdbc.Drive")
    private String drive;
    @Value("jdbc:mysql://localhost:3306/spring_db")
    private String url;
    @Value("root")
    private String userName;
    @Value("1234")
    private String password;


    @Bean("dataSource")
    public DataSource dataSource(BookDao bookDao){
        DruidDataSource ds = new DruidDataSource();
        System.out.println(bookDao);
        ds.setDriverClassName(drive);
        ds.setUrl(url);
        ds.setUsername(userName);
        ds.setPassword(password);
        return ds;
    }
}
