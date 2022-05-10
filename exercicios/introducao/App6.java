package exercicios.introducao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.util.Date;

import exercicios.introducao.exercicio3.Comprador;
import exercicios.introducao.exercicio3.ItemPedido;
import exercicios.introducao.exercicio3.Pedido;
import exercicios.introducao.exercicio3.Produto;

public class App6 {
    public static void main(String[] args) {
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");

        Comprador zezinho = new Comprador();
        zezinho.setId(300);
        zezinho.setNome("Zezinho da Silva");
        zezinho.setEndereco("Rua Lalala 100");

        Pedido pedido1 = new Pedido();
        pedido1.setId(1);
        try {
            pedido1.setData(dataFormatada.parse("29/04/2022"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

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

        pedido1.setCliente(zezinho);
        pedido1.getListaItens().add(item1);
        pedido1.getListaItens().add(item2);

        Comprador mariazinha = new Comprador();
        mariazinha.setNome("Maria Braga da Silva");
        mariazinha.setId(301);
        mariazinha.setEndereco("Rua Pipipi, 101");

        Pedido pedido2 = new Pedido();
        pedido2.setId(2);
        try {
            pedido2.setData(dataFormatada.parse("10/05/2022"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        ItemPedido item3 = new ItemPedido();
        item3.setId(3);
        item3.setQuantidade(2);
        item3.setValorVenda(137.98f);

        ItemPedido item4 = new ItemPedido();
        item4.setId(4);
        item4.setQuantidade(1);
        item4.setValorVenda(80f);

        ItemPedido item5 = new ItemPedido();
        item5.setId(5);
        item5.setQuantidade(1);
        item5.setValorVenda(30753f);

        Produto produto3 = new Produto();
        produto3.setId(1003);
        produto3.setNome("Minecraft Java Edition");
        produto3.setValor(150f);

        Produto produto4 = new Produto();
        produto4.setId(1004);
        produto4.setNome("Moka");
        produto4.setValor(100f);

        Produto produto5 = new Produto();
        produto5.setId(1005);
        produto5.setNome("iPad Pro");
        produto5.setValor(34170f);

        pedido2.setCliente(mariazinha);
        pedido2.getListaItens().add(item3);
        pedido2.getListaItens().add(item4);
        pedido2.getListaItens().add(item5);

        float valorPedido1 = pedido1.calcValorTotal();
        float valorPedido2 = pedido2.calcValorTotal();
        System.out.printf("O valor do pedido 1 é R$ %.2f\nO valor do pedido 2 é R$ %.2f", valorPedido1, valorPedido2);
    }
}
