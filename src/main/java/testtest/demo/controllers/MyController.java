package testtest.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import testtest.demo.repositories.MySqlRepository;

@RestController
public class MyController {
    
    @Autowired
    MySqlRepository repo;

    @GetMapping("/test")
    public String test() {
        return "hello";
    }

    @GetMapping("/five")
    public List<String> five() {
        return this.repo.getFive();
    }
    
}   


