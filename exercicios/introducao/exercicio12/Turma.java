import java.util.ArrayList;

public class Turma {
    private String serie;
    private ArrayList<Crianca> listaCriancas = new ArrayList<>();

    public String getSerie() {
        return serie;
    }
    public void setSerie(String serie) {
        this.serie = serie;
    }

    public ArrayList<Crianca> getListaCriancas() {
        return listaCriancas;
    }
    public void setListaCriancas(ArrayList<Crianca> listaCriancas) {
        this.listaCriancas = listaCriancas;
    }

    public int contaMeninos() {
        return 0;
    }

    public int contaMeninas() {
        int somaMeninas = 0;
        for (Crianca umaCrianca : listaCriancas) {
            if (umaCrianca.getSexo().equals("F") || umaCrianca.getSexo().equals("feminino")  || umaCrianca.getSexo().equals("Feminino") || umaCrianca.getSexo().equals("menina") || umaCrianca.getSexo().equals("Menina")) {
                somaMeninas++;
            }
        }
        return somaMeninas;
    }

    public static void main(String[] args) {
        
    }
}
