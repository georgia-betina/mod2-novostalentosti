package exercicios.introducao.exercicio7;

import java.util.Date;

public class ContaLuz { // calcula de acordo com cada MÊS
    private Date leituraRelogio;
    private long numeroLeitura;
    private float gastoKWMensal;
    private float valorAPagar;
    private Date dataPagamento;

    public Date getLeituraRelogio() {
        return leituraRelogio;
    }
    public void setLeituraRelogio(Date leituraRelogio) {
        this.leituraRelogio = leituraRelogio;
    }
    public long getNumeroLeitura() {
        return numeroLeitura;
    }
    public void setNumeroLeitura(long numeroLeitura) {
        this.numeroLeitura = numeroLeitura;
    }
    public float getGastoKWMensal() {
        return gastoKWMensal;
    }
    public void setGastoKWMensal(float gastoKWMensal) {
        this.gastoKWMensal = gastoKWMensal;
    }
    public float getValorAPagar() {
        return valorAPagar;
    }
    public void setValorAPagar(float valorAPagar) {
        this.valorAPagar = valorAPagar;
    }
    public Date getDataPagamento() {
        return dataPagamento;
    }
    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
}
