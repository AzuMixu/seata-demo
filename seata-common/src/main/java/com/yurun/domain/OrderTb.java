package com.yurun.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author Xi Gao
 * @date 2020/9/1 21:32
 */
@Data
public class OrderTb {
    @TableId(type = IdType.AUTO)
    private Long id;

    private String userId;

    private String commodityCode;

    private Integer count;

    private Integer money;

}
