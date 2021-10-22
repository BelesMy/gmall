package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserManageService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getUmsMemberReceiveAddressByUmsMemberId(String id);
}
