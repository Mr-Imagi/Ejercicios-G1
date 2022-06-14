package com.generation.f20220602;

public class Secretario extends Trabajador {
private int citasProgramadas;
private int llamadasRecibidas;
public Secretario(String nombre, String apellido, int edad,int citasProgramadas,int llamadasRecibidas) {
	super(nombre, apellido, edad);
	this.citasProgramadas = citasProgramadas;
	this.llamadasRecibidas = llamadasRecibidas;
}
@Override
public String mostrarDatos() {
	return"Nombre: "+getNombre()+
			"\nApellido: "+getApellido()+
			"\nEdad: "+getEdad()+
			"\nCitas Programadas en el mes: "+citasProgramadas+
			"\nLlamadas recibidas en el mes "+llamadasRecibidas;
	
}
}
