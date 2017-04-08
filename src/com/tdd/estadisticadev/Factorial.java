package com.tdd.estadisticadev;

public class Factorial {

	public double sacarFactorial(double numero) {
		if (numero == 0) {
			return 1;
		} else {
			return numero * sacarFactorial(numero - 1);
		}
	}
}
