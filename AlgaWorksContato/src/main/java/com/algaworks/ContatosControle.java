package com.algaworks;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.UUID;

@Controller
public class ContatosControle {

    private static final ArrayList<Contato> LISTA_CONTATOS =    new ArrayList<>();

    static {
        LISTA_CONTATOS.add(new Contato("1", "Pedro", "(61) 9 9985-5877"));
        LISTA_CONTATOS.add(new Contato("2", "João", "(61) 9 9944-5877"));
        LISTA_CONTATOS.add(new Contato("3", "Normandes", "(61) 9 9876-5877"));
        LISTA_CONTATOS.add(new Contato("4", "Thiago", "(61) 9 8756-5877"));
        LISTA_CONTATOS.add(new Contato("5", "Jucas", "(61) 9 1233-0077"));
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/contatos")
    public ModelAndView listar() {
        ModelAndView modelAndView = new ModelAndView("listar");
        modelAndView.addObject("contatos", LISTA_CONTATOS);
        return modelAndView;
    }

    @GetMapping("/contatos/novo")
    public ModelAndView novo() {
        ModelAndView modelAndView = new ModelAndView("formulario");

        modelAndView.addObject("contato", new Contato());
        return modelAndView;
    }
    @PostMapping("/contatos")
    public String cadastrar(Contato contato) {
        String id = UUID.randomUUID().toString();
        contato.setId(id);
        LISTA_CONTATOS.add(contato);
        return "redirect:/contatos";
    }
}
