package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.dao.impl.BookDaoImpl;
import com.itheima.service.BookService;

public class BookServiceImpl implements BookService {


    private BookDao bookDao;
public void save() {
    System.out.println("this is bookService");
    bookDao.save();

}
public void setBookDao(BookDao bookDao){
    this.bookDao = bookDao;
}

}
