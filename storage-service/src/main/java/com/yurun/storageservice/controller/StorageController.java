package com.yurun.storageservice.controller;

import com.yurun.storageservice.service.StorageService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Xi Gao
 * @date 2020/9/2 17:16
 */
@RestController
public class StorageController {

    @Resource
    private StorageService storageService;

    @PostMapping("reduceStorageAmount")
    public boolean reduceStorageAmount(String goodCode,Integer num){
        try {
            return storageService.reduceStorageAmount(goodCode,num);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
