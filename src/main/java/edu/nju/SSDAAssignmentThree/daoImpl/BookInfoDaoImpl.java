package edu.nju.SSDAAssignmentThree.daoImpl;

import edu.nju.SSDAAssignmentThree.dao.BookInfoDao;
import edu.nju.SSDAAssignmentThree.model.Book;
import org.springframework.stereotype.Repository;


@Repository
public class BookInfoDaoImpl implements BookInfoDao {

    @Override
    public boolean addOneBook(Book book) {
        return false;
    }

    @Override
    public boolean deleteOneBook(String bookId) {
        return false;
    }

    @Override
    public boolean updateOneBook(Book book) {
        return false;
    }

    @Override
    public boolean findOneBook(String bookId) {
        return false;
    }
}
