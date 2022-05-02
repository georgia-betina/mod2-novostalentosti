package exercicios.introducao.exercicio2;

import java.util.ArrayList;
import java.util.Date;

public class Reserva {
    private int numero;
    private Date dataInicial;
    private Date dataFinal;
    private Quarto quarto;
    private ArrayList<Hospede> listaHospedes = new ArrayList<>();

    public ArrayList<Hospede> getListaHospedes() {
        return listaHospedes;
    }

    public void setListaHospedes(ArrayList<Hospede> listaHospedes) {
        this.listaHospedes = listaHospedes;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public Reserva(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
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
        montadorString.append("Hóspede: ");
        montadorString.append(getListaHospedes());
        montadorString.append("\nNúmero de telefone: ");
        montadorString.append("\nNúmero do CPF: ");
        montadorString.append("\nNúmero da reserva: ");
        montadorString.append(numero);
        montadorString.append("\nData inicial: ");
        montadorString.append(dataInicial);
        montadorString.append("Data final: ");
        montadorString.append(dataFinal);
        montadorString.append("Quarto reservado: ");
        montadorString.append(getQuarto());


        return montadorString.toString();
    }

    
}
