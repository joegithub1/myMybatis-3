package demo;

import mybatis.Student;
import mybatis.TeacherMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
/**
 *@description:
 *@author: huangJian
 *@create: 2020-03-31
 */
public class MybatisTest {
  public static void main(String[] args) throws IOException {
    String resource = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    //start --
    // 1、解析mybatis-config.xml , 把${} 替换成.properties中的值
    // 2、准备数据源setEnvironment
    // 3、把所有的mapper中的sql语句加入到 MappedStatement 中 ， builderAssistant.addMappedStatement
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    //--end
    //start-- 获取configuration.getEnvironment数据源 和执行器
    SqlSession session = sqlSessionFactory.openSession();
    //--end
    try {
      //start--  获取 configuration.getMappedStatement(statement);    执行SQL
      Student student =  session.selectOne("mybatis.StudentMapper.getStudentById", 19);
      System.out.println(student.toString());
      TeacherMapper tMapper = session.getMapper(TeacherMapper.class);
      List tList = tMapper.findAll();
      System.out.println(tList == null?-1:tList.size());
    } catch (Exception e) {
      e.printStackTrace();
    }finally{
      session.close();
    }
    System.out.println("success");
  }
}

