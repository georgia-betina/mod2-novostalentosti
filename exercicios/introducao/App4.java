package exercicios.introducao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.util.GregorianCalendar;

import exercicios.introducao.exercicio1.Autor;
import exercicios.introducao.exercicio1.Livro;

public class App4 {
    public static void main(String[] args) {
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");

        Autor autorLivro1;
        try {
            autorLivro1 = new Autor("Deitel", dataFormatada.parse("01/01/1945"));
            Livro livro1 = new Livro("Java como Programar");
            livro1.setValor(349f);
            livro1.setEsgotado(false);
            livro1.setEscritor(autorLivro1);
            System.out.printf(livro1.toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //GregorianCalendar
        
        Autor autorLivro2;
        try {
            autorLivro2 = new Autor("Grady Booch", dataFormatada.parse("27/02/1955"));
            Livro livro2 = new Livro("Java 2 Ensino Didático");
            livro2.setValor(126f);
            livro2.setEsgotado(true);
            livro2.setEscritor(autorLivro2);
            System.out.printf(livro2.toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
