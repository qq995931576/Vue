package com.achang.dao;

import com.achang.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/******
 @author 阿昌
 @create 2021-02-20 15:50
 *******
 */
@Mapper
public interface UserDao {

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
