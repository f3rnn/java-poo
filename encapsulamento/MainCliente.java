public class MainCliente {
    public static void main(String[] args) {
        Cliente clienteUm = new Cliente();

        clienteUm.setNome("João");
        clienteUm.setEmail("joaozinho@gmail.com");
        clienteUm.setSenha("123");

        System.out.println("nome: " + clienteUm.getNome());
        System.out.println("email: " + clienteUm.getEmail());
        System.out.println("senha: " + clienteUm.getSenha());

        //com construtor

        Cliente clienteDois = new Cliente("maria", "mariazinha@gmaial.com", "321");

        System.out.println(clienteDois.toString());
    }
}
