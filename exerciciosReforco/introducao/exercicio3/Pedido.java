package exerciciosReforco.introducao.exercicio3;

import java.util.ArrayList;
import java.util.Date;

import javax.sound.sampled.SourceDataLine;

public class Pedido {
    private long id;
    private Date data;
    private Comprador cliente;
    private ArrayList<ItemPedido> listaItens = new ArrayList<>();

    public Comprador getCliente() {
        return cliente;
    }

    public void setCliente(Comprador cliente) {
        this.cliente = cliente;
    }

    public ArrayList<ItemPedido> getListaItens() {
        return listaItens;
    }

    public void setListaItens(ArrayList<ItemPedido> listaItens) {
        this.listaItens = listaItens;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public float calcValorTotal() {
        float valorTotal = 0;
        for (ItemPedido iPedido : listaItens) {
            System.out.println(iPedido.getId());
            var valorItem = iPedido.getQuantidade();
            valorTotal += valorItem;
        }
        return valorTotal;
    }
}
