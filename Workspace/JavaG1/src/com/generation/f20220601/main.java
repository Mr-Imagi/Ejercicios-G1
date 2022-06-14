package com.generation.f20220601;

import java.util.ArrayList;
import java.util.List;

import com.generation.f20220601.modelo.Gato;
import com.generation.f20220601.modelo.Mascota;
import com.generation.f20220601.modelo.Perro;

public class main {
	
	public static void main(String[] args) {
		//herencia
		Mascota mascota = new Mascota();
		mascota.setColor("amarillo");
		mascota.setEspecie("Pug");
		mascota.setPelaje("pelo suave");
		
		Perro perro = new Perro();
		
		
		Gato gato = new Gato();
		//Poliformaismo
		List<Mascota> listaMascotas = new ArrayList<Mascota>();
		Mascota regalon = new Mascota("negro","Canes","Firulais",1.5f,"Macho");
		
		Mascota felix = new Gato();
		felix.setNombre("Felix");
		felix.setColor("Negro");
		
	}

}
            