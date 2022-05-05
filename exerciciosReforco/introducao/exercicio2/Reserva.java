package exerciciosReforco.introducao.exercicio2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Reserva {
    private int numero;
    private Date dataInicial;
    private Date dataFinal;
    private ArrayList<Hospede> listaHospedes = new ArrayList<>();
    private Quarto quarto;

    public Quarto getQuarto(){
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public ArrayList<Hospede> getListaHospedes() {
        return listaHospedes;
    }

    public void setListaHospedes(ArrayList<Hospede> listaHospedes) {
        this.listaHospedes = listaHospedes;
    }

    public Reserva(int numero) {
        this.numero = numero;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String toString() {
        StringBuilder montadorString = new StringBuilder();
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");

        for (Hospede umHospede : listaHospedes) {
            montadorString.append(String.format("\nNome: %s", umHospede.getNome()));
            montadorString.append(String.format("\nTelefone: %s", umHospede.getTelefone()));
            montadorString.append(String.format("\nCPF: %s", umHospede.getCpf()));
        }

        montadorString.append(String.format("\nNúmero da reserva: %d", getNumero()));
        montadorString.append(String.format("\nData inicial: %s", dataFormatada.format(dataInicial)));
        montadorString.append(String.format("\nData final: %s", dataFormatada.format(dataFinal)));
        montadorString.append(String.format("\nNúmero do quarto: %d", quarto.getNumero()));

        return montadorString.toString();
    }
}
