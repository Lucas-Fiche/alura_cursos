package ex_03;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = leitura.nextInt();

        for (int i = 1; i < 11; i++){
            System.out.println(String.format("%d * %d = ", numero, i) + numero*i);
        }

        leitura.close();
    }
}
