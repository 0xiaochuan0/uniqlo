package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "uniqlo-men-provider")
public interface BookMenService extends BookService {

}
