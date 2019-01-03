package com.heima.dao;

import com.heima.domain.Role;

import java.util.List;

public interface RoleDao {
    /**
     * 查询所有角色 及用户
     * @return
     */
    List<Role> findRoleUser();


    /**
     * 查询所有用户id匹配的角色
     * @return
     */
    List<Role> findRoleByUid(int uid);
}
