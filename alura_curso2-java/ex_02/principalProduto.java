package ex_02;

public class principalProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto();

        produto1.setNome("Camisa do Botafogo");
        produto1.setPreco(349.50);
        System.out.println("Preço sem Desconto: " + produto1.getPreco());

        produto1.aplicarDesconto(0.1);

        System.out.println("Produto: " + produto1.getNome());
        System.out.println("Preço com Desconto: " + produto1.getPreco());
    }
}
