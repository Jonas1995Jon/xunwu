package com.jang.xunwu.base;

import lombok.Getter;
import lombok.Setter;

/**
 * title ApiDataTableResponse
 * projectName xunwu
 * desc Datatables响应结构
 *
 * @author Jang
 * @date 2020/1/5 16:44
 */
@Getter
@Setter
public class ApiDataTableResponse extends ApiResponse {

    private Integer draw;

    private Long recordsTotal;

    private Long recordsFiltered;

    public ApiDataTableResponse(ApiResponse.Status status) {
        this(status.getCode(), status.getStandardMessage(), null);
    }

    public ApiDataTableResponse(int code, String message, Object data) {
        super(code, message, data);
    }
}
