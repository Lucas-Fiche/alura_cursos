package ex_02;

public class Livro {
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor; 
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void exibirDetalhes(){
        System.out.println("""
                Detalhes do Livro:
                Título: %s
                Autor: %s
                """.formatted(titulo, autor));
    }
}
