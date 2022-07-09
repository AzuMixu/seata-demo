package com.yurun.accountservice.controller;

import com.yurun.accountservice.service.AccountService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Xi Gao
 * @date 2020/9/2 16:44
 */
@RestController
public class AccountController {

    @Resource
    private AccountService accountService;

    @PostMapping("reducerAccountMoney")
    public boolean reducerAccountMoney(String userId,Integer money){
        try {
            return accountService.reducerAccountMoney(userId,money);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

}
