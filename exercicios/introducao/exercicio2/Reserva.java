package exercicios.introducao.exercicio2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Reserva {
    private int numero;
    private Date dataInicial;
    private Date dataFinal;
    private ArrayList<Hospede> listaHospedes = new ArrayList<>();
    private Quarto quarto;

    public Reserva(int numero){
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

    public String toString() {
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
        StringBuilder montadorString = new StringBuilder();

        montadorString.append(String.format("\nNúmero da reserva: %d\nData inicial da reserva: %s\nData final da reserva: %s\n", numero, dataFormatada.format(dataInicial), dataFormatada.format(dataFinal)));
        for (Hospede hospede : listaHospedes) {
            montadorString.append(String.format("\nNome do hóspede: %s", hospede.getNome()));
            montadorString.append(String.format("\nCPF: %s", hospede.getCpf()));
            montadorString.append(String.format("\nTelefone: %s", hospede.getTelefone()));
        }
        montadorString.append(String.format("\nQuarto: %d", quarto.getNumero()));
        
        return montadorString.toString();
    }
}
//         for (int i = 0; i < listaHospedes.size(); i++) {
//             Hospede umHospede = listaHospedes.get(i);
//             montadorString.append("\nHóspede - Nome: " + umHospede.getNome());
//             montadorString.append("\nHóspede - Telefone: " + umHospede.getTelefone());
//             montadorString.append("\nHóspede - CPF: " + umHospede.getCpf());
//         }

