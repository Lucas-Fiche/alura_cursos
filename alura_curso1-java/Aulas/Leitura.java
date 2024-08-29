package Aulas;
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito:");
        String filme = leitura.nextLine();
        System.out.println(String.format("Seu filme favorito é %s", filme));

        System.out.println("Qual o ano de lançamento? ");
        int anoLancamento = leitura.nextInt();
        System.out.println("Diga a sua avaliação para o filme: ");
        double avaliacao = leitura.nextDouble();
        // No scanner será utilizado a vírgula para ponto flutuante, por causa da lingua do computador. 

        System.out.println(String.format("O ano de lançamento é %d e sua nota foi %.1f", anoLancamento, avaliacao));

        leitura.close();
    }
}
