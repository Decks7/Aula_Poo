package com.poo.introducao;
import java.util.Scanner;
public class Lista1 {
    void ex2(){
        Scanner scanner = new Scanner(System.in);
        //Exercicio 2
		
		String nome;
		String sobrenome;
		System.out.println("Escreva seu nome : ");
		nome = scanner.nextLine();
		System.out.println("Digite seu Sobrenome :");
		sobrenome = scanner.nextLine();

		System.out.println("Olá "+nome+" "+sobrenome);
    }
    void ex3(){
        Scanner scanner = new Scanner(System.in);
        //Exercicio 3

		double dolar = 5.25d;
		double real;
		double resultado3;

		System.out.println("Digite o Valor a ser convertido em dolar :");
		real = scanner .nextDouble();

		resultado3 = real / dolar ;

		System.out.println("Seu valor em dolar é : "+resultado3);
    }
   
}
