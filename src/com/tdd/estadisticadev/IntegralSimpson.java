package com.tdd.estadisticadev;

public class IntegralSimpson {

	public double integrar(double x, double dof, double num_seg, double error) {
		double resSegmentos = hacerOperaciones(x, dof, num_seg);
		double resSegmentosDuplicados = hacerOperaciones(x, dof, (num_seg * 2));
		if (Math.abs(resSegmentos - resSegmentosDuplicados) < error) {
			return resSegmentosDuplicados;
		} else {
			System.out.println("Error: no se puede llegar a un resultado menor al error " + error);
			return 0;
		}

	}

	public double hacerOperaciones(double x, double dof, double num_seg) {
		DistribucionT distribucionT = new DistribucionT();
		double w = (x / num_seg);
		double xi = 0;
		double resultado = 0;
		for (int i = 0; i <= num_seg; i++) {
			xi = (i * w);
			if (i == 0) {
				resultado += distribucionT.sacarDistribucionT(dof, xi);
			} else {
				if (i == num_seg) {
					resultado += distribucionT.sacarDistribucionT(dof, xi);
				} else {
					if (i % 2 == 0) {
						resultado += (2 * distribucionT.sacarDistribucionT(dof, xi));
					} else {
						resultado += (4 * distribucionT.sacarDistribucionT(dof, xi));
					}
				}
			}
		}
		return resultado * (w / 3);
	}
}
