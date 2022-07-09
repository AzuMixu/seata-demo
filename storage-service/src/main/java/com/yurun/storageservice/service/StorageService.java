package com.yurun.storageservice.service;

import com.yurun.storageservice.mapper.StorageMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Xi Gao
 * @date 2020/9/2 17:17
 */
@Service
public class StorageService {

    @Resource
    private StorageMapper storageMapper;


    public boolean reduceStorageAmount(String goodCode,Integer num) {
        return storageMapper.updateAmountByGoodCode(goodCode,num) > 0;
    }
}
