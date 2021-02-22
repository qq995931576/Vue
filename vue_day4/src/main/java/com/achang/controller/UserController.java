package com.achang.controller;

import com.achang.entity.User;
import com.achang.service.UserService;
import org.springframework.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/******
 @author 阿昌
 @create 2021-02-17 17:42
 *******
 */
@RestController
@RequestMapping("/user")
@CrossOrigin //允许可以跨域操作，解决Vue静态页面访问的跨域问题
public class UserController {

    @Autowired
    private UserService userService;

    //查询所有
    @GetMapping("/findAll")
    public List<User> findAll(){
        List<User> userList = userService.findAll();
        return userList;
    }

    //保存用户和修改某用户
    @PostMapping("/save")
    public Map<String,Object> save(@RequestBody User user){
        Map<String,Object> map = new HashMap<>();
        try {
            //判断传来的user对象是否有id值，有为保存操作，没有为修改操作
            if (StringUtils.isEmpty(user.getId())){
                userService.save(user);
            }else {
                userService.update(user);
            }
            map.put("success", true);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("fail",false);
            map.put("msg","用户保存或更新失败");
        }

        return map;
    }

    //根据用户id删除信息
    @GetMapping("/deleteById")
    public Map<String,Object> deleteById(String id){
        Map<String,Object> map = new HashMap<>();
        try {
            userService.deleteById(id);
            map.put("success",true);
            map.put("msg","用户删除【成功】");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("fail",false);
            map.put("msg","用户删除【失败】");
        }
        return map;
    }

    //根据用户id查询该用户信息
    @GetMapping("findOne")
    public User findOne(String id){
        return userService.findOne(id);
    }

    //模糊检索
    @GetMapping("/findNameOrNum")
    public List<User> findNameOrNum(String name,String num){
        return userService.findNameOrPhoneNumber(name,num);
    }


}
