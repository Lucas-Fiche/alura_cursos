package ex_03;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
       int numeroAleatorio = new Random().nextInt(100);
       int tentativas = 1;
       Scanner leitura = new Scanner(System.in);
       int chute = 0;

        System.out.println(numeroAleatorio);

       while(tentativas<=5) {
        System.out.println("Digite seu chute (entre 0 e 100): ");
        chute = leitura.nextInt();
       
        if (chute != numeroAleatorio){
            if (chute > numeroAleatorio){
                System.out.println("Um pouco menor!");
            } else {
                System.out.println("Um pouco maior!");
            }
        } else {
            System.out.println("Você acertou o número! Parábens!");
            System.out.println(String.format("O número era %d e foram precisas %d tentativas", numeroAleatorio, tentativas));
            break;
        }

        tentativas++;

        if (tentativas > 5 && chute != numeroAleatorio){
            System.out.println(String.format("Você não acertou! O número era %d", numeroAleatorio));
        }
       }

       leitura.close();
    }
}
