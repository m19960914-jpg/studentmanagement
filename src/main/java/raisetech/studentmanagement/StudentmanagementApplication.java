package raisetech.studentmanagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import raisetech.studentmanagement.data.Student;
import raisetech.studentmanagement.data.Students_Courses;
import raisetech.studentmanagement.repository.StudentRepository;

@SpringBootApplication

@RestController
public class StudentmanagementApplication {

    public static void main(String[] args){
        //localhost:8080
        SpringApplication.run(StudentmanagementApplication.class,args);

    }

  /*  @GetMapping("/student")
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
*/

}