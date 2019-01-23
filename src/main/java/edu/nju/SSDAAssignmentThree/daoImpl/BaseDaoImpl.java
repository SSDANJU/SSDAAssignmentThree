package edu.nju.SSDAAssignmentThree.daoImpl;

import edu.nju.SSDAAssignmentThree.dao.BaseDao;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;


@Repository
public class BaseDaoImpl implements BaseDao {
    @Override
    public Session getSession() {
        return null;
    }
}
