package com.jang.xunwu.web.dto;

import lombok.Data;

/**
 * title UserDTO
 * projectName xunwu
 * desc 用户数据传输对象
 *
 * @author Jang
 * @date 2020/1/5 13:53
 */
@Data
public class UserDTO {

    private Long id;

    private String name;

    private String avatar;

    private String phoneNumber;

    private String lastLoginTime;

}
