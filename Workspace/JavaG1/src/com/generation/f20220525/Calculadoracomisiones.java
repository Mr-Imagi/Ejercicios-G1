package com.generation.f20220525;
import java.util.Scanner;
public class Calculadoracomisiones {

	public static void main(String[] args) {
      	
        Scanner entrada = new Scanner(System.in);
      	
      	float comision1= 0.3f;
        float comision2= 0.2f;
        float comision3= 0.1f;
		
      	int venta;
        float valorResultante;
        System.out.println("Ingrese el valor de la venta obtenida");
  		venta = Integer.parseInt(entrada.nextLine());
		
  		if(venta>=10000){
          valorResultante=(venta*comision1);
          System.out.println("La comisión de la venta es de 30% equivalente a: "+valorResultante);
        }else if(venta >= 5001 && venta <=9999 ){
         	valorResultante=(venta*comision2);
            System.out.println("La comisión de la venta es de 20% equivalente a: "+valorResultante);
        }else if(venta >= 1001 && venta <=4999){
          	valorResultante=(venta*comision3);
            System.out.println("La comisión de la venta es de 10% equivalente a: "+valorResultante);
        }else{
            System.out.println("No hay comisión por su venta");
        }
		
	}
}