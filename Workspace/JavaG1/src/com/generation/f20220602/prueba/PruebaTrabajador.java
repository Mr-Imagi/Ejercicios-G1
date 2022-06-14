package com.generation.f20220602.prueba;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.generation.f20220602.Administradora;
import com.generation.f20220602.Secretario;

class PruebaTrabajador {
	Administradora administradora = new Administradora ("Katherina","Orellana",26,123,9.7f);
	Secretario secretario = new Secretario ("Danko","Abarca",25,12,253);
int edadAdmi= 26;
int reuniones = 12;
	@Test
	void testEdadAdmi() {
		if(edadAdmi == 26) {
			assertEquals(26, 0, "Si, tiene 26 años");
		}
}
	@Test
	void testreunionesCitadas() {
		if (reuniones !=0) {
			assertNotEquals(12, 0,"son 12 reuniones citadas");
		}
		
	}

}
 