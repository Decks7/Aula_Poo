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
   
}
