package com.qin.springboot01.mapper;

import com.qin.springboot01.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface Usermapper {

    public List<User> findALL();

    public List<User> findById(int id);
}
