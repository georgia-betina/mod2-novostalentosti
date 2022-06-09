package br.univille;

import java.util.ArrayList;

public class ImpostoDeRenda {
    private float valorImptoRetidonaFonte;
    private ArrayList<Rendimento> listaRendimentos = new ArrayList<>();
    private float calculaRendimento() {
        float somaRendimentos = 0;
        for (Rendimento umRendimento : listaRendimentos) {
            somaRendimentos += umRendimento.getValor();
        }
        final float rendimentosPorMes = somaRendimentos / 12;
        return rendimentosPorMes;
    }

    private float aplicaIRPF(float imposto) {
        float aplicaIRPF = 0;
        aplicaIRPF = calculaRendimento() * imposto;
        aplicaIRPF = calculaRendimento() - aplicaIRPF - valorImptoRetidonaFonte;
        return aplicaIRPF;
    }

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
        if (calculaRendimento() >= 1903.99 && calculaRendimento() <= 2826.65) {
            return aplicaIRPF(0.075f);
        } else if (calculaRendimento() >= 2826.66 && calculaRendimento() <= 3751.05) {
            return aplicaIRPF(0.15f);
        } else if (calculaRendimento() >= 3751.06 && calculaRendimento() <= 4664.68) {
            return aplicaIRPF(0.255f);
        } else if (calculaRendimento() > 4664.68) {
            return aplicaIRPF(0.275f);
        } else {
            return 0f;
        }
    }
}
