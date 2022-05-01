package exercicios.introducao.exercicio1;

import java.util.ArrayList;

public class Livro {
    private String titulo;
    private Float valor;
    private Boolean esgotado;

    private ArrayList<Autor> listaEscritor = new ArrayList<>();

    public ArrayList<Autor> getListaEscritor() {
        return listaEscritor;
    }

    public Livro(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Float getValor() {
        return valor;
    }
    public void setValor(Float valor) {
        this.valor = valor;
    }
    public Boolean getEsgotado() {
        return esgotado;
    }
    public void setEsgotado(Boolean esgotado) {
        this.esgotado = esgotado;
    }

    @Override
    public String toString() {
        return "Livro [esgotado=" + esgotado + ", listaEscritor=" + listaEscritor + ", titulo=" + titulo + ", valor="
                + valor + "]";
    }

    
    
}
