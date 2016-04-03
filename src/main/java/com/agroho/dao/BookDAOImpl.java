package com.agroho.dao;/*
 * Created by rezaul on 2016-04-02.
 * Email:  arezaulalam@gmail.com
 */

import com.agroho.model.Book;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class BookDAOImpl implements BookDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public BookDAOImpl(SessionFactory sessionFactory) {

        this.sessionFactory = sessionFactory;
    }

    public BookDAOImpl(){

    }

    @Override
    @Transactional
    public List<Book> bookList() {

        String hql = "from Book";

        Query query = sessionFactory.getCurrentSession().createQuery(hql);

        List<Book> books = (List<Book>)query.list();
        return books;
    }

    @Override
    @Transactional
    public void saveOrUpdate(Book book) {

        sessionFactory.getCurrentSession().saveOrUpdate(book);
    }

    public void delete(int bookId) {

    }

    public Book getBook(int bookId) {
        return null;
    }
}
