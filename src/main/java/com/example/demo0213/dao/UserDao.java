package com.example.demo0213.dao;

import com.example.demo0213.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User user);
    
    User selectByPrimaryKey(Integer id);
    
    int updateByPrimaryKey(User user);
}