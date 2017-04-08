package com.tdd.estadisticatest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tdd.estadisticadev.Factorial;

public class FactorialTest {

	@Test
	public void testFactorial() {
		double numero = 4;
		Factorial factorial = new Factorial();
		double resultado = factorial.sacarFactorial(numero);
		System.out.println("El factorial de " + numero + " es igual a: " + resultado);
		assertEquals(24, resultado, 0.0);
	}

}
