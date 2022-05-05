package exercicios.introducao.exercicio1;

//import java.text.SimpleDateFormat;

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
        //SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");

            montadorString.append(String.format("\n\nTítulo: %s", getTitulo()));
            //montadorString.append(getTitulo());
            montadorString.append(String.format("\nValor: R$ %.2f", getValor()));
            //montadorString.append(getValor());
            montadorString.append(String.format("\nEsgotado: %s", getEsgotado()));
            //montadorString.append(getEsgotado());
            montadorString.append(String.format("\nAutor(a): %s", getEscritor()));
            //montadorString.append(escritor.getNome());
            montadorString.append(String.format("\nData de nascimento: %s", getEscritor().getDataNascimento()));
            //montadorString.append(escritor.getDataNascimento());
            
        return montadorString.toString();
    }

    
    
}
