package com.agroho.dao;/*
 * Created by rezaul on 2016-04-02.
 * Email:  arezaulalam@gmail.com
 */

import com.agroho.model.Book;

import java.util.List;

public interface BookDAO {

    public List<Book> bookList();

    public void saveOrUpdate(Book book);

    public void delete(int bookId);

    public Book getBook(int bookId);


}
