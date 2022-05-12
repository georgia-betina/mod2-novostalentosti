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
        StringBuilder montadorString = new StringBuilder();
        montadorString.append(String.format("\n\nDados do gerente:\nNome do gerente: %s\nID do gerente: %d\nSetor: %s\nTelefone: %s", getGestor().getNome(), getGestor().getId(), getGestor().getSetor(), getGestor().getTelefone()));
        for (Vendedor vendedor : listaVendedores) {
            montadorString.append(String.format("\n\nDados do vendedor:\nNome do vendedor: %s\nID do vendedor: %d\nTelefone: %s\nMeta de vendas: %.0f\nPercentual de comissão: %.0f%%", vendedor.getNome(), vendedor.getId(), vendedor.getTelefone(), vendedor.getMetaVendas(), vendedor.getPercComissao()));
        }
        return montadorString.toString();
    }
}
