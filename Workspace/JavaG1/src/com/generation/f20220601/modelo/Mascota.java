package com.generation.f20220601.modelo;

public class Mascota {

	
	private String color;
	private String especie;
	private String pelaje;
	private String sexo;
	private float peso;
	private String nombre;
	
	public Mascota(String string, String string2, String string3, float f, String string4) {
		super();
		this.color = color;
		this.especie = especie;
		this.pelaje = pelaje;
		this.sexo = sexo;
		this.peso = peso;
		this.nombre = nombre;
	}
 
	


	public Mascota() {
		// TODO Auto-generated constructor stub
	}




	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getPelaje() {
		return pelaje;
	}
	public void setPelaje(String pelaje) {
		this.pelaje = pelaje;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void hacerSonido() {
		System.out.println("Muuuuu");

	}
	
}
