package com.agroho.controller;/*
 * Created by rezaul on 2016-04-02.
 * Email:  arezaulalam@gmail.com
 */

import com.agroho.dao.BookDAO;
import com.agroho.model.Book;
import com.agroho.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@SessionAttributes("book")
@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/")
    public ModelAndView home(){

        List<Book> books = bookService.bookList();
        ModelAndView model = new ModelAndView("index");
        model.addObject("booklist",books);

        return model;
    }


    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public  String newBook(Model model){

        Book book = new Book();

        model.addAttribute("book",book);
        return "addBook";
    }


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView saveBook(@ModelAttribute("book") Book book){
        bookService.saveOrUpdate(book);
        ModelAndView model = new ModelAndView("redirect:/");

        return model;
    }
}
