package raisetech.studentmanagement;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentRepository {

    @Select("select * from students where name =#{name}")
    Student SearchByName(String name);



    @Insert("insert students values (#{name},#{age},#{grade})")
    void registerStudent(String name, int age,int grade);

    @Update("update students set age = #{age} ,grade = #{grade} where name = #{name}")
          void updateStudent(String name, int age,int grade);

    @Delete("delete from  students  where name = #{name}")
    void deleteStudent(String name);
    @Select("select * from students")
    List<Student> searchAll();

}