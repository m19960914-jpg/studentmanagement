package raisetech.studentmanagement;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentRepository {

    @Select("select * from student where name =#{name}")
    Student SearchByName(String name);


    @Insert("insert student values (#{name},#{age})")
    void registerStudent(String name, int age);

    @Update("update student set age = #{age} where name = #{name}")
          void updateStudent(String name, int age);

    @Delete("delete from  student  where name = #{name}")
    void deleteStudent(String name);
    @Select("select * from student")
    List<Student> searchAll();

    @Select("select * from students_courses")
    List<students_courses> searchAllCourses();
}