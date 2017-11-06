package com.shsxt.service;

import com.shsxt.dao.UserDao;

/**
 * Created by homw on 2017/11/6.
 */
public class UserService {
    private UserDao userDao=new UserDao();

    public  void saveUser(String userName,String password){
        userDao.saveUser(userName,password);
        System.out.println("service 层保存用户记录:userName:"+userName+":password:"+password);
    }
}
