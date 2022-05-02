package exercicios.introducao.exercicio1;

import java.util.ArrayList;
import java.util.Date;

public class Autor {
    private String nome;
    private Date dataNascimento;
    private ArrayList<Livro>listaLivros = new ArrayList<>();

    public ArrayList<Livro> getListaLivros() {
        return listaLivros;
    }

    public void setListaLivros(ArrayList<Livro> listaLivros) {
        this.listaLivros = listaLivros;
    }

    public Autor (String nome, Date dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public Autor(String nome2, String string) {
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Date getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
