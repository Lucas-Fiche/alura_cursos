package ex_01;

public class carroPrincipal {
    public static void main(String[] args){
        Carro carro1 = new Carro();
        carro1.modelo = "Polo";
        carro1.ano = 2019;
        carro1.cor = "Cinza Escuro";

        carro1.fichaTecnica();

        int idadeCarro = carro1.calculaIdade();
        System.out.println("Idade do Carro: " + idadeCarro + " Anos");
    }
}
