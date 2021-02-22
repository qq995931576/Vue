package com.achang.service;

import com.achang.entity.User;

import java.util.List;

/******
 @author 阿昌
 @create 2021-02-20 16:39
 *******
 */
public interface UserService {
    //保存
    void save(User user);

    //更新
    void update(User user);

    //删除
    void delete(Integer id);

    //查询所有
    List<User> findAll();

    //根据id，查询一个用户
    User findById(Integer id);

}
