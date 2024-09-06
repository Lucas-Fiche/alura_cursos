package ex_03;

import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String [] args){

        Scanner leitura = new Scanner(System.in);
        int numero = 0;

        System.out.println("Digite um número: ");
        numero = leitura.nextInt();
        if (numero > 0){
            System.out.println("Número Positivo!");
        } else {
            System.out.println("Número Negativo!");
        }

        leitura.close();
    }
}
