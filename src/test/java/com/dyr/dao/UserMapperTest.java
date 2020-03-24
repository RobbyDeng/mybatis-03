package com.dyr.dao;

import com.dyr.pojo.User;
import com.dyr.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import java.util.List;

public class UserMapperTest {

   @Test
   public void test(){
      SqlSession sqlSession = MybatisUtils.getSqlSession();
      UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//      List<User> users = mapper.getUsers();
//      for (User user : users) {
//         System.out.println(user);
//      }

      User userById = mapper.getUserById(1);
      System.out.println(userById);

      sqlSession.close();
   }

   @Test
   public void addUser(){
      SqlSession sqlSession = MybatisUtils.getSqlSession();
      UserMapper mapper = sqlSession.getMapper(UserMapper.class);
      mapper.addUser(new User(10,"金光瑶","133"));
      sqlSession.close();
   }

   @Test
   public void updateUser(){
      SqlSession sqlSession = MybatisUtils.getSqlSession();
      UserMapper mapper = sqlSession.getMapper(UserMapper.class);
      mapper.updateUser(new User(6,"蓝曦臣","1234"));
      sqlSession.close();
   }

   @Test
   public void deleteUser(){
      SqlSession sqlSession = MybatisUtils.getSqlSession();
      UserMapper mapper = sqlSession.getMapper(UserMapper.class);
      mapper.deleteUser(3);
      sqlSession.close();

   }

}
