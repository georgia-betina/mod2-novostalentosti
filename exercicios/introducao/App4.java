package exercicios.introducao;

import exercicios.introducao.exercicio1.Livro;

public class App4 {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Java como Programar");
        livro1.setValor(349f);
        livro1.setEsgotado(false);

        System.out.println(livro1);
    }
}
