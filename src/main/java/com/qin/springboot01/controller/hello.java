package com.qin.springboot01.controller;

import com.qin.springboot01.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {

    @Autowired  // 自动装配
    private Student student;
    @RequestMapping("hello3")
    public String hello(){
        System.out.println(student);
        return "hello3";
    }

    @RequestMapping("hello4")
    public String hello2(){
        // System.out.println(student);
        return "hello4";
    }
}
