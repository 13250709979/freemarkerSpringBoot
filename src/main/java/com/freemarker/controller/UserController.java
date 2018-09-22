package com.freemarker.controller;

import com.freemarker.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * SpringBoot整合Freemarker
 *
 */
@Controller
public class UserController {

    @RequestMapping(value = "/showUser",method = RequestMethod.GET)
    public String showUser(Model model){
        List<User> userList=new ArrayList<>();
        userList.add(new User(1,"张三",14));
        userList.add(new User(5,"张三",44));
        userList.add(new User(6,"张三",54));
        model.addAttribute("list",userList);
        return "userList";
    }

}
