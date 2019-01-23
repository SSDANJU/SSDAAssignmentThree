package edu.nju.SSDAAssignmentThree.dao;

import edu.nju.SSDAAssignmentThree.model.User;

public interface UserInfoDao {

    boolean addOneUser(User user);

    boolean deleteOneUser(String userId);

    boolean updateOneUser(User user);

    boolean findOneUser(String userId);
}
