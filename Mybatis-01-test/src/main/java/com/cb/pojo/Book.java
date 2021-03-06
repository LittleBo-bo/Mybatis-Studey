package com.cb.pojo;

import java.util.Date;

public class Book {
    private String bookname;
    private String author;
    private Date publicationdate;
    private int price;

    public Book() {
    }

    public Book(String bookname, String author, Date publicationdate, int price) {

        this.bookname = bookname;
        this.author = author;
        this.publicationdate = publicationdate;
        this.price = price;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPublicationdate() {
        return publicationdate;
    }

    public void setPublicationdate(Date publicationdate) {
        this.publicationdate = publicationdate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookname='" + bookname + '\'' +
                ", author='" + author + '\'' +
                ", publicationdate=" + publicationdate +
                ", price=" + price +
                '}';
    }
}
