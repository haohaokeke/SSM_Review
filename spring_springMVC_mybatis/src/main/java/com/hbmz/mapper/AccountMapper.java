package com.hbmz.mapper;

import com.hbmz.pojo.Account;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface AccountMapper {

    @Insert("insert into account values (null, #{usernaem}, #{balance})")
    public void insert(Account account);

    @Delete("delete from account where id = #{id}")
    public void delete(@Param("id") Integer id);

    @Update("update account set username = #{username}, balance = #{balance}")
    public void update(Account account);

    @Select("select * from account where id = #{id}")
    public Account selectById(Integer id);

    @Select("select * from account")
    public List<Account> selectAll();

}
