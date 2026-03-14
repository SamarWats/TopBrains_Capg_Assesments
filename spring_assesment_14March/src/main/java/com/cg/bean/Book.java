package com.cg.bean;

public class Book {

    private int bookId;
    private String title;
    private String author;

    public Book() {}

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayBookDetails() {
        System.out.println("Book Id: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}