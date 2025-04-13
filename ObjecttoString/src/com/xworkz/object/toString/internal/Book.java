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
    @Override
    public int hashCode() {
        return 88;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Book){
                Book book=this;
                Book book2=(Book) obj;
                if (book.title.equals(book2.title)){
                    return true;
                }
            }
        }
        return false;
    }
}

