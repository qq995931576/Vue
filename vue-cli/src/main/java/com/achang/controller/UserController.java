package com.achang.controller;

import com.achang.entity.User;
import com.achang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/******
 @author 阿昌
 @create 2021-02-20 16:59
 *******
 */
@RestController
@CrossOrigin //解决跨域问题
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //查询所有
    @GetMapping("/findAll")
    public Map<String,Object> findAll(Integer page, Integer rows){
        List<User> result = userService.findAll();
        HashMap<String, Object> map = new HashMap<>();
        map.put("total",1);
        map.put("totalPage",1);
        map.put("page",1);
        map.put("result",result);

        return map;
    }

    //添加用户
    @PostMapping("/add")
    public Map<String,Object> add(@RequestBody User user){
        HashMap<String, Object> map = new HashMap<>();
        try {
            userService.save(user);
            map.put("success",true);
            map.put("msg","添加成功");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("success",false);
            map.put("msg","添加失败： "+e.getMessage());
        }
        return map;
    }

    //用户删除
    @GetMapping("/delete")
    public Map<String,Object> delete(Integer id){
        HashMap<String, Object> map = new HashMap<>();
        try {
            userService.delete(id);
            map.put("success",true);
            map.put("msg","删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("success",false);
            map.put("msg","删除失败： "+e.getMessage());
        }
        return map;
    }

    //根据id查询用户
    @GetMapping("findOne")
    public User finOne(Integer id){
        return userService.findById(id);
    }

    //修改用户
    @PostMapping("/edit")
    public Map<String,Object> edit(@RequestBody User user){
        HashMap<String, Object> map = new HashMap<>();
        try {
            userService.update(user);
            map.put("success",true);
            map.put("msg","更新成功");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("success",true);
            map.put("msg","感谢成功");
        }
        return map;
    }


}
