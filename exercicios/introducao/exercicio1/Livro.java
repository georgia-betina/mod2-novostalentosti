package exercicios.introducao.exercicio1;

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

    @Override
    public String toString() {
        return "Livro \"" + titulo + "\"\n" + "Autor(a): " + escritor + "\nEstoque: " + esgotado + "\n" + "Valor: R$ "
                + valor;
    }

    
    
}
