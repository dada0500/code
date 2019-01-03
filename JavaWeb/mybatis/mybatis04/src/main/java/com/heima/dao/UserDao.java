package com.heima.dao;

import com.heima.domain.Role;
import com.heima.domain.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

@CacheNamespace(blocking = true)
public interface UserDao {
    /**
     * 查询所有用户
     */
    public List<User> findAll ();
    /**
     * 查询用户 id
     */
    @Select ("select * from user where id = #{id}")
    public User findUserById (int id);
    /**
     * 查询所有 username
     */
    @Update ("update user set username=#{username},sex=#{sex},birthday=#{birthday},address=#{address} where id = #{id}")
    public int updateUser (User user);

    /**
     * 查询所有用户 及其 账户信息
     */
    @Select ("select * from user")
    @Results(id="userMap",value = {
            @Result(property = "id",column = "id"),
            @Result(property = "username",column = "username"),
            @Result(property = "birthday",column = "birthday"),
            @Result(property = "sex",column = "sex"),
            @Result(property = "address",column = "address"),
            @Result(property = "roles",column="id",javaType = List.class,
                    many=@Many(select="com.heima.dao.RoleDao.findRolesByUid",fetchType = FetchType.LAZY)
            )
    })
    public List<User> findAllUserAccount ();

    /**
     * 查询所有用户 及其 角色信息
     */
    @Select ("select * from user")
    public List<User> findAllUserRole ();
}
