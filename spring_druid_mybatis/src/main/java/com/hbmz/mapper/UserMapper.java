package com.hbmz.mapper;

import com.hbmz.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@SuppressWarnings("ALL")
@Mapper
public interface UserMapper {

    @Select("select * from t_user")
    List<User> selectAll();

    User selectByUsername(@Param("username") String username);

    public List<User> selectByUserNamePassword(@Param("username")String username, @Param("password")String password);


}
