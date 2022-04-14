package com.example.mybatisx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mybatisx.pojo.User;
import com.example.mybatisx.service.UserService;
import com.example.mybatisx.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author admin
* @description 针对表【t_user】的数据库操作Service实现
* @createDate 2022-04-14 15:59:53
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




