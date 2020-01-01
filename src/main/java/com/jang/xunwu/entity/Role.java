package com.jang.xunwu.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * title Role
 * projectName xunwu
 * desc 角色
 *
 * @author Jang
 * @date 2020/1/1 14:42
 */
@Entity
@Table(name = "role")
@Data
public class Role {

    /**
     * 角色ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 角色名
     */
    private String name;

}
