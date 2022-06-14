package com.generation.f20220524;

public class CalculoPromedio {

	public static void main(String[] args) {
//int cantidadNotas = 12;
//arreglo
Integer[] notas = {20,50,67,99,10,0,88,77,58,79,33,50};
	
//promedio sera la suma de todas las notas / por la cantidad de notas
//variable acumuladora
int sumaNotas = 0;
int notasFueraDeRango = 0;
//


// como recorrer el arreglo de notas
for (int i = 0; i < notas.length; i++) {
	//validar la nota!(que no sea negativa y que se pase de 100)
	if (notas[i] < 0 || notas[i] > 100 ){System.out.println("la nota:" +notas[i] + " en la posicion" + i+ "esta fuera de rango");
	notasFueraDeRango++;
	}
	sumaNotas = sumaNotas + notas[i];	
}
	if(notasFueraDeRango>0)
//con esto se accede a cada uno de los valores

	System.out.println("suma de notas: " + sumaNotas);
	float promedio = sumaNotas / notas.length;
	
	//punto critico!
	if(promedio >= 50 && promedio <=100){
	System.out.println("Alumno Aprobado");	//condicional intermedia de Java
	System.out.println("El promedio es:" +promedio);
	}else if(promedio <= 0  && promedio >= 50) {
		System.out.println("Alumno reprobado");
		System.out.println("El promedio es:" +promedio);
	} else {
		System.out.println("error en el calculo del promedio");
	}
	
	
	}

}
