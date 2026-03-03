package com.cg.jdbc_assignment.service;
import com.cg.jdbc_assignment.bean.Author;

import java.util.List;

public interface IAuthorService {

    String addAuthor(Author author);

    Author findAuthor(int id);

    String updatePhone(int id, String phone);

    String removeAuthor(int id);

    List<Author> getAllAuthors();
}