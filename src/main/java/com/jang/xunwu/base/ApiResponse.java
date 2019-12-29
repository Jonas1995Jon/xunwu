package com.jang.xunwu.base;

import lombok.Data;

/**
 * title ApiResponse
 * projectName xunwu
 * desc API格式封装
 *
 * @author Jang
 * @date 2019/12/29 16:40
 */
@Data
public class ApiResponse {

    /**
     * 响应状态码
     */
    private int code;

    /**
     * 响应信息
     */
    private String message;

    /**
     * 响应数据
     */
    private Object data;

    /**
     * 是否还有跟多信息
     */
    private boolean more;

    public ApiResponse(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 无参构造器 默认为成功信息 code：200 message："OK"
     */
    public ApiResponse() {
        this.code = Status.SUCCESS.getCode();
        this.message = Status.SUCCESS.getStandardMessage();
    }

    public static ApiResponse ofMessage(int code, String message) {
        return new ApiResponse(code, message, null);
    }

    public static ApiResponse ofSuccess(Object data) {
        return new ApiResponse(Status.SUCCESS.getCode(), Status.SUCCESS.getStandardMessage(), data);
    }

    public static ApiResponse ofStatus(Status status) {
        return new ApiResponse(status.getCode(), status.getStandardMessage(), null);
    }

    /**
     * 状态枚举值
     */
    public enum Status {

        /**
         * 成功
         */
        SUCCESS(200, "OK"),

        /**
         * 错误请求
         */
        BAD_REQUEST(400, "Bad Request"),

        /**
         * 内部服务器错误
         */
        INTERNAL_SERVER_ERROR(500, "Unknown Internal Error"),

        /**
         * 无效的参数
         */
        NOT_VALID_PARAM(40005, "Not valid Params"),

        /**
         * 不支持的操作
         */
        NOT_SUPPORTED_OPERATION(40006, "Operation not supported"),

        /**
         * 没有登录
         */
        NOT_LOGIN(50000, "Not Login");

        /**
         * 状态码
         */
        private int code;

        /**
         * 返回信息
         */
        private String standardMessage;

        Status(int code, String standardMessage) {
            this.code = code;
            this.standardMessage = standardMessage;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getStandardMessage() {
            return standardMessage;
        }

        public void setStandardMessage(String standardMessage) {
            this.standardMessage = standardMessage;
        }
    }

}
