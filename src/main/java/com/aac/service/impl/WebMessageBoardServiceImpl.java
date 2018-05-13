package com.aac.service.impl;

import com.aac.dao.webmessageboard.WebMessageBoardDao;
import com.aac.entity.WebMessageBoardEntity;
import com.aac.service.WebMessageBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/4/12.
 */
@Service
public class WebMessageBoardServiceImpl implements WebMessageBoardService {

    @Autowired
    WebMessageBoardDao webMessageBoardDao;

    public int insert(WebMessageBoardEntity webMessageBoardEntity) {
        //CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_SLAVE);
        int id = 0;
        id = webMessageBoardDao.insert(webMessageBoardEntity);
        int i = 9 / 0;
        return id;
    }
}
