package com.anabatic.itAssets.endpoint.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontEndController {
    
    @GetMapping("/check")
    public String index() {
        return "index";
    }
    

}
