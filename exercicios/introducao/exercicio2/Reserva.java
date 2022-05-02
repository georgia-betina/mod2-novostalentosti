package exercicios.introducao.exercicio2;

import java.util.Date;

public class Reserva {
    private int numero;
    private Date dataInicial;
    private Date dataFinal;
    
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
        montadorString.append();
        montadorString.append("Número da reserva: ");
        montadorString.append(numero);
        montadorString.append("Data inicial: ");
        montadorString.append(dataInicial);
        montadorString.append("Data final: ");
        montadorString.append(dataFinal);


        return montadorString.toString();
    }

    
}
