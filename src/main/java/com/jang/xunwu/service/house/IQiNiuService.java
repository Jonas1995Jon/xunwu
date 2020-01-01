package com.jang.xunwu.service.house;

import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;

import java.io.File;
import java.io.InputStream;

/**
 * title IQiNiuService
 * projectName xunwu
 * desc 七牛云服务
 *
 * @author Jang
 * @date 2020/1/1 17:35
 */
public interface IQiNiuService {

    /**
     * 使用文件上传至七牛云
     *
     * @param file 上传的文件
     * @return Response
     * @throws QiniuException
     */
    Response uploadFile(File file) throws QiniuException;

    /**
     * 使用文件流上传至七牛云
     *
     * @param is 上传的文件的流
     * @return Response
     * @throws QiniuException
     */
    Response uploadFile(InputStream is) throws QiniuException;

    /**
     * 删除上传的文件
     *
     * @param key
     * @return Response
     * @throws QiniuException
     */
    Response delete(String key) throws QiniuException;

}
