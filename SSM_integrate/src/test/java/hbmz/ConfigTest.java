package hbmz;

import com.hbmz.config.JDBCConfig;
import com.hbmz.config.MybatisConfig;
import com.hbmz.config.SpringConfig;

import com.hbmz.mapper.BookMapper;
import com.hbmz.pojo.Book;
import com.hbmz.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class ConfigTest {

    @Autowired
    private JDBCConfig jdbcConfig;

    @Autowired
    private MybatisConfig mybatisConfig;

   @Autowired
   private BookService bookService;

   @Autowired
   private BookMapper bookMapper;

    /**
     * @ 测试JDBC连接
     */
    @Test
   public void test01() {

        DataSource ds = jdbcConfig.getDataSource();

        System.out.println(ds);

    }

    /**
     * @ 测试mybatis连接
     */
   @Test
   public void test02() {

        MapperScannerConfigurer m = mybatisConfig.mapperScannerConfigurer();

        System.out.println(m);

    }

    /**
     * @ 测试数据层接口
     */
    @Test
    public void test03() {

        Book book = bookService.getById(3);

        System.out.println(book);

    }

    @Test
    public void test04() {

        List<Book> books = bookService.getAll();

        System.out.println(books);

        }

    @Test
    public void test05() {

        List list = new ArrayList();

        System.out.println(list);


    }



}
