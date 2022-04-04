package com.spring.boot.example.springboot.mybatis;

import com.spring.boot.example.springboot.mybatis.dao.News;
import com.spring.boot.example.springboot.mybatis.mapper.NewsMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
class SpringBootMybatisApplicationTests {

    @Autowired
    private DataSource dataSource;

    @Resource
    private NewsMapper newsMapper;


    @Test void testNewsMapper() throws SQLException {

        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from sci_news");
       while(resultSet.next()){
            int id = resultSet.getInt(1);
            String title = resultSet.getString(2);
            String type = resultSet.getString(3);
            String user_id = resultSet.getString(4);
            System.out.println("id:" + id + " title:"+title+"type:"+type+"user_id:"+user_id);
       }
        System.out.println();
    }

}