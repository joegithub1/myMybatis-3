package mybatis;

import java.util.List;

/**
 *@description:
 *@author: huangJian
 *@create: 2020-04-02
 */
public interface TeacherMapper {

  public Teacher getById(Integer id);

  public List findAll();
}
