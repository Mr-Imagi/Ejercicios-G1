package com.generation.f20220523;

public class Main {

	public static void main(String[] args) {
		// variables Primitivas

		// String
		// 1.se define el tipo de dato al que pertenecera la varible
		// 2.tipo de dato
		// 3. inicializarla, osea ponerle un valor
		String nombre = "Danko Abarca";
		System.out.println(nombre);

		// variables numericas

		// 32 bits
		int numeroInt = 25;
		System.out.println(numeroInt);

		// 8bits
		byte numeroByte = 50;
		System.out.println(numeroByte);

		// 16 bits
		short numeroShort = 75;
		System.out.println(numeroShort);

		// 64 bits
		long numeroLong = 1000;
		System.out.println(numeroLong);

		// variables de un solo caracter
		// va con comillas simples
		char letraD = 'D';
		System.out.println(letraD);

		// variable booleana (verdadero o falso)
		boolean acepta = true; // o falso, dependiendo lo que necesites
		if (acepta) {
			System.out.println("es berdadero señor");

		} else {
			System.out.println("era falso señor :c");
		}
		String curso = "g1";
		if (curso.equals("g1")) {
			System.out.println("iguales");
		} else {
			System.out.println("distintos");
		}

		if (curso.equalsIgnoreCase("g1")) {
			System.out.println("iguales");
		} else {
			System.out.println("distintos");
		}
		if (curso.toLowerCase().equals("g1")) {
			System.out.println("iguales");
		}
		if (curso.equals("g1".toUpperCase())) {
			System.out.println("iguales");
		}

	// Float y Double
	// un cast es convertir un dato a otro tipo de dato
	float altura = 1.57f;
	float peso = 70;
	// parse: convertir string a un tipo de numero
	// Interger.parseInt
	// Long.parseLong
	// Double.parseDouble
	// Float.parseFloat

	// ejercicio
	int num1 = 12;
	long num2 = 5000;
	/*
	 * Conversion de datos automatica: vamos de un dato mas pequeño al grande
	 * byte>short>int>long>float>double manual: hay que escribir con funciones
	 */

	// automatica
	int num4 = 18;
	float num4f = num4;

	Double peso2 = 75.9;
	Float peso2F =  peso2.floatValue();

	// operadores matematicos + - * / %
	// == != > >= < <= () estos son de comparacion

	if(5==(3+2))
	{
		System.out.println();
	}

}
	}

