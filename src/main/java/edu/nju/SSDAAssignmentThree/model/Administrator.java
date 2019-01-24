package edu.nju.SSDAAssignmentThree.model;

public class Administrator extends User {

    public Administrator() {
    }

    public Administrator(String userId, String userName, String userPassword) {
        super(userId, userName, userPassword);
    }

    public boolean getNotification(Notification notification){
        return true;
    }
}
