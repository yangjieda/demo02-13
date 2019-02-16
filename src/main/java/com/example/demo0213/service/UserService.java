package com.example.demo0213.service;

import com.example.demo0213.pojo.User;

public interface UserService {
    int deleteByPrimaryKey(Integer id);

    int insert(User user);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(User user);
}
