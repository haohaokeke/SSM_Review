package com.hbmz.mapper;

import com.hbmz.pojo.Book;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface BookMapper {

    /**
     * 增
     */
    @Insert("insert into tbl_book values(null, #{type}, #{name}, #{description}) ")
    public void insert(Book book);


    /**
     * 删
     */
    public void deleteById(Integer id);


    /**
     * 改
     */
    @Update("update tbl_book set type = #{type}, name = #{name}, description = #{description} where id = #{id}")
    public void update(Book book);


    /**
     * 查
     */
    @Select("select * from tbl_book where id = #{id}")
    public Book getById(Integer id);

    /**
     * 查
     */
    public List<Book> getAll();


}
