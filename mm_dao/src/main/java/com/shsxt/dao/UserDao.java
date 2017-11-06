package com.shsxt.dao;

/**
 * Created by homw on 2017/11/6.
 */
public class UserDao {
    public  void saveUser(String userName,String password){
        System.out.println("dao层保存用户记录:userName:"+userName+":password:"+password);
    }
}
