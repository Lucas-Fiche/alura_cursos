package ex_02;

public class ValorTotal {
    public static void main(String[] args){
        double precoProduto = 9.99;
        int quantidade = 37;
        double valorTotal = precoProduto * quantidade;

        System.out.println("O valor total é %.2f".formatted(valorTotal));
    }
    
}
