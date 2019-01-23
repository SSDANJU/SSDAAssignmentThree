package edu.nju.SSDAAssignmentThree.service;

import edu.nju.SSDAAssignmentThree.model.Notification;
import edu.nju.SSDAAssignmentThree.model.User;

public interface UserInfoService {

    boolean updateUserInfo(User user);

    /**
     * 包括用户更新个人数据时的通知、用户借书记录和逾期通知等等
     * @param notification
     * @return
     */
    boolean generateNotification(Notification notification);

    User findUserInfo(String userId);
}
