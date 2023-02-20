package com.itheima.factory;


import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.cglib.proxy.Factory;



/*
-------------------------实例工厂---------------------------------------------------------------
 */


public class UserFactory  implements FactoryBean<UserDao>{


    @Override
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }
}