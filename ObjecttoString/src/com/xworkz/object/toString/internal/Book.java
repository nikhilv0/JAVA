package com.xworkz.object.toString.internal;

public class Book {
    private String title, author;
    private int pages;
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    @Override
    public String toString() {
        return "Book {Title: " + this.title + ", Author: " + this.author + ", Pages: " + this.pages + "}";
    }
}

