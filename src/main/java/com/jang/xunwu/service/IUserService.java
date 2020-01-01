package com.jang.xunwu.service;

import com.jang.xunwu.entity.User;

/**
 * title IUserService
 * projectName xunwu
 * desc 用户服务
 *
 * @author Jang
 * @date 2020/1/1 14:27
 */
public interface IUserService {

    /**
     * 根据用户名查询用户
     *
     * @param userName 用户名
     * @return User
     */
    User findUserByName(String userName);

}
