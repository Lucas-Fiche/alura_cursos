package ex_03;

import java.util.Scanner;

public class CalculoArea {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);

        System.out.println("""
                =-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                            Menu

                1. Calcular Área do Quadrado
                2. Calcular Área do Círculo
                =-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                """);
        
        System.out.println("Digite sua opção: ");
        int menu = leitura.nextInt();

        if(menu == 1){
            System.out.println("Digite o valor de um dos lados do quadrado: ");
            int lado = leitura.nextInt();
            int areaQuadrado = lado*lado;
            System.out.println("A área do quadrado é %dm^2".formatted(areaQuadrado));
        } else if (menu == 2) {
            System.out.println("Digite o raio do Círculo: ");
            double raio = leitura.nextFloat();
            double areaCirculo = raio*raio*3.14;
            System.out.println("A área do Círculo é %.2fm^2".formatted(areaCirculo));
        }
        
        leitura.close();
    }
}
