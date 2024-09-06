package ex_02;

public class Produto {
    private String nome;
    private double preco;
    public double valorPercentual;

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }


    public double aplicarDesconto(double valorPercentual){
        double desconto = preco*valorPercentual;
        preco-=desconto;
        return preco;
    }
}
