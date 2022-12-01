package com.ProjetoFinal.SwapBooks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LivroController {
    
    @GetMapping("/meuLivro")
    public String meuLivro(){
        return "livro";
    }
}
