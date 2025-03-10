package exercicios.ex04;

public class Juridica04 extends Pessoa04 {
    private String cnpj;
    private String inscricaoEstadual;

    public Juridica04(String nome, String telefone, String cnpj, String inscricaoEstadual) {
        super(nome, telefone);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    // Getters e Setters
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    // Método toString
    @Override
    public String toString() {
        return super.toString() + '\n' +
                "cnpj: " + cnpj + '\n' +
                "inscricaoEstadual: " + inscricaoEstadual;
    }
}
