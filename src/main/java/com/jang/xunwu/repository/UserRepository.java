package com.jang.xunwu.repository;

import com.jang.xunwu.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * title UserRepository
 * projectName xunwu
 * desc 用户接口
 *
 * @author jiangjian
 * @date 2019/12/29 0:49
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
