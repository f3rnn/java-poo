package exercicios.ex04;

public abstract class Pessoa04 {
    protected String nome;
    protected String telefone;

    public Pessoa04(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Método toString
    @Override
    public String toString() {
        return  "nome: " + nome + '\n' +
                "telefone: " + telefone;
    }
}
