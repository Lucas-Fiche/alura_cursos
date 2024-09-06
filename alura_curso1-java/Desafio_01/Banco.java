package Desafio_01;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args){

        Scanner leitura = new Scanner(System.in);
        

        System.out.println("Digite seu nome: ");
        String nome = leitura.nextLine();

        System.out.println("Digite seu saldo: ");
        double saldo = leitura.nextFloat();


        System.out.println("""
            *********************************
            Dados Iniciais do cliente:
            
            Nome:          %s
            Tipo conta:    Corrente
            Saldo Inicial:  R$%.2f
            *********************************
                """.formatted(nome, saldo));

            String menu = """
            =-=-=-=-=-=-=-=-=-=-=-=-=-=
                Operações
                
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair

                Digite sua opção:
            =-=-=-=-=-=-=-=-=-=-=-=-=-=
                    """;

            int opcao = 0;
            while(opcao != 4){

                System.out.println(menu);
                opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println(String.format("O seu saldo é de R$%.2f.", saldo));
            } else if (opcao == 2) {
                System.out.println("Quanto você vai receber?");
                double receber = leitura.nextFloat();
                saldo += receber;
                System.out.println(String.format("O seu saldo é R$%.2f.", saldo));
            } else if (opcao==3){
                System.out.println("Quanto você vai transferir?");
                double transferir = leitura.nextFloat();
                if(transferir>saldo){
                    System.out.println("Saldo insuficiente!");
                } else {
                    saldo-=transferir;
                    System.out.println(String.format("O seu saldo é de R$%.2f.", saldo));
                } 
            } else if (opcao > 4) {
                System.out.println("Opção Inválida!");
            }
            }

            System.out.println("Obrigado, volte sempre!");

            leitura.close();
            
    }
}
