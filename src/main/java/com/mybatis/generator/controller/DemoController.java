package com.mybatis.generator.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mybatis.generator.mapper.entended.ExtendedUserMapper;
import com.mybatis.generator.mapper.generated.UserMapper;
import com.mybatis.generator.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {

    @Autowired
    private ExtendedUserMapper extendedUserMapper;

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/user")
    public PageInfo<User> get(@RequestParam Integer pageNum, @RequestParam Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        // UserExample userExample = new UserExample();
        // UserExample.Criteria criteria = userExample.createCriteria();
        // criteria.andUsernameEqualTo("mao");
        // List<User> users = userMapper.selectByExample(userExample);

        List<User> users = extendedUserMapper.selectByUsername("mao");
        PageInfo<User> userPageInfo = new PageInfo<User>(users);
        return userPageInfo;
    }


}
