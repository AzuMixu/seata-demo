package com.yurun.fegin;

import com.yurun.fegin.factory.AccountFallBackFactory;
import com.yurun.fegin.factory.StorageFallBackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Xi Gao
 * @date 2020/9/2 17:26
 */
@FeignClient(name = "storage-service", fallbackFactory = StorageFallBackFactory.class)
public interface RemoteStorageService {

    @PostMapping("reduceStorageAmount")
    boolean reduceStorageAmount(@RequestParam String goodCode,@RequestParam Integer num);
}
