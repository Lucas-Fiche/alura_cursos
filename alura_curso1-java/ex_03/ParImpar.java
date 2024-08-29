package ex_03;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args){

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = leitura.nextInt();

        if(numero%2==0){
            System.out.println("Número Par");
        } else {
            System.out.println("Número Ímpar");
        }

        leitura.close();
    }
}
