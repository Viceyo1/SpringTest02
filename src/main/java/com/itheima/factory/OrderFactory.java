package com.itheima.factory;

import com.itheima.dao.OrderDao;
import com.itheima.dao.impl.OrderDaoImpl;


/*
-------------------------静态工厂---------------------------------------------------------------
 */


public class OrderFactory {

    public  static  OrderDao getOrderDao(){
        System.out.println("orderDaoFactory start ....................");

        return new OrderDaoImpl();

    }


}
