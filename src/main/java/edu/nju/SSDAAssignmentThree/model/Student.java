package edu.nju.SSDAAssignmentThree.model;

import edu.nju.SSDAAssignmentThree.service.BorrowStrategy;

public class Student extends User {

    private BorrowStrategy borrowStrategy;

    public Student() {
    }

    public Student(String userId, String userName, String userPassword) {
        super(userId, userName, userPassword);
    }

    public BorrowStrategy getBorrowStrategy() {
        return borrowStrategy;
    }

    public void setBorrowStrategy(BorrowStrategy borrowStrategy) {
        this.borrowStrategy = borrowStrategy;
    }

    public void borrowBook(String book){
        borrowStrategy.borrowBook(book);
    }
}
