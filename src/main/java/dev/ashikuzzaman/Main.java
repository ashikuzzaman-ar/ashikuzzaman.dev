package dev.ashikuzzaman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		try {
			log.info("Staring Application");
			SpringApplication.run(Main.class, args);
			log.info("Application Started");
		} catch (Exception e) {
			log.error("Exception In Starting Application", e);
		}
	}

}
