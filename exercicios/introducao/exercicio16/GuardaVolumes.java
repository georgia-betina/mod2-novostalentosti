import java.util.ArrayList;

public class GuardaVolumes {
    private ArrayList<Item> listaItens = new ArrayList<>();

    public ArrayList<Item> getListaItens() {
        return listaItens;
    }
    public void setListaItens(ArrayList<Item> listaItens) {
        this.listaItens = listaItens;
    }

    public String gerarListaItens() {
        StringBuilder montaString = new StringBuilder();
        for (Item umItem : listaItens) {
            montaString.append(String.format("\nItem: %s | Proprietário: %s", umItem.getNome(), umItem.getProprietario().getNome()));
        }
        return montaString.toString();
    }

    public static void main(String[] args) {
        GuardaVolumes guarda = new GuardaVolumes();

        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        Item item4 = new Item();
        Item item5 = new Item();
        Item item6 = new Item();

        Proprietario prop1 = new Proprietario();
        Proprietario prop2 = new Proprietario();

        guarda.getListaItens().add(item1);
        guarda.getListaItens().add(item2);
        guarda.getListaItens().add(item3);
        guarda.getListaItens().add(item4);
        guarda.getListaItens().add(item5);
        guarda.getListaItens().add(item6);

        item1.setProprietario(prop1);
        item2.setProprietario(prop1);

        item3.setProprietario(prop2);
        item4.setProprietario(prop2);
        item5.setProprietario(prop2);
        item6.setProprietario(prop2);

        item1.setNome("Chave de casa");
        item2.setNome("Celular");
        item3.setNome("Chave de casa");
        item4.setNome("Celular");
        item5.setNome("Carteira");
        item6.setNome("Escova de cabelos");

        prop1.setNome("Zezinho");
        prop2.setNome("Mariazinha");

        final String listaDeItens = guarda.gerarListaItens();

        System.out.println(listaDeItens);
    }
}
