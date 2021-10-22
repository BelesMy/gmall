package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.user.service.UserManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserManageController {
    @Autowired
    UserManageService userService;

    @RequestMapping("/index")
    @ResponseBody
    public String getIndex() {
        return "hello word";
    }

    @RequestMapping("/getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        return userService.getAllUser();
    }

    @RequestMapping("/getUmsMemberReceiveAddressByUmsMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getUmsMemberReceiveAddressByUmsMemberId(String menid){
        return userService.getUmsMemberReceiveAddressByUmsMemberId(menid);
    }
}
