package pessoa;

public class MainPessoa {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("marta", "23", "30/12/2024", "crédito");
        Funcionario funcionario1 = new Funcionario("zezão", "25", "123456", "TI", 2000);

        System.out.println(cliente1.toString());
        System.out.println(funcionario1.toString());
    }
}
