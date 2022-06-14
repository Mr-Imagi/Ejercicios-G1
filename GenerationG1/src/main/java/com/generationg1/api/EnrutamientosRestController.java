package com.generationg1.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class EnrutamientosRestController {
	//en caso de que el puerto este usado, buscar el archivo application.properties puedes cambiar el puerto
	/** Enrutamientos*/
	//http://localhost:8080/usuario
	@RequestMapping("/usuario")
	public String usuario() {
		return "estamos en la url usuario";
	}
	@RequestMapping(value = "/proveedor/registrado",method= RequestMethod.GET)
	public String proveedor() {
		return "estamos en la url usuario/inscrito";
	}
	
}
