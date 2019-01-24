package edu.nju.SSDAAssignmentThree.factory;

import edu.nju.SSDAAssignmentThree.model.User;
import edu.nju.SSDAAssignmentThree.service.UserFactory;

public class UserFactoryImpl implements UserFactory {
    @Override
    public User createUser(String position) {
        User user = new User();
        //TODO
        return user;
    }
}
