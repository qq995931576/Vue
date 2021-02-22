package com.achang.dao;

import com.achang.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/******
 @author 阿昌
 @create 2021-02-17 17:22
 *******
 */
public interface UserDao {
    //查询所有
    List<User> findAll();

    //保存用户
    void save(User user);

    //根据id删除用户
    void deleteById(String id);

    //根据id查询一个人信息
    User findOne(String id);

    //根据id修改用户信息
    void update(User user);

    //根据姓名或者电话进行模糊搜索
    //@Param：参数绑定
    List<User> findNameOrPhoneNumber(@Param("name") String name, @Param("num") String phoneNumber);
}
