package com.aac.dao.webmessageboard;

import com.aac.entity.WebMessageBoardEntity;
import com.aac.utils.DataSource;

/**
 * Created by Administrator on 2018/4/12.
 */
public interface WebMessageBoardDao {

    @DataSource(value="slaveDataSource")
    int insert(WebMessageBoardEntity webMessageBoardEntity);
}
