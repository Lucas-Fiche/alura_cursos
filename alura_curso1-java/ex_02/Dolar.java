package ex_02;

public class Dolar {
    public static void main(String[] args) {
        double valorEmDolares = 1343.75;
        double valorEmReais = 4.94;
        double conversão = valorEmDolares*valorEmReais;

        System.out.println("%.2f dólares são %.2f reais.".formatted(valorEmDolares, conversão));
    }
}
