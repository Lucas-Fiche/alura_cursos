package ex_03;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = leitura.nextInt();
        int fatorial = 1;

        for (int i = numero; i >=1; i--){
            fatorial = fatorial * i;
        }

        System.out.println(fatorial);
        
        leitura.close();
    }
}
