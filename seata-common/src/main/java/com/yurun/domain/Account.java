package com.yurun.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author Xi Gao
 * @date 2020/9/1 21:33
 */
@Data
public class Account {
    @TableId(type=IdType.AUTO)
    private Long id;
    private String userId;
    private Integer money;
}
