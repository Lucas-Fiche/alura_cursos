package ex_02;

public class Desconto {
    public static void main(String[] args){
        double precoOriginal = 5799.99;
        double percentualDesconto = 0.1;
        double descontoEmReais = precoOriginal * percentualDesconto;
        double valorTotal = precoOriginal - descontoEmReais;

        System.out.println(String.format("O valor %.2f com o desconto de 10%% - %.2f, sairá por %.2f reais", 
        precoOriginal, descontoEmReais, valorTotal));
    }
}
