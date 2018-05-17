package com.aac.service.impl;

import com.aac.dao.webuser.WebUserDao;
import com.aac.entity.WebMessageBoardEntity;
import com.aac.entity.WebUserEntity;
import com.aac.service.WebMessageBoardService;
import com.aac.service.WebUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/4/10.
 */
@Service
public class WebUserServiceImpl implements WebUserService {

    @Autowired
    WebUserDao webUserDao;
    @Autowired
    WebMessageBoardService webMessageBoardService;


    public List<WebUserEntity> listUsers() {
        //CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_MASTER);
        //return webUserDao.listUsers();
        return null;
    }

    public int createWebUser(WebUserEntity webUserEntity) {
        //CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_MASTER);
        int id = webUserDao.createWebUser(webUserEntity);

        WebMessageBoardEntity webMessageBoardEntity = new WebMessageBoardEntity();
        webMessageBoardEntity.setContent("这是留言板222");
        webMessageBoardEntity.setMessageUserID(2L);
        webMessageBoardEntity.setUserID(webUserEntity.getId());
        webMessageBoardEntity.setCreateDate(new Date());
        webMessageBoardEntity.setUpdateDate(new Date());
        webMessageBoardService.insert(webMessageBoardEntity);

        return id;
    }
}
