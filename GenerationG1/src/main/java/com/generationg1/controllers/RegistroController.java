package com.generationg1.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.generationg1.models.Usuario;

@Controller
@RequestMapping("/registro")
public class RegistroController {
	//se agrega una ruta para desplegar el jsp
	@RequestMapping("")
	public String registro(@ModelAttribute("usuario")Usuario usuario) {
		return "Registro.jsp"; //pagina a desplegar
	//con esto se pasa el objeto vacio
	}

	
	//ruta para capturar los datos del formulario
	@PostMapping("/usuario/respaldo")
	public String registroUsuario(@RequestParam(value="gato")String nombre,
			@RequestParam(value="apellido")String apellido,
			@RequestParam(value="edad")String edad){
		System.out.println("parametro gato"+ nombre);
		System.out.println("parametro apellido"+apellido);
		System.out.println("parametro edad"+edad);
		return "registro.jsp"; //la pagina a desplegar
	}
@PostMapping("/usuario")
//Valid y BindingResult es para validar si la informacion que se mete es correcta
public String guardarUsuario (@Valid @ModelAttribute("usuario")Usuario usuario,
		BindingResult resultado,
		Model model) {
	if(resultado.hasErrors())//es para capturar si hay algun error en el ingreso de datos
		{model.addAttribute("msgError","Debe realizar ingreso correcto de los datos");
		return "registro.jsp";
		
	}
	
	System.out.println(usuario.getNombre()+" "+usuario.getApellidos()+" "+usuario.getEdad());
	//captura el objeto con los atributos llenos
	return "index.jsp"; //pagina a desplegar
}


}