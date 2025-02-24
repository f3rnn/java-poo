//package atividade;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Marta",22, new Endereco("rua a", "32", "Salvador" ));

        System.out.println(cliente1.toString());
    }
}
