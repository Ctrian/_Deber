package com.uce.edu;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DeberApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DeberApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Cristian Olivares - Taller 5");
		System.out.println("Cambio en la misma rama");
	}

}
