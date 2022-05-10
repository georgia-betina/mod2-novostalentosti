package exercicios.introducao.exercicio1;

import java.text.SimpleDateFormat;

public class Livro {
    private String titulo;
    private float valor;
    private boolean esgotado;
    private Autor escritor;

    public Livro (String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public boolean isEsgotado() {
        return esgotado;
    }

    public void setEsgotado(boolean esgotado) {
        this.esgotado = esgotado;
    }

    public Autor getEscritor() {
        return escritor;
    }

    public void setEscritor(Autor escritor) {
        this.escritor = escritor;
    }

    public String toString() {
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
        StringBuilder montadorString = new StringBuilder();
        montadorString.append(String.format("Título: %s\nAutor(a): %s\nData de nascimento: %s\nValor: R$ %.2f\nEsgotado: %s\n", titulo, getEscritor().getNome(), dataFormatada.format(getEscritor().getDataNascimento()), getValor(), isEsgotado()));
        return montadorString.toString();
    }
}
