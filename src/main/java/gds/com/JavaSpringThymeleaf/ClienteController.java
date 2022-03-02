package gds.com.JavaSpringThymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class ClienteController {
    @GetMapping
    String getCliente(Model model){
        model.addAttribute("cliente", Arrays.asList(
                new Cliente("João","joao@gmail.com","Vera Cruz",2),
                new Cliente("Ana","ana@gmail.com","Marilia",1),
                new Cliente("Paulo","paulod@outlook.com","São Paulo",4),
                new Cliente("Erica","ericaq@gmail.com","Garça",5),
                new Cliente("Roberto","roberto@gmail.com","Marilia",3),
                new Cliente("Bianca","bianca@outlook.com","São Paulo",9),
                new Cliente("Alex","alex@gmail.com","Lacio",1),
                new Cliente("Carlos","carlos@gmail.com","Pompeia",3),
                new Cliente("Cristian","cristian@outlook.com","São Paulo",8)
        ));
        return"clientelista";
    }
}
