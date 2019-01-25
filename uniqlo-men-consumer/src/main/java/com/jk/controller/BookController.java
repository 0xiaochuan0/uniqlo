package com.jk.controller;

import com.jk.service.BookMenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("men")
public class BookController {

    @Resource
    private BookMenService bookMenService;

    @RequestMapping("query")
    @ResponseBody
    public String queryList(String id){
        return bookMenService.queryList(id);
    }
}
