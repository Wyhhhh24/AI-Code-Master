package com.air.aicodemaster.common;

import lombok.Data;

/**
 * 分页请求包؜装类，提供给分页请求时的 DTO 进行继承用的
 * 包括当前页号、页面大小、排序字‌段、排序顺序参数
 */
@Data
public class PageRequest {
    /**
     * 当前页号
     */
    private int pageNum = 1;

    /**
     * 页面大小
     */
    private int pageSize = 10;

    /**
     * 排序字段
     */
    private String sortField;

    /**
     * 排序顺序（默认降序）
     */
    private String sortOrder = "descend";
}
