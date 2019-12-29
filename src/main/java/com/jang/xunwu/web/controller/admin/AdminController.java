package com.jang.xunwu.web.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * title AdminController
 * projectName xunwu
 * desc 管理员
 *
 * @author Jang
 * @date 2019/12/29 18:47
 */
@Controller
public class AdminController {

    @GetMapping("/admin/center")
    public String adminCenterPage() {
        return "admin/center";
    }

    @GetMapping("/admin/welcome")
    public String welcomePage() {
        return "admin/welcome";
    }

    @GetMapping("/admin/login")
    public String adminLoginPage() {
        return "admin/login";
    }

}
