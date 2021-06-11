package br.com.fiap.itens.controller;

import br.com.fiap.itens.dto.Integrante;
import br.com.fiap.itens.services.impl.IntegranteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class RegisterController {

	@Autowired
	IntegranteServiceImpl service;
	
	@GetMapping("/register")
	public ModelAndView RegisterItem() {
	ModelAndView view = new ModelAndView("register");
		view.addObject(new Integrante());
		return view;
	}

	@PostMapping("save-integrante")
	public String saveIntegrante(@Valid Integrante integrante, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute(integrante);
			return "register";
		}
		else{
			service.salvaIntegrante(integrante);
			return "redirect:/home";
		}
	}
}