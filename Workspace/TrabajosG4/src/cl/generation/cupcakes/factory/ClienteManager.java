package cl.generation.cupcakes.factory;

import java.util.List;

import cl.generation.cupcakes.Cupcake;

public class ClienteManager {
//recorrer el arreglo e imprimir
	public void recorrerArreglo(List<Cupcake> listaCupcake) {
		for (Cupcake cupcake : listaCupcake) {
			System.out.println(cupcake.getTipoBizcocho());
		}
		
		
		
		
	}
}
