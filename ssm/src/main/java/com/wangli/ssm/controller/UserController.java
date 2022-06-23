//package com.wangli.ssm.controller;
//
//import com.wangli.ssm.po.User;
//import com.wangli.ssm.service.UserService;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import javax.annotation.Resource;
//
///**
// * @description:
// * @author: wl
// * @create: 2022/6/23
// **/
//@Controller
//public class UserController {
//
//    @Resource
//    private UserService userService;
//
//    @RequestMapping("query")
//    @ResponseBody
//    public User queryUser(Integer userId){
//        return userService.queryUser(userId);
//    }
//}
