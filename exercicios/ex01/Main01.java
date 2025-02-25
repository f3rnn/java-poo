package exercicios.ex01;

public class Main01 {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo();

        veiculo1.setPlaca("AAA-1234");
        veiculo1.setCor("Preto");
        veiculo1.setNumeroPassageiros(5);
        veiculo1.setCapTanque(100);
        veiculo1.setVelMax(220);
        veiculo1.setConsumoMedio(11);

        Cliente cliente1 = new Cliente();

        cliente1.setNome("João");
        cliente1.setIdade(25);
        cliente1.setCpf("123.456.789-00");
        cliente1.setEndereco("Via Rua Alameda");
        cliente1.setTelefone("(71)91234-5678");

        System.out.println(veiculo1.toString());
        System.out.println(cliente1.toString());

    }
}
