package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/*
------------------------注解开发---------------------------------------------------------------
 */



@Configuration
@ComponentScan({"com.itheima"})
@PropertySource("jdbc.properties")
public class SpringConfig {
}
