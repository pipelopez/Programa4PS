package com.tdd.estadisticadev;

public class Gamma {

	public double sacarGamma(double numero) {
		Factorial factorial = new Factorial();

		if (numero == 1) {
			return 1;
		} else {
			if (numero % 1 == 0) {
				return factorial.sacarFactorial(numero - 1);
			} else {
				if (numero == 0.5) {
					return Math.sqrt(Math.PI);
				} else {
					return ((numero - 1) * (sacarGamma(numero - 1)));
				}
			}
		}
	}
}
