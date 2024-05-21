package com.fit.se;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoGithubActionsApplication {

	@GetMapping("/name")
	public String welcome1() {
		return "Truong Minh Huu";
	}

	@GetMapping("/name1")
	public String welcome2() {
		return "Pham Minh Hieu";
	}

//	echo "# github-actions-demo" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/trngmhuu/github-actions-demo.git
//	git push -u origin main
	public static void main(String[] args) {
		SpringApplication.run(DemoGithubActionsApplication.class, args);
	}

}
