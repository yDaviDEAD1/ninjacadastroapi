package dev.java.cadastrodeninja.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/acesso")
    public String boasVindas(){
        return "Essa é a minha mensagem de boas vindas para os ninjas";
    }

}
