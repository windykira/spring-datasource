package com.aac.service;

import com.aac.entity.WebUserEntity;
import com.aac.utils.DataSource;

import java.util.List;

/**
 * Created by Administrator on 2018/4/10.
 */
public interface WebUserService{

    List<WebUserEntity> listUsers();

    int createWebUser(WebUserEntity webUserEntity);
}
