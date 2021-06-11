package br.com.fiap.itens.controller;

import br.com.fiap.itens.dto.Integrante;
import br.com.fiap.itens.dto.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class LoginController {

    @GetMapping("/")
    public ModelAndView Login(){
        ModelAndView view = new ModelAndView("login");
        view.addObject(new Usuario());
        return view;
    }

    @PostMapping("/login")
    public String ValidLogin(@Valid Usuario usuario, BindingResult result, Model model){
        String usuarioPadrao = "admin";
        String senhaPadrao = "admin";

        if(result.hasErrors()){
            model.addAttribute(usuario);
            return "login";
        }
        else if (((usuario.getUsuario().equals(usuarioPadrao))  &
                (usuario.getSenha().equals(senhaPadrao)) )){
            return "redirect:/home";
        }
        else{
            model.addAttribute(usuario);
            return "login";

        }
    }
}
