package com.cg.jdbc_assignment.service;

import java.util.List;

import com.cg.jdbc_assignment.bean.Book;
import com.cg.jdbc_assignment.dao.BookDao;
import com.cg.jdbc_assignment.dao.IBookDao;

public class BookService implements IBookService {

    IBookDao dao = new BookDao();

    @Override
    public String addBook(Book book) {
        return dao.insertBook(book);
    }

    @Override
    public List<String> getBooksByAuthor(String firstName) {
        return dao.getBooksByAuthorName(firstName);
    }

    @Override
    public String updateBookPrice(String firstName, double newPrice) {
        return dao.updateBookPriceByAuthor(firstName, newPrice);
    }
}