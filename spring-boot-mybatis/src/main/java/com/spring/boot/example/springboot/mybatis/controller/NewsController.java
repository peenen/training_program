package com.spring.boot.example.springboot.mybatis.controller;


import com.spring.boot.example.springboot.mybatis.dao.News;
import com.spring.boot.example.springboot.mybatis.mapper.NewsMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;


@Controller
    public class NewsController {

        @Resource
        private NewsMapper newsMapper;

        @ResponseBody

        @RequestMapping("/getNewsByUserId")
        public News getNewsByUserId(String user_id) {
            return newsMapper.getNewsByUserId(user_id);
        }




}

