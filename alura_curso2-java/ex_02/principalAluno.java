package ex_02;

public class principalAluno {
    public static void main(String[] args){
        Aluno aluno1 = new Aluno("Lucas", 10, 8.5, 7);
        Aluno aluno2 = new Aluno("Catherine", 10, 10, 9.2);

        System.out.println("Aluno 1: ");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Nota 1: " + aluno1.getNota1());
        System.out.println("Nota 2: " + aluno1.getNota2());
        System.out.println("Nota 3: " + aluno1.getNota3());
        double media = aluno1.calcularMedia();
        System.out.println("Media: " + media);

        System.out.println("Aluno 2: ");
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Nota 1: " + aluno2.getNota1());
        System.out.println("Nota 2: " + aluno2.getNota2());
        System.out.println("Nota 3: " + aluno2.getNota3());
        double mediaaluno2 = aluno2.calcularMedia();
        System.out.println("Media: " + mediaaluno2);
    }
}
