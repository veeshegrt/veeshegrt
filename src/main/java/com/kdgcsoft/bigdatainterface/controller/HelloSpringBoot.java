package com.kdgcsoft.bigdatainterface.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ChengXie
 * @create 2021/10/11 10:41
 */
@Api("swagger测试")
@RestController
@RequestMapping("test")
public class HelloSpringBoot {

    @GetMapping("/getParamDemo1/{id}")
    public String getParamDemo1 (@PathVariable("id") int userId){
        System.out.println("get param " + userId);
        return "success get param";
    }
}
