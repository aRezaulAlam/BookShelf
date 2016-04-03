package com.agroho.service;/*
 * Created by rezaul on 2016-04-03.
 * Email:  arezaulalam@gmail.com
 */

import com.agroho.dao.BookDAO;
import com.agroho.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDAO bookDAO;

    @Override
    public List<Book> bookList() {
        return bookDAO.bookList();
    }

    @Override
    public void saveOrUpdate(Book book) {
            bookDAO.saveOrUpdate(book);
    }

    @Override
    public void delete(int bookId) {

    }

    @Override
    public Book getBook(int bookId) {
        return null;
    }
}
