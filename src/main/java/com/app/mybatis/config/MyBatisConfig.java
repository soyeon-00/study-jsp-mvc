package com.app.mybatis.config;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisConfig {
   private static SqlSessionFactory sqlSessionFactory;
   
   static {
      String resource = "com/app/mybatis/config/config.xml";
      try {
         Reader reader = Resources.getResourceAsReader(resource);
         sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
   
   public static SqlSessionFactory getSqlSessionFactory() {
      return sqlSessionFactory;
   }
   
}
