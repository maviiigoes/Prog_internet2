package com.projeto.rosa.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloControler {
    @GetMapping("/teste")
    public  String teste(@RequestParam(value= "name", required = false, defaultValue = "Hello")String name, Model model){
        model.addAttribute("name",name);

        return "teste";


    }
}
