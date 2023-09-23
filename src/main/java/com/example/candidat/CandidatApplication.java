package com.example.candidat;

import com.example.candidat.CandidatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class CandidatApplication {
    public static void main(String[] args) {
        SpringApplication.run(CandidatApplication.class, args);
    }
    @Autowired
    private CandidatRepository repository;
    @Bean
    ApplicationRunner init() {
        return (args) -> {
            repository.save(new Candidat("Mariem","ch","ma@esprit.tn"));
            repository.save(new Candidat("souha","so","so@esprit.tn"));
            repository.save(new Candidat("mohammed","mo","mo@esprit.tn"));
            repository.findAll().forEach(System.out::println);
        };
    }
}