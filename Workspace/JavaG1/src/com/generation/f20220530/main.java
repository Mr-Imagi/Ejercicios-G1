package com.generation.f20220530;

import java.util.ArrayList;
import java.util.List;

import com.generation.f20220531.Cliente;

public class main {

	public static void main(String[] args) {
		List<Alumno> listaAlumnos = new ArrayList<Alumno>();
		
		//es una definicion de un objeto, invocar un objeto
		//el get es para conseguir el valor que pudiese tener mi variable
		//setter o set es para asignar un valor deseado
		//las interfaces solo definen los metodos, un array list es una clase como tal, va a tener atributos, funciones, metodos, y va mucho mas alla de la implementacion
//averiguar, sobrescritura de metodos y sobrecarga de metodos
		
		//instancia de una clase
		Alumno alumno = new Alumno();
		Alumno alumno1 = new Alumno();
		Alumno alumno2 = new Alumno();
		Alumno alumno3 = new Alumno();
		Alumno alumno4 = new Alumno();
		listaAlumnos.add(alumno);
		listaAlumnos.add(alumno1);
		listaAlumnos.add(alumno2);
		listaAlumnos.add(alumno3);
		listaAlumnos.add(alumno4);
				
		alumno = new Alumno("Danko", "Abarca", 25, "G1");
		alumno1 = new Alumno("Catalina", " Martínez", 25, "G1");
		alumno2 = new Alumno("Esteban", "Castañeda", 22, "G1");
		alumno3 = new Alumno("Katherina", "Orellana", 24, "G1");
		alumno4 = new Alumno("Wladimir", "Rojas", 27, "G1");
		
		
		System.out.println("Alumno 1" + " " + alumno.datos());
		System.out.println("Alumno 2" + " " + alumno1.datos());
		System.out.println("Alumno 3" + " " + alumno2.datos());
		System.out.println("Alumno 4" + " " + alumno3.datos());
		System.out.println("Alumno 5" + " " + alumno4.datos());
		
		for (int i = 0; i < listaAlumnos.size(); i++) {
			System.out.println(listaAlumnos.get(i).getNombre());
			System.out.println(listaAlumnos.get(i).getApellido());
		}
	}


	}


