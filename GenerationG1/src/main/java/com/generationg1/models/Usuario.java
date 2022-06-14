package com.generationg1.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="usuarios")
public class Usuario {
	//Se establecen los objetos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	//size limita los caracteres
	@Size(min=3, max=50)
	private String nombre;
	@Size(min=3, max=50)
	private String apellidos;
	
	private Integer edad;
	
	@NotNull()
	@Size(min=6, max=10)
	private String password;
	
	//se añaden los constructores
	public Usuario() {
		super();
	}

	public Usuario(String nombre, String apellidos, Integer edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}
