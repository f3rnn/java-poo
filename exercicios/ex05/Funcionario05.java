package exercicios.ex05;

public abstract class Funcionario05 {
    protected String nome;
    protected String email;
    protected double salario;
    protected Endereco05 endereco;

    public Funcionario05(String nome, String email, double salario, Endereco05 endereco) {
        this.nome = nome;
        this.email = email;
        this.salario = salario;
        this.endereco = endereco;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Endereco05 getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco05 endereco) {
        this.endereco = endereco;
    }

    // Método toString

    @Override
    public String toString() {
        return  "nome: " + nome + '\n' +
                "email: " + email + '\n' +
                "salario: " + salario + '\n' +
                "endereco: " + endereco;
    }
}
