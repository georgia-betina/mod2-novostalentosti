package exercicios.introducao.exercicio6;

import java.util.ArrayList;

public class EquipeDeVendas {
    private Gerente gestor;
    private ArrayList<Vendedor> listaVendedores = new ArrayList<>();

    public Gerente getGestor() {
        return gestor;
    }
    public void setGestor(Gerente gestor) {
        this.gestor = gestor;
    }
    public ArrayList<Vendedor> getListaVendedores() {
        return listaVendedores;
    }
    public void setListaVendedores(ArrayList<Vendedor> listaVendedores) {
        this.listaVendedores = listaVendedores;
    }

    public String listarEquipe(){
        return "";
    }
}
