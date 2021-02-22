package com.achang.service;

import com.achang.entity.User;

import java.util.List;

/******
 @author 阿昌
 @create 2021-02-17 17:40
 *******
 */
public interface UserService {

    //查询所有用户
    public List<User> findAll();

    //保存用户
    public void save(User user);

    //根据id删除用户
    public void deleteById(String id);

    //根据id查询一个用户信息
    public User findOne(String id);

    //根据id修改用户信息
    public void update(User user);

    //模糊检索
    public List<User> findNameOrPhoneNumber(String name,String num);

}
