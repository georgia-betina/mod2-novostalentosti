import java.util.ArrayList;

public class Aluno {
    private String nome;
    private ArrayList<Nota> listaNotas = new ArrayList<>();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Nota> getListaNotas() {
        return listaNotas;
    }
    public void setListaNotas(ArrayList<Nota> listaNotas) {
        this.listaNotas = listaNotas;
    }

    public float calcMediaNotas() {
        float soma = 0;
        for (Nota umaNota : listaNotas) {
            soma += umaNota.getValor();
        }
        float media = soma / listaNotas.size();
        return media;
    }

    public static void main(String[] args) {
        Aluno zezinho = new Aluno();
        zezinho.setNome("Zezinho da Silva");
        Nota nota1 = new Nota();
        nota1.setValor(5);
        Nota nota2 = new Nota();
        nota2.setValor(7);
        Nota nota3 = new Nota();
        nota3.setValor(6);
        zezinho.getListaNotas().add(nota1);
        zezinho.getListaNotas().add(nota2);
        zezinho.getListaNotas().add(nota3);

        float guardaMedia = zezinho.calcMediaNotas();
        System.out.printf("A média de %s é %.1f.", zezinho.getNome(), guardaMedia); 
    }
}
