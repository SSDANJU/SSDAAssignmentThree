package edu.nju.SSDAAssignmentThree.servieImpl;

import edu.nju.SSDAAssignmentThree.dao.UserInfoDao;
import edu.nju.SSDAAssignmentThree.model.Notification;
import edu.nju.SSDAAssignmentThree.model.User;
import edu.nju.SSDAAssignmentThree.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoDao userInfoDao;

    @Override
    public boolean updateUserInfo(User user) {
        return false;
    }

    @Override
    public boolean generateNotification(Notification notification) {
        return false;
    }

    @Override
    public User findUserInfo(String userId) {
        return null;
    }
}
