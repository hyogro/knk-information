package com.knk.knkinfomation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String getHello(Model model){
        model.addAttribute("data", "이상훈");
        return "test/index";
    }

    @GetMapping("/test1")
    public String getHelloTest1(Model model){
        model.addAttribute("data", "테스트");
        return "test/index";
    }

    @GetMapping("/test")
    public String getHelloTest(Model model){
        model.addAttribute("data", "테스트");
        return "test/hello";
    }
}
