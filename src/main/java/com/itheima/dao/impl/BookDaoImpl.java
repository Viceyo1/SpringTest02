package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


/*
------------------------注解开发---------------------------------------------------------------
 */


@Repository("bookDao")
@Scope("singleton")
public class BookDaoImpl implements BookDao {

    @Value("${name}")
    private String name;


    public void save() {
        System.out.println("this is bookDao......." + name);
    }


@PostConstruct
    public void init() {
        System.out.println("this is init......." );
    }

@PreDestroy
    public void destroy() {
        System.out.println("this is destroy......." );
    }

}
























