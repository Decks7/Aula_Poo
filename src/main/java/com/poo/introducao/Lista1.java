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
    void ex4(){
        Scanner scanner = new Scanner(System.in);
        // Exercicio 4
		int numero4;
		int antecessor;
		int sucessor;
		System.out.println("Escreva seu numero :");
		numero4 = scanner.nextInt();
		
		antecessor =numero4 - 1 ;
		sucessor = numero4 + 1;

		System.out.println("O seu numero antecessor é : "+ antecessor +" O seu sucessor é : "+ sucessor);
    }
    void ex5(){
        Scanner scanner = new Scanner(System.in);
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
    void ex6(){

        Scanner scanner = new Scanner(System.in);

        int distancia;
        int custoC;
        int resultado6;
        int litro = 6;

        System.out.println("Digite a distancia : ");
        distancia = scanner.nextInt();

        System.out.println("Digite o Valor do combustivel ; ");
        custoC = scanner.nextInt();
        resultado6= distancia/(custoC/litro);
        System.out.println("Sua Autonomia foi : "+ resultado6);
    }
    void ex7(){
        Scanner scanner = new Scanner(System.in);

        double nota1,nota2,nota3,nota4;
       double resultado6;
        System.out.println("Digite sua nota1 :");
        nota1 = scanner.nextInt();
        System.out.println("Digite sua nota2 :");
        nota2 = scanner.nextInt();
        System.out.println("Digite sua nota3 :");
        nota3 = scanner.nextInt();
        System.out.println("Digite sua nota4 :");
        nota4 = scanner.nextInt();

        resultado6 = (nota1+nota2+nota3+nota4)/4;
        System.out.println("Sua Media é : "+ resultado6);
        


        
    }
    void ex8(){
        Scanner scanner = new Scanner(System.in);
        
        double fahrenheit;
        double celsius;

        System.out.println("Digite a Temperatura em Fahreinheit : ");
        fahrenheit = scanner.nextInt();

        celsius = (fahrenheit -32) /1.8;

      System.out.println("Sua temperatura em celsius é : "+celsius);

        
    }
 
}
