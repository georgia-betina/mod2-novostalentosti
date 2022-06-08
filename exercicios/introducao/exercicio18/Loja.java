import java.util.ArrayList;

public class Loja {
    private ArrayList<Setor> listaSetores = new ArrayList<>();

    public ArrayList<Setor> getListaSetores() {
        return listaSetores;
    }
    public void setListaSetores(ArrayList<Setor> listaSetores) {
        this.listaSetores = listaSetores;
    }

    public String gerarCatalogo() {
        StringBuilder montaString = new StringBuilder();
        for (Setor umSetor : listaSetores) {
            montaString.append(String.format("\nNome do setor: %s", umSetor.getNome()));
            umSetor.getListaProdutos().forEach(umItem -> {
                montaString.append(String.format("\nNome do produto: %s | Preço: R$ %.2f | Nome do fornecedor: %s", umItem.getNome(), umItem.getPreco(), umItem.getFornecedor().getNome()));
            });
        }
        return montaString.toString();
    }

    public static void main(String[] args) {
        Loja loja1 = new Loja();

        Setor setor1 = new Setor();
        Setor setor2 = new Setor();
        Setor setor3 = new Setor();

        Produto prod1 = new Produto();
        Produto prod2 = new Produto();
        Produto prod3 = new Produto();
        Produto prod4 = new Produto();
        Produto prod5 = new Produto();

        Fornecedor forn1 = new Fornecedor();
        Fornecedor forn2 = new Fornecedor();

        loja1.getListaSetores().add(setor1);
        loja1.getListaSetores().add(setor2);
        loja1.getListaSetores().add(setor3);

        setor1.getListaProdutos().add(prod1);
        setor1.getListaProdutos().add(prod2);

        setor2.getListaProdutos().add(prod3);

        setor3.getListaProdutos().add(prod4);
        setor3.getListaProdutos().add(prod5);

        prod1.setFornecedor(forn1);
        prod2.setFornecedor(forn1);
        prod3.setFornecedor(forn1);

        prod4.setFornecedor(forn2);
        prod5.setFornecedor(forn2);

        setor1.setNome("Cama");
        setor2.setNome("Mesa");
        setor3.setNome("Banho");

        prod1.setNome("Travesseiro");
        prod1.setPreco(70f);

        prod2.setNome("Cobertor");
        prod2.setPreco(250f);

        prod3.setNome("Toalha");
        prod3.setPreco(100f);

        prod4.setNome("Toalha de banho");
        prod4.setPreco(60f);

        prod5.setNome("Toalha de rosto");
        prod5.setPreco(30f);

        forn1.setNome("Karsten");
        forn2.setNome("Dohler");

        final String catalogo = loja1.gerarCatalogo();
        System.out.println(catalogo);
    }
}
