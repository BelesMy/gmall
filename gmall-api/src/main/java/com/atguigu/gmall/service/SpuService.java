package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.PmsProductInfo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface SpuService  {
    List<PmsProductInfo> spuList(String catalog3Id);
}
