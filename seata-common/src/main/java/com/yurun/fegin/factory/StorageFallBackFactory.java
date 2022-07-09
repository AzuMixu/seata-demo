package com.yurun.fegin.factory;

import com.yurun.fegin.RemoteStorageService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author Xi Gao
 * @date 2020/9/2 17:26
 */
@Component
public class StorageFallBackFactory implements FallbackFactory<RemoteStorageService> {
    @Override
    public RemoteStorageService create(Throwable throwable) {
        return new RemoteStorageService() {

            @Override
            public boolean reduceStorageAmount(String goodCode, Integer num) {
                return false;
            }
        };
    }
}
