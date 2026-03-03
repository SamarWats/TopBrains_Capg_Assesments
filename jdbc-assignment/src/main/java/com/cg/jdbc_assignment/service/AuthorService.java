package com.cg.jdbc_assignment.service;

import java.util.List;

import com.cg.jdbc_assignment.bean.Author;
import com.cg.jdbc_assignment.dao.AuthorDao;
import com.cg.jdbc_assignment.dao.IAuthorDao;

public class AuthorService implements IAuthorService {

    IAuthorDao dao = new AuthorDao();

    @Override
    public String addAuthor(Author author) {

        if (author.getFirstName() == null || author.getFirstName().length() < 3)
            return "Invalid Author Name";

        return dao.insertAuthor(author);
    }

    @Override
    public Author findAuthor(int id) {
        return dao.getAuthorById(id);
    }

    @Override
    public String updatePhone(int id, String phone) {
        return dao.updateAuthorPhone(id, phone);
    }

    @Override
    public String removeAuthor(int id) {
        return dao.deleteAuthor(id);
    }

    @Override
    public List<Author> getAllAuthors() {
        return dao.getAllAuthors();
    }
}