package com.shsxt.controller;

import com.shsxt.service.UserService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by homw on 2017/11/6.
 */
@WebServlet(urlPatterns = "/user")
public class UserController extends HttpServlet {
    private UserService userService=new UserService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String userName=request.getParameter("userName");
        String password=request.getParameter("password");
        userService.saveUser(userName,password);
        System.out.println("web 层保存用户记录:userName:"+userName+":password:"+password);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request,response);
    }
}
