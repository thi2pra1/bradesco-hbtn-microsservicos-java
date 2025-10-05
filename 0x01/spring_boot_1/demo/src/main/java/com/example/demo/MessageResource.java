package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/messages")
public class MessageResource {

    @GetMapping("/simpleMessageWelcome")
    public String simpleMessageWelcome() {
        return "BEM VINDO A AULA DE MICROSSERVIÇO USANDO SPRING BOOT !!!";
    }

    @GetMapping("/login")
    public String login(@RequestParam(required = false) String user,
                       @RequestParam(required = false) String password) {

        // Check if user or password are null, blank or not informed
        if (user == null || password == null || user.trim().isEmpty() || password.trim().isEmpty()) {
            return "USUÁRIO E SENHA NÃO INFORMADOS";
        }

        // Check if user or password have more than 15 characters
        if (user.length() > 15 || password.length() > 15) {
            return "USUÁRIO E SENHA INVÁLIDOS";
        }

        // If user and password are correctly informed
        return "LOGIN EFETUADO COM SUCESSO !!!";
    }
}
