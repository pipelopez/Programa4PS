package com.tdd.estadisticatest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tdd.estadisticadev.DistribucionT;

public class DistribucionTTest {

	@Test
	public void testSacarDistribucionT() {
		DistribucionT distribucionT = new DistribucionT();
		double dof = 9;
		double x = 1.1;
		double resultado = distribucionT.sacarDistribucionT(dof, x);
		System.out.println("El resultado de la distribución es: " + resultado);
		assertEquals(0.2065, resultado, 0.5);
	}
}
