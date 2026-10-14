package raisetech.studentmanagement;

import java.util.List;

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
        return student.getName() + "　" + student.getAge() + "sai"+ student.getGender() ;
    }


    @PostMapping("/student")
    public  void registerStudent(String name, int age,int id,String kana,String nickname,String email,String region,String gender)
    {
    repository.registerStudent(name,age,id, student_id, course_name, start_date, end_date);
}

    @PostMapping("/students_c")
    public  void registerStudentC(String name, int age,int id, int student_id , String course_name,localdate start_date,localdate end_date )
    {
        repository.registerStudent(name,age,id,student_id ,course_name,start_date,end_date);
    }

    @PatchMapping ("/student")
    public  void  updateStudent(String name,int age,int grade)
    {
        repository.updateStudent(name,age,grade);
    }

  @DeleteMapping("/student")
     public   void deleteStudent(String name) {
      repository.deleteStudent(name);
  }

    @GetMapping("/studentList")
    public List<Student> getStudentList() {
        return repository.searchAll(); // Mapperを呼び出して全員分のリストをそのまま返す
    }
}

