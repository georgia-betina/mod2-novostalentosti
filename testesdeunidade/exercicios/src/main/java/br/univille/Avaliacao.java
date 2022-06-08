package br.univille;

public class Avaliacao {
    private String descricao;
    private float nota;

    public Avaliacao(String descricao, float nota) {
        this.descricao = descricao;
        this.nota = nota;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getNota() {
        return nota;
    }
    public void setNota(float nota) {
        this.nota = nota;
    }
}
