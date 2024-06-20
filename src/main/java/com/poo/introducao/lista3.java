package com.poo.introducao;
import java.util.Scanner;
public class lista3 {
    void ex1() {
        int numeroDigitado;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um Numero para iniciar o Contador");
        numeroDigitado = scanner.nextInt();
        if (numeroDigitado>1 && numeroDigitado<59) {
            try {
                for (int i = numeroDigitado; i > 0; i--) {
                    System.out.println(i + " segundos restantes.");
                    Thread.sleep(1000); 
                }
                System.out.println("Tempo esgotado!");
            } catch (InterruptedException e) {
                System.out.println("O cronômetro foi interrompido.");
            } 
        } else {
            System.out.println("Digite um Número entre 1 e 59");
        }
    }
    void ex2() {
        Scanner scanner=new Scanner(System.in);
        int numeroTabuada;

        System.out.println("Digite o Número que deseja saber a tabuada");
        numeroTabuada = scanner.nextInt();
        System.out.println("==== Tabuada ====");
        for(int i = numeroTabuada;i<numeroTabuada*11;i=i+numeroTabuada){
            System.out.println();
            System.out.println(i);
            
        }

    }
    void ex3() {
        Scanner scanner=new Scanner(System.in);
        int numeroInteiro1,numeroInteiro2;
        int maior,menor;
        System.out.println("Digite o Primeiro número inteiro : ");
        numeroInteiro1=scanner.nextInt();

        System.out.println("Digite o Segundo número inteiro : ");
        numeroInteiro2=scanner.nextInt();
        System.out.println("==== Os Números Pares entre eles é ====");
        if(numeroInteiro1>numeroInteiro2){
            maior=numeroInteiro1+1;
            menor = numeroInteiro2;
        } else{
            maior=numeroInteiro2+1;
            menor=numeroInteiro1;
        }
        for(int i= menor;i<+maior;i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }
     void ex4() {
            Scanner scanner = new Scanner(System.in);
            
            // Primeira pessoa escolhe um número
            System.out.println("Pessoa 1, escolha um número (não deixe a Pessoa 2 ver!):");
            int numeroEscolhido = scanner.nextInt();
            
            // Limpar a tela para esconder o número escolhido (apenas simulação, pode ser melhorado)
            for (int i = 0; i < 50; i++) {
                System.out.println();
            }
            
            // Segunda pessoa tenta adivinhar o número
            System.out.println("Pessoa 2, tente adivinhar o número:");
            int tentativa;
            boolean acertou = false;
            
            while (!acertou) {
                tentativa = scanner.nextInt();
                
                if (tentativa == numeroEscolhido) {
                    System.out.println("Parabéns! Você acertou!");
                    acertou = true;
                } else if (Math.abs(tentativa - numeroEscolhido) <= 2) {
                    System.out.println("Quase lá!");
                } else if (tentativa < numeroEscolhido) {
                    if (numeroEscolhido - tentativa > 10) {
                        System.out.println("Muito baixo! Tá frio.");
                    } else {
                        System.out.println("Tá frio. Um pouco mais alto.");
                    }
                } else {
                    if (tentativa - numeroEscolhido > 10) {
                        System.out.println("Muito alto! Tá frio.");
                    } else {
                        System.out.println("Tá frio. Um pouco mais baixo.");
                    }
                }
            }
        }
        void ex5() {
            Scanner scanner = new Scanner(System.in);
            String login = "Diego";
            String senha = "1234";
            String loginDigitado;
            String senhaDigitada;
            int tentivas = 3;
            System.out.println("==== Login Banco ====");
            System.out.println();
            for(int i= tentivas;tentivas>0;i--){
                
                System.out.println("Digíte Seu Login : ");
                loginDigitado = scanner.nextLine();
                
                if (!(loginDigitado.equals(login))) {
                    System.out.println("Login incorreto!");
                    tentivas= tentivas-1;
                    System.out.println();
                    System.out.println("Você tem "+tentivas+" Chances!");
                    System.out.println();
                } else {
                    System.out.println("Digite Sua Senha : ");
                    senhaDigitada = scanner.nextLine();
                    if (!(senhaDigitada.equals(senha))) {
                        System.out.println("Senha Incorreta!");
                        tentivas = tentivas-1;
                        System.out.println();
                        System.out.println("Você tem "+tentivas+" Chances!");
                        System.out.println();
                    } else {
                        System.out.println("Bem Vindo! ");
                        break;
                    }
                }
            }
        }
        void ex6() {
            Scanner scanner = new Scanner(System.in);
        
            // Solicita ao usuário o número de andares da pirâmide
            System.out.println("Digite o número de andares da pirâmide:");
            int andares = scanner.nextInt();
            
            // Desenha a pirâmide de asteriscos
            for (int i = 1; i <= andares; i++) {
                // Imprime espaços em branco
                for (int j = 1; j <= andares - i; j++) {
                    System.out.print(" ");
                }
                // Imprime asteriscos
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }
                // Move para a próxima linha
                System.out.println();
            }
            
        }
        void ex7() {
            int largura;
            int altura;
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite a altura : ");
            altura = scanner.nextInt();

            System.out.println("Digite a largura : ");
            largura =  scanner.nextInt();
            
            for (int i = 0; i < altura; i++) {
                for (int j = 0; j < largura; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

