package com.jang.xunwu.service;

import lombok.Data;

import java.util.List;

/**
 * title ServiceMultiResult
 * projectName xunwu
 * desc 通用多结果Service返回结构
 *
 * @author Jang
 * @date 2020/1/4 14:16
 */
@Data
public class ServiceMultiResult<T> {

    private Long total;

    private List<T> result;

    public ServiceMultiResult(Long total, List<T> result) {
        this.total = total;
        this.result = result;
    }

    public int getResultSize() {
        if (this.result == null) {
            return 0;
        }
        return this.result.size();
    }

}
