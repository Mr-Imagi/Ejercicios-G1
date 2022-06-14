package com.generationg1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.generationg1.models.Usuario;
@Controller
public class IndexController {
	//este es el local host (http://localhost:8080/)
	@RequestMapping("/") //anotacion para capturar las rutas
	public String index(Model model) {
		model.addAttribute("apellidos", "Abarca Muñoz");
		model.addAttribute("nombre", "Danko");
		
		//instacia de usuario. es lo que viene despues de hacer el constructor
		Usuario usuario = new Usuario("Julian","Novoa",27);
		model.addAttribute("usuario",usuario);
		
		
		
		return "index.jsp";
		
		
		}

	
	
	
	
}
