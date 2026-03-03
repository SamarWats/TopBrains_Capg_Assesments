package com.cg.jdbc_assignment.dao;

import java.util.List;
import com.cg.jdbc_assignment.bean.Author;

public interface IAuthorDao {

    String insertAuthor(Author author);

    Author getAuthorById(int authorId);

    String updateAuthorPhone(int authorId, String newPhone);

    String deleteAuthor(int authorId);

    List<Author> getAllAuthors();
}