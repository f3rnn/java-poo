package exercicios.ex05;

public class Main05 {
    public static void main(String[] args) {
        // Instanciando engenheiro com endereço
        Engenheiro05 engenheiro = new Engenheiro05(
            "Carlos Silva", 
            "carlossilva@email.com", 
            1500,
            new Endereco05(
                "Rua dos Engenheiros", 
                "100", 
                "Sala 10", 
                "123456-789", 
                "São Paulo"
            ),
            "123456-SP"
        );   

        // Instanciando médico com endereço (nome, telefone, salario, endereco, crm)
        Medico05 medico = new Medico05(
            "Ana Santos",
            "medico@email.com",
            2500,
            new Endereco05(
                "Avenida dos Médicos",
                "200",
                "Consultório 20",
                "87654-321",
                "São Paulo"
            ),
            "CRM/SP 54321"
        );

        // Exibindo as informações
        System.out.println("=== Dados do Engenheiro ===");
        System.out.println(engenheiro);
        System.out.println("\n=== Dados do Médico ===");
        System.out.println(medico);
    }
}
