package com.aac.dao.webuser;

import com.aac.entity.WebUserEntity;
import com.aac.utils.DataSource;

import java.util.List;

/**
 * Created by Administrator on 2018/4/10.
 */
public interface WebUserDao {

    List<WebUserEntity> listUsers();

    @DataSource(value="masterDataSource")
    int createWebUser(WebUserEntity webUserEntity);
}
