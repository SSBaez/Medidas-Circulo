package com.ssabez.circulo;

import java.util.Scanner;

public class MedidasCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Aplicación que recibe del usuario el radio de un círculo como un entero, y que "
							+ "imprime el diámetro, la circunferencia y el área\ndel círculo mediante el uso "
							+ "del valor de punto flotante.\n");
		
		System.out.print("Ingrese el radio (como un valor entero): ");
		r = input.nextInt();
		
		//diámetro = 2r
		//circunferencia = 2PIr
		// área = PIr^(2)
		
		// %d formato para var de tipo int
		// %n formato para salto de línea
		// %f formato para var de tipo float
		System.out.printf("diámetro: %d%ncircunferencia: %f%nárea: %f", 2*r, 2*Math.PI*r, Math.PI*Math.pow(r,2));

	}

}
