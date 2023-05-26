package com.hbmz.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface AccountsMapper {

    @Update("update t_account set money = money + #{money} where name = #{name}")
    void inMoney(@Param("name")String name, @Param("money")Double money);

    @Update("update t_account set money = money - #{money} where name = #{name}")
    void outMoney(@Param("name")String name, @Param("money")Double money);


}
