package com.myth.restart.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class HelloController {
    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("name","老王");
        return "index";
    }
}
