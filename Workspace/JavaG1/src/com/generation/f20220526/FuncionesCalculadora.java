package com.generation.f20220526;
import java.util.Scanner;
public class FuncionesCalculadora {

	public static void main(String[] args) {
		double numeroElevado = Math.pow(5, 2); // elevar numeros
		double EnteroMayor = Math.ceil(numeroElevado);//redondear al entero mayor
		double enteroMenor = Math.floor(numeroElevado);//redondear al entero menor
		double enteroRedondeado = Math.round(numeroElevado);//redondeo
		System.out.println(numeroElevado);
		System.out.println(enteroMenor);
		System.out.println(EnteroMayor);
		System.out.println(enteroRedondeado);
		//numeros aleatorios entre el cero y 10
		int num010= (int) (Math.random()*100);
		int num58= (int) (Math.random() * (4- -4))+ -4;
		double aleatorio = Math.random();
		System.out.println(num58);
		
	}
		
public static int Suma (int num1,int num2) {
	 Scanner entrada = new Scanner(System.in);
	 System.out.println("Ingrese su primer numero a sumar");
	num1 = Integer.parseInt(entrada.nextLine());
	System.out.println("Ingrese su segundo numero a sumar"); 
	num2= Integer.parseInt(entrada.nextLine());
	int suma = num1 + num2;
	return suma;
}
double numeroElevado = Math.pow(6, 2);
double EnteroMayor = Math.ceil(numeroElevado);

}
