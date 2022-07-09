package com.yurun.accountservice.service;

        import com.yurun.accountservice.mapper.AccountMapper;
        import org.springframework.stereotype.Service;

        import javax.annotation.Resource;

/**
 * @author Xi Gao
 * @date 2020/9/2 16:50
 */
@Service
public class AccountService {

    @Resource
    private AccountMapper accountMapper;

    public boolean reducerAccountMoney(String userId, Integer money) {
        return accountMapper.updateAccountMoney(userId, money) > 0;
    }
}
