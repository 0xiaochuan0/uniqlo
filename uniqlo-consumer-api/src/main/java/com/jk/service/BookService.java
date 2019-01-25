package com.jk.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface BookService {

    @GetMapping(value = "/query")
    String queryList(@RequestParam("id") String id);

}
