package ch.bbw.m347.refcard03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
@SpringBootApplication
public class ArchitectureRefCard03Application {

	public static void main(String[] args) {
		SpringApplication.run(ArchitectureRefCard03Application.class, args);
	}

}
