package com.aac.entity;

import java.util.Date;

/**
 * Created by windy on 2017/11/6.
 */
public class WebUserEntity extends BaseEntity{

    private String loginName;
    private String passWord;
    private String userName;
    private String mobile;
    private String email;
    private String logo;

    private Date birthday;
    private String alt;

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public WebUserEntity(){

    }

    public WebUserEntity(String loginName, String passWord, String userName){
        this.loginName = loginName;
        this.passWord = passWord;
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
