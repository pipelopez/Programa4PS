package com.tdd.estadisticatest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tdd.estadisticadev.IntegralSimpson;

public class IntegralSimpsonTest {

	@Test
	public void testHacerOperaciones() {
		IntegralSimpson integralSimpson = new IntegralSimpson();
		double x = 1.1;
		double dof = 9;
		double num_seg = 10;
		double resultado = integralSimpson.hacerOperaciones(x, dof, num_seg);
		System.out.println("El resultado de las operaciones es: " + resultado);
		assertEquals(0.35005890, resultado, 0.0005);
	}

	@Test
	public void testIntegrar() {
		IntegralSimpson integralSimpson = new IntegralSimpson();
		double x = 1.1;
		double dof = 9;
		double num_seg = 10;
		double error = 0.00001;
		double resultado = integralSimpson.integrar(x, dof, num_seg, error);
		System.out.println("El resultado de las integración es: " + resultado);
		assertEquals(0.35005863, resultado, 0.0005);
	}

	@Test
	public void testIntegrarErrorMuyPequeño() {
		IntegralSimpson integralSimpson = new IntegralSimpson();
		double x = 1.1;
		double dof = 9;
		double num_seg = 10;
		double error = 0.000000000000000000000000001;
		double resultado = integralSimpson.integrar(x, dof, num_seg, error);
		System.out.println("El resultado de las integración es: " + resultado);
		assertEquals(0.0, resultado, 0);
	}

}
