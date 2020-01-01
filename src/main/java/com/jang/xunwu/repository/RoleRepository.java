package com.jang.xunwu.repository;

import com.jang.xunwu.entity.Role;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * title RoleRepository
 * projectName xunwu
 * desc 角色数据接口
 *
 * @author Jang
 * @date 2020/1/1 14:44
 */
public interface RoleRepository extends CrudRepository<Role, Long> {

    /**
     * 根据用户ID获取角色列表
     *
     * @param userId 用户ID
     * @return List<Role>
     */
    List<Role> findRoleByUserId(Long userId);

}
