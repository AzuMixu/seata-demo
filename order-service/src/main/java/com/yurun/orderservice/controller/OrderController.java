package com.yurun.orderservice.controller;

import com.yurun.domain.OrderTb;
import com.yurun.orderservice.service.OrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Xi Gao
 * @date 2020/9/1 21:54
 */
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;


    @PostMapping("generateOrder")
    public boolean generateOrder(@RequestBody OrderTb order) {
      try {
          return orderService.save(order);
      }catch (Exception e){
          e.printStackTrace();
          return false;
      }
    }










}
