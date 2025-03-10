package exercicios.ex05;

public class Engenheiro05 extends Funcionario05 {
    private String crea;

    public Engenheiro05(String nome, String email, double salario, Endereco05 endereco, String crea) {
        super(nome, email, salario, endereco);
        this.crea = crea;
    }

    // Getters e Setters
    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    // Método toString
    @Override
    public String toString() {
        return  "nome: " + nome + '\n' +
                "email: " + email + '\n' +
                "salario: " + salario + '\n' +
                "endereco: " + endereco + '\n' +
                "crea: " + crea;
    }
}
