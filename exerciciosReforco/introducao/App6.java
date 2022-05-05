package exerciciosReforco.introducao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import exerciciosReforco.introducao.exercicio3.Comprador;
import exerciciosReforco.introducao.exercicio3.ItemPedido;
import exerciciosReforco.introducao.exercicio3.Pedido;
import exerciciosReforco.introducao.exercicio3.Produto;

public class App6 {
    public static void main(String[] args) {
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");

        Comprador zezinho = new Comprador();
        zezinho.setId(300);
        zezinho.setNome("Zezinho da Silva");
        zezinho.setEndereco("Rua Lalala 100");

        Produto produto1 = new Produto();
        produto1.setId(1001);
        produto1.setNome("Playstation 5");
        produto1.setValor(8000f);

        Produto produto2 = new Produto();
        produto2.setId(1002);
        produto2.setNome("Xbox Series X");
        produto2.setValor(5000f);

        ItemPedido item1 = new ItemPedido();
        item1.setId(1);
        item1.setQuantidade(1);
        item1.setValorVenda(7500f);
        item1.setProduto(produto1);

        ItemPedido item2 = new ItemPedido();
        item2.setId(2);
        item2.setId(1);
        item2.setValorVenda(4000f);
        item2.setProduto(produto2);

        Pedido pedido1 = new Pedido();
        pedido1.setId(1);
        try {
            pedido1.setData(dataFormatada.parse("29/04/2022"));
            pedido1.setCliente(zezinho);
            pedido1.getListaItens().add(item1);
            pedido1.getListaItens().add(item2);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println(pedido1.calcValorTotal());
        //System.out.println(Pedido.calcValorTotal);
    }
}
