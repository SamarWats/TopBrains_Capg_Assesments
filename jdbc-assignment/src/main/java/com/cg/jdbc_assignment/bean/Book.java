package com.cg.jdbc_assignment.bean;

public class Book {

    private int isbn;
    private String title;
    private double price;
    private int authorId;

    public Book() {}

    public Book(String title, double price, int authorId) {
        this.title = title;
        this.price = price;
        this.authorId = authorId;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    @Override
    public String toString() {
        return "Book [isbn=" + isbn +
                ", title=" + title +
                ", price=" + price +
                ", authorId=" + authorId + "]";
    }
}