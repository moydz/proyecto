/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lja.controller;

import com.lja.model.Persona;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

/**
 *
 * @author moises
 */
@Controller
public class LoginController {
    
   @RequestMapping("/irFormulario")
	public ModelAndView irFormulario(){
		return new ModelAndView("form","cmdForm",new Persona());
	}
	
	@RequestMapping(value= "/agregar", method= { RequestMethod.GET,
			RequestMethod.POST})
	public String agregar(Persona per,ModelMap model){
		model.addAttribute("nombreModel",per.getNombre());
		model.addAttribute("apellidoModel",per.getApellido());
		return "ver";
	}
    
}
