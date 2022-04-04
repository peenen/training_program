package com.spring.boot.example.springboot.mybatis.mapper;

import com.spring.boot.example.springboot.mybatis.dao.News;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface NewsMapper {

        News getNewsByUserId(String user_id);


}
