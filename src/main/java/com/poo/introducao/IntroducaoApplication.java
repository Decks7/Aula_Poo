package com.poo.introducao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;
@SpringBootApplication
public class IntroducaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntroducaoApplication.class, args);
		Scanner scanner = new Scanner(System.in);
		//Exercicio 1
		int numero1;
		int numero2;
		int resultado;

		System.out.println("Digite um numero para a soma :");
		numero1 = scanner.nextInt();
		
		System.out.println("Digite Outro Número :");
		numero2 =scanner.nextInt();
		resultado=numero1 + numero2;
		System.out.println("A soma Entre os dois números é" + resultado);

		//Exercicio 2
		
		String nome;
		String sobrenome;
		System.out.println("Escreva seu nome : ");
		nome = scanner.nextLine();
		System.out.println("Digite seu Sobrenome :");
		sobrenome = scanner.nextLine();

		System.out.println("Olá "+nome+" "+sobrenome);

		//Exercicio 3

		float dolar = 5.25f;
		float real;
		float resultado3;

		System.out.println("Digite o Valor a ser convertido em dolar :");
		real = scanner .nextFloat();

		resultado3 = real * dolar ;

		System.out.println("Seu valor em dolar é : "+resultado);

		// Exercicio 4
		int numero4;
		int antecessor;
		int sucessor;
		System.out.println("Escreva seu numero :");
		numero4 = scanner.nextInt();
		
		antecessor =numero4-- ;
		sucessor = numero4++;

		System.out.println("O seu numero antecessor é : "+ antecessor +" O seu sucessor é : "+ sucessor);

		// Exercicio 5

		int largura;
		int comprimento;
		int resultado5;
		System.out.println("Digite a Largura do terreno :");
		largura = scanner.nextInt();

		System.out.println("Digite o Comprimento do terreno");
		comprimento = scanner.nextInt();
		resultado5 = largura * comprimento;
		System.out.println("Seu m^2 É : "+resultado5);



	}

}
