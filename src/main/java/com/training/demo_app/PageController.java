package com.training.demo_app;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/signup")
    public String showSignupPage() {
        return "redirect:/signup.html";
    }

    @GetMapping("/login")
    public String showLoginPage() {
        return "redirect:/login.html";
    }

    @GetMapping("/welcome")
    public String showWelcomePage() {
        return "redirect:/welcome.html";
    }
}