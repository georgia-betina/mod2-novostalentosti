package exercicios.introducao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.util.Date;

import exercicios.introducao.exercicio2.Hospede;
import exercicios.introducao.exercicio2.Quarto;
import exercicios.introducao.exercicio2.Reserva;

public class App5 {
    public static void main(String[] args) {
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");

        Hospede pessoa1 = new Hospede("111.111.111-11");
        pessoa1.setNome("Zezinho");
        pessoa1.setTelefone("5555-1234");

        Hospede pessoa2 = new Hospede("222.222.222-22");
        pessoa2.setNome("Mariazinha");
        pessoa2.setTelefone("5555-4321");

        Reserva reserva1 = new Reserva(1001);
        try {
            reserva1.setDataInicial(dataFormatada.parse("28/04/2022"));
            reserva1.setDataFinal(dataFormatada.parse("05/05/2022"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Quarto quarto1 = new Quarto();
        quarto1.setNumero(100);

        reserva1.getListaHospedes().add(pessoa1);
        reserva1.getListaHospedes().add(pessoa2);
        reserva1.setQuarto(quarto1);

        System.out.printf(reserva1.toString());

        Hospede pessoa3 = new Hospede("333.333.333-33");
        pessoa3.setNome("Luizinho");
        pessoa3.setTelefone("5555-1122");

        Hospede pessoa4 = new Hospede("444.444.444-44");
        pessoa4.setNome("Huguinho");
        pessoa4.setTelefone("5555-2233");

        Hospede pessoa5 = new Hospede("555.555.555-55");
        pessoa5.setNome("Paulinha");
        pessoa5.setTelefone("5555-5555");

        Quarto quarto2 = new Quarto();
        quarto2.setNumero(200);

        Reserva reserva2 = new Reserva(1002);
        try {
            reserva2.setDataInicial(dataFormatada.parse("21/04/2022"));
            reserva2.setDataFinal(dataFormatada.parse("28/04/2022"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        reserva2.setQuarto(quarto2);
        reserva2.getListaHospedes().add(pessoa3);
        reserva2.getListaHospedes().add(pessoa4);
        reserva2.getListaHospedes().add(pessoa5);
    }
}
