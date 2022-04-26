package introducao;

public class Aplicativo {
    String nome;

    public Aplicativo(String nome) {
        setNome(nome);        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String toString(){
        return getNome();
    }
}
