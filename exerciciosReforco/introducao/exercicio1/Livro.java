package exerciciosReforco.introducao.exercicio1;

public class Livro {
    private String titulo;
    private Float valor;
    private Boolean esgotado;
    private Autor escritor;

    public Autor getEscritor() {
        return escritor;
    }

    public void setEscritor(Autor escritor) {
        this.escritor = escritor;
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

    public String toString() {
        StringBuilder montadorString = new StringBuilder();
            montadorString.append(String.format("\n\nTítulo: %s", getTitulo()));
            montadorString.append(String.format("\nPreço: R$ %.2f", getValor()));
            montadorString.append(String.format("\nEsgotado: %s", getEsgotado()));
            montadorString.append(String.format("\nAutor(a): %s", getEscritor().getNome()));
            montadorString.append(String.format("\nData de nascimento: %s", getEscritor().getDataNascimento()));
        return montadorString.toString();
    }


}
