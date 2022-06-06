package exercicios.introducao.exercicio7;

import java.util.Date;
import java.util.HashMap;

public class ContaLuz { // calcula de acordo com cada MÊS
    private Date leituraRelogio;
    private long numeroLeitura;
    private float gastoKWMensal;
    private float valorAPagar;
    private Date dataPagamento;
    private HashMap<Integer, String> mesesDoAno = new HashMap<>();
    
    public HashMap<Integer, String> getMesesDoAno() {
        mesesDoAno.put(1, "janeiro");
        mesesDoAno.put(2, "fevereiro");
        mesesDoAno.put(3, "março");
        mesesDoAno.put(4, "abril");
        mesesDoAno.put(5, "maio");
        mesesDoAno.put(6, "junho");
        mesesDoAno.put(7, "julho");
        mesesDoAno.put(8, "agosto");
        mesesDoAno.put(9, "setembro");
        mesesDoAno.put(10, "outubro");
        mesesDoAno.put(11, "novembro");
        mesesDoAno.put(12, "dezembro");
        return mesesDoAno;
    }

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
