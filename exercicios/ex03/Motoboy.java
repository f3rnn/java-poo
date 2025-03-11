package exercicios.ex03;

public class Motoboy extends Funcionario {
    private String carteiraDeHabilitacao;
    
    public Motoboy(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase, String carteiraDeHabilitacao) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    @Override
    public double getSalarioFinal() {
        return this.getSalario();
    }

    @Override
    public String toString() {
        return "carteira de habilitação: " + carteiraDeHabilitacao + "\nnome: " + nome + "\ndata de nascimento: "
                + dataNascimento + "\nsexo: " + sexo + "\nsetor: " + setor + "\nsalario: " + salario;
    }
}
