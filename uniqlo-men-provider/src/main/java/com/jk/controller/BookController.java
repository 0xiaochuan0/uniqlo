package com.jk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @RequestMapping("query")
    public String queryList(@RequestParam("id") String id){
        return id;
    }
}
