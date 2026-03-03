package com.cg.jdbc_assignment.service;

import java.util.List;
import com.cg.jdbc_assignment.bean.Book;

public interface IBookService {

    String addBook(Book book);

    List<String> getBooksByAuthor(String firstName);

    String updateBookPrice(String firstName, double newPrice);
}