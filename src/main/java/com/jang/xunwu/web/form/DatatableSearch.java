package com.jang.xunwu.web.form;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * title DatatableSearch
 * projectName xunwu
 * desc 搜索
 *
 * @author Jang
 * @date 2020/1/5 13:58
 */
@Data
public class DatatableSearch {

    /**
     * DataTables要求回显字段
     */
    private int draw;

    /**
     * DataTables规定分页字段
     */
    private int start;

    private int length;

    private Integer status;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createTimeMin;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createTimeMax;

    private String city;

    private String title;

    private String direction;

    private String orderBy;

}
