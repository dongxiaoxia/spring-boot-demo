package com.example;

import javafx.scene.Parent;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	@RequestMapping("/")
	public String index(){
		return "Hello World!";
	}

	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
//		SpringApplication app = new SpringApplication(DemoApplication.class);
//		app.setBannerMode(Banner.Mode.OFF);
//		app.run(args);
		new SpringApplicationBuilder()
				.bannerMode(Banner.Mode.OFF)
				.sources(Parent.class)
				.child(DemoApplication.class)
				.run(args);
	}
}


