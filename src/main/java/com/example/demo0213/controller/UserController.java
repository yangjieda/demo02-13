package com.example.demo0213.controller;

import com.example.demo0213.pojo.User;
import com.example.demo0213.service.Impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Controller
public class UserController {
    @Resource
    UserServiceImpl userService;

    @RequestMapping("/index")
    public String find(){
        return "login";
    }
    @RequestMapping("/select")
    public String logins(Model model,User user){
        User user1=userService.selectByPrimaryKey(user.getId());
        User user2=null;
        if (user.getName()!=""){
            List list=new ArrayList();
            list.add(user1);
            Iterator iterator=list.iterator();
            while (iterator.hasNext()){
                user2=(User) iterator.next();
            }
            if (user.getName().equals(user2.getName())){
                model.addAttribute("login","用户名已存在");
            }else {
                if (user.getPassword().equals(user2.getPassword())){
                    model.addAttribute("login","密码错误");
                }else {
                    return "welcome";
                }
            }
        }
        return "login";
    }
}
