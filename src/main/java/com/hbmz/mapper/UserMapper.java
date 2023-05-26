package com.hbmz.mapper;

import com.hbmz.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {


    public void insert();

    public void insert1(User user);

    public List<User> selectByUserNamePassword(@Param("username")String username, @Param("password")String password);

    public Integer selectByCount();

    public List<User> selectLike(@Param("usernaem")String username);

    @Select("select * from t_user")
    public List<User> select();

}
