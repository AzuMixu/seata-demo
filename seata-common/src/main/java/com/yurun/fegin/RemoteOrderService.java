package com.yurun.fegin;


import com.yurun.domain.OrderTb;
import com.yurun.fegin.factory.OrderFallBackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author Xi Gao
 * @date 2020/9/2 17:34
 */
@FeignClient(name = "order-service", fallbackFactory = OrderFallBackFactory.class)
public interface RemoteOrderService {

    @PostMapping("generateOrder")
    boolean generateOrder(@RequestBody OrderTb order);

}
