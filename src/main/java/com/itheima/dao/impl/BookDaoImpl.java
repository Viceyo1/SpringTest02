package com.itheima.dao.impl;

import com.itheima.dao.BookDao;


/*
-------------------------构造器注入---------------------------------------------------------------
 */
public class BookDaoImpl implements BookDao {
    private String hah;

    public void setHah(String hah) {
        this.hah = hah;
    }

    public void save() {
        System.out.println("this is bookDao......." + hah);
    }

}
























