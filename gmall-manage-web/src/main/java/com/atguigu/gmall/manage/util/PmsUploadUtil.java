package com.atguigu.gmall.manage.util;

import org.csource.common.MyException;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public class PmsUploadUtil {
    public static String uploadImage(MultipartFile file) {
        String uploadImagePath = "";
        try {
            String filename = file.getOriginalFilename();
            String finallyname = filename.substring(filename.lastIndexOf(".") + 1);
            byte[] bytes = file.getBytes();
            // 配置fdfs的全局链接地址
            String tracker = PmsUploadUtil.class.getResource("/tracker.conf").getPath();// 获得配置文件的路径
            ClientGlobal.init(tracker);
            TrackerClient trackerClient = new TrackerClient();
            // 获得一个trackerServer的实例
            TrackerServer trackerServer = trackerClient.getTrackerServer();
            // 通过tracker获得一个Storage链接客户端
            StorageClient storageClient = new StorageClient(trackerServer, null);
            String[] uploadInfos = storageClient.upload_file(bytes, finallyname, null);
            String url = "http://192.168.149.128";
            for (String uploadInfo : uploadInfos) {
                url += "/" + uploadInfo;
            }
            uploadImagePath = url;
            System.out.println(url);
        } catch (Exception e) {
        }
        return uploadImagePath;
    }
}
