package edu.nju.SSDAAssignmentThree.model;

import edu.nju.SSDAAssignmentThree.service.BorrowStrategy;

public class GraduateStudent extends User {

    private BorrowStrategy borrowStrategy;

    public BorrowStrategy getBorrowStrategy() {
        return borrowStrategy;
    }

    public void setBorrowStrategy(BorrowStrategy borrowStrategy) {
        this.borrowStrategy = borrowStrategy;
    }

    public GraduateStudent(BorrowStrategy borrowStrategy) {
        this.borrowStrategy = borrowStrategy;
    }

    public GraduateStudent(String userId, String userName, String userPassword, BorrowStrategy borrowStrategy) {
        super(userId, userName, userPassword);
        this.borrowStrategy = borrowStrategy;
    }

    public void borrowBook(String book){
        borrowStrategy.borrowBook(book);
    }
}
