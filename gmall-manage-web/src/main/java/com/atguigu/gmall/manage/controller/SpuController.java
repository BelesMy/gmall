package com.atguigu.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.PmsProductInfo;
import com.atguigu.gmall.service.SpuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
@CrossOrigin
public class SpuController {
    @Reference
    SpuService spuService;
    @RequestMapping("/spuList")
    @ResponseBody
    public List<PmsProductInfo> spuList (String catalog3Id){
        List<PmsProductInfo> spuList = spuService.spuList(catalog3Id);
        return spuList;
    }
    @RequestMapping("/saveSpuInfo")
    @ResponseBody
    public List<PmsProductInfo> saveSpuInfo (@RequestBody PmsProductInfo pmsProductInfo ){

        return null;
    }

    @RequestMapping("fileUpload")
    @ResponseBody
    public String fileUpload(@RequestParam("file") MultipartFile multipartFile){
        return "https://img14.360buyimg.com/n0/jfs/t1/199270/22/8292/88751/61418b0cE7a752547/8584becc705d8e69.jpg";
    }
}
