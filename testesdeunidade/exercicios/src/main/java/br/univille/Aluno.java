package br.univille;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private float percentualDeFrequencia;
    private ArrayList<Avaliacao> listaNotas = new ArrayList<>();
    private float calculaMedia() {
        float somaNotas = 0;
        float calculaMedia = 0;
            for (Avaliacao umaAvaliacao : listaNotas) {
            somaNotas += umaAvaliacao.getNota();
        }
        calculaMedia = somaNotas / listaNotas.size();
        return calculaMedia;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public float getPercentualDeFrequencia() {
        return percentualDeFrequencia;
    }
    public void setPercentualDeFrequencia(float percentualDeFrequencia) {
        this.percentualDeFrequencia = percentualDeFrequencia;
    }

    public ArrayList<Avaliacao> getListaNotas() {
        return listaNotas;
    }
    public void setListaNotas(ArrayList<Avaliacao> listaNotas) {
        this.listaNotas = listaNotas;
    }

    public boolean estaEmExame() {
        if (calculaMedia() >= 3 && calculaMedia() < 7 && percentualDeFrequencia >= 75) {
            return true;
        } else {
            return false;
        }
    }

    public boolean estaAprovado() {
        if (calculaMedia() >= 7 && percentualDeFrequencia >= 75) {
            return true;
        } else {
            return false;
        }
    }

    public boolean estaReprovado() {
        if (calculaMedia() < 3 || percentualDeFrequencia < 75) {
            return true;
        } else {
            return false;
        }
    }
}
