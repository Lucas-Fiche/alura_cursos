package ex_03;

import java.util.Scanner;

public class Igualdade {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero_um = leitura.nextInt();

        System.out.println("Digite o segundo número: ");
        int numero_dois = leitura.nextInt();

        if (numero_um == numero_dois) {
            System.out.println("Os números são iguais!");
        } else {
            System.out.println("Os números são diferentes!");
            if (numero_um>numero_dois){
                System.out.println(String.format("O número 1 (%d) é maior!", numero_um));
            } else {
                System.out.println(String.format("O número 2 (%d) é maior", numero_dois));
            }
        }

        leitura.close();
    }
}
