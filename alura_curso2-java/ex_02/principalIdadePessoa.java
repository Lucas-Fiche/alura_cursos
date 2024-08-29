package ex_02;

public class principalIdadePessoa {
    public static void main(String[] args){
        IdadePessoa pessoa1 = new IdadePessoa();

        pessoa1.setNome("Lucas");
        pessoa1.setIdade(23);

        IdadePessoa pessoa2 = new IdadePessoa();

        pessoa2.setNome("Cath");
        pessoa2.setIdade(17);

        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());

        pessoa1.verificarIdade();

        System.out.println("Nome: " + pessoa2.getNome());
        System.out.println("Idade: " + pessoa2.getIdade());

        pessoa2.verificarIdade();
    }
}
