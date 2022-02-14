package com.example.demo.base.greeting;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class GreetingController {
    @GetMapping(value="/greeting")
    public String getGreeting(@RequestParam(name="name", required=false, defaultValue="Unknown")String name,Model model) {
        model.addAttribute("name",name);
        return "greeting.html";
    }
}
