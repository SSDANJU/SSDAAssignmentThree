package edu.nju.SSDAAssignmentThree.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Notification {

    @Id
    private String notificationId;

    private String userId;

    private String notificationType;

    private String content;

    public Notification() {
    }

    public Notification(String notificationId, String userId, String notificationType, String content) {
        this.notificationId = notificationId;
        this.userId = userId;
        this.notificationType = notificationType;
        this.content = content;
    }

    public String getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
