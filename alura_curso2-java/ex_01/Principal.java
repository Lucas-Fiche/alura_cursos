package ex_01;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args){
        Filme meuFilme = new Filme();
        meuFilme.setNome("O Poderoso Chefão"); 
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        
        meuFilme.exibeFicheTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de Avaliações: " + meuFilme.gettotalAvaliacoes());
        // System.out.println(meuFilme.totalAvaliacoes); --> não utilizamos mais essa forma por se tratar de um método privado 

        System.out.println(meuFilme.pegaMedia());

        Serie minhaSerie = new Serie();
        minhaSerie.setNome("Lost");
        minhaSerie.setAnoDeLancamento(2000);
        minhaSerie.exibeFicheTecnica();
        minhaSerie.setTemporadas(10);
        minhaSerie.setEpisodiosPorTemporada(10);
        minhaSerie.setMinutosPorEpisodio(50);
        System.out.println("Duração para Maratonar Lost: " + minhaSerie.getDuracaoEmMinutos());
    }
}

// Classe --> Modelo | Objeto --> Atributos | Métodos --> Funções 

// Encapsulamento --> esconder detalhes internos de uma classe, mantendo os atributos e métodos protegidos