package com.jang.xunwu.entity;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * title User
 * projectName xunwu
 * desc 用户
 *
 * @author jiangjian
 * @date 2019/12/29 0:16
 */
@Data
@Entity
@Table(name = "user")
public class User implements UserDetails {

    /**
     * 用户唯一ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 电话号码
     */
    @Column(name = "phone_number")
    private String phoneNumber;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户状态 0-正常 1-封禁
     */
    private int status;

    /**
     * 用户帐号创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 上次登录时间
     */
    @Column(name = "last_login_time")
    private Date lastLoginTime;

    /**
     * 上次更新记录时间
     */
    @Column(name = "last_update_time")
    private Date lastUpdateTime;

    /**
     * 头像
     */
    private String avatar;

    @Transient
    private List<GrantedAuthority> authorities;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authorities;
    }

    @Override
    public String getUsername() {
        return name;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
