package exercicios.ex05;

public class Medico05 extends Funcionario05 {
    private String crm;

    public Medico05(String nome, String email, double salario, Endereco05 endereco, String crm) {
        super(nome, email, salario, endereco);
        this.crm = crm;
    }

    // Getters e Setters
    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    // Método toString
    @Override
    public String toString() {
        return  "nome: " + nome + '\n' +
                "email: " + email + '\n' +
                "salario: " + salario + '\n' +
                "endereco: " + endereco + '\n' +
                "crm: " + crm;
    }
}
