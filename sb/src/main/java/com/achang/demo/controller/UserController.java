package com.achang.demo.controller;

import com.achang.demo.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/******
 @author 阿昌
 @create 2021-02-16 20:33
 *******
 */
@RestController
@RequestMapping("/user")
public class UserController {

    //删除数据
    @CrossOrigin //用来解决跨域问题
    @DeleteMapping("delete")
    public Map<String,Object> delete(String id){
        Map<String,Object> map = new HashMap<>();
        System.out.println("id = " + id);
        map.put("success",true);
        return map;
    }

    //保存数据
    @CrossOrigin //用来解决跨域问题
    @PostMapping("save")
    public Map<String,Object> save(@RequestBody User user){
        Map<String,Object> map = new HashMap<>();
        System.out.println("user = " + user);
        map.put("success",true);
        return map;
    }

    //展示索引
    @CrossOrigin //用来解决跨域问题
    @GetMapping("findAll")
    public List<User> findAll(String name){
        System.out.println(name);
        List<User> users = new ArrayList<>();
        users.add(new User("21","赵云","zhaoyun@achang.com",18,1688312));
        users.add(new User("22","赵学","zhaoxue@achang.com",12,3688395));
        users.add(new User("23","赵彩","zhaocai@achang.com",11,1523395));
        return users;
    }




}
