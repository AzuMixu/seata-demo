package com.yurun.fegin.factory;

import com.yurun.domain.OrderTb;
import com.yurun.fegin.RemoteOrderService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author Xi Gao
 * @date 2020/9/2 17:35
 */
@Component
public class OrderFallBackFactory implements FallbackFactory<RemoteOrderService> {
    @Override
    public RemoteOrderService create(Throwable throwable) {
        return new RemoteOrderService() {
            @Override
            public boolean generateOrder(OrderTb order) {
                return false;
            }
        };
    }
}
