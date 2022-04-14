package org.dijure.smelly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmellyApplication {

	public static void main(String[] args) {
		Math math = new Math();
		SpringApplication.run(SmellyApplication.class, args);
	}

}
