package com.poo.introducao;
import java.util.Scanner;

public class lista2 {

    void ex() {
        Scanner scanner = new Scanner(System.in);

        int numeroDigitado;

        System.out.println("Digite um número :");
        numeroDigitado = scanner.nextInt();

        if ((numeroDigitado & 1) == 0) {
            System.out.println("Este número é par.");
        }
        else{
            System.out.println("Seu número e Ìmpar .");
        }
    }
    void ex2 () {
        Scanner scanner = new Scanner(System.in);

        int numero1,numero2;

        System.out.println("Digite um número :");
        numero1 = scanner.nextInt();

        System.out.println("Digite outro número :");
        numero2 = scanner.nextInt();

        if (numero1>numero2 ) {
            System.out.println("Seu Primeiro Número é maior");
        }
        else {
            System.out.println("Seu Segundo Número é maior");
        }
    }
    void ex3 () {
        Scanner scanner = new Scanner(System.in);
        boolean idade;
        boolean deficienteGestante ;

        System.out.println("Você Tem mais de 65 anos ?");
        idade = scanner.nextBoolean();

        if (idade == true) {
            System.out.println("Você será encaminhado para a fila preferencial");

        }
        else  { 
            System.out.println("Você é Deficiente ou Gestante ?");
            deficienteGestante = scanner.nextBoolean();
            if (deficienteGestante == true) {
                System.out.println("Você será encaminhado para a fila preferencial");
            }
            else {
                System.out.println("Você será encaminhado para a fila comum ");
            }
        }
       
    }
    void ex4 () {
        Scanner scanner = new Scanner(System.in);
        int idade;

        System.out.println("Escreva sua Idade : ");
        idade = scanner.nextInt();

        if ( idade >18) {
            System.out.println("Entrada Liberado");
        } else if ((idade >= 16)&&(idade <= 18)) {
            System.out.println("Entrada Somente Acompanhado Pelos Responsaveis");
        } else {
            System.out.println("Proibida a Entrada");
        }
        
    }
    void ex5 () {
        Scanner scanner = new Scanner(System.in);
        String login = "Diego";
        String senha = "1234";
        String login2;
        String senha2;

        System.out.println("Digíte Seu Login : ");
        login2 = scanner.nextLine();
        if (login.equals(login2) ){
            System.out.println("Digite Sua Senha : " );
            senha2 = scanner.nextLine();
            if (senha.equals(senha2) ) {
                System.out.println("Bem Vindo ");
            } else {
                System.out.println(" Senha Incorreta ");
            }
        } else {
            System.out.println("Login Incorreto ");

        }
    }
    void ex6 () {
        Scanner scanner = new Scanner(System.in);
        int nota1,nota2,recuperacao,media ;

        System.out.println("Digite Sua Nota do Teste : ");
        nota1 = scanner.nextInt();

        System.out.println("Digite sua Nota da Prova : ");
        nota2 = scanner.nextInt();

        media = (nota1 + nota2)/2 ;

        if (media > 5) {
            System.out.println("APROVADO!");
        } else {
            System.out.println("Digite Sua Nota da Recuperação: ");
            recuperacao = scanner.nextInt();

            if (recuperacao > nota1 && recuperacao > nota2) {
                if (nota1 < nota2) {
                    nota1 = recuperacao;
                } else {
                    nota2 = recuperacao;
                }
            } else if (recuperacao > nota1) {
                nota1 = recuperacao;
            } else if (recuperacao > nota2) {
                nota2 = recuperacao;
            }

            media = (nota1 + nota2) / 2;

            if (media > 5) {
                System.out.println("APROVADO!");
            } else {
                System.out.println("REPROVADO!");
            }
        }
          
    }
    void ex7 () {
        Scanner scanner = new Scanner(System.in);
        int numeroDividir ;
        int divisor;
        int verificador;

        System.out.println("Digite um Número para dividir : ");
        numeroDividir = scanner.nextInt();

        System.out.println("Digite o Divisor : ");
        divisor = scanner.nextInt();
        if ((numeroDividir&divisor)==0) {
            System.out.println("Número Divisivel");
        } 
        else {
            System.out.println("Número Não Divisivel");
        }
    }
    void ex8() {
        Scanner scanner = new Scanner(System.in);
        int contador = 0 ;
        String resposta1,resposta2,resposta3,resposta4,resposta5;
        System.out.println("1. Quem foi a primeira pessoa a viajar no Espaço?\r\n" + //
                        "a) Yuri Gagarin\r\n" + //
                        "b) A cadela Laika\r\n" + //
                        "c) Neil Armstrong\r\n" + //
                        "d) Marcos Pontes\r\n" + //
                        "e) Buzz Aldrin");
        // System.out.println("a) Yuri Gagarin b) A cadela Laika c) Neil Armstrong d) Marcos Pontes ");
        resposta1 = scanner.nextLine();

        switch (resposta1) {
            case "a": 
                System.out.println("Resposta Errada");
                contador = contador + 1;
                break;
            case "b":
                System.out.println("Resposta Errada");
                contador = contador + 1;
                break;
            case "c": 
                System.out.println("Resposta Certa");
                
                break;
            case "d": 
                System.out.println("Resposta Errada");
                contador = contador + 1;
                break;
        }

        System.out.println("2. Qual a montanha mais alta do mundo?\r\n" + //
                        "a) Mauna Kea\r\n" + //
                        "b) Dhaulagiri\r\n" + //
                        "c) Monte Chimborazo\r\n" + //
                        "d) Monte Everest\r\n" + //
                        "e) Pico da Neblina");
        resposta2 = scanner.nextLine();
        switch (resposta2) {
            case "a": 
                System.out.println("Resposta Errada");
                contador = contador + 1;
                break;
            case "b":
                System.out.println("Resposta Errada");
                contador = contador + 1;
                break;
            case "c": 
                System.out.println("Resposta Errada");
                contador = contador + 1;
                break;
            case "d": 
                System.out.println("Resposta Certa");
                
                break;
        }

        System.out.println("3. Onde se localiza Machu Picchu?\r\n" + //
                        "a) Colômbia\r\n" + //
                        "b) Peru\r\n" + //
                        "c) China\r\n" + //
                        "d) Bolívia\r\n" + //
                        "e) Índia");
        resposta3 = scanner.nextLine();
        switch (resposta3) {
            case "a": 
                System.out.println("Resposta Errada");
                contador = contador + 1;
                break;
            case "b":
                System.out.println("Resposta Certa");
                
                break;
            case "c": 
                System.out.println("Resposta Errada");
                contador = contador + 1;
                break;
            case "d": 
                System.out.println("Resposta Errada");
                contador = contador + 1;
                break;
        }
        if (contador>=3){
            System.out.println("Você Perdeu");
        }
        else {
            System.out.println("4. Que país tem o formato de uma bota?\r\n" + //
                            "a) Butão\r\n" + //
                            "b) Brasil\r\n" + //
                            "c) Portugal\r\n" + //
                            "d) Itália\r\n" + //
                            "e) México");
            resposta4 = scanner.nextLine();

            switch (resposta4) {
                case "a": 
                    System.out.println("Resposta Errada");
                    contador = contador + 1;
                    break;
                case "b":
                    System.out.println("Resposta Errada");
                    contador = contador + 1;
                    break;
                case "c": 
                    System.out.println("Resposta Errada");
                    contador = contador + 1;
                    break;
                case "d": 
                    System.out.println("Resposta Certa");
                    
                    break;
            }
            if (contador>= 3){
                System.out.println("Você Perdeu");
            }
            else {
               System.out.println("5. Quem inventou a lâmpada?\r\n" + //
                                      "a) Graham Bell\r\n" + //
                                      "b) Steve Jobs\r\n" + //
                                      "c) Thomas Edison\r\n" + //
                                      "d) Henry Ford\r\n" + //
                                      "e) Santos Dumont"); 
                resposta5 = scanner.nextLine();
                switch (resposta5) {
                case "a": 
                    System.out.println("Resposta Errada");
                    contador = contador + 1;
                    break;
                case "b":
                    System.out.println("Resposta Errada");
                    contador = contador + 1;
                    break;
                case "c": 
                    System.out.println("Resposta Certa");
                 
                    break;
                case "d": 
                    System.out.println("Resposta Errada");
                    contador = contador + 1;
                    break;
                }

            }
            
        }
        if (contador>= 3){
            System.out.println("Você Perdeu, Tente Novamente");
        }
        else {
            System.out.println("Você Ganhou");
        }
    }   

}
