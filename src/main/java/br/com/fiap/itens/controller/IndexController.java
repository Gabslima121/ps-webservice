package br.com.fiap.itens.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	@GetMapping("/")
	   public ModelAndView cadastroItem(){
	   return new ModelAndView("cadastro-item");
	}
}