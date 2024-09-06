package ex_01;

public class musicaPrincipal {
    public static void main(String[] args){
        Musica musica1 = new Musica();
        musica1.titulo = "Runnaway";
        musica1.artista = "Galantis";
        musica1.anoLancamento = 2010;

        musica1.fichaTecnica();

        musica1.avalia(10);
        musica1.avalia(10);

        double mediaAvaliacoes = musica1.media();
        System.out.println(mediaAvaliacoes);

        Musica musica2 = new Musica();
        musica2.titulo = "Bom Dia, Fazendinha";
        musica2.artista = "Não sei";
        musica2.anoLancamento = 2001;

        musica2.fichaTecnica();

        musica2.avalia(8);
        musica2.avalia(10);

        double mediaAvaliacoes2 = musica2.media();
        System.out.println(mediaAvaliacoes2);

    }
}
