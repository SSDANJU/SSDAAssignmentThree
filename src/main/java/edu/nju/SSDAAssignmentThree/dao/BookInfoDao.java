package edu.nju.SSDAAssignmentThree.dao;

import edu.nju.SSDAAssignmentThree.model.Book;

public interface BookInfoDao {

    boolean addOneBook(Book book);

    boolean deleteOneBook(String bookId);

    boolean updateOneBook(Book book);

    boolean findOneBook(String bookId);
}
