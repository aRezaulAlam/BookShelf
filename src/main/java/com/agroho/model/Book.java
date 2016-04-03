package com.agroho.model;/*
 * Created by rezaul on 2016-04-02.
 * Email:  arezaulalam@gmail.com
 */

import javax.persistence.*;
import java.util.Date;

@Entity
public class Book {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookId;
    private String bookName;
    private String writer;
    private String publisher;
    private String type;
    private double price;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
