package com.facimp.projetoPooJava;

import jakarta.persistence.Entity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com.facimp.projetoPooJava")
@EntityScan(basePackages = "com.facimp.projetoPooJava.model")
public class ProjetoPooJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoPooJavaApplication.class, args);
	}

}
