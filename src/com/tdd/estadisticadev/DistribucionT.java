package com.tdd.estadisticadev;

public class DistribucionT {

	public double sacarDistribucionT(double dof, double x) {
		Gamma gamma = new Gamma();
		double resultado = 0;
		double dividendo = (gamma.sacarGamma((dof + 1) / 2));
		double divisor = ((Math.sqrt(dof * Math.PI)) * (gamma.sacarGamma(dof / 2)));
		double multiplicador = (Math.pow((1 + (Math.pow(x, 2) / dof)), (-(dof + 1) / 2)));
		resultado = (dividendo / divisor)* multiplicador;
		return resultado;
	}
}
