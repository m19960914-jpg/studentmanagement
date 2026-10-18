package raisetech.studentmanagement;

import java.util.Arrays;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication

@RestController
public class StudentmanagementApplication {

    @Autowired
    private StudentRepository repository;




public static void main(String[] args){
        //localhost:8080
        SpringApplication.run(StudentmanagementApplication.class,args);

    }

    @GetMapping("/student")
    public String getStudent(@RequestParam String name) {
        Student student = repository.SearchByName(name);
        return student.getName() + "　" + student.getAge() + "sai";
    }


    @PostMapping("/student")
    public  void registerStudent(String name, int age) {
    repository.registerStudent(name,age);
}

    @PatchMapping ("/student")
    public  void  updateStudent(String name,int age) {
        repository.updateStudent(name,age);
    }

  @DeleteMapping("/student")
     public   void deleteStudent(String name) {
      repository.deleteStudent(name);
  }

    @GetMapping("/studentList")
    public List<Student> getStudentList() {
        return repository.searchAll(); // Mapperを呼び出して全員分のリストをそのまま返す
    }
    @GetMapping("/students_courseList")
    public List<students_courses> getStudent_courseList() {
        return repository.searchAllCourses(); // Mapperを呼び出して全員分のリストをそのまま返す
    }

}

