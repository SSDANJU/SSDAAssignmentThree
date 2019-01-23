package edu.nju.SSDAAssignmentThree.service;

import edu.nju.SSDAAssignmentThree.model.Book;

public interface BookInfoService {

    boolean updateBookInfo(Book book);

    Book findBookInfo(String bookId);
}
