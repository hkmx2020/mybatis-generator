package com.mybatis.generator.mapper.entended;

import com.mybatis.generator.mapper.generated.UserMapper;
import com.mybatis.generator.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExtendedUserMapper extends UserMapper {

    List<User> selectByUsername(@Param("username") String username);
}