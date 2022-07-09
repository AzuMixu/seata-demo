package com.yurun.storageservice.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * @author Xi Gao
 * @date 2020/9/2 17:19
 */
public interface StorageMapper {
    /**
     * 减库存
     * @param goodCode
     * @return
     */
    int updateAmountByGoodCode(@Param("goodCode") String goodCode, @Param("num") Integer num);
}
