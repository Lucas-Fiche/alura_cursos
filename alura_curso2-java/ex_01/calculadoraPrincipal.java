package ex_01;
public class calculadoraPrincipal {
    public static void main(String[] args){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.dobroNumero(5);
        System.out.println(resultado);
    }
}
