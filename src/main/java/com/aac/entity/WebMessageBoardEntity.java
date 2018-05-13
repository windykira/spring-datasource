package com.aac.entity;

import java.util.Date;

public class WebMessageBoardEntity extends BaseEntity{

    private Long userID;

    private Long messageUserID;

    private String content;

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public Long getMessageUserID() {
        return messageUserID;
    }

    public void setMessageUserID(Long messageUserID) {
        this.messageUserID = messageUserID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}