package com.itheima.dao.impl;

import com.itheima.dao.BookDao;


/*
-------------------------CI注入---------------------------------------------------------------
 */
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("this is bookDao");
    }
}
























