package com.qin.springboot01;

import com.qin.springboot01.mapper.Usermapper;
import com.qin.springboot01.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootApplicationTests {

    @Autowired
    private Usermapper usermapper;
    @Test
    void contextLoads() {
        List<User> all = usermapper.findALL();
        for (User user : all) {
            System.out.println(user);
        }
    }

}
