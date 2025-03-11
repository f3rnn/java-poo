package exercicios.ex03;

public enum Setor {
    RECURSOS_HUMANOS, FINANCEIRO, OPERACOES;

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
