package com.jang.xunwu.service.user;

import com.jang.xunwu.entity.Role;
import com.jang.xunwu.entity.User;
import com.jang.xunwu.repository.RoleRepository;
import com.jang.xunwu.repository.UserRepository;
import com.jang.xunwu.service.IUserService;
import com.jang.xunwu.service.ServiceResult;
import com.jang.xunwu.web.dto.UserDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * title UserServiceImpl
 * projectName xunwu
 * desc 用户服务实现
 *
 * @author Jang
 * @date 2020/1/1 14:30
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public User findUserByName(String userName) {
        User user = userRepository.findByName(userName);
        if (user == null) {
            return null;
        }
        List<Role> roles = roleRepository.findRoleByUserId(user.getId());
        if (roles == null || roles.isEmpty()) {
            throw new DisabledException("权限非法");
        }
        List<GrantedAuthority> authorities = new ArrayList<>();
        roles.forEach(role -> authorities.add(new SimpleGrantedAuthority("ROLE_" + role.getName())));
        user.setAuthorities(authorities);
        return user;
    }

    @Override
    public ServiceResult<UserDTO> findById(Long userId) {
        User user = userRepository.findOne(userId);
        if (user == null) {
            return ServiceResult.notFound();
        }
        UserDTO userDTO = modelMapper.map(user, UserDTO.class);
        return ServiceResult.of(userDTO);
    }

    @Override
    public User findUserByTelephone(String telephone) {
        return null;
    }

    @Override
    public User addUserByPhone(String telephone) {
        return null;
    }

    @Override
    public ServiceResult modifyUserProfile(String profile, String value) {
        return null;
    }
}
