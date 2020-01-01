package com.jang.xunwu.service.house;

import com.jang.xunwu.XunWuApplicationTests;
import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;

/**
 * title QiNiuServiceTest
 * projectName xunwu
 * desc 七牛云上传文件测试
 *
 * @author Jang
 * @date 2020/1/1 17:57
 */
public class QiNiuServiceTest extends XunWuApplicationTests {

    @Autowired
    private IQiNiuService qiNiuService;

    @Test
    public void testUploadFile() {
        String fileName = "E:\\Project\\Java\\xunwu\\temp\\def933228baaff2f573f8cad0c622a9b.jpg";
        File file = new File(fileName);

        Assert.assertTrue(file.exists());

        try {
            Response response = qiNiuService.uploadFile(file);
            Assert.assertTrue(response.isOK());
        } catch (QiniuException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testDelete() {
        String key = "FiBfGEM3SB7NW9CTOh93k5fkgoI1";
        try {
            Response response = qiNiuService.delete(key);
            Assert.assertTrue(response.isOK());
        } catch (QiniuException e) {
            e.printStackTrace();
        }
    }

}
