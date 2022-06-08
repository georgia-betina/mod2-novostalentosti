package br.univille;

public class PlanejadorDeChurrasco {
    private int adultos;
    private int criancas;

    public int getAdultos() {
        return adultos;
    }
    public void setAdultos(int adultos) {
        this.adultos = adultos;
    }
    
    public int getCriancas() {
        return criancas;
    }
    public void setCriancas(int criancas) {
        this.criancas = criancas;
    }

    public float calculaQtdCarne() {
        float qtdTotalDeCarne = 0;
        qtdTotalDeCarne += adultos * 250;
        qtdTotalDeCarne += criancas * 100;
        return qtdTotalDeCarne;
    }
}
