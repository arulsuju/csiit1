package com.csiit.one.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping("/welcome")
    public String welcomeHome(Model model){
        String name="arulsuju";
        model.addAttribute("name",name);
        return "welcome";
    }
}
