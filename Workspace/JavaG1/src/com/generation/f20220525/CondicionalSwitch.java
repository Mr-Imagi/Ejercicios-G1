package com.generation.f20220525;

import java.util.Scanner;

public class CondicionalSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// menu
		System.out.println("Ingrese opcion:");
		System.out.println("1 Sumar 2 restar 3 multi 4 dividir");
		int opcion = sc.nextInt();
		switch (opcion) {
		case 1:
			//accion para opcion 1
			System.out.println("**Suma");
			break;
		case 2:
			System.out.println("**Resta");
			break;
		case 3:
			System.out.println("**Multi");
		break;
		case 4:
			System.out.println("**Dividir");
		break;

		default:
			System.out.println("opcion ingresada no valida");
			break;
		}

	}

}
