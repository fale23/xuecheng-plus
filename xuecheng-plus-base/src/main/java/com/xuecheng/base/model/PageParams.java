package com.xuecheng.base.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageParams {
    //默认页码
    private Long pageNO=1L;
    //默认查询条数
    private Long pageSize=10L;
}
