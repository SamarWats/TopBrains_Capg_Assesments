package com.cg.bean;

public class Librarian {
    private int libId;
    private String name;
    private Book book;

    public Librarian() {}

    public int getLibrarianId() {
        return libId;
    }

    public void setLibrarianId(int librarianId) {
        this.libId = librarianId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void issueBook() {
        System.out.println("Librarian: " + name);
        System.out.println("Issued Book Details:");
        book.displayBookDetails();
    }
}