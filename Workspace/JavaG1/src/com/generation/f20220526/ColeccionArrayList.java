package com.generation.f20220526;
import java.util.ArrayList;
import java.util.Collections;
public class ColeccionArrayList {

	public static void main(String[] args) {
		//ArrayList
		ArrayList<String> colores = new ArrayList<String>();
		ArrayList<Integer> numerosPares = new ArrayList<Integer>();
	
		//con esto agregamos un elemento a la lista, es un array dinamico
	colores.add("rojo");
	colores.add("naranjo");
	
	//imprimir el contenido
	System.out.println(colores);
	
	//se pueden añadir elementos asi, pero no puede pasarse del largo
	colores.add(2,"celeste");
	System.out.println(colores);
	
	//con este podemos ver el tamaño del array hasta ese momento
	System.out.println(colores.size());
	
	//para modificar un elemento, se usa set
	System.out.println(colores.set(2,"morado"));
	System.out.println(colores);

	//para quitar un elemento
	colores.remove(0);
	System.out.println(colores);
	
	//recorrer un arreglo
		for (int i = 0; i < colores.size(); i++) {
			System.out.println(colores.get(i));
		}
		for (String colores2 : colores) {
			System.out.println(colores2);
		}
	
		//este ordena el arreglo de forma ascendente
		Collections.sort(colores);
		System.out.println(colores);
		
		//Collections.reverse invierte el orden de los elementos 
	
		//para quitar todos los elementos
	colores.clear();
	System.out.println(colores);
	
	numerosPares.add(14);
	numerosPares.add(8);
	numerosPares.add(6);
	numerosPares.add(4);
	numerosPares.add(16);
	numerosPares.add(11);
	System.out.println(numerosPares);
	Collections.sort(numerosPares);
	System.out.println(numerosPares);
	
	
}}
