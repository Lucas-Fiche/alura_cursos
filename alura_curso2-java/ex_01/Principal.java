package ex_01;
import br.com.alura.screenmatch.modelos.Filme;

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
    }
}

// Classe --> Modelo | Objeto --> Atributos | Métodos --> Funções 

// Encapsulamento --> esconder detalhes internos de uma classe, mantendo os atributos e métodos protegidos