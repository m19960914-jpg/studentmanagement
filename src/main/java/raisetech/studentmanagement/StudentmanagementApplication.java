package raisetech.studentmanagement;

import java.util.Map;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.concurrent.ConcurrentMap;

@SpringBootApplication
@RestController
public class StudentmanagementApplication {

	/*private String name = "enami kouji";
	private String age = "37";
*/
	private  final java.util.Map<String,Integer> studentMap = new java.util.concurrent.ConcurrentHashMap<>();

	public static void main(String[] args) {
		//localhost:8080
		SpringApplication.run(StudentmanagementApplication.class, args);

	}

	@GetMapping("/studentInfo")
	public Map<String,Integer> getStudentInfo() {
		return studentMap;
	}



	@PostMapping ("/studentInfo")
	public String  setStudentInfo(String name, String age) {
		studentMap.put(name,Integer.parseInt(age));

return name + "sannode-tawohozonsita" ;
	}



}

