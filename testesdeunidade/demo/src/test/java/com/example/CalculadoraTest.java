package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    @DisplayName("Testa soma do valor dois com dois")
    public void testaSomaDoiseDois() {
        Calculadora calc = new Calculadora();
        assertEquals(4, calc.soma(2, 2));
    } 

    @Test
    @DisplayName("Testa soma do valor dois com cinco")
    public void testaSomaDoiseCinco() {
        Calculadora calc = new Calculadora();
        assertEquals(7, calc.soma(2, 5));
    }
}
