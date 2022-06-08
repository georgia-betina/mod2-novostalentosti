package br.univille;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AlunoTest {
    @Test
    public void testaAlunoAprovado() {
        Aluno aluno1 = new Aluno();
        Avaliacao avaliacao1 = new Avaliacao("Álgebra Linear", 7);
        Avaliacao avaliacao2 = new Avaliacao("Algoritmos e Estrutura de Dados", 7);
        Avaliacao avaliacao3 = new Avaliacao("Cálculo I", 7);
        aluno1.setPercentualDeFrequencia(75f);
        aluno1.getListaNotas().add(avaliacao1);
        aluno1.getListaNotas().add(avaliacao2);
        aluno1.getListaNotas().add(avaliacao3);
        aluno1.
        //assertEquals(7, aluno1.calculaMedia());
        assertEquals(true, aluno1.estaAprovado());
        //assertEquals(true, aluno1.estaAprovado());
        assertEquals(false, aluno1.estaEmExame());
        assertEquals(false, aluno1.estaReprovado());
    }
}
