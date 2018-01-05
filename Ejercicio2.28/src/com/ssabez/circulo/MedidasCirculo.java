package com.ssabez.circulo;

import java.util.Scanner;

public class MedidasCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Aplicaci�n que recibe del usuario el radio de un c�rculo como un entero, y que "
							+ "imprime el di�metro, la circunferencia y el �rea\ndel c�rculo mediante el uso "
							+ "del valor de punto flotante.\n");
		
		System.out.print("Ingrese el radio (como un valor entero): ");
		r = input.nextInt();
		
		//di�metro = 2r
		//circunferencia = 2PIr
		// �rea = PIr^(2)
		
		// %d formato para var de tipo int
		// %n formato para salto de l�nea
		// %f formato para var de tipo float
		System.out.printf("di�metro: %d%ncircunferencia: %f%n�rea: %f", 2*r, 2*Math.PI*r, Math.PI*Math.pow(r,2));

	}

}
