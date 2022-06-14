package com.generation.f20220602;

public class Administradora extends Trabajador {
	private int codigoTrabajador;
	private float promedioVenta;
	
	public Administradora(String nombre,String apellido,int edad,int codigoTrabajador,float promedioVenta) {
	super (nombre,apellido,edad);
	this.codigoTrabajador = codigoTrabajador;
	this.promedioVenta = promedioVenta;
}
@Override
	public String mostrarDatos() {
		return "Nombre: "+getNombre()+
			"\nApellido: "+getApellido()+
			"\nEdad: "+getEdad()+
			"\nCodigo de Trabajador: "+codigoTrabajador+
			"\nPromedio de Ventas: "+promedioVenta;
	
}


}

