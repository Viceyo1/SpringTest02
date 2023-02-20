package com.itheima.dao.impl;

import com.itheima.dao.OrderDao;

/*
-------------------------静态工厂---------------------------------------------------------------
 */



public class OrderDaoImpl implements OrderDao {
    @Override
    public void save() {
        System.out.println("this is orderDao");
    }
}
