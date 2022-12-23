package com.swagger2demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.swagger2demo.model.entity.User;
import com.swagger2demo.service.UserService;
import com.swagger2demo.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author Jun
* @description TODO
* @Date 2022-12-23 18:05:58
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




