package com.generation.f20220526;

public class Funciones {

	public static void main(String[] args) {
	//funciones
		//4 tipos de funciones
		// hay dos funciones que retornan algo y dos que no
	// tipo de retorno void signifca que no retornan nada, solo ejecutan codigo
	//el nombre de la funcion se escribe con minuscula la primera letra, siempre
	//para llamar a una funcion de forma interna hay que usar su nombre
	//-Accesador, tipo de retorno, nombre de la funcion, entre ()aqui van los parametros, pueden ir o no parametros
	saludo ();
	calculoSumaPares(true,56,"65",44,"sumar");
	int edad = obtenerEdad();
	System.out.println(edad);
	validarMayorEdad(edad);
	boolean mayorOMenor = validarMayorEdad(edad);
	if(mayorOMenor) {
		System.out.println("puede ingresar al curso");
	}else {
		System.out.println("no puede ingresar al curso");
	}
	}
public static void calculoSumaPares(boolean verdad,int numero1,String numero2,long numero3,String accion) {
	System.out.println(numero1+numero3+Integer.parseInt(numero2));
}

public void calculoSumaImpares() {}
// solicitar el ingreso de datos, para eso sirven las funciones sin parametros definidos

//funciones que si retornan un tipo de dato, tienen que tener un return
public static Integer obtenerEdad() {
	Integer edad = 18;
	return edad;//muestra el contenido de la variable
	}

public static Boolean validarMayorEdad(Integer edad) {
	if(edad>= 18) {
		System.out.println("es mayor de edad");
		return true;
	}else {
		System.out.println("es menor de edad");
		return false;
	}
	
	//return true;o false, puede ser cualquiera de los dos
}
public static void saludo () {
	System.out.println("buenos dias!");
}


}

