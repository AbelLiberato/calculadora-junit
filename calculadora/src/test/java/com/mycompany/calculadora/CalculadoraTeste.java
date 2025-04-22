/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTeste {

    operacoes operacoes = new operacoes();

    @Test
    public void testSomar() {
        assertEquals(8.0, operacoes.somar(5, 3));
    }

    @Test
    public void testSubtrair() {
        assertEquals(2.0, operacoes.subtrair(5, 3));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(15.0, operacoes.multiplicar(5, 3));
    }

    @Test
    public void testDividir() {
        assertEquals(2.0, operacoes.dividir(6, 3));
    }

    @Test
    public void testPotenciar() {
        assertEquals(8.0, operacoes.potenciar(2, 3));
    }
}

