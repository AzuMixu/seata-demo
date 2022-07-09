package com.yurun.accountservice.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * @author Xi Gao
 * @date 2020/9/2 16:34
 */
public interface AccountMapper {

    /**
     * 修改用户
     */
    int updateAccountMoney(@Param("userId") String userId,@Param("money") Integer money);


}
