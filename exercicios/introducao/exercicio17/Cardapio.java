import java.util.ArrayList;

public class Cardapio {
    private ArrayList<ItemCardapio> listaItensCardapio = new ArrayList<>();

    public ArrayList<ItemCardapio> getListaItensCardapio() {
        return listaItensCardapio;
    }
    public void setListaItensCardapio(ArrayList<ItemCardapio> listaItensCardapio) {
        this.listaItensCardapio = listaItensCardapio;
    }

    public String gerarCardapio() {
        StringBuilder montaString = new StringBuilder();
        for (ItemCardapio umItemDoCardapio : listaItensCardapio) {
            if (umItemDoCardapio.isDisponivel() == true) {
                montaString.append(String.format("\nNome: %s | Preço: R$ %.2f", umItemDoCardapio.getPrato().getNome(), umItemDoCardapio.getPrato().getPreco()));
            }
        }
        return montaString.toString();
    }

    public static void main(String[] args) {
        Cardapio card = new Cardapio();

        ItemCardapio item1 = new ItemCardapio();
        ItemCardapio item2 = new ItemCardapio();
        ItemCardapio item3 = new ItemCardapio();
        ItemCardapio item4 = new ItemCardapio();

        Prato prato1 = new Prato();
        Prato prato2 = new Prato();
        Prato prato3 = new Prato();
        Prato prato4 = new Prato();

        card.getListaItensCardapio().add(item1);
        card.getListaItensCardapio().add(item2);
        card.getListaItensCardapio().add(item3);
        card.getListaItensCardapio().add(item4);

        item1.setPrato(prato1);
        item2.setPrato(prato2);
        item3.setPrato(prato3);
        item4.setPrato(prato4);

        item1.setDisponivel(true);
        item2.setDisponivel(true);
        item3.setDisponivel(false);
        item4.setDisponivel(true);

        prato1.setNome("Bifão");
        prato1.setPreco(10f);
        prato2.setNome("Feijoada");
        prato2.setPreco(30f);
        prato3.setNome("Dobradinha");
        prato3.setPreco(50f);
        prato4.setNome("Hamburguer");
        prato4.setPreco(20f);

        final String mostraCardapio = card.gerarCardapio();

        System.out.println(mostraCardapio);
    }
}
