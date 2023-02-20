package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.dao.impl.BookDaoImpl;
import com.itheima.service.BookService;

public class BookServiceImpl implements BookService {
    BookDao bookDao;
    @Override
    public void save() {
        bookDao.save();
        System.out.println("this is bookService");
    }

    public void setBookDao(BookDaoImpl bookDao) {
        this.bookDao = bookDao;
    }
}
