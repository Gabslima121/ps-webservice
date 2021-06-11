package br.com.fiap.itens.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.itens.dto.Integrante;
import br.com.fiap.itens.services.impl.IntegranteServiceImpl;

import java.util.List;

@Controller
public class ListController{
	
	@Autowired
	IntegranteServiceImpl service;
	
	@GetMapping("/listItem")
	public ModelAndView ListItem() {
		ModelAndView view = new ModelAndView("listItem");
		List<Integrante> itens = service.listaIntegrantes();
			view.addObject("integrante", itens);
			return view;
		}
}