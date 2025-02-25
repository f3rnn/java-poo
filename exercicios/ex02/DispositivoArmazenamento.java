package exercicios.ex02;

public class DispositivoArmazenamento extends Componentes {
    private String capArmazenamentoDispositivo;
    private String tipoDeConexao;
    
    public DispositivoArmazenamento(String marca, String modelo, String capArmazenamentoDispositivo,
            String tipoDeConexao) {
        super(marca, modelo);
        this.capArmazenamentoDispositivo = capArmazenamentoDispositivo;
        this.tipoDeConexao = tipoDeConexao;
    }

    public String getCapArmazenamentoDispositivo() {
        return capArmazenamentoDispositivo;
    }

    public void setCapArmazenamentoDispositivo(String capArmazenamentoDispositivo) {
        this.capArmazenamentoDispositivo = capArmazenamentoDispositivo;
    }

    public String getTipoDeConexao() {
        return tipoDeConexao;
    }

    public void setTipoDeConexao(String tipoDeConexao) {
        this.tipoDeConexao = tipoDeConexao;
    }

    @Override
    public String toString() {
        return "DispositivoArmazenamento [marca=" + marca + ", modelo=" + modelo + ", capArmazenamentoDispositivo="
                + capArmazenamentoDispositivo + ", tipoDeConexao=" + tipoDeConexao + "]";
    }

    
}
