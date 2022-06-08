package br.univille;

import java.util.ArrayList;

public class ImpostoDeRenda {
    private float valorImptoRetidonaFonte;
    private ArrayList<Rendimento> listaRendimentos = new ArrayList<>();

    public float getValorImptoRetidonaFonte() {
        return valorImptoRetidonaFonte;
    }
    public void setValorImptoRetidonaFonte(float valorImptoRetidonaFonte) {
        this.valorImptoRetidonaFonte = valorImptoRetidonaFonte;
    }

    public ArrayList<Rendimento> getListaRendimentos() {
        return listaRendimentos;
    }
    public void setListaRendimentos(ArrayList<Rendimento> listaRendimentos) {
        this.listaRendimentos = listaRendimentos;
    }

    public float calculaValorIRPF() {
        return 0f;
    }
}
