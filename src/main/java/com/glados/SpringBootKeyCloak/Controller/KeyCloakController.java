package com.glados.SpringBootKeyCloak.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/")
public class KeyCloakController {

    @GetMapping
    public String index(){
        return "External Endpoint";
    }

    @GetMapping("/customer")
    public String customers(){

        return "Customers";
    }
}
