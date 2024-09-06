package ex_02;

public class Temperatura {
    public static void main(String[] args){
        double temperaturaEmCelcius = 30.4;
        double temperaturaFahrenheit = (temperaturaEmCelcius*1.8) + 32;
        String conversão = "%.2f graus Celcius equivalem a %.2f Fahrenheit.".formatted(temperaturaEmCelcius, temperaturaFahrenheit);
        System.out.println(conversão);

        int temperaturaFahrenheitInteira = (int) temperaturaFahrenheit;
        System.out.println(temperaturaFahrenheitInteira);
    }
}
