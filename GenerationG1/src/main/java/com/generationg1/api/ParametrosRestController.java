package com.generationg1.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ParametrosRestController {
	
	//localhost:9080/api/?fecha=2022-06-13
	@RequestMapping("/")
	public String fecha(@RequestParam(value="fecha")String fecha) {
		
		
		return "la fecha es: "+ fecha;
	}
	//localhost:9080/api/seccion?modulo=3&seccion=5
	/*deben estar los dos parametros, no importa el orden pero deben estar*/
	@RequestMapping("/seccion")
	public String seccion(@RequestParam(value="modulo")String modulo,
			@RequestParam(value="seccion")String seccion) {
		
		
		return "el modulo es: " + modulo + " la seccion es: " + seccion;
	}
	/** rutas con parametros no obligatorios **/
	//localhost:9080/api/date?ano=2022&mes=6&dia=13
	@RequestMapping("/date")
	public String capturarParametros(@RequestParam(value="ano",required= false)String ano,
			@RequestParam(value="mes",required= false)String mes,
			@RequestParam(value="dia",required= false)String dia) {
	
		
		
		return "La fecha es"+ano+mes+dia;
		
		
	}
	
}
