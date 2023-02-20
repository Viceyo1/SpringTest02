package com.itheima.dao.impl;



/*
-------------------------静态工厂---------------------------------------------------------------
 */


import com.itheima.dao.UserDao;

public class UserDaoImpl implements UserDao {

    @Override
    public void save() {
        System.out.println("this is orderDao");
    }
}
