package com.jang.xunwu.repository;

import com.jang.xunwu.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * title UserRepository
 * projectName xunwu
 * desc 用户接口
 *
 * @author jiangjian
 * @date 2019/12/29 0:49
 */
public interface UserRepository extends CrudRepository<User, Long> {

    /**
     * 根据用户名查询用户
     *
     * @param userName 用户名
     * @return User
     */
    User findByName(String userName);

}
