//Created by David Abellan Navarro 1ºDam 
package com.dadivaandco.dam.programacion;

import java.util.Scanner;

public class AdivinaElNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner numInsert = new Scanner(System.in);
		int numSecret = (int) (Math.random() *100 +1);
		int intentos = 10;


		System.out.println("Adivina el numero de (1 a 100)");
		int num = numInsert.nextInt();
		
	
				while (numSecret != num && intentos >1) {
					if (num < 1 || num > 100)  {
						System.out.println("El número ha de ser entre 1 y 100");
						intentos += 1;
					}

					if (numSecret == num) {
						System.out.println("Acertaste");	
					}
					else if (numSecret < num) {
						System.out.println("Muy Alto");
					}
					else  {
						System.out.println("Muy Bajo");
					}
					intentos -= 1;
					System.out.println("Te quedan " + intentos);
					System.out.println("Fallaste pon otro numero");
					num = numInsert.nextInt();

					
				}
						
		if (numSecret == num) {
			System.out.println("Has acertado en "+ (11-intentos)+" intentos");
		}
		
		else {
			System.out.println("Fin Intentos");
		}
		numInsert.close();
	}
}
