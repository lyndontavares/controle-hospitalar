package com.mycompany.hospital.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    // abrir pagina home
    @GetMapping("/home")
    public String home() {
        return "home";
    }
}
