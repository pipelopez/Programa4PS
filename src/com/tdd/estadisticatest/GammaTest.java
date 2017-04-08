package com.tdd.estadisticatest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tdd.estadisticadev.Gamma;

public class GammaTest {

	@Test
	public void testGammaEntero() {
		Gamma gamma = new Gamma();
		double numero = 5;
		double resultado = gamma.sacarGamma(numero);
		System.out.println("El gamma de " + numero + " es: " + resultado);
		assertEquals(24, resultado, 0.0);
	}

	@Test
	public void testGammaDouble() {
		Gamma gamma = new Gamma();
		double numero = 4.5;
		double resultado = gamma.sacarGamma(numero);
		System.out.println("El gamma de " + numero + " es: " + resultado);
		assertEquals(11.63, resultado, 0.05);
	}

	@Test
	public void testGammaUno() {
		Gamma gamma = new Gamma();
		double numero = 1;
		double resultado = gamma.sacarGamma(numero);
		System.out.println("El gamma de " + numero + " es: " + resultado);
		assertEquals(1, resultado, 0.0);
	}

	@Test
	public void testGammaMedio() {
		Gamma gamma = new Gamma();
		double numero = 0.5;
		double resultado = gamma.sacarGamma(numero);
		System.out.println("El gamma de " + numero + " es: " + resultado);
		assertEquals(Math.sqrt(Math.PI), resultado, 0.0);
	}

}
