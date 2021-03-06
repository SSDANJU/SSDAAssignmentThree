package edu.nju.SSDAAssignmentThree.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {

    @Id
    private String bookId;

    private String bookName;

    private String bookType;

    public Book() {
    }

    public Book(String bookId, String bookName, String bookType) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookType = bookType;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }
}
