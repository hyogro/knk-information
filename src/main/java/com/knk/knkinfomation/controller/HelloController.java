package com.knk.knkinfomation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

//    @GetMapping("index")
    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String getHello(Model model){
        model.addAttribute("data", "이상훈");
        return "index";
    }

    @GetMapping("/test")
    public String getHelloTest(Model model){
        model.addAttribute("data", "테스트");
        return "test/hello";
    }
}
