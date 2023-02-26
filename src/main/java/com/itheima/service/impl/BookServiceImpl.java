package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.dao.impl.BookDaoImpl;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/*
------------------------注解开发---------------------------------------------------------------
 */

@Service

public class BookServiceImpl implements BookService {


@Autowired
@Qualifier("bookDao")

    private BookDao bookDao;


    public void save() {
    System.out.println("this is bookService" );
    bookDao.save();

}

}
