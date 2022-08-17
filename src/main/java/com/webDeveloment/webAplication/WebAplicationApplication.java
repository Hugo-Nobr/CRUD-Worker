package com.webDeveloment.webAplication;

import com.webDeveloment.webAplication.Worker.Worker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.Local;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
public class WebAplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebAplicationApplication.class, args);
	}

}
