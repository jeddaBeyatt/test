package com.example.dogs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class DogsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DogsApplication.class, args);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ecrire un nombre: ");

		//List<String> etudiants = new List<String>()<>;

		int nombre = scanner.nextInt();
	    for (int i= 0; i <= nombre; i++){
			System.out.println("Hello :" + i);
		}



		int a = 1;
		System.out.println(a++);
		int b = 1;
		System.out.println(++b);
		System.out.println(a);
	}

}
