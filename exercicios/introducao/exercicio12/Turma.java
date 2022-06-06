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
        int somaMeninos = 0;
        final String sexoM = "Masculino";
        for (Crianca umaCrianca : listaCriancas) {
            String sexoCrianca = umaCrianca.getSexo();
            if (sexoCrianca.equals(sexoM)) {
                somaMeninos++;
            }
        }
        return somaMeninos;
    }

    public int contaMeninas() {
        return 0;
    }

    public static void main(String[] args) {
        Turma turma1 = new Turma();
        turma1.setSerie("5 série");
        Crianca crianca1 = new Crianca();
        crianca1.setNome("Zezinho");
        crianca1.setSexo("Masculino");
        Crianca crianca2 = new Crianca();
        crianca2.setNome("Mariazinha");
        crianca1.setSexo("Feminino");
        Crianca crianca3 = new Crianca();
        crianca3.setNome("Aninha");
        crianca3.setSexo("Feminino");
        Crianca crianca4 = new Crianca();
        crianca4.setNome("Julinha");
        crianca4.setSexo("Feminino");
        turma1.getListaCriancas().add(crianca1);
        turma1.getListaCriancas().add(crianca2);
        turma1.getListaCriancas().add(crianca3);
        turma1.getListaCriancas().add(crianca4);

        int quantidadeMeninos = turma1.contaMeninos();
        int quantidadeMeninas = turma1.contaMeninas();

        System.out.printf("A quantidade de meninos é %d e a de meninas é %d.", quantidadeMeninos, quantidadeMeninas);
    }
}
