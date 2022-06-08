package br.univille;

public class Boleto {
    private float valor;
    private int diaDoVencimento;
    private float percentualDesconto;
    private float percentualMulta;

    public Boleto(float valor, int diaDoVencimento, float percentualDesconto, float percentualMulta) {
        this.valor = valor;
        this.diaDoVencimento = diaDoVencimento;
        this.percentualDesconto = percentualDesconto;
        this.percentualMulta = percentualMulta;
    }

    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getDiaDoVencimento() {
        return diaDoVencimento;
    }
    public void setDiaDoVencimento(int diaDoVencimento) {
        this.diaDoVencimento = diaDoVencimento;
    }

    public float getPercentualDesconto() {
        return percentualDesconto;
    }
    public void setPercentualDesconto(float percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public float getPercentualMulta() {
        return percentualMulta;
    }
    public void setPercentualMulta(float percentualMulta) {
        this.percentualMulta = percentualMulta;
    }

    public float pagar(int diaDoPagamento) {
        if (diaDoPagamento <= diaDoVencimento) {
            /* Transforma o percentual em decimal */
            float percentualDescontoEmDecimal = percentualDesconto / 100;

            /* Aplica o desconto */
            float aplicadesconto = 0;
            aplicadesconto = valor * percentualDescontoEmDecimal;
            valor -= aplicadesconto;
        } else if (diaDoPagamento > diaDoVencimento) {
            /* Transforma o percentual em decimal */
            float percentualMultaEmDecimal = percentualMulta / 100;

            /* Aplica multa */
            float aplicamulta = 0;
            aplicamulta = valor * percentualMultaEmDecimal;
            valor += aplicamulta;
        }
        return valor;
    }
}
