package com.yurun.fegin;

import com.yurun.fegin.factory.AccountFallBackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Xi Gao
 * @date 2020/9/2 17:07
 */
@FeignClient(name = "account-service", fallbackFactory = AccountFallBackFactory.class)
public interface RemoteAccountService {
    @PostMapping("reducerAccountMoney")
    boolean reducerAccountMoney(@RequestParam String userId, @RequestParam Integer money);
}
