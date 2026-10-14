package raisetech.studentmanagement;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentRepository {

    @Select("select * from students where name =#{name}")
    Student SearchByName(String name);



    @Insert("insert students values (#{name},#{age},#{grade})")
    void registerStudent(String name, int age, int grade, int student_id, String course_name, localdate start_date, localdate end_date);

    @Insert("insert students_courses values (#{name},#{age},#{id}, #｛student_id｝,#｛ course_name},)")
    void registerStudent(String name, int age, int id, int studentId, string courseName, localdate startDate, localdate endDate);

    @Update("update students set age = #{age} ,grade = #{grade} where name = #{name}")
          void updateStudent(String name, int age,int grade);

    @Delete("delete from  students  where name = #{name}")
    void deleteStudent(String name);
    @Select("select * from students")
    List<Student> searchAll();



}