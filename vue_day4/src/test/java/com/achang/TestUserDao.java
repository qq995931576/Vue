package com.achang;

import com.achang.dao.UserDao;
import com.achang.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/******
 @author 阿昌
 @create 2021-02-17 17:28
 *******
 */
@SpringBootTest(classes = VueApplication.class)
public class TestUserDao {

    @Autowired
    private UserDao userDao;

    @Test
    void testFindAll(){
        List<User> userList = userDao.findAll();
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
