package com.generation.f20220526;

import java.util.Arrays;

public class ColeccionesArray {

	public static void main(String[] args) {
		// Array
		String[] colores = {"red","blue","yellow","orange","black"};
		Integer[] numerosPares= {2,4,6,8,10,12};
		int[] primerosNumeros = {1,2,3,4,5,6,7,8,9,10};
		
	// Todos parten en la posicion cero
	
		System.out.println(colores[3]);
		System.out.println(numerosPares[3]);
		System.out.println(primerosNumeros[9]);
		
		System.out.println(Arrays.toString(colores));//esto es para imprimir toodo el arreglo

	//Podemos acceder al elemento en particular poniendo el nombre con corchetes el numero de su posicion en la lista
		
		//numerosPares[]= ; //con esto puedes modificar el elemento de la posicion indicada
// a diferencia de Javascript, el poner un valor nuevo que pasa del array no lo crea, arroja error	
	
	//recorrer un arreglo
		for (int i = 0; i < primerosNumeros.length; i++) {
			System.out.println(primerosNumeros[i]);
		}
	//for each
		for (int elemento : primerosNumeros) {
			System.out.println(elemento);
		}
	for (String colores2 : colores) {
		System.out.println(colores2 + "aiuda");
	}
	}
	

	}


