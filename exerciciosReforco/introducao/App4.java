package exerciciosReforco.introducao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import exerciciosReforco.introducao.exercicio1.Autor;
import exerciciosReforco.introducao.exercicio1.Livro;

public class App4 {
    public static void main(String[] args) {
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");

        Livro livro1 = new Livro("Java como Programar");
        livro1.setValor(349f);
        livro1.setEsgotado(false);

        Autor autor1;
        try {
            autor1 = new Autor("Deitel", dataFormatada.parse("01/01/1945"));
            livro1.setEscritor(autor1);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println(livro1.toString());

        Livro livro2 = new Livro("UML Guia do Usuário");
        livro2.setValor(165f);
        livro2.setEsgotado(false);

        Autor autor2;
        try {
            autor2 = new Autor("Grady Booch", dataFormatada.parse("27/02/1955"));
            livro2.setEscritor(autor2);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println(livro2.toString());

        Livro livro3 = new Livro("Java 2 Ensino Didático");
        livro3.setValor(126f);
        livro3.setEsgotado(true);

        Autor autor3;
        try {
            autor3 = new Autor("Grady Booch", dataFormatada.parse(null));
            livro3.setEscritor(autor3);
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            
        }

        System.out.println(livro3.toString());
    }
}
