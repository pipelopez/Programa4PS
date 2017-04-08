package com.tdd.main;

import com.tdd.estadisticadev.IntegralSimpson;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		IntegralSimpson integralSimpson = new IntegralSimpson();
		// Pedir datos al usuario
		Scanner scanner = new Scanner(System.in);
		double x=0;
		double dof =0;
		double num_seg=0;
		double error =0;
		System.out.println(
				"Los números sólo deben estar separados por una coma \",\" para representar la fracción decimal.");
		try {
			System.out.println("Ingrese el valor del límite superior de la integral X: ");
			x = scanner.nextDouble();
			System.out.println("Ingrese el valor para dof: ");
			dof = scanner.nextDouble();
			System.out.println("Ingrese el valor de num_seg: ");
			num_seg = scanner.nextDouble();
			System.out.println("Ingrese el valor del error E: ");
			error = scanner.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("Parámetros mal ingresados, ejecute el programa de nuevo y siga las instrucciones correctamente.");
			System.exit(0);
		}

		// Realizar la integral con el métodoSimpson
		double resultado = integralSimpson.integrar(x, dof, num_seg, error);
		System.out.println("El resultado de la integral es: " + resultado);
		scanner.close();
	}

}
