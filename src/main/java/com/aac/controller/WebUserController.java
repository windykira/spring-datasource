package com.aac.controller;

import com.aac.entity.WebMessageBoardEntity;
import com.aac.entity.WebUserEntity;
import com.aac.service.WebMessageBoardService;
import com.aac.service.WebUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/4/10.
 */
@Controller
@RequestMapping("/webUser")
public class WebUserController {

    @Autowired
    WebUserService webUserService;
    @Autowired
    WebMessageBoardService webMessageBoardService;

    @ResponseBody
    @RequestMapping("/create")
    public long create() {

        WebUserEntity webUserEntity = new WebUserEntity();
        webUserEntity.setLoginName("test111");
        webUserEntity.setPassWord("123456");
        webUserEntity.setEmail("xxx@163.com");
        webUserEntity.setAlt("altalt");
        webUserEntity.setLogo("josfs2222bbbc");
        webUserEntity.setMobile("18015052006");
        webUserEntity.setUserName("测试");
        webUserEntity.setCreateDate(new Date());
        webUserEntity.setUpdateDate(new Date());
        webUserEntity.setBirthday(new Date());
        webUserService.createWebUser(webUserEntity);

        return webUserEntity.getId();
    }

    @ResponseBody
    @RequestMapping("/list")
    public List<WebUserEntity> show() throws IOException {

        return webUserService.listUsers();
        //ModelAndView mav = new ModelAndView();
        /*WebUserEntity webUserEntity = new WebUserEntity();
        webUserEntity.setLoginName("test111");
        webUserEntity.setPassWord("123456");
        webUserEntity.setEmail("xxx@163.com");
        webUserEntity.setLogo("josfs2222bbbc");
        webUserEntity.setMobile("18015052006");
        webUserEntity.setUserName("测试");
        webUserEntity.setCreateDate(new Date());
        webUserEntity.setUpdateDate(new Date());
        webUserService.createWebUser(webUserEntity);*/
        //mav.setViewName("show");
        //HttpSession session = request.getSession();
        //session.setAttribute("name", customer.getName());
        //return mav;
    }

    @RequestMapping(value="/getXML")
    @ResponseBody
    public String getXML(HttpServletRequest request){
        //String path = request.getServletContext().getRealPath("");
        //System.out.println(path);
        Reader reader = null;
        InputStreamReader isr = null;
        BufferedReader bufferedReader = null;
        StringBuilder sb = new StringBuilder();
        try {

//        	reader = new FileReader(path+"\\xml\\1.xml");
            //reader = new FileReader("E:\\Workspace\\spring\\xml\\1.xml");
            isr = new InputStreamReader(new FileInputStream("D:\\1.xml"),"UTF-8");
            int len;
            char[] buf = new char[1024];

            while ((len=isr.read(buf))!=-1){
                System.out.println(buf);
                sb.append(buf);
                buf=new char[1024];
            }
//    	bufferedReader = new BufferedReader(reader);
//    	String result = null;
//
//			while (  (result = bufferedReader.readLine() ) != null ){
//				sb.append(result);
//			 }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Map m = new HashMap();
        m.put("xml", sb.toString());
        return  sb.toString();
    }
}
