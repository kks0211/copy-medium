package org.hanseungroom.copymedium;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class CopyMediumApplication {

	public static void main(String[] args) {
		SpringApplication.run(CopyMediumApplication.class, args);
	}

}

@Controller
@RequestMapping("/")
class Test1 {

	@RequestMapping("")
	public String Test() {
		System.out.println("hi");
		return "index";
	}
}
