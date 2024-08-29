package br.com.alura.screenmatch.modelos;

public class Filme {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalAvaliacoes;
    private int duracaoEmMinutos; 

    public String getNome(){
        return nome;
    }

    public int getAnoDeLancamento(){
        return anoDeLancamento;
    }

    public boolean getIncluidoNoPlano(){
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos(){
        return duracaoEmMinutos;
    }

    public int gettotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    /*
    
    public void setNome(String n){
        nome = n;
    }

     */

     public void setAnoDeLancamento(int anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
     }

     public void setIncluidoNoPlano(boolean incluidoNoPlano){
        this.incluidoNoPlano = incluidoNoPlano;
     }

     public void setDuracaoEmMinutos(int duracaoEmMinutos){
        this.duracaoEmMinutos = duracaoEmMinutos;
     }

    public void exibeFicheTecnica(){
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Duração do Filme em Minutos: " + duracaoEmMinutos);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalAvaliacoes;
    }
}

//   Modelo | Especificação

// O import é a forma que uma classe se referencia a outra quando estão em pacotes diferentes 