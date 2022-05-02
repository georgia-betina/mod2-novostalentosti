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
        /*return "Livro \"" + titulo + "\"\n" + "Autor(a): " + getEscritor().getNome() + " | Data de nascimento: " + getEscritor().getDataNascimento() + "\nEstoque: " + esgotado + "\n" + "Valor: R$ "
                + valor;*/
        StringBuilder montadorString = new StringBuilder();

            montadorString.append("Título: ");
            montadorString.append(getTitulo());
            montadorString.append("Valor: R$ ");
            montadorString.append(getValor());
            montadorString.append("Esgotado: ");
            montadorString.append(getEsgotado());
            montadorString.append("Autor(a): ");
            montadorString.append(escritor.getNome());
            montadorString.append("Data de nascimento: ");
            montadorString.append(escritor.getDataNascimento());
            
        return montadorString.toString();
    }

    
    
}
