package com.achang.controller;

import com.achang.entity.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/******
 @author 阿昌
 @create 2021-02-19 13:42
 *******
 */
@RestController
@RequestMapping("/user")
@CrossOrigin //解决跨域问题
public class UserController {
    @GetMapping("/findAll")
    public List<User> findAll(){
        System.out.println("查询所有。。。。。。");
        List<User> list = Arrays.asList(
                new User("21","阿昌昌昌",23,new Date()),
                new User("22","PePe",21,new Date()),
                new User("23","Oni",34,new Date())
        );
        return list;
    }

}
