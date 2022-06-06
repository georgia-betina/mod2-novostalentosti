import java.util.ArrayList;

public class Vestibular {
    private ArrayList<Vestibulando> listaVestibulandos = new ArrayList<>();

    public ArrayList<Vestibulando> getListaVestibulandos() {
        return listaVestibulandos;
    }
    public void setListaVestibulandos(ArrayList<Vestibulando> listaVestibulandos) {
        this.listaVestibulandos = listaVestibulandos;
    }

    public String gerarListaAprovados() {
        StringBuilder listaDeAprovacao = new StringBuilder();
        listaDeAprovacao.append("LISTA DE APROVADOS:");
        for (Vestibulando umVestibulando : listaVestibulandos) {
            if (umVestibulando.getNota() >= 7) {
                listaDeAprovacao.append(String.format("\nNome: %s | Nota: %.1f", umVestibulando.getNome(), umVestibulando.getNota()));
            }
        }
        return listaDeAprovacao.toString();
    }

    public static void main(String[] args) {
        Vestibular acafe = new Vestibular();
        Vestibulando vest1 = new Vestibulando();
        vest1.setNome("Zezinho");
        vest1.setNota(7);

        Vestibulando vest2 = new Vestibulando();
        vest2.setNome("Pedrinho");
        vest2.setNota(5);

        Vestibulando vest3 = new Vestibulando();
        vest3.setNome("Huguinho");
        vest3.setNota(10);

        Vestibulando vest4 = new Vestibulando();
        vest4.setNome("Luizinho");
        vest4.setNota(8);

        acafe.getListaVestibulandos().add(vest1);
        acafe.getListaVestibulandos().add(vest2);
        acafe.getListaVestibulandos().add(vest3);
        acafe.getListaVestibulandos().add(vest4);

        String listaDeAprovados = acafe.gerarListaAprovados();

        System.out.println(listaDeAprovados);
    }
}
