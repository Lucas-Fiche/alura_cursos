package ex_02;

public class Media {
    public static void main(String[] args) { 
        double nota_um = 6.3;
        double nota_dois = 7.6;
        double media = (nota_um + nota_dois)/2;

        System.out.println("A média das notas é %.2f".formatted(media));
    }
}
