import java.util.ArrayList;

public class Pedido {
    private Arraylist<Produto> listaProdutos = new ArrayList<>();

    public Arraylist<Produto> getListaProdutos() {
        return listaProdutos;
    }
    public void setListaProdutos(Arraylist<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public float calcSomaProdutos() {
        float somaValor = 0;
        for (Produto umProduto : listaProdutos) {
            somaValor += umProduto.getValor();
        }
        return somaValor;
    }

    public static void main(String[] args) {
        Pedido pedido1 = new Pedido();
        Produto prod1 = new Produto();
        prod1.setNome("banana");
        prod1.setValor(3.5f);

        pedido1.getListaProdutos().add(prod1);

        Produto prod2 = new Produto();
        prod2.setNome("laranja");
        prod2.setValor(2.2f);

        pedido1.getListaProdutos().add(prod2);

        Produto prod3 = new Produto();
        prod3.setNome("Maça");
        prod3.setValor(7.2f);

        pedido1.getListaProdutos().add(prod3);

        Produto prod4 = new Produto();
        prod4.setNome("Pêra");
        prod4.setValor(25f);

        pedido1.getListaProdutos().add(prod4);

        float guardaValor = pedido1.calcSomaProdutos();
        System.out.printf("O valor do pedido é R$ %.2f.", guardaValor);
    }
}
