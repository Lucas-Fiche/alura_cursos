package ex_01;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    void fichaTecnica(){
        System.out.println("Titulo da Música: " + titulo);
        System.out.println("Nome do Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoLancamento);
    }

    void avalia(double nota){
        avaliacao+=nota;
        numAvaliacoes++;
    }

    double media(){
        return avaliacao / numAvaliacoes;
    }
}
