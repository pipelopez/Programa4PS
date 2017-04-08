package com.tdd.estadisticadev;

public class DistribucionT {

	public double sacarDistribucionT(double dof, double x) {
		Gamma gamma = new Gamma();
		double resultado = 0;
		resultado = (((gamma.sacarGamma((dof + 1) / 2)) / ((Math.sqrt(dof * Math.PI)) * (gamma.sacarGamma(dof / 2))))
				* (Math.pow((1 + (Math.pow(x, 2) / dof)), (-(dof + 1) / 2))));
		return resultado;
	}
}
