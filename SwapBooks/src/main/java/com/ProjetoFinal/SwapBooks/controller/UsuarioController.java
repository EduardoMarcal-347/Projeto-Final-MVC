package com.ProjetoFinal.SwapBooks.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class UsuarioController {
    @GetMapping("cadastraUsuario")
    public String cadastraUsuario() {
        return "cadastraUsuario";
    }
    @GetMapping("login")
    public String login() {
        return "login";
    }

    @GetMapping("perfil")
    public String perfil(){
        return "perfil";
    }

    @GetMapping("config")
    public String config(){
        return "config";
    }
}
