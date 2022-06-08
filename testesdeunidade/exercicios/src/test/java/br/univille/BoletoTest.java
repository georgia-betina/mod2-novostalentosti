package br.univille;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BoletoTest {
    @Test
    public void testaPagamentoAntesDoVencimento() {
        Boleto boleto1 = new Boleto(2500f, 5, 20, 5);
        assertEquals(2000, boleto1.pagar(4));
    }

    @Test
    public void testaPagamentoNoDiaDoVencimento() {
        Boleto boleto2 = new Boleto(2500f, 5, 20, 5);
        assertEquals(2000, boleto2.pagar(5));
    }

    @Test
    public void testaPagamentoDepoisDoVencimento() {
        Boleto boleto3 = new Boleto(2500f, 5, 20, 5);
        assertEquals(2625, boleto3.pagar(6));
    }

    @Test
    public void testaPagamentoAntesDoVencimentoSemDesconto() {
        Boleto boleto1 = new Boleto(2500f, 5, 0, 5);
        assertEquals(2500f, boleto1.pagar(4));
    }

    @Test
    public void testaPagamentoNoDiaDoVencimentoSemDesconto() {
        Boleto boleto2 = new Boleto(2500f, 5, 0, 5);
        assertEquals(2500f, boleto2.pagar(5));
    }

    @Test
    public void testaPagamentoDepoisDoVencimentoSemMulta() {
        Boleto boleto3 = new Boleto(2500f, 5, 20, 0);
        assertEquals(2500f, boleto3.pagar(6));
    }
}
