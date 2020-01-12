package com.jang.xunwu.service;

import com.jang.xunwu.entity.User;
import com.jang.xunwu.web.dto.UserDTO;

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

    /**
     * 根据用户编号获取用户信息
     *
     * @param userId
     * @return
     */
    ServiceResult<UserDTO> findById(Long userId);

    /**
     * 根据电话号码寻找用户
     *
     * @param telephone
     * @return
     */
    User findUserByTelephone(String telephone);

    /**
     * 通过手机号注册用户
     *
     * @param telehone
     * @return
     */
    User addUserByPhone(String telehone);

    /**
     * 修改指定属性值
     *
     * @param profile
     * @param value
     * @return
     */
    ServiceResult modifyUserProfile(String profile, String value);

}
