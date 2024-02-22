package com.sp.question2;

import java.time.LocalTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {

	@GetMapping("/")
    public String greeting(Model model) {
        LocalTime now = LocalTime.now();
        String name = "Sorada Prathan"; 
        String message = "Welcome to COMP367";
        model.addAttribute("message", message);
        return "greeting";
    }
}