package com.jang.xunwu.web.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * title UserController
 * projectName xunwu
 * desc 用户控制器
 *
 * @author Jang
 * @date 2020/1/1 14:05
 */
@Controller
public class UserController {

    @GetMapping("/user/login")
    public String loginPage() {
        return "user/login";
    }

    @GetMapping("/user/center")
    public String centerPage() {
        return "user/center";
    }

}
