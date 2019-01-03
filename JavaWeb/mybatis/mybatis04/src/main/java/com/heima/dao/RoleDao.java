package com.heima.dao;

import com.heima.domain.Role;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RoleDao {
    /**
     * 查询所有角色 及用户
     * @return
     */
    List<Role> findRoleUser ();

    /**
     * 查询所有角色 ,用uid查询
     * @return
     */
    @Select("SELECT r.* FROM role r , user_role ur WHERE r.id=ur.rid and uid = #{id}")
    @Results(id="roleMap",value = {
        @Result(property = "id",column = "id"),
        @Result(property = "name",column = "role_name"),
        @Result(property = "desc",column = "role_desc")
    })
    List<Role> findRolesByUid (int uid);
}
