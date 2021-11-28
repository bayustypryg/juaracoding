package tugas.thymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class HomeController {
    
    @GetMapping
    public String index(Model model){
        int angka = 12;
        model.addAttribute("angka", angka);
        return "main";
    }
}
