package exercicios.ex01;

public class Veiculo {
    private String placa;
    private String cor;
    private int numeroPassageiros;
    private double capTanque;
    private double velMax;
    private double consumoMedio;
    
    public Veiculo() {
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public double getCapTanque() {
        return capTanque;
    }

    public void setCapTanque(double capTanque) {
        this.capTanque = capTanque;
    }

    public double getVelMax() {
        return velMax;
    }

    public void setVelMax(double velMax) {
        this.velMax = velMax;
    }

    public double getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }

    @Override
    public String toString() {
        return "Veiculo [placa=" + placa + ", cor=" + cor + ", numeroPassageiros=" + numeroPassageiros + ", capTanque="
                + capTanque + ", velMax=" + velMax + ", consumoMedio=" + consumoMedio + "]";
    }

    
}
