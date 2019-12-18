package com.anabatic.itAssets.endpoint.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@CrossOrigin(origins="*",allowedHeaders="*")
@Controller
public class FrontEndController {
    
    @GetMapping("/check")
    public String index() {
        return "index";
    }
    

}
