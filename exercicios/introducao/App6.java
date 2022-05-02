package exercicios.introducao;

import java.util.Date;

import exercicios.introducao.exercicio3.Comprador;
import exercicios.introducao.exercicio3.ItemPedido;
import exercicios.introducao.exercicio3.Pedido;
import exercicios.introducao.exercicio3.Produto;

public class App6 {
    public static void main(String[] args) {
        Comprador zezinho = new Comprador();
        zezinho.setId(300);
        zezinho.setNome("Zezinho da Silva");
        zezinho.setEndereco("Rua Lalala 100");

        Pedido pedido1 = new Pedido();
        pedido1.setId(1);
        pedido1.setData(new Date(2022,04,29));

        ItemPedido item1 = new ItemPedido();
        item1.setId(1);
        item1.setQuantidade(1);
        item1.setValorVenda(7500f);

        Produto produto1 = new Produto();
        produto1.setId(1001);
        produto1.setNome("Playstation 5");
        produto1.setValor(8000f);

        ItemPedido item2 = new ItemPedido();
        item2.setId(2);
        item2.setQuantidade(1);
        item2.setValorVenda(4000f);

        Produto produto2 = new Produto();
        produto2.setId(1002);
        produto2.setNome("Xbox Series X");
        produto2.setValor(5000f);

        
    }
}
