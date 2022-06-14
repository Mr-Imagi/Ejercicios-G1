package com.generation.f20220527;

import java.util.ArrayList;
import java.util.HashMap;

public class ColeccionesMap {

	public static void main(String[] args) {
		//pares clave <-> valor
		//HashMap<(aqui va el tipo de dato), valor> map = new HashMap <K,V>();
		//K es "key" o clave, la V es "value" o valor
		//HashMap mapa = new HashMap();
		
		HashMap<String, String>objHashMap = new HashMap<>();

		objHashMap.put("Nombre", "Danko");
		objHashMap.put("ApellidoP", "Abarca");
		objHashMap.put("ApellidoM", "Muñoz");
		objHashMap.put("Edad", "25");
		System.out.println("Elementos del mapa");
		System.out.println(objHashMap);
		
		//para obtener un valor del hash
		System.out.println(objHashMap.get("ApellidoP"));
		
		//para eliminar un par (osea la clave y el valor)
		objHashMap.remove("Edad");
		System.out.println(objHashMap);
		
		//esto es para mostrar todas las "llaves" disponibles
		System.out.println(objHashMap.keySet());
		
		//esto es para mostrar los valores disponibles
		System.out.println(objHashMap.values());
		
		ArrayList<String> vocales = new ArrayList<>();
		vocales.add("a");
		vocales.add("e");
		vocales.add("i");
		vocales.add("o");
		vocales.add("u");
	 	
		//con un array, se pueden invocar muchos mas contenidos
		//objHashMap.put("vocales",vocales );
		System.out.println(objHashMap);
		
		//crear un menu de comida
		//hay que solicitar que eliga el plato
		//y que se imprima el plato
		
	   //como recorrer un hashmap
	   for(String clave : objHashMap.keySet()) {
		   System.out.println(clave);
		   System.out.println(objHashMap.get(clave));
		   
	   }
	   for(Object clave : objHashMap.keySet()) {
			System.out.println("clave: "+clave +" - valor: "+objHashMap.get(clave)); 
			
		}

	   
	   
	   
	}

}

