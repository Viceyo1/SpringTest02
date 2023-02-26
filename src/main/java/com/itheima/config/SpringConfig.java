package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

/*
------------------------注解开发---------------------------------------------------------------
 */



@Configuration
@ComponentScan("com.itheima")
@Import({JdbcConfig.class})
public class SpringConfig {


}
