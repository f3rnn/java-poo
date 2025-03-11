package exercicios.ex03;

public class Diretor extends Funcionario implements Contratacao {
    private final double PREMIO = 0.2;

    public Diretor(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public double getSalarioFinal() {
        double salarioFinal = 0;
        salarioFinal = (super.salario * PREMIO) + super.salario;
        salarioFinal += super.salario;  
        return salarioFinal;
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Admitindo funcionário: " + funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitindo funcionário: " + funcionario.toString());
    }

    @Override
    public String toString() {
        return "nome: " + nome + "\ndata de nascimento=" + dataNascimento + "\nsexo: " + sexo + "\nsetor: " + setor
                + "\nsalario: " + this.getSalarioFinal();
    }

}
