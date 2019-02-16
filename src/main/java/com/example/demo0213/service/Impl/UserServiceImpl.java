package com.example.demo0213.service.Impl;

import com.example.demo0213.dao.UserDao;
import com.example.demo0213.pojo.User;
import com.example.demo0213.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class UserServiceImpl implements UserService {
    @Resource
    UserDao userDao;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userDao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(User user) {
        return userDao.insert(user);
    }

    @Override
    public User selectByPrimaryKey(Integer id) {

        return userDao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(User user) {
        return userDao.updateByPrimaryKey(user);
    }
}
