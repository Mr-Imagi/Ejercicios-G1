package com.generation.f20220525;
import java.util.Scanner;
public class BucleWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Bucles
		System.out.println("\"(0) salir \\n (1) sumar \\n (2) restar \\n (3) multiplicar \\n (4) dividir\"");
int opcion = sc.nextInt();//
//NECESITAMOS VALIDAR UN MAL INGRESO
		while(opcion <0 || opcion >4) {
			System.out.println("\"(0) salir \\n (1) sumar \\n (2) restar \\n (3) multiplicar \\n (4) dividir\"");
	opcion = sc.nextInt();
}
		
		
		
	}

}
