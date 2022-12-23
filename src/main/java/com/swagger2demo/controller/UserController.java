package com.swagger2demo.controller;

import com.swagger2demo.model.entity.User;
import com.swagger2demo.service.UserService;
import com.swagger2demo.service.impl.UserServiceImpl;
import com.swagger2demo.utils.R;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Jun
 * @description TODO
 * @Date 2022/12/23 18:06
 * @modify
 */
@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    private final UserServiceImpl userService;

    @GetMapping("/list")
    public R listUser(){
        List<User> userList = userService.list();
        return R.ok().data("data",userList);
    }
}
