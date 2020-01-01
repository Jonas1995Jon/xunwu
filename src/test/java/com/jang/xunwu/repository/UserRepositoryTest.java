package com.jang.xunwu.repository;

import com.jang.xunwu.XunWuApplicationTests;
import com.jang.xunwu.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

/**
 * title UserRepositoryTest
 * projectName xunwu
 * desc 用户接口测试
 *
 * @author jiangjian
 * @date 2019/12/29 0:56
 */
public class UserRepositoryTest extends XunWuApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void findById() {
        User user = userRepository.findOne(1L);
        Assert.assertEquals("waliwali", user.getName());
    }

}
