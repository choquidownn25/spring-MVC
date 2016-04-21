/**
 * 
 */
package com.ejemplo.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author choqu_000
 * Clase index de la Anotacion de Controles
 */
@Controller
public class IndexController {

	
	//Mapeo de request
	@RequestMapping("/index")
	public String index(){
		//Retorna a la vista
		return "/WEB-INF/jsp/index.jsp";
	}
}
