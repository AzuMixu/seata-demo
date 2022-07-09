package com.yurun.fegin.factory;

import com.yurun.fegin.RemoteAccountService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author Xi Gao
 * @date 2020/9/2 17:10
 */
@Component
public class AccountFallBackFactory implements FallbackFactory<RemoteAccountService> {
    @Override
    public RemoteAccountService create(Throwable throwable) {
        return new RemoteAccountService() {
            @Override
            public boolean reducerAccountMoney(String userId, Integer money) {
                return false;
            }
        };
    }
}
