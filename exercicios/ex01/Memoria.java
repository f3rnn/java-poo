package exercicios.ex01;

public class Memoria extends Componentes {
    private String capacidadeArmazenamento;

    public Memoria(String marca, String modelo, String capacidadeArmazenamento) {
        super(marca, modelo);
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    public String getCapacidadeArmazenamento() {
        return capacidadeArmazenamento;
    }

    public void setCapacidadeArmazenamento(String capacidadeArmazenamento) {
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    @Override
    public String toString() {
        return "Memoria [marca=" + marca + ", capacidadeArmazenamento=" + capacidadeArmazenamento + ", modelo=" + modelo
                + "]";
    }
    
}
