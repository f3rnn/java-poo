package exercicios.ex04;

public class Fisica04 extends Pessoa04 {
    private String cpf;
    private String rg;
    private String dataNascimento;

    public Fisica04(String nome, String telefone, String cpf, String rg, String dataNascimento) {
        super(nome, telefone);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }

    // Getters e Setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    // Método toString
    @Override
    public String toString() {
        return super.toString() + '\n' +
                "cpf: " + cpf + '\n' +
                "rg: " + rg + '\n' +
                "dataNascimento: " + dataNascimento;
    }

}
