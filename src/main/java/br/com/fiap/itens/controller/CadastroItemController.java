package br.com.fiap.itens.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CadastroItemController {
	
	@GetMapping("/cadastro-item")
	public ModelAndView CadastroItem() {
		ModelAndView view = new ModelAndView("cadastro");
		view.addObject("cadastro-item");
		return view;
	}

	@RequestMapping("/cadastro-item")
	public ModelAndView cadastro() {
		return new ModelAndView("cadastro");
	}
}