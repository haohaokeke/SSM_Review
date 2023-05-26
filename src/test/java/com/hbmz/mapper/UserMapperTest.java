package com.hbmz.mapper;

import com.hbmz.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.*;

public class UserMapperTest {

    SqlSession sqlSession = null;
    UserMapper userMapper = null;

    @Before
    public void setUp() throws Exception {

        //获取核心配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        //创建工厂类
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);

        //创建sqlSession对象
        sqlSession = sqlSessionFactory.openSession();

        //使用Mapper代理
        userMapper = sqlSession.getMapper(UserMapper.class);

    }

    @After
    public void tearDown() throws Exception {

        sqlSession.close();

    }

    @Test
    public void insert() {

        //执行方法
        userMapper.insert();


    }

    @Test
    public void insert1() {

        //创建实体类对象
        User user = new User(null, "root", "123456", 21, "女", "2479103932@qq.com");

        //执行方法
        userMapper.insert1(user);

    }

    @Test
    public void selectByUserNamePassword(){

        //执行方法
        List<User> user = userMapper.selectByUserNamePassword("root", "123456");

        System.out.println(user);

    }

    @Test
    public void selectByCount() {

        Integer num = userMapper.selectByCount();

        System.out.println(num);

    }

    @Test
    public void selectLike() {

        List<User> user = userMapper.selectLike("a");

        System.out.println(user);

    }

    @Test
    public void select() {

        List<User> users = userMapper.select();

        System.out.println(users);

    }
}