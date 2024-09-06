package ex_02;

public class principalContaBancaria {
    public static void main(String[] args){
        ContaBancaria conta1 = new ContaBancaria();

        conta1.setNumeroConta(123);
        conta1.setSaldo(3000);
        conta1.titular = "Lucas";

        System.out.println("Numero da Conta: " + conta1.getNumeroConta());
        System.out.println("Saldo: " + conta1.getSaldo());
        System.out.println("Titular: " + conta1.titular);


    }
}
