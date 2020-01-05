package com.jang.xunwu.base;

import com.jang.xunwu.entity.User;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * title LoginUserUtil
 * projectName xunwu
 * desc 登录用户工具类
 *
 * @author Jang
 * @date 2020/1/5 14:59
 */
public class LoginUserUtil {

    public static User load() {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (principal instanceof User) {
            return (User) principal;
        }

        return null;
    }

    public static Long getLoginUserId() {
        User user = load();
        if (user == null) {
            return -1L;
        }

        return user.getId();
    }

}
