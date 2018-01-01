package cn.edu.cufe.dao;

import cn.edu.cufe.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoginDao {
    List<User> selectUser(@Param("name") String name, @Param("password") String password);
}
