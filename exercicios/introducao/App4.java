package exercicios.introducao;

import java.util.Date;
//import java.util.GregorianCalendar;

import exercicios.introducao.exercicio1.Autor;
import exercicios.introducao.exercicio1.Livro;

public class App4 {
    public static void main(String[] args) {

        Autor autorLivro1 = new Autor("Deitel", new Date(1945,01,01));
        //GregorianCalendar
        Livro livro1 = new Livro("Java como Programar");
        livro1.setValor(349f);
        livro1.setEsgotado(false);
        livro1.setEscritor(autorLivro1);

        Autor autorLivro2 = new Autor("Grady Booch", new Date());
        Livro livro2 = new Livro("Java 2 Ensino Didático");
        livro2.setValor(126f);
        livro2.setEsgotado(true);
        livro2.setEscritor(autorLivro2);

        System.out.printf(livro1.toString());
        System.out.printf(livro2.toString());
    }
}
