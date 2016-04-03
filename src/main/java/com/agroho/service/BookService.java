package com.agroho.service;/*
 * Created by rezaul on 2016-04-03.
 * Email:  arezaulalam@gmail.com
 */

import com.agroho.model.Book;

import java.util.List;

public interface BookService {

    public List<Book> bookList();

    public void saveOrUpdate(Book book);

    public void delete(int bookId);

    public Book getBook(int bookId);
}
