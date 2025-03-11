package exercicios.ex03;

public abstract class Funcionario {
    protected String nome;
    protected String dataNascimento;
    protected Sexo sexo;
    protected Setor setor;
    protected double salario;

    public Funcionario(String nome, String dataNascimento, Sexo sexo, Setor setor, double salario) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.setor = setor;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public Setor getSetor() {
        return setor;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract double getSalarioFinal();

    @Override
    public String toString() {
        return "Funcionario [dataNascimento=" + dataNascimento + ", nome=" + nome + ", salario=" + salario + ", sexo="
                + sexo + ", setor=" + setor + "]";
    }
}
