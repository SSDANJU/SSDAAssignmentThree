package edu.nju.SSDAAssignmentThree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class SSDAAssignmentThreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SSDAAssignmentThreeApplication.class, args);
	}


	@RequestMapping(value = "/",produces = "text/plain;charset=UTF-8")
	String index(){
		return "helloWorld";
	}
}

