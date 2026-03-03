package com.cg.jdbc_assignment.dao;

import java.util.List;
import com.cg.jdbc_assignment.bean.Book;

public interface IBookDao {

    String insertBook(Book book);

    List<String> getBooksByAuthorName(String firstName);

    String updateBookPriceByAuthor(String firstName, double newPrice);
}