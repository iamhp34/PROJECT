package com.hariprasad.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title",   "Hi Hariprasad");
        model.addAttribute("message", "App is running on Undertow — No Tomcat!");
        model.addAttribute("server",  "Undertow");
        model.addAttribute("java",    System.getProperty("java.version"));
        return "index";
    }
}
