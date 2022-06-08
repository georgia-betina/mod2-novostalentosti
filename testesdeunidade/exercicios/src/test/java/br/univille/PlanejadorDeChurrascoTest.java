package test.java.br.univille;

import java.beans.Transient;

import main.java.br.univille.PlanejadorDeChurrasco;

public class PlanejadorDeChurrascoTest {
    
    @Test
    public void testaUmAdultoZeroCriancas() {
        PlanejadorDeChurrasco planejamentoChurrascoUmAdulto = new PlanejadorDeChurrasco();
        planejamentoChurrascoUmAdulto.setAdultos(1);
        planejamentoChurrascoUmAdulto.setCriancas(0);
        assertEquals(250f, planejamentoChurrascoUmAdulto.calculaQtdCarne());
    }

    @Test
    public void testaUmaCriancaZeroAdultos() {
        PlanejadorDeChurrasco planejamentoChurrascoUmaCrianca = new PlanejadorDeChurrasco();
        planejamentoChurrascoUmaCrianca.setAdultos(0);
        planejamentoChurrascoUmaCrianca.setCriancas(1);
        assertEquals(100f, planejamentoChurrascoUmaCrianca.calculaQtdCarne());
    }

    @Test
    public void testaZeroPessoas() {
        PlanejadorDeChurrasco planejamentoChurrascoZeroPessoas = new PlanejadorDeChurrasco();
        planejamentoChurrascoZeroPessoas.setAdultos(0);
        planejamentoChurrascoZeroPessoas.setCriancas(0);
        assertEquals(0f, planejamentoChurrascoZeroPessoas.calculaQtdCarne());
    }

    @Test
    public void testaUmAdultoUmaCrianca() {
        PlanejadorDeChurrasco planejamentoChurrascoUmAdultoUmaCrianca = new PlanejadorDeChurrasco();
        planejamentoChurrascoUmAdultoUmaCrianca.setAdultos(1);
        planejamentoChurrascoUmAdultoUmaCrianca.setCriancas(1);
        assertEquals(350f, planejamentoChurrascoUmAdultoUmaCrianca.calculaQtdCarne());
    }
}
