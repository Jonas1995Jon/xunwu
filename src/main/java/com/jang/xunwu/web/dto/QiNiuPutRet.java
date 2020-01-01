package com.jang.xunwu.web.dto;

import lombok.Data;

/**
 * title QiNiuPutRet
 * projectName xunwu
 * desc 七牛云数据格式
 *
 * @author Jang
 * @date 2020/1/1 18:26
 */
@Data
public class QiNiuPutRet {

    public String key;

    public String hash;

    public String bucket;

    public int width;

    public int height;

}
