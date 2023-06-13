package com.dynamicdoers.ddquoteapi.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class MainController {

//    @GetMapping(path = "/api")
//    public String giveQuote(){
//        return "The best code is no code at all";
//    }
@GetMapping(path = "/api")
public HashMap<String,String>  giveQuote(){
    HashMap<String,String> response = new HashMap<>();
    response.put("status","OK");
    response.put("result","The best code is no code at all");
   return response;
}
}
