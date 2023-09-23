package com.example.candidat;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CandidatRestApi {
    private String title="Hello, I'm the candidate Micro Service";
    @RequestMapping("/hello")
    public String sayHello(){
        System.out.println(title);
        return title;
    }
}
