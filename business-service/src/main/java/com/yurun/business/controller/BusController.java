package com.yurun.business.controller;

import com.yurun.domain.OrderTb;
import com.yurun.fegin.RemoteAccountService;
import com.yurun.fegin.RemoteOrderService;
import com.yurun.fegin.RemoteStorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Xi Gao
 * @date 2020/9/2 17:45
 */
@Slf4j
@RestController
public class BusController {
    private final static Integer PRICE = 10;

    @Resource
    private RemoteAccountService accountService;
    @Resource
    private RemoteOrderService orderService;
    @Resource
    private RemoteStorageService storageService;

    @GlobalTransactional
    @PostMapping("buyGoods")
    public String buyGood(String goodCode, Integer num, String userId) {
            //生成订单
            OrderTb order = new OrderTb();
            order.setCommodityCode(goodCode);
            order.setCount(num);
            order.setMoney(num * PRICE);
            order.setUserId(userId);
            boolean r1 = orderService.generateOrder(order);
            //减账号余额
            boolean r2 = accountService.reducerAccountMoney(userId, order.getMoney());
            //减库存
            boolean r3 = storageService.reduceStorageAmount(goodCode, num);
            log.info("下单结果：{}，减账号余额结果{}，减库存结果{}",r1,r2,r3);
       /*     if (r1 && r2 && r3) {
                return "success";
            } else {
                throw new RuntimeException();
            }*/
            throw new RuntimeException();
    }
}
