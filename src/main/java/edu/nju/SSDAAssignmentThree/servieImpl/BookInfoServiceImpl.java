package edu.nju.SSDAAssignmentThree.servieImpl;

import edu.nju.SSDAAssignmentThree.dao.BookInfoDao;
import edu.nju.SSDAAssignmentThree.model.Book;
import edu.nju.SSDAAssignmentThree.service.BookInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookInfoServiceImpl implements BookInfoService {

    @Autowired
    BookInfoDao bookInfoDao;

    @Override
    public boolean updateBookInfo(Book book) {
        return false;
    }

    @Override
    public Book findBookInfo(String bookId) {
        return null;
    }
}
