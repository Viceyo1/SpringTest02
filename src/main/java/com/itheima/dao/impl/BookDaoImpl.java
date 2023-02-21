package com.itheima.dao.impl;

import com.itheima.dao.BookDao;


/*
-------------------------简单类型的Setter注入---------------------------------------------------------------
 */
public class BookDaoImpl implements BookDao {

    private int connectionNum;
    private String databaseName;
    public void save() {
        System.out.println("this is bookDao......." + connectionNum + ","+ databaseName);
    }

    public void setConnectionNum(int connectionNum) {
        this.connectionNum = connectionNum;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }
}
























