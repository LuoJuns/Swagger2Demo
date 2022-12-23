package com.swagger2demo.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jun
 * @description TODO
 * @Date 2022/12/23 14:27
 * @modify
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/swagger")
    @ApiOperation(value = "swagger接口测试",notes = "接口测试1")
    public String test(){
        return "hello swagger~";
    }
}
