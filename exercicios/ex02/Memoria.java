package exercicios.ex02;

public class Memoria extends Componentes {
    private String capArmazenamentoMemoria;
    private String frequenciaMemoria;
    
    public Memoria(String marca, String modelo, String capArmazenamentoMemoria, String frequenciaMemoria) {
        super(marca, modelo);
        this.capArmazenamentoMemoria = capArmazenamentoMemoria;
        this.frequenciaMemoria = frequenciaMemoria;
    }

    public String getCapArmazenamento() {
        return capArmazenamentoMemoria;
    }

    public void setCapArmazenamento(String capArmazenamento) {
        this.capArmazenamentoMemoria = capArmazenamento;
    }

    public String getFrequenciaMemoria() {
        return frequenciaMemoria;
    }

    public void setFrequenciaMemoria(String frequenciaMemoria) {
        this.frequenciaMemoria = frequenciaMemoria;
    }

    @Override
    public String toString() {
        return "Memoria [marca=" + marca + ", capArmazenamento=" + capArmazenamentoMemoria + ", modelo=" + modelo
                + ", frequenciaMemoria=" + frequenciaMemoria + "]";
    }

    
}
