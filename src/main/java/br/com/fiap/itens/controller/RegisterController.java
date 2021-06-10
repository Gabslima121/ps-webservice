package br.com.fiap.itens.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {
	
	@GetMapping("/register")
	public ModelAndView RegisterItem() {
	ModelAndView view = new ModelAndView("register");
//		view.addObject("cadastro");
		return view;
	}
}