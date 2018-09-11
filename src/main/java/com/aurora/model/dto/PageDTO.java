package com.aurora.model.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class PageDTO<T> {

    private final Integer pageSize = 2;  //每页显示记录数
    private Integer totalRecord ;        //总记录数
    private Integer totalPages;          //总页数
    private Integer currentPageCode;     //当前页码
    private Integer startRecord;         //从第几条记录开始显示
    private Integer endRecord;           // 到第几条记录结束显示 mysql不使用
    private List<T> modelList;           //当前页显示记录对象集合
}
