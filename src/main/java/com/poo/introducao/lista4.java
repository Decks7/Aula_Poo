package com.poo.introducao;
import java.util.Scanner;
public class lista4 {
    void ex1() {
        int [] soma = {100,22,30,33,15};
        int valor=0;

        for(int i=0;i<soma.length;i++){
        valor += soma[i];
        }
        System.out.println("O valor da soma do dia é " + valor);
        
          

    }
    void ex2() {
        int [] soma = {8,22,30,10,15};
        int menor= soma[0];
        int maior= soma[0];

        for(int i=0;i<soma.length;i++){
            if(soma[i]<menor){
                menor= soma[i];

            } else if (soma[i]>maior){
                maior = soma[i];
            }
        }
        System.out.println("maior = "+maior+" ,Menor = "+menor);
    }
    void ex3() {
        int [] soma = {100,22,30,33,15};
        int valor=0;
        int ticket;
        for(int i=0;i<soma.length;i++){
        valor += soma[i];
        }
        ticket = valor/soma.length;

        System.out.println("O valor da soma do dia é " + valor);
        System.out.println("O Ticket Médio é "+ticket);
          
    }
    void ex4() {
        int [] lista = { 3, 5, 6, 7, 8, 10, 22, 55, 110 };
        int contador = 0;

        for(int i=0;i<lista.length;i++){
            if ((lista[i] % 2)==0) {
                contador+=1;
                System.out.print("números Pares "+lista[i]);
                System.out.println(" ,Quantidade = "+contador);
            }
        }
    }
    void ex5678() {
        Scanner scanner = new Scanner(System.in);

        String[] listaMercado = new String[10];
        String[] precoLista = new String[10];
        int tamanhoLista=0;
        boolean addpreco;
        String valor;
        while(true){  
            System.out.println("=====  Lista de Compras =====");
            System.out.println("1. Adicionar Item/Adicionar Preço");
            System.out.println("2. Ver Lista");
            System.out.println("3. Remover Item");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 
            if (opcao==1) {
                System.out.println("Digite o item que deseja Adicionar a Lista");
                String item = scanner.nextLine();
               
                listaMercado[tamanhoLista]=item;
                System.out.println("Item Adicionado!");
                System.out.println("Deseja adicionar o Preço?");
                addpreco = scanner.nextBoolean();
                if (addpreco==true) {
                    scanner.nextLine();
                    System.out.println("Digite o Preço do item");
                    valor = scanner.nextLine();
                    precoLista[tamanhoLista]=valor;
                } else if (addpreco==false) {
                    System.out.println("Seu Item ja se encontra na lista!");
                }
                tamanhoLista++;
                
            } else if (opcao==2) {
                System.out.println("=====  Lista =====");
                for (int i = 0; i < tamanhoLista; i++) {
                    System.out.println((i + 1) + ". " + listaMercado[i]+" R$"+precoLista[i]);

                }
                
            } else if (opcao==3) {
                System.out.println("Digite o numero do item que deseja remover: ");
                int removerItem;
                removerItem=scanner.nextInt();
                listaMercado[(tamanhoLista-removerItem)]=null;
            } else if (opcao==4) {
                System.out.println("Saindo...");
                break;
            }

        }
    }
}
