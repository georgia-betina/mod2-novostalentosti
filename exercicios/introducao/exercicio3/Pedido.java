package exercicios.introducao.exercicio3;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private long id;
    private Date data;
    private Comprador cliente;
    private ArrayList<ItemPedido> listaItens = new ArrayList<>();

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
        // ?
        return 0f;
    }
    public Comprador getCliente() {
        return cliente;
    }
    public void setCliente(Comprador cliente) {
        this.cliente = cliente;
    }
}
