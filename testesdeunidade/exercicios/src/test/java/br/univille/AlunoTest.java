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
        //assertEquals(7, aluno1.calculaMedia());
        assertEquals(true, aluno1.estaAprovado());
        assertEquals(false, aluno1.estaEmExame());
        assertEquals(false, aluno1.estaReprovado());
    }

    @Test
    public void testaAlunoReprovado() {
        Aluno aluno2 = new Aluno();
        Avaliacao avaliacao1 = new Avaliacao("Desenho", 7);
        Avaliacao avaliacao2 = new Avaliacao("Gravura", 7);
        Avaliacao avaliacao3 = new Avaliacao("História da Arte Moderna", 7);
        aluno2.setPercentualDeFrequencia(74);
        aluno2.getListaNotas().add(avaliacao1);
        aluno2.getListaNotas().add(avaliacao2);
        aluno2.getListaNotas().add(avaliacao3);
        assertEquals(false, aluno2.estaAprovado());
        assertEquals(false, aluno2.estaEmExame());
        assertEquals(true, aluno2.estaReprovado());
    }

    @Test
    public void testaAlunoEmExame() {
        Aluno aluno3 = new Aluno();
        Avaliacao avaliacao1 = new Avaliacao("", 6);
        Avaliacao avaliacao2 = new Avaliacao("", 6);
        Avaliacao avaliacao3 = new Avaliacao("", 6);
        aluno3.setPercentualDeFrequencia(75);
        aluno3.getListaNotas().add(avaliacao1);
        aluno3.getListaNotas().add(avaliacao2);
        aluno3.getListaNotas().add(avaliacao3);
        assertEquals(false, aluno3.estaAprovado());
        assertEquals(true, aluno3.estaEmExame());
        assertEquals(false, aluno3.estaReprovado());
    }
}
