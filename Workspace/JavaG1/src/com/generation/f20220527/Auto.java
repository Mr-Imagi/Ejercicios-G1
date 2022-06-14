package com.generation.f20220527;

public class Auto {
//una clase es un modelo o un prototipo, a partir de el se crean los objetos
	//el objeto nace a partir de la clase, tiene metodos/funciones
	//un atributo de colaboracion es tomar un objeto y usarlo como atributo
	//estructura de un objeto:
	//-atributo
	//-constructores
	//-accesadores y mutadores (get y set)
	//-metodos/funciones
	
	//1.atributo
	//2. accesador-tipo-nombreDelAtributo
	private String color;
	private String marca;
	private String modelo;
	private double velocidad;
	
	// 3. constructor con parametros (click derecho, source, generate constructor with field)
	public Auto(String color, String marca, String modelo, double velocidad) {
		super();
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.velocidad = velocidad;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public Auto() {
		super();
	}
	
	public void AumentarVelocidad() {
		this.velocidad = 10d;
	}
	
	
}
